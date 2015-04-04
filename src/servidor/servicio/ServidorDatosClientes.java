/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.servicio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import entidad.Cliente;
import entidad.Comando;
import entidad.Filtro;
import entidad.Respuesta;
import interfaz.IDao;
import interfaz.IFiltro;
import interfaz.IParametro;
import servidor.dao.DAOFactory;
import servidor.dao.DAOFileCliente;


/**
 *
 * @author paul
 */
public class ServidorDatosClientes {

    public static void main(String[] args) {
        ServidorDatosClientes objServer = new ServidorDatosClientes();
        objServer.iniciarServicio();
    }

    public void iniciarServicio() {
        try {
            int i = 1;
            ServerSocket s = new ServerSocket(10001);
            //String x = new String("abc");
            while (true) {
                Socket canalComunicacionconCliente = s.accept();
                System.out.println("Conectando " + i);
                Runnable r = new ServicioDatos(canalComunicacionconCliente, i);
                Thread t = new Thread(r);
                t.start();
                
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class ServicioDatos implements Runnable {

    private Socket canal;
    private int contador;

    ServicioDatos(Socket canalComunicacionconCliente, int i) {
        this.canal = canalComunicacionconCliente;
        contador = i;
    }

    @Override
    public void run() {
        Respuesta res;
        Comando cmd;
        try {
            ObjectOutputStream out = new ObjectOutputStream(canal.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(canal.getInputStream());
            boolean bandera=true;
            IDao daocli;
            
            while(bandera){
                cmd = (Comando) in.readObject();      
                String tipo = cmd.getParametro().toString();
                DAOFactory df = new DAOFactory(tipo);
                daocli = df.fabricarInstancia();
                //paso 1 recibir comando
                //paso 2 . logica de proceso según el comando
                if(cmd.getTextoComando().equals("SALIR")){
                    //paso 3 . responder al cliente 
                    res = new Respuesta();
                    res.setTextoRespuesta("Conexión Terminada");
                    res.setTextoError("-");
                    res.setListaRespuesta(null);
                    out.writeObject(res);
                    bandera=false;
                } else if(cmd.getTextoComando().equals("INSERTAR")){
                    IParametro cl = cmd.getParametro();
                    //daocli.conectarse();
                    daocli.insertar(cl);
                    //daocli.desconectarse();
                    res = new Respuesta();
                    res.setTextoRespuesta(tipo.concat(" Agrego datos"));
                    res.setTextoError("-");
                    res.setListaRespuesta(null);
                    out.writeObject(res);
                } else if (cmd.getTextoComando().equals("MODIFICAR")){
                    IParametro cl = cmd.getParametro();
                    //daocli.conectarse();
                    daocli.modifica(cl);
                    //daocli.desconectarse();
                    res = new Respuesta();
                    res.setTextoRespuesta(tipo.concat(" Modificado"));
                    res.setTextoError("-");
                    res.setListaRespuesta(null);
                    out.writeObject(res);
                } else if (cmd.getTextoComando().equals("ELIMINAR")){
                    IParametro cl = cmd.getParametro();
                    //daocli.conectarse();
                    daocli.elimina(cl);
                    //daocli.desconectarse();
                    res = new Respuesta();
                    res.setTextoRespuesta(tipo.concat(" Eliminado"));
                    res.setTextoError("-");
                    res.setListaRespuesta(null);
                    out.writeObject(res);
                } else if (cmd.getTextoComando().equals("CONSULTAR")){
                    IParametro cl = cmd.getParametro();
                    IFiltro fil = cmd.getFiltro();
                    //daocli.conectarse();
                    ArrayList listaClientes = daocli.listar(fil);
                    //daocli.desconectarse();
                    res = new Respuesta();
                    res.setTextoRespuesta("Lista ".concat(tipo).concat("s"));
                    res.setTextoError("-");
                    res.setListaRespuesta(listaClientes);
                    out.writeObject(res);
                } else if (cmd.getTextoComando().equals("CONTEO")){
                    int x = daocli.conteo();
                    res = new Respuesta();
                    res.setTextoRespuesta(String.valueOf(x));
                    res.setTextoError("-");
                    res.setListaRespuesta(null);
                    out.writeObject(res);
                }
 
            }
            out.close();
            in.close();        
            canal.close();
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
    }
}
