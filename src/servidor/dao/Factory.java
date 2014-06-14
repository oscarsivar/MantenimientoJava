/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import interfaz.IFactoryAlmacen;
import interfaz.IParametro;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author paul
 */
public abstract class Factory implements IFactoryAlmacen{
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;
    
    //public abstract void setNombre(String nombre);
    
    public abstract String getNombre();
    
    @Override
    public void persistAlmacen(ArrayList<IParametro> almacen) {
        try {
            String sFileName = getNombre();
            fos = new FileOutputStream(sFileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(almacen);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<IParametro> readAlmacen() {
        ArrayList<IParametro> myObject = null;
        try {
            String sFileName = getNombre();
            fis = new FileInputStream(sFileName);
            ois = new ObjectInputStream(fis);
            myObject = (ArrayList<IParametro>) ois.readObject();
        } catch (IOException e) {
            myObject = new ArrayList<IParametro>();
            return myObject;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return myObject;
    }
    
}
