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
public class FactoryVehiculo extends Factory implements IFactoryAlmacen{
    private String nombre="";

    public FactoryVehiculo() {
        nombre="Vehiculo.dat";
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
}
