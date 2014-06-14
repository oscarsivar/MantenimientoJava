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
public class ParametroTipoA implements IParametro,iProceso{
    private String nombres;
    private String apellidos;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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
