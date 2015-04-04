/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.controlador;

import cliente.dao.DAOVista;
import entidad.Alumno;
import interfaz.IDao;
import java.util.ArrayList;


/**
 *
 * @author paul
 */
public class ControllerAlumno extends Controller{
    private DAOVista objDao;

    public ControllerAlumno() {
        objDao = new DAOVista(new Alumno());
        objDao.conectarse();
    }

    @Override
    public IDao getDao() {
        if (objDao==null ){
          objDao = new DAOVista(new Alumno());
          objDao.conectarse();
        }
        return objDao;
    }

    @Override
    public String[] getTitulosParaGrid() {
        String[] vectorTitulos = {"Carnet","Nombres","Apellido1","Apellido2","Dirección","Teléfono","Email"};
        return vectorTitulos;
    }

    @Override
    public void rellenarDataconArrayList(String[][] data, ArrayList lista) {
        int numreg = lista.size();
        Alumno alu;  
        for (int fila = 0; fila < numreg; fila++) {
            alu = (Alumno) lista.get(fila);
            data[fila][0] = alu.getCarnet();
            data[fila][1] = alu.getNombres();
            data[fila][2] = alu.getApellido1();
            data[fila][3] = alu.getApellido2();
            data[fila][4] = alu.getDireccion();
            data[fila][5] = alu.getTelefono();
            data[fila][6] = alu.getEmail();
        }
    }

    @Override
    public int getCantidadColumnas() {
        return 7;
    }

    @Override
    public String[][] getRows() {
        
        return super.getRows();
        //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
