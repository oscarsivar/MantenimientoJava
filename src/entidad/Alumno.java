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
public class Alumno implements IParametro,Serializable {
    private String carnet;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private String email;

    @Override
    public String toString() {
        return "DAOFileAlumno";
    }
  
    public Alumno() {
    }

    public Alumno(String carnet, String nombres, String apellido1, String apellido2, String direccion, String telefono, String email) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
