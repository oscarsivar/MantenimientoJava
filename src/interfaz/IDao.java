/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import java.util.ArrayList;
import entidad.Cliente;
import entidad.Filtro;

/**
 *
 * @author paul
 */
public interface IDao {
    
     public void conectarse();

     public void desconectarse();
     
     public void insertar(IParametro par);
     
     public void modifica(IParametro par);
     
     public void elimina(IParametro par);
     
     public ArrayList listar(IFiltro filtro);
     
     public int conteo();
     
     public boolean isConectado();
     
     public void setConectado(boolean conectado);
    
}
