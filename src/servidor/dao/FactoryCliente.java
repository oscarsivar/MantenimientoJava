/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import interfaz.IParametro;
import java.io.*;
import java.util.ArrayList;
import entidad.Cliente;
import interfaz.IFactoryAlmacen;

/**
 *
 * @author paul
 */
public class FactoryCliente extends Factory implements IFactoryAlmacen {
    private String nombre;

    public FactoryCliente() {
        nombre="Cliente.dat";
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
}