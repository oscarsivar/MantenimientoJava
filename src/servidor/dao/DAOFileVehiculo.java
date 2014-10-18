/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

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

   
}
