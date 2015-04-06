/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Filtro;
import entidad.Vehiculo;
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
public class DAOFileVehiculo extends DAOFile implements IDao, Serializable {

    @Override
    public IFactoryAlmacen getInstanciaFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean compararId(IParametro par, IParametro par1) {
        boolean respuesta = false;
        Vehiculo veh1 = (Vehiculo) par;
        Vehiculo veh2 = (Vehiculo) par1;
        if (veh1.getPlaca().equals(veh2.getPlaca())){
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public String getValorCampo1(IParametro item) {
        Vehiculo veh = (Vehiculo) item;
        //int x =10;
        return veh.getMarca();
        //return String.valueOf(equipo.getAnioCompra());
    }

    @Override
    public String getValorCampo2(IParametro item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValorCampo3(IParametro item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
