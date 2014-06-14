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

import cliente.controlador.ControllerProducto;
import entidad.Producto;
import entidad.Filtro;



/**
 *
 * @author paul
 */
public class FormProducto extends javax.swing.JFrame {
    private ControllerProducto controller;
    /** Creates new form FormCliente */
    public FormProducto() {
        initComponents();
        controller = new ControllerProducto();
        Filtro filtro = new Filtro(false,false,false,"","","");
        controller.setFiltro(filtro);
        this.jtblProductos.setModel(controller); 
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
        jtblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtDescripcion = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();
        jbtnFiltrar = new javax.swing.JButton();
        jchkFiltroNombres = new javax.swing.JCheckBox();
        jchkFiltroApellido1 = new javax.swing.JCheckBox();
        jchkFiltroApellido2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblProductos);

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

        jLabel1.setText("Datos del Producto");

        jLabel3.setText("Código:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Descripción:");

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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchkFiltroApellido1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jchkFiltroApellido2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jchkFiltroNombres))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
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
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroNombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroApellido1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jchkFiltroApellido2)
                            .addComponent(jbtnFiltrar))
                        .addGap(81, 81, 81)
                        .addComponent(jbtnCerrar))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAgregarMouseClicked
        // TODO add your handling code here:
        Producto pr = new Producto();
        pr.setIdProducto(this.jtxtCodigo.getText());
        pr.setNombre(this.jtxtNombre.getText());
        pr.setDescripcion(this.jtxtDescripcion.getText());
        controller.agregar(pr);
        controller = new ControllerProducto();
        this.jtblProductos.setModel(controller);
    }//GEN-LAST:event_jbtnAgregarMouseClicked

    private void jbtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseClicked
        // TODO add your handling code here:
        Producto pr = new Producto();
        pr.setIdProducto(this.jtxtCodigo.getText());
        pr.setNombre(this.jtxtNombre.getText());
        pr.setDescripcion(this.jtxtDescripcion.getText());
        controller.modificar(pr);
        controller = new ControllerProducto();
        this.jtblProductos.setModel(controller);
    }//GEN-LAST:event_jbtnModificarMouseClicked

    private void jbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseClicked
        // TODO add your handling code here:
        Producto pr = new Producto();
        pr.setIdProducto(this.jtxtCodigo.getText());
        controller.elimina(pr);
        controller = new ControllerProducto();
        this.jtblProductos.setModel(controller);
    }//GEN-LAST:event_jbtnEliminarMouseClicked

    private void jbtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnCerrarMouseClicked

    private void jtblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProductosMouseClicked
        // TODO add your handling code here:
        int x =0;
        x= this.jtblProductos.getSelectedRow();
        Producto pr = (Producto) controller.getlistaProductos().get(x);
        this.jtxtCodigo.setText(pr.getIdProducto());
        this.jtxtNombre.setText(pr.getNombre());
        this.jtxtDescripcion.setText(pr.getDescripcion());
    }//GEN-LAST:event_jtblProductosMouseClicked

    private void jbtnFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnFiltrarMouseClicked
        // TODO add your handling code here:
        boolean filtro1 = this.jchkFiltroNombres.isSelected();
        boolean filtro2 = this.jchkFiltroApellido1.isSelected();
        boolean filtro3 = this.jchkFiltroApellido2.isSelected();
        controller = new ControllerProducto();
        Filtro filtro = new Filtro(filtro1,filtro2,filtro3,this.jtxtCodigo.getText(),this.jtxtNombre.getText(),this.jtxtDescripcion.getText());
        controller.setFiltro(filtro);
        controller.getRows();
        this.jtblProductos.setModel(controller);
        
    }//GEN-LAST:event_jbtnFiltrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTable jtblProductos;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}