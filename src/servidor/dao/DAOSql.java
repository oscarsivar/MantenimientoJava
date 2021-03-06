/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.dao;

import com.mysql.jdbc.CallableStatement;
import entidad.Cliente;
import entidad.Filtro;
import interfaz.IDao;
import interfaz.IFiltro;
import interfaz.IParametro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paul
 */
public class DAOSql implements IDao {

    private Connection cn;
    PreparedStatement st;
    PreparedStatement stUpd;
    PreparedStatement stDel;

    public DAOSql() {
        try {
            st = cn.prepareStatement("Insert into clientes (Id,nombres,apellido1,apellido2,direccion,telefono,celular,email) values (?,?,?,?,?,?,?,?)");
            stUpd = cn.prepareStatement("Update Clientes set nombres=?,apellido1=?,apellido2=?,direccion=?,telefono=?,celular=?,email=? where id =? ");
            stDel = cn.prepareStatement("Delete from clientes where id =?");
        } catch (SQLException ex) {
        }
    }

    @Override
    public void conectarse() {
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/favoritos?user=root&password=root");
            //Statement stx = cn.createStatement();
            //stx.execute("Insert into .....");

        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (InstantiationException ex) {
        } catch (Exception ex) {
        }
    }

    @Override
    public void desconectarse() {
        //throw new UnsupportedOperationException("Not supported yet.");
        try {
            cn.close();
        } catch (Exception e) {
            
        }
        
    }

    @Override
    public void insertar(IParametro par) {
        Cliente cliente = (Cliente) par;
        try {
            
            st.setString(1, cliente.getCodigo());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido1());
            st.setString(4, cliente.getApellido2());
            st.setString(5, cliente.getDireccion());
            st.setString(6, cliente.getTelefono());
            st.setString(7, cliente.getCelular());
            st.setString(8, cliente.getEmail());
            int x = st.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public void modifica(IParametro par) {
        Cliente cliente = (Cliente) par;
        try {
            stUpd.setString(1, cliente.getNombre());
            stUpd.setString(2, cliente.getApellido1());
            stUpd.setString(3, cliente.getApellido2());
            stUpd.setString(4, cliente.getDireccion());
            stUpd.setString(5, cliente.getTelefono());
            stUpd.setString(6, cliente.getCelular());
            stUpd.setString(7, cliente.getEmail());
            stUpd.setString(8, cliente.getCodigo());
            int x = stUpd.executeUpdate();
        } catch (Exception e) {
        }

    }

    @Override
    public void elimina(IParametro par) {
        Cliente cliente = (Cliente) par;
        try {
            stDel.setString(1, cliente.getCodigo());
            stDel.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList listar(IFiltro filtroGen) {
        Filtro filtro = (Filtro) filtroGen;
        Statement stSel;
        ArrayList lista = null;
        try {
            stSel = cn.createStatement();
            ResultSet rs = stSel.executeQuery("Select id,nombres,apellido1,apellido2,direccion,telefono,celular,email from clientes order by id");
            while (rs.next()) {
                Cliente cl = new Cliente(rs.getString("id"), rs.getString("nombres"),
                        rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("direccion"),
                        rs.getString("telefono"), rs.getString("celular"), rs.getString("email"));
                lista.add(cl);
            }
        } catch (SQLException ex) {
        }
        return lista;
    }

    @Override
    public int conteo() {
        int cuenta = 0;
        try {
            Statement stSelConteo = cn.createStatement();
            ResultSet rs = stSelConteo.executeQuery("Select count(*) as conteo from clientes");
            rs.next();
            cuenta = rs.getInt("conteo");
        } catch (Exception e) {
        }
        return cuenta;
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
