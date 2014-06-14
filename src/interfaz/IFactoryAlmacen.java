/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;

/**
 *
 * @author paul
 */
public interface IFactoryAlmacen {
    
    public void persistAlmacen(ArrayList<IParametro> almacen);       
    
    public ArrayList<IParametro> readAlmacen();
    
}
