package cliente.controlador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import cliente.dao.DAOVista;
import interfaz.IDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import entidad.Cliente;
import entidad.Filtro;

/**
 *
 * @author paul
 */
public class ControllerCliente extends DefaultTableModel {

    private int numreg = 0;
    private String data[][];
    private IDao daoclientes;
    private ArrayList listaClientes;
    private Filtro filtro = new Filtro(false, false, false, "", "", "");

    public ControllerCliente() {
        super();
        daoclientes = new DAOVista(new Cliente());
        if (!daoclientes.isConectado()) {
            daoclientes.conectarse();
        }
        data = getRows();
        setDataVector(data, getCols());

    }

    public String[][] getRows() {
        ArrayList lista;
        numreg = daoclientes.conteo();
        data = new String[numreg][8];
        Cliente cl;
        try {
            lista = daoclientes.listar(this.filtro);
            this.listaClientes = lista;
            //String.valueOf(pr.getCosto())
            //for (Object cl1 : lista) {
                
            //}
            for (int fila = 0; fila < numreg; fila++) {
                cl = (Cliente) lista.get(fila);
                data[fila][0] = cl.getCodigo();
                data[fila][1] = cl.getNombre();
                data[fila][2] = cl.getApellido1();
                data[fila][3] = cl.getApellido2();
                data[fila][4] = cl.getDireccion();
                data[fila][5] = cl.getTelefono();
                data[fila][6] = cl.getCelular();
                data[fila][7] = cl.getEmail();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public String[] getCols() {
        String[] Encabezados = {new String("Código"), new String("Nombres"), new String("Apellido_1"), new String("Apellido_2"), new String("Dirección"), new String("Teléfono"), new String("Celular"), new String("Email")};
        return Encabezados;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    public void agregarCliente(Cliente cliente) {
        daoclientes.insertar(cliente);
    }

    public void modificarCliente(Cliente cliente) {
        daoclientes.modifica(cliente);
    }

    public void eliminaCliente(Cliente cliente) {
        daoclientes.elimina(cliente);
    }

    /**
     * @return the listaClientes
     */
    public ArrayList getListaClientes() {
        return listaClientes;
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
