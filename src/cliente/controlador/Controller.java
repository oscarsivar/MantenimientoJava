/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.controlador;

import cliente.dao.DAOVista;
import entidad.Empleado;
import entidad.Filtro;
import interfaz.IDao;
import interfaz.IParametro;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul
 */
public abstract class Controller extends DefaultTableModel{
    private Filtro filtro = new Filtro(false, false, false, "", "", "");
    private int numreg = 0;
    private String data[][];
    private ArrayList lista;
    
    public Controller() {
        super();
        data = getRows();
        setDataVector(data, getCols());

    }
    
    public abstract IDao getDao();
    
    
    public abstract String[] getTitulosParaGrid();
    
    public abstract void rellenarDataconArrayList(String[][] data, ArrayList lista);
    
    public abstract int getCantidadColumnas();
    
    public String[] getCols() {
        String[] Encabezados = getTitulosParaGrid();
        return Encabezados;
    }
    
    public ArrayList getLista() {
        return lista;
    }
    
    public String[][] getRows() {
        ArrayList lista2;
        numreg = getDao().conteo();
        int numCols = getCantidadColumnas();
        data = new String[numreg][numCols];
        Empleado emp;
        try {
            lista2 = getDao().listar(this.filtro);
            this.lista = lista2;
            rellenarDataconArrayList(data,lista2);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public void agregar(IParametro par) {
        getDao().insertar(par);
    }

    public void elimina(IParametro par) {
        getDao().elimina(par);
    }
    
    public void modificar(IParametro par) {
        getDao().modifica(par);
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }

    /**
     * @return the filtro
     */
    
    public Filtro getFiltro() {
        return filtro;
    }

    /**
     * @param filtro the filtro to set
     */
    public void setFiltro(Filtro filtro) {
        this.filtro = filtro;
    }
    
}
