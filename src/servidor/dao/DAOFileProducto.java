/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import entidad.Empleado;
import entidad.Filtro;
import entidad.Producto;
import interfaz.IDao;
import interfaz.IFiltro;
import interfaz.IParametro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public class DAOFileProducto implements IDao, Serializable {

    private ArrayList<IParametro> almacenDatos;
    private FactoryProducto fc = new FactoryProducto();

    @Override
    public void conectarse() {
        almacenDatos = fc.readAlmacen();
        //deserializar y leer almacen de datos
    }

    @Override
    public void desconectarse() {
        //Serializar y guardar almacen de datos
        fc.persistAlmacen(almacenDatos);
    }

    @Override
    public void insertar(IParametro par) {
        conectarse();
        almacenDatos.add(par);
        desconectarse();
    }

    @Override
    public void modifica(IParametro par) {
        Producto producto = (Producto) par;
        conectarse();
        int x = 0;
        for (IParametro par1 : almacenDatos) {
            Producto producto1 = (Producto) par1;
            if (producto1.getIdProducto().equals(producto.getIdProducto())) {
                almacenDatos.set(x, producto);
            }
            x++;
        }
        desconectarse();
    }

    @Override
    public void elimina(IParametro par) {
        Producto producto = (Producto) par;
        conectarse();
        int x = 0;
        for (IParametro par1 : almacenDatos) {
            Producto producto1 = (Producto) par1;
            if (producto1.getIdProducto().equals(producto.getIdProducto())) {
                almacenDatos.remove(x);
            }
            x++;
        }
        desconectarse();
    }

    @Override
    public ArrayList listar(IFiltro filtroGen) {
        Filtro filtro = (Filtro) filtroGen;
        conectarse();
        ArrayList<Producto> copiaAlmacen = (ArrayList<Producto>) almacenDatos.clone();
        int x = 0;
        for (Producto producto : copiaAlmacen) {
            if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == false) {
                if (!producto.getIdProducto().equals(filtro.getValor1())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!producto.getNombre().equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == false & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!producto.getDescripcion().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == false) {
                if (!producto.getIdProducto().equals(filtro.getValor1()) && !producto.getNombre().equals(filtro.getValor2())) {
                    copiaAlmacen.remove(x);
                }
            } else if (!filtro.isBfiltro1() == false & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!producto.getNombre().equals(filtro.getValor2()) && !producto.getDescripcion().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == false & filtro.isBfiltro3() == true) {
                if (!producto.getIdProducto().equals(filtro.getValor1()) && !producto.getDescripcion().equals(filtro.getValor3())) {
                    copiaAlmacen.remove(x);
                }
            } else if (filtro.isBfiltro1() == true & filtro.isBfiltro2() == true & filtro.isBfiltro3() == true) {
                if (!producto.getIdProducto().equals(filtro.getValor1()) && !producto.getNombre().equals(filtro.getValor2())
                        && !producto.getDescripcion().equals(filtro.getValor3())) {
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

}
