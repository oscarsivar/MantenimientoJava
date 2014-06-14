/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Cliente;
import entidad.Filtro;
import entidad.Producto;
import interfaz.IFactoryAlmacen;
import interfaz.IFiltro;
import interfaz.IParametro;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public abstract class DAOFile {

    private ArrayList<IParametro> almacenDatos;
    private IFactoryAlmacen fc = getInstanciaFactory();

    public void conectarse() {
        almacenDatos = fc.readAlmacen();
    }

    public void desconectarse() {
        fc.persistAlmacen(almacenDatos);
    }

    public abstract IFactoryAlmacen getInstanciaFactory();

    public abstract boolean compararId(IParametro par, IParametro par1);
    
    public abstract String getValorCampo1(IParametro item);
    
    public abstract String getValorCampo2(IParametro item);
    
    public abstract String getValorCampo3(IParametro item);

    public void insertar(IParametro par) {
        conectarse();
        almacenDatos.add(par);
        desconectarse();
    }

    public void modifica(IParametro par) {
        //Producto producto = (Producto) par;
        conectarse();
        int x = 0;
        for (IParametro par1 : almacenDatos) {
            //Producto producto1 = (Producto) par1;
            //if (producto1.getIdProducto().equals(producto.getIdProducto())) {
            if (compararId(par1, par)) {
                almacenDatos.set(x, par);
            }
            x++;
        }
        desconectarse();
    }

    public void elimina(IParametro par) {
        //Producto producto = (Producto) par;
        conectarse();
        int x = 0;
        for (IParametro par1 : almacenDatos) {
            //Producto producto1 = (Producto) par1;
            //if (producto1.getIdProducto().equals(producto.getIdProducto())) {
            if (compararId(par1, par)) {
                almacenDatos.remove(x);
            }
            x++;
        }
        desconectarse();
    }

    public int conteo() {
        conectarse();
        int size = almacenDatos.size();
        desconectarse();
        return size;

    }

    public boolean isConectado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setConectado(boolean conectado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
        public ArrayList listar(IFiltro filtroGen) {
        Filtro filtro = (Filtro) filtroGen;
        conectarse();
        //ArrayList<Cliente> copiaAlmacen = (ArrayList<Cliente>) almacenDatos.clone();
        ArrayList<IParametro> copiaAlmacen = (ArrayList<IParametro>) almacenDatos.clone();
        int x = 0;
        for (IParametro item : copiaAlmacen) {
            if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == false) {
                if (!getValorCampo1(item).equals(filtro.getValor1())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!getValorCampo2(item).equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo2(item).equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (!filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!getValorCampo2(item).equals(filtro.getValor2()) && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!getValorCampo1(item).equals(filtro.getValor1()) && !getValorCampo2(item).equals(filtro.getValor2())
                        && !getValorCampo3(item).equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            }
            x++;
        }
        desconectarse();
        return copiaAlmacen;
    }
        
    public void procesoX(){
    
    }
}
