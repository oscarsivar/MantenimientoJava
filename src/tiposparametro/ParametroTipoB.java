/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposparametro;

import interfaz.IParametro;
import interfaz.iProceso;

/**
 *
 * @author paul
 */
public class ParametroTipoB implements IParametro,iProceso{
    private double precio;
    private String descripcionProducto;

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void proceso1(String x) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void proceso2(int y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
