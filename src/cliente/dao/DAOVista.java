/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.dao;

import entidad.Cliente;
import entidad.Comando;
import entidad.Filtro;
import entidad.Respuesta;
import interfaz.IFiltro;
import interfaz.IParametro;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class DAOVista implements interfaz.IDao {
    private IParametro parametro;
    private Socket canal;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private boolean conectado=false;

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public DAOVista(IParametro parametro) {
        this.parametro = parametro;
    }

    public IParametro getParametro() {
        return parametro;
    }

    public void setParametro(IParametro parametro) {
        this.parametro = parametro;
    }
    
    @Override
    public void conectarse() {
        try {
            this.canal = new Socket("127.0.0.1", 10001);
            this.conectado=true;
            this.in = new ObjectInputStream(canal.getInputStream());
            this.out = new ObjectOutputStream(canal.getOutputStream());
        } catch (UnknownHostException ex) {
            this.conectado=false;
        } catch (IOException ex) {
        }
    }

    @Override
    public void desconectarse() {
        try {
            canal.close();
            this.conectado=false;
        } catch (IOException ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
    
     @Override
    public ArrayList listar(IFiltro filtro) {
        try {
            Comando cmd = new Comando();
            cmd.setTextoComando("CONSULTAR");
            cmd.setParametro(parametro);
            cmd.setFechaHora(null);
            cmd.setFiltro(filtro);
            cmd.setIpCliente(null);
            cmd.setUsuario(null);
            out.writeObject(cmd);
            Respuesta res =  (Respuesta) in.readObject();
            if (!res.getTextoError().equals("-")){
                throw new Exception(res.getTextoError());
            }
            return res.getListaRespuesta();
        } catch (Exception ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public int conteo() {
        try {
            Comando cmd = new Comando();
            cmd.setTextoComando("CONTEO");
            cmd.setParametro(parametro);
            cmd.setFechaHora(null);
            cmd.setFiltro(null);
            cmd.setIpCliente(null);
            cmd.setUsuario(null);
            out.writeObject(cmd);
            Respuesta res = (Respuesta) in.readObject();
            if (!res.getTextoError().equals("-")) {
                throw new Exception(res.getTextoError());
            }
            int x = Integer.parseInt(res.getTextoRespuesta());
            return x;
        } catch (Exception ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    @Override
    public void insertar(IParametro par) {
        try {
            Comando cmd = new Comando();
            cmd.setTextoComando("INSERTAR");
            cmd.setParametro(par);
            cmd.setFechaHora(null);
            cmd.setFiltro(null);
            cmd.setIpCliente(null);
            cmd.setUsuario(null);
            out.writeObject(cmd);
            Respuesta res = (Respuesta) in.readObject();
            if (!res.getTextoError().equals("-")) {
                throw new Exception(res.getTextoError());
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifica(IParametro par) {
        try {
            Comando cmd = new Comando();
            cmd.setTextoComando("MODIFICAR");
            cmd.setParametro(par);
            cmd.setFechaHora(null);
            cmd.setFiltro(null);
            cmd.setIpCliente(null);
            cmd.setUsuario(null);
            out.writeObject(cmd);
            Respuesta res = (Respuesta) in.readObject();
            if (!res.getTextoError().equals("-")) {
                throw new Exception(res.getTextoError());
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void elimina(IParametro par) {
        try {
            Comando cmd = new Comando();
            cmd.setTextoComando("ELIMINAR");
            cmd.setParametro(par);
            cmd.setFechaHora(null);
            cmd.setFiltro(null);
            cmd.setIpCliente(null);
            cmd.setUsuario(null);
            out.writeObject(cmd);
            Respuesta res =  (Respuesta) in.readObject();
            if (!res.getTextoError().equals("-")){
                throw new Exception(res.getTextoError());
            }
        } catch (Exception ex) {
            Logger.getLogger(DAOVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
