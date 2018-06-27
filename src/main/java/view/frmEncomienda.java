package view;

import dao.BusDAO;
import dao.EmpleadoDAO;
import dao.EncomiendaDAO;
import dao.GenericDAO;
import dao.HorarioDAO;
import dao.ProgramacionDAO;
import dao.RolDAO;
import dao.RutaDAO;
import entity.Bus;
import entity.Empleado;
import entity.Horario;
import entity.Programacion;
import entity.Rol;
import entity.Ruta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmEncomienda extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmEncomienda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
        this.setSize(this.getToolkit().getScreenSize());
        cargarDatos();
        //this.cboxRol.removeAllItems();

       
        
        contador++;
        
        
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboEstadoFiltro = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1292, 558));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/encomienda_1.png"))); // NOI18N

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

        cboEstadoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "REGISTRADO", "ENVIADO", "RECEPCIONADO", "ENTREGADO" }));
        cboEstadoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoFiltroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Estado:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check.png"))); // NOI18N
        jButton1.setText("ENTREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registrarEncomienda.png"))); // NOI18N
        jButton2.setText("Registrar Encomienda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(jButton2)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked

    }//GEN-LAST:event_tableDatosMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargarDatos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMousePressed

        

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        
            int selection = tableDatos.getSelectedRow();
            //txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            
        
    }//GEN-LAST:event_tableDatosKeyReleased

    private void cboEstadoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoFiltroActionPerformed
        cargarDatos();
    }//GEN-LAST:event_cboEstadoFiltroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      
        
        int selection = tableDatos.getSelectedRow();
        if(selection!=-1){
            String estado=String.valueOf(tableDatos.getValueAt(selection, 9));
            if(estado.equals("ENTREGADO")){
                JOptionPane.showMessageDialog(null, "La encomienda ya se ha entregado anteriormente !");
                return;
            }
            else if(!estado.equals("RECEPCIONADO")){
                JOptionPane.showMessageDialog(null, "La encomienda aún no ha llegado a la agencia !");
                return;
            }
            
            String cod=String.valueOf(tableDatos.getValueAt(selection, 0));
            EncomiendaDAO enc = new EncomiendaDAO();
            enc.cambiarEstadoEntregado(Integer.parseInt(cod));
            JOptionPane.showMessageDialog(null, "Se ha realizado la entrega de la encomienda !");
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro !");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmRegistrarEncomienda r = new frmRegistrarEncomienda(null, rootPaneCheckingEnabled);
        r.setVisible(true);
        cargarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                frmEncomienda dialog = new frmEncomienda(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cboEstadoFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public void cargarDatos() {

        EncomiendaDAO encDAO = new EncomiendaDAO();
        
        int cbEstado=-1;

        if(cboEstadoFiltro.getSelectedItem().toString().equals("REGISTRADO")){
            cbEstado=0;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("ENVIADO")){
            cbEstado=1;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("RECEPCIONADO")){
            cbEstado=2;
        }
        else if(cboEstadoFiltro.getSelectedItem().toString().equals("ENTREGADO")){
            cbEstado=3;
        }
        
        List<Object> datos = encDAO.buscarEncomienda(txtBuscar.getText(),cbEstado);

        Object[][] matriz = new Object[datos.size()][10];
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
            matriz[i][6] = s[6];
            matriz[i][7] = s[7];
            matriz[i][8] = s[8];
            
            
            String estado="";
            if(s[9].equals(0)){
                estado="REGISTRADO";
            }else if(s[9].equals(1)){
                estado="ENVIADO";
            }else if(s[9].equals(2)){
                estado="RECEPCIONADO";
            }else if(s[9].equals(3)){
                estado="ENTREGADO";
            }
            
            matriz[i][9] = estado;
            
            
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"Codigo", "Fecha Envio", "Hora Llegada", "N° Bus", "DNI Remitente","Nombres Remitente","DNI Receptor","Nombres Receptor","Precio Total","Estado"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }

    
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(150);
    columnModel.getColumn(2).setPreferredWidth(200);
    columnModel.getColumn(3).setPreferredWidth(250);
    }

}
