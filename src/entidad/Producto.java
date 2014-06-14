/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.IParametro;
import java.io.Serializable;

/**
 *
 * @author paul
 */
public class Producto implements Serializable, IParametro {
    private String idProducto;
    private String nombre;
    private String descripcion;

    public Producto() {
    }

    @Override
    public String toString() {
        return "DAOFileProducto";
    }

    public Producto(String idProducto, String nombre, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
