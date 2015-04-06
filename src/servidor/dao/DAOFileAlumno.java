/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Alumno;
import entidad.Filtro;
import interfaz.IDao;
import interfaz.IFactoryAlmacen;
import interfaz.IParametro;
import java.io.Serializable;
import java.util.ArrayList;

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
    
    @Override
    public void filter(Filtro filtro, ArrayList<IParametro> copiaAlmacen2,IParametro item, int x ){
        if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == false) {
                if (!getValorCampo1(item).equals(filtro.getValor1())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!getValorCampo2(item).equals(filtro.getValor2())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo2(item).equals(filtro.getValor2())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (!filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!getValorCampo2(item).equals(filtro.getValor2()) && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo2(item).equals(filtro.getValor2())
                        && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen2.remove(x);
                    x--;
                }
            }
        
    }

    
}
