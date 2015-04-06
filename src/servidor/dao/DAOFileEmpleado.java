/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Empleado;
import entidad.Filtro;
import interfaz.IDao;
import interfaz.IFactoryAlmacen;
import interfaz.IFiltro;
import interfaz.IParametro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public class DAOFileEmpleado extends DAOFile implements IDao, Serializable {

    private ArrayList<IParametro> almacenDatos;
    private FactoryEmpleado fc = new FactoryEmpleado();
    
    
    public IFactoryAlmacen getInstanciaFactory() {
        FactoryEmpleado fc = new FactoryEmpleado();
        return fc;
    }
    //Se implementea el método abstracto de la clase padre DAOFile
    
    public boolean compararId(IParametro par1, IParametro par2) {
        boolean respuesta = false;
        Empleado cl1 = (Empleado) par1;
        Empleado cl2 = (Empleado) par2;
        if (cl1.getCodigo().equals(cl2.getCodigo())){
            respuesta = true;
        }
        return respuesta;
    }
    
    @Override
    public ArrayList listar(IFiltro filtroGen) {
        Filtro filtro = (Filtro) filtroGen;
        conectarse();
        ArrayList<Empleado> copiaAlmacen = (ArrayList<Empleado>) almacenDatos.clone();
        int x = 0;
        for (Empleado empleado : copiaAlmacen) {
            if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == false) {
                if (!empleado.getNombre().equals(filtro.getValor1())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!empleado.getApellido1().equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!empleado.getApellido2().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!empleado.getNombre().equals(filtro.getValor1()) && !empleado.getApellido1().equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (!filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!empleado.getApellido1().equals(filtro.getValor2()) && !empleado.getApellido2().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!empleado.getNombre().equals(filtro.getValor1()) && !empleado.getApellido2().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!empleado.getNombre().equals(filtro.getValor1()) && !empleado.getApellido1().equals(filtro.getValor2())
                        && !empleado.getApellido2().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            }
            x++;
        }
        desconectarse();
        return copiaAlmacen;
    }

    @Override
    public int conteo() {
        conectarse();
        int size = almacenDatos.size();
        desconectarse();
        return size;

    }

    @Override
    public boolean isConectado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setConectado(boolean conectado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getValorCampo1(IParametro item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getValorCampo2(IParametro item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getValorCampo3(IParametro item) {
        throw new UnsupportedOperationException("Not supported yet.");
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
