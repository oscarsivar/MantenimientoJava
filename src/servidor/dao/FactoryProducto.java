/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import interfaz.IFactoryAlmacen;

/**
 *
 * @author paul
 */
public class FactoryProducto extends Factory implements IFactoryAlmacen {
    private String nombre;

    public FactoryProducto() {
        this.nombre = "Producto.dat";
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    
    
}
