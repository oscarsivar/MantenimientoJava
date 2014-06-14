/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Alumno;
import interfaz.IDao;
import interfaz.IFactoryAlmacen;
import interfaz.IParametro;
import java.io.Serializable;

/**
 *
 * @author paul
 */
public class DAOFileAlumno extends DAOFile implements IDao, Serializable{
    @Override
    public IFactoryAlmacen getInstanciaFactory() {
        FactoryAlumno fa = new FactoryAlumno();
        return fa;
    }

    @Override
    public boolean compararId(IParametro par, IParametro par1) {
        boolean respuesta = false;
        Alumno al1 = (Alumno) par;
        Alumno al2 = (Alumno) par1;
        if (al1.getCarnet().equals(al2.getCarnet())){
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public String getValorCampo1(IParametro item) {
        Alumno al = (Alumno) item;
        return al.getNombres();
    }

    @Override
    public String getValorCampo2(IParametro item) {
        Alumno al = (Alumno) item;
        return al.getApellido1();
    }

    @Override
    public String getValorCampo3(IParametro item) {
        Alumno al = (Alumno) item;
        return al.getApellido2();
    }

    
}
