package view;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import dao.BusDAO;
import dao.EmpleadoDAO;
import dao.GenericDAO;
import dao.RolDAO;
import dao.RutaDAO;
import entity.Bus;
import entity.Empleado;
import entity.Rol;
import entity.Ruta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListEmpleado extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmListEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        cargarDatos();
        //this.cboxRol.removeAllItems();

        RolDAO rolDAO = new RolDAO();
        List<Rol> list = rolDAO.listRol();

        
        //this.cboxRol.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/EMPLEADOS_1.png"))); // NOI18N

        tableDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tableDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "DNI", "Nombres y Apellidos", "Celular", "Direccion"
            }
        ));
        tableDatos.getTableHeader().setReorderingAllowed(false);
        tableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableDatosMousePressed(evt);
            }
        });
        tableDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableDatosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableDatosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableDatos);
        if (tableDatos.getColumnModel().getColumnCount() > 0) {
            tableDatos.getColumnModel().getColumn(0).setMinWidth(50);
            tableDatos.getColumnModel().getColumn(0).setMaxWidth(50);
            tableDatos.getColumnModel().getColumn(1).setMinWidth(80);
            tableDatos.getColumnModel().getColumn(1).setMaxWidth(80);
            tableDatos.getColumnModel().getColumn(2).setMinWidth(200);
            tableDatos.getColumnModel().getColumn(2).setMaxWidth(200);
            tableDatos.getColumnModel().getColumn(3).setMinWidth(80);
            tableDatos.getColumnModel().getColumn(3).setMaxWidth(80);
            tableDatos.getColumnModel().getColumn(4).setMinWidth(200);
            tableDatos.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Nota: Para seleccionar el empleado haga doble click en el registro.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        if(evt.getClickCount()==2){
            
            int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));*/
            frmUsuario.txtCodEmp.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            frmUsuario.txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            frmUsuario.txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            this.dispose();
            
        }
    }//GEN-LAST:event_tableDatosMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargarDatos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMousePressed

        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtCelular.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtDireccion.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            cboxRol.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 5)));*/
        }

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        
    }//GEN-LAST:event_tableDatosKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmListEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmListEmpleado dialog = new frmListEmpleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        EmpleadoDAO empDAO = new EmpleadoDAO();
        Empleado bus = new Empleado();
        List<Object> datos = empDAO.buscarEmpleado(txtBuscar.getText());

        Object[][] matriz = new Object[datos.size()][6];
        Object[] s = new Object[]{};
        for (int i = 0; i < datos.size(); i++) {
            
            
            
            
            s=(Object[]) datos.get(i);
            System.out.println(s[0]);
            
            matriz[i][0] = s[0];
            matriz[i][1] = s[1];
            matriz[i][2] = s[2];
            matriz[i][3] = s[3];
            matriz[i][4] = s[4];
            matriz[i][5] = s[5];
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"Codigo", "N° DNI", "Nombres y Apellidos", "N° Celular", "Dirección","Rol"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }

    /*public void habilitarBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5) {
        btnNuevo.setEnabled(b1);
        btnGrabar.setEnabled(b2);
        btnEditar.setEnabled(b3);
        btnEliminar.setEnabled(b4);
        btnCancelar.setEnabled(b5);
    }

    public void limpiarCajas() {
        txtCodigo.setText("-");
        txtDNI.setText("");
        txtDNI.requestFocus();
        txtNombres.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        cboxRol.setSelectedIndex(0);

    }

    public void habilitarCajas() {
        txtDNI.setEnabled(true);
        txtNombres.setEnabled(true);
        txtCelular.setEnabled(true);
        txtDireccion.setEnabled(true);
        cboxRol.setEnabled(true);
        
    }

    public void deshabilitarCajas() {

        txtDNI.setEnabled(false);
        txtNombres.setEnabled(false);
        txtCelular.setEnabled(false);
        txtDireccion.setEnabled(false);
        cboxRol.setEnabled(false);
        
    }*/

}
