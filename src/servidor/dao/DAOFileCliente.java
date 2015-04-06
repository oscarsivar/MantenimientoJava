/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Cliente;
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
public class DAOFileCliente extends DAOFile implements IDao, Serializable {
    private ArrayList<IParametro> almacenDatos;
    private FactoryCliente fc = new FactoryCliente();

    @Override
    public IFactoryAlmacen getInstanciaFactory() {
        FactoryCliente fc = new FactoryCliente();
        return fc;
    }
    //Se implementea el método abstracto de la clase padre DAOFile
    @Override
    public boolean compararId(IParametro par1, IParametro par2) {
        boolean respuesta = false;
        Cliente cl1 = (Cliente) par1;
        Cliente cl2 = (Cliente) par2;
        if (cl1.getCodigo().equals(cl2.getCodigo())){
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public String getValorCampo1(IParametro item) {
        Cliente cl = (Cliente) item;
        return cl.getNombre();
    }

    @Override
    public String getValorCampo2(IParametro item) {
        Cliente cl = (Cliente) item;
        return cl.getApellido1();
    }

    @Override
    public String getValorCampo3(IParametro item) {
        Cliente cl = (Cliente) item;
        return cl.getApellido2();
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
