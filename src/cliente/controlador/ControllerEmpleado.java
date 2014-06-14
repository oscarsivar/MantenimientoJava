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
import entidad.Empleado;
import entidad.Filtro;
import java.text.SimpleDateFormat;

/**
 *
 * @author paul
 */
public class ControllerEmpleado extends Controller {

    private IDao daoempleados;

    public ControllerEmpleado() {
        super();
        daoempleados = new DAOVista(new Empleado());
        if (!daoempleados.isConectado()) {
            daoempleados.conectarse();
        }
    }

    @Override
    public IDao getDao() {
        return this.daoempleados;
    }

    

    @Override
    public String[] getTitulosParaGrid() {
        String[] listaTitulos = {new String("Código"), new String("Nombres"), new String("Apellido_1"), new String("Apellido_2"), new String("Dirección"), new String("Teléfono"), new String("Celular"), new String("Email"), new String("FechaIngreso"), new String("Cargo")};
        return listaTitulos;
    }

    @Override
    public void rellenarDataconArrayList(String[][] data, ArrayList lista) {
        int numreg = daoempleados.conteo(); 
        Empleado emp;   
        for (int fila = 0; fila < numreg; fila++) {
            emp = (Empleado) lista.get(fila);
            data[fila][0] = emp.getCodigo();
            data[fila][1] = emp.getNombre();
            data[fila][2] = emp.getApellido1();
            data[fila][3] = emp.getApellido2();
            data[fila][4] = emp.getDireccion();
            data[fila][5] = emp.getTelefono();
            data[fila][6] = emp.getCelular();
            data[fila][7] = emp.getEmail();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data[fila][8] = sdf.format(emp.getFechaIngreso());
            data[fila][9] = emp.getCargo();
        }
    }

    @Override
    public int getCantidadColumnas() {
        return 10;
    }
}
