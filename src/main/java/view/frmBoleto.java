package view;

import dao.BoletoDAO;
import dao.BusDAO;
import dao.EmpleadoDAO;
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

public class frmBoleto extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmBoleto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
        this.setSize(this.getToolkit().getScreenSize());
        cargarDatos();
        //this.cboxRol.removeAllItems();

        /*/LLENAR COMBO HORARIO
        HorarioDAO horarioDAO = new HorarioDAO();
        List<Object> list = horarioDAO.listHorario();
        this.cboHorario.addItem("--Seleccione--");
            
        for (int i = 0; i < list.size(); i++) {
            this.cboHorario.addItem( list.get(i).toString());
        }
        
        //LLENAR COMBO RUTA
        RutaDAO rutaDAO = new RutaDAO();
        List<Ruta> listRuta = rutaDAO.listRuta();
        this.cboRuta.addItem("--Seleccione--");
            
        for (int i = 0; i < listRuta.size(); i++) {
            this.cboRuta.addItem( listRuta.get(i).getNombRut());
        }
        
        contador++;
        
        txtIdBus.setVisible(false);
        txtIdPiloto.setVisible(false);
        txtIdCoPiloto.setVisible(false);
        txtIdRuta.setVisible(false);
        txtIdHorario.setVisible(false);
        txtValCoPi.setVisible(false);*/
        
        

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
        btnAnularBoleto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/boletos_1.png"))); // NOI18N

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
                "Número Boleto", "Fecha Viaje", "Horario Viaje", "Empresa RUC", "Razón Social", "Pasajero DNI", "Nombres", "Ruta", "Total", "Estado"
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
            tableDatos.getColumnModel().getColumn(0).setMinWidth(100);
            tableDatos.getColumnModel().getColumn(0).setMaxWidth(100);
            tableDatos.getColumnModel().getColumn(1).setMinWidth(80);
            tableDatos.getColumnModel().getColumn(1).setMaxWidth(80);
            tableDatos.getColumnModel().getColumn(3).setMinWidth(100);
            tableDatos.getColumnModel().getColumn(3).setMaxWidth(100);
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

        cboEstadoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "EMITIDOS", "ANULADOS" }));
        cboEstadoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoFiltroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Estado:");

        btnAnularBoleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus.png"))); // NOI18N
        btnAnularBoleto.setText("ANULAR BOLETO");
        btnAnularBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularBoletoActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/boletos.png"))); // NOI18N
        jButton2.setText("Vender Boleto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1223, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnularBoleto)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(546, 546, 546)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnularBoleto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            
            Date fecha=(Date) tableDatos.getValueAt(selection, 1);
            txtFecha.setDate(fecha);

            cboHorario.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 2)));
            cboRuta.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtBusNum.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            txtBusPlaca.setText(String.valueOf(tableDatos.getValueAt(selection,5)));
            txtDNIPiloto.setText(String.valueOf(tableDatos.getValueAt(selection,6)));
            txtNombPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 7)));
            txtDNICoPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 8)));
            txtNombCoPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 9)));
            
            String dniPi=String.valueOf(tableDatos.getValueAt(selection,6));
            EmpleadoDAO empDAO = new EmpleadoDAO();
            List<Object> datoPi=empDAO.buscarEmpleadoxDNI(dniPi);
            Object[] s = new Object[]{};
            s=(Object[]) datoPi.get(0);
            txtIdPiloto.setText(s[0].toString());
            
            String dniCoPi=String.valueOf(tableDatos.getValueAt(selection,8));
           
            List<Object> datoCoPi=empDAO.buscarEmpleadoxDNI(dniCoPi);
            Object[] ss = new Object[]{};
            ss=(Object[]) datoCoPi.get(0);
            txtIdCoPiloto.setText(ss[0].toString());
        
        */
            
        }

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            Date fecha=(Date) tableDatos.getValueAt(selection, 1);
            txtFecha.setDate(fecha);
            cboHorario.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 2)));
            cboRuta.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtBusNum.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            txtBusPlaca.setText(String.valueOf(tableDatos.getValueAt(selection,5)));
            txtDNIPiloto.setText(String.valueOf(tableDatos.getValueAt(selection,6)));
            txtNombPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 7)));
            txtDNICoPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 8)));
            txtNombCoPiloto.setText(String.valueOf(tableDatos.getValueAt(selection, 9)));
            
            String dniPi=String.valueOf(tableDatos.getValueAt(selection,6));
            EmpleadoDAO empDAO = new EmpleadoDAO();
            List<Object> datoPi=empDAO.buscarEmpleadoxDNI(dniPi);
            Object[] s = new Object[]{};
            s=(Object[]) datoPi.get(0);
            txtIdPiloto.setText(s[0].toString());
            
            String dniCoPi=String.valueOf(tableDatos.getValueAt(selection,8));
           
            List<Object> datoCoPi=empDAO.buscarEmpleadoxDNI(dniCoPi);
            Object[] ss = new Object[]{};
            ss=(Object[]) datoCoPi.get(0);
            txtIdCoPiloto.setText(ss[0].toString());*/
        }
    }//GEN-LAST:event_tableDatosKeyReleased

    private void cboEstadoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoFiltroActionPerformed
        cargarDatos();
    }//GEN-LAST:event_cboEstadoFiltroActionPerformed

    private void btnAnularBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularBoletoActionPerformed
        
      
       
        int selection = tableDatos.getSelectedRow();
        if(selection!=-1){
            String estado=String.valueOf(tableDatos.getValueAt(selection, 9));
            if(estado.equals("ANULADO")){
                JOptionPane.showMessageDialog(null, "El boleto ya esta anulado !");
                return;
            }
            
            String cod=String.valueOf(tableDatos.getValueAt(selection, 0));
            BoletoDAO bol = new BoletoDAO();
            bol.cambiarEstado(Integer.parseInt(cod));
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro !");
        }
        
        
        
    }//GEN-LAST:event_btnAnularBoletoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmVentaBoleto v = new frmVentaBoleto(null, rootPaneCheckingEnabled);
        v.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmBoleto dialog = new frmBoleto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnularBoleto;
    private javax.swing.JComboBox<String> cboEstadoFiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public void cargarDatos() {

        BoletoDAO bolDAO = new BoletoDAO();
      
        int cbEstado=-1;
        if(cboEstadoFiltro.getSelectedItem().toString().equals("EMITIDOS")){
            cbEstado=0;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("ANULADOS")){
            cbEstado=1;
        }
        
        List<Object> datos = bolDAO.buscarBoleto(txtBuscar.getText(),cbEstado);

        Object[][] matriz = new Object[datos.size()][10];
        Object[] s = new Object[]{};
        for (int i = 0; i < datos.size(); i++) {
            
            s=(Object[]) datos.get(i);
            //System.out.println(s[0]);
            
            matriz[i][0] = s[0];
            matriz[i][1] = s[4];
            matriz[i][2] = s[5];
            matriz[i][3] = s[6];
            matriz[i][4] = s[7];
            matriz[i][5] = s[8];
            matriz[i][6] = s[9];
            matriz[i][7] = s[10];
            matriz[i][8] = s[13];
            
            String estado="ANULADO";
            if((int)s[14]==0){
                estado="EMITIDO";
            }
            matriz[i][9] = estado;
            
           
            
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"Número Boleto", "Fecha Viaje","Horario Viaje", "Empresa RUC", "Razón Social", "Pasajero DNI","Nombres","Ruta","Total","Estado"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }

    /*public void habilitarBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean lupa) {
        btnNuevo.setEnabled(b1);
        btnGrabar.setEnabled(b2);
        btnEditar.setEnabled(b3);
        btnEliminar.setEnabled(b4);
        btnCancelar.setEnabled(b5);
        btnBusSelect.setEnabled(lupa);
        btnPilotoSelect.setEnabled(lupa);
        btnCoPilotoSelect.setEnabled(lupa);
    }

    public void limpiarCajas() {
        txtCodigo.setText("-");
        
        txtFecha.setDate(null);
        
        txtBusNum.setText("");
        txtBusPlaca.setText("");
        
        txtDNIPiloto.setText("");
        txtNombPiloto.setText("");
        
        txtDNICoPiloto.setText("");
        txtNombCoPiloto.setText("");
        
        cboHorario.setSelectedIndex(0);
        cboRuta.setSelectedIndex(0);
        
        txtIdPiloto.setText("0");
        txtIdCoPiloto.setText("0");

    }

    public void habilitarCajas() {
        txtFecha.setEnabled(true);
        cboHorario.setEnabled(true);
        cboRuta.setEnabled(true);
        
        txtBusNum.setEnabled(true);
        txtBusPlaca.setEnabled(true);
        
        txtDNIPiloto.setEnabled(true);
        txtNombPiloto.setEnabled(true);
        
        txtDNICoPiloto.setEnabled(true);
        txtNombCoPiloto.setEnabled(true);
        
        txtBusNum.setEditable(false);
        txtBusPlaca.setEditable(false);
        
        txtDNIPiloto.setEditable(false);
        txtNombPiloto.setEditable(false);
        
        txtDNICoPiloto.setEditable(false);
        txtNombCoPiloto.setEditable(false);
        
    }

    public void deshabilitarCajas() {

        
        txtFecha.setEnabled(false);
        cboHorario.setEnabled(false);
        cboRuta.setEnabled(false);
        
        txtBusNum.setEnabled(false);
        txtBusPlaca.setEnabled(false);
        
        txtDNIPiloto.setEnabled(false);
        txtNombPiloto.setEnabled(false);
        
        txtDNICoPiloto.setEnabled(false);
        txtNombCoPiloto.setEnabled(false);
  
    }
    
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(150);
    columnModel.getColumn(2).setPreferredWidth(200);
    columnModel.getColumn(3).setPreferredWidth(250);
    }*/

}
