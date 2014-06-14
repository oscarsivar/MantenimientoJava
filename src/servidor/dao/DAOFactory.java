/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import interfaz.IDao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class DAOFactory {
    private String nombreClase;

    public DAOFactory(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    public IDao fabricarInstancia(){
        IDao obj=null;
        try {
////            Código debe sustituirse con lectura de archivo externo de configuración
//            if(nombreClase.equals("Cliente")){
//                obj = new DAOFileCliente();
//            }else if(nombreClase.equals("Producto")){
//                obj = new DAOFileProducto();
//            }else if(nombreClase.equals("Empleado")){
//                obj = new DAOFileEmpleado();
//            }
            Class c =  Class.forName("servidor.dao.".concat(nombreClase));
            obj = (IDao) c.newInstance();
            
        } catch (Exception ex) {
            Logger.getLogger(DAOFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
    }
    
}
