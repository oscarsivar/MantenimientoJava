/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormCliente.java
 *
 * Created on Jul 30, 2011, 5:11:29 PM
 */
package cliente.vista;

import cliente.controlador.ControllerCliente;
import entidad.Cliente;
import entidad.Filtro;



/**
 *
 * @author paul
 */
public class FormCliente extends javax.swing.JFrame {
    private ControllerCliente controller;
    /** Creates new form FormCliente */
    public FormCliente() {
        initComponents();
        controller = new ControllerCliente();
        Filtro filtro = new Filtro(false,false,false,"","","");
        controller.setFiltro(filtro);
        this.jtblClientes.setModel(controller);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombres = new javax.swing.JTextField();
        jtxtApellido1 = new javax.swing.JTextField();
        jtxtApellido2 = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCelular = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();
        jbtnFiltrar = new javax.swing.JButton();
        jchkFiltroNombres = new javax.swing.JCheckBox();
        jchkFiltroApellido1 = new javax.swing.JCheckBox();
        jchkFiltroApellido2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Datos del Cliente");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellido 1:");

        jLabel5.setText("Apellido 2:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("Celular:");

        jLabel9.setText("E-Mail:");

        jbtnAgregar.setText("Agregar");
        jbtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAgregarMouseClicked(evt);
            }
        });

        jbtnModificar.setText("Modifcar");
        jbtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseClicked(evt);
            }
        });

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseClicked(evt);
            }
        });

        jbtnCerrar.setText("Cerrar");
        jbtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarMouseClicked(evt);
            }
        });

        jbtnFiltrar.setText("Filtrar...");
        jbtnFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnFiltrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApellido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jchkFiltroApellido1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jchkFiltroApellido2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jchkFiltroNombres)))
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroNombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jtxtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroApellido1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(jtxtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroApellido2)
                            .addComponent(jbtnFiltrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(jtxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCerrar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbtnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseClicked
        // TODO add your handling code here:
        Cliente cl = new Cliente();
        cl.setCodigo(this.jtxtCodigo.getText());
        cl.setNombre(this.jtxtNombres.getText());
        cl.setApellido1(this.jtxtApellido1.getText());
        cl.setApellido2(this.jtxtApellido2.getText());
        cl.setDireccion(this.jtxtDireccion.getText());
        cl.setTelefono(this.jtxtTelefono.getText());
        cl.setCelular(this.jtxtCelular.getText());
        cl.setEmail(this.jtxtEmail.getText());
        
        controller.agregarCliente(cl);
        controller = new ControllerCliente();
        this.jtblClientes.setModel(controller);
    }//GEN-LAST:event_jbtnAgregarMouseClicked

    private void jbtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseClicked
        // TODO add your handling code here:
        Cliente cl = new Cliente();
        cl.setCodigo(this.jtxtCodigo.getText());
        cl.setNombre(this.jtxtNombres.getText());
        cl.setApellido1(this.jtxtApellido1.getText());
        cl.setApellido2(this.jtxtApellido2.getText());
        cl.setDireccion(this.jtxtDireccion.getText());
        cl.setTelefono(this.jtxtTelefono.getText());
        cl.setCelular(this.jtxtCelular.getText());
        cl.setEmail(this.jtxtEmail.getText());
        controller.modificarCliente(cl);
        controller = new ControllerCliente();
        this.jtblClientes.setModel(controller);
    }//GEN-LAST:event_jbtnModificarMouseClicked

    private void jbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseClicked
        // TODO add your handling code here:
        Cliente cl = new Cliente();
        cl.setCodigo(this.jtxtCodigo.getText());
        controller.eliminaCliente(cl);
        controller = new ControllerCliente();
        this.jtblClientes.setModel(controller);
    }//GEN-LAST:event_jbtnEliminarMouseClicked

    private void jbtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnCerrarMouseClicked

    private void jtblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblClientesMouseClicked
        // TODO add your handling code here:
        int x =0;
        x= this.jtblClientes.getSelectedRow();
        Cliente cl = (Cliente) controller.getListaClientes().get(x);
        this.jtxtCodigo.setText(cl.getCodigo());
        //int y = Integer.parseInt(this.jtxtCodigo.getText());
        //String a = String.valueOf(y);
        this.jtxtNombres.setText(cl.getNombre());
        this.jtxtApellido1.setText(cl.getApellido1());
        this.jtxtApellido2.setText(cl.getApellido2());
        this.jtxtDireccion.setText(cl.getDireccion());
        this.jtxtTelefono.setText(cl.getTelefono());
        this.jtxtCelular.setText(cl.getCelular());
        this.jtxtEmail.setText(cl.getEmail());
    }//GEN-LAST:event_jtblClientesMouseClicked

    private void jbtnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnFiltrarMouseClicked
        // TODO add your handling code here:
        boolean filtro1 = this.jchkFiltroNombres.isSelected();
        boolean filtro2 = this.jchkFiltroApellido1.isSelected();
        boolean filtro3 = this.jchkFiltroApellido2.isSelected();
        controller = new ControllerCliente();
        Filtro filtro = new Filtro(filtro1,filtro2,filtro3,this.jtxtNombres.getText(),this.jtxtApellido1.getText(),this.jtxtApellido2.getText());
        controller.setFiltro(filtro);
        controller.getRows();
        this.jtblClientes.setModel(controller);
        
    }//GEN-LAST:event_jbtnFiltrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JCheckBox jchkFiltroApellido1;
    private javax.swing.JCheckBox jchkFiltroApellido2;
    private javax.swing.JCheckBox jchkFiltroNombres;
    private javax.swing.JTable jtblClientes;
    private javax.swing.JTextField jtxtApellido1;
    private javax.swing.JTextField jtxtApellido2;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNombres;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
