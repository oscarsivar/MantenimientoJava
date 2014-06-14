/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Producto;
import interfaz.IFactoryAlmacen;
import interfaz.IParametro;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public class FactoryAlumno extends Factory implements IFactoryAlmacen {

    private String nombre;

    public FactoryAlumno() {
         this.nombre = "Alumno.dat";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
        
}
