/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import interfaz.IDao;
import java.io.Serializable;
import servidor.servicio.ServidorDatosClientes;

/**
 *
 * @author paul
 */
public class Principal {

    public static void Main(String[] args) {
        Principal p = new Principal();
        DAOSql sql = new DAOSql();
        
    }

    public Principal() {
        
        DAOFile f;
        f = new DAOFileAlumno();
        f.conectarse();
        f = new DAOFileCliente();
        f.conectarse();
        f = new DAOFileEmpleado();
        f.conectarse();
        
        IDao f2;
        f2 = new DAOFileAlumno();
        f2.conectarse();
        f2 = new DAOFileCliente();
        f2.conectarse();
        f2 = new DAOFileEmpleado();
        f2.conectarse();
        
        Serializable s;
        s = new DAOFileAlumno();
        s = new DAOFileCliente();
        s = new DAOFileEmpleado();
        
        f.procesoX();
        
        DAOFileAlumno dfa = new DAOFileAlumno();
        dfa.procesoX();
        
    }

}
