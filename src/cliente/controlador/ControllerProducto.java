package cliente.controlador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import cliente.dao.DAOVista;
import interfaz.IDao;
import java.util.ArrayList;
import entidad.Filtro;
import entidad.Producto;

/**
 *
 * @author paul
 */
public class ControllerProducto extends Controller {

    private int numreg = 0;
    private String data[][];
    private IDao dao;
    private ArrayList lista;
    private Filtro filtro = new Filtro(false, false, false, "", "", "");

    public ControllerProducto() {
        super();
        dao = new DAOVista(new Producto());
        if (!dao.isConectado()) {
            dao.conectarse();
        }
        data = getRows();
        setDataVector(data, getCols());

    }

    public String[][] getRows() {
        ArrayList lista = null;
        numreg = dao.conteo();
        data = new String[numreg][3];
        Producto pro;
        try {
            lista = dao.listar(this.filtro);
            this.lista = lista;
            for (int fila = 0; fila < numreg; fila++) {
                pro = (Producto) lista.get(fila);
                data[fila][0] = pro.getIdProducto();
                data[fila][1] = pro.getNombre();
                data[fila][2] = pro.getDescripcion();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public String[] getCols() {
        String[] Encabezados = {new String("Código"), new String("Nombre"), new String("Descripción")};
        return Encabezados;
    }

    /**
     * @return the listaEmpleados
     */
    public ArrayList getlistaProductos() {
        return lista;
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

    @Override
    public IDao getDao() {
        return this.dao;
    }

    
    public String[][] getData() {
        return this.data;
    }

    @Override
    public String[] getTitulosParaGrid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void rellenarDataconArrayList(String[][] data, ArrayList lista) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getCantidadColumnas() {
        return 3;
    }
}
