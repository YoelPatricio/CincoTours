
package view;

import dao.BusDAO;
import dao.GenericDAO;
import dao.RutaDAO;
import entity.Bus;
import entity.Ruta;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class frmListBus extends javax.swing.JDialog {

   DefaultTableModel dtm;
   String accion="";
    public frmListBus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
       
        cargarDatos();
  
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BUSES.png"))); // NOI18N

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
                "Código", "N° de Bus", "Placa", "Kilometraje", "Marca", "Modelo", "N° Asientos"
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
            tableDatos.getColumnModel().getColumn(0).setHeaderValue("Código");
            tableDatos.getColumnModel().getColumn(1).setHeaderValue("N° de Bus");
            tableDatos.getColumnModel().getColumn(2).setHeaderValue("Placa");
            tableDatos.getColumnModel().getColumn(3).setHeaderValue("Kilometraje");
            tableDatos.getColumnModel().getColumn(4).setHeaderValue("Marca");
            tableDatos.getColumnModel().getColumn(5).setHeaderValue("Modelo");
            tableDatos.getColumnModel().getColumn(6).setHeaderValue("N° Asientos");
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
        jLabel8.setText("Nota: Para seleccionar el Bus haga doble click en el registro.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        if(evt.getClickCount()==2){
            
            int selection = tableDatos.getSelectedRow();
            String estado=String.valueOf(tableDatos.getValueAt(selection, 7));
            if(estado.equals("OCUPADO")){
                JOptionPane.showMessageDialog(null, "El bus se encuentra ocupado !");
                return;
            }

            frmProgramacion.txtIdBus.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            frmProgramacion.txtBusNum.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            frmProgramacion.txtBusPlaca.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            this.dispose();
 
        }
    }//GEN-LAST:event_tableDatosMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargarDatos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMousePressed
        
        if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtNBus.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtPlaca.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtMarca.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtModelo.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            txtKmt.setText(String.valueOf(tableDatos.getValueAt(selection, 5)));
            txtAsientos.setText(String.valueOf(tableDatos.getValueAt(selection, 6)));*/
        }
        
    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed
        
    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
       if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtNBus.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtPlaca.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtMarca.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtModelo.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            txtKmt.setText(String.valueOf(tableDatos.getValueAt(selection, 5)));
            txtAsientos.setText(String.valueOf(tableDatos.getValueAt(selection, 6)));*/
            
        }
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
            java.util.logging.Logger.getLogger(frmListBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmListBus dialog = new frmListBus(new javax.swing.JFrame(), true);
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
        
        BusDAO busDAO = new BusDAO();
        Bus bus = new Bus();
        List<Bus> datos=busDAO.buscarBus(txtBuscar.getText());
        
        Object[][] matriz = new Object[datos.size()][8];
        
        for (int i = 0; i < datos.size(); i++) {
            matriz[i][0]=datos.get(i).getIdBus();
            matriz[i][1]=datos.get(i).getNumeBus();
            matriz[i][2]=datos.get(i).getPlacBus();
            matriz[i][3]=datos.get(i).getMarcBus();
            matriz[i][4]=datos.get(i).getModeBus();
            matriz[i][5]=datos.get(i).getKmetBus();
            matriz[i][6]=datos.get(i).getNasiBus();
            int estaBus=datos.get(i).getEstaBus();
            String estado="DISPONIBLE";
            if(estaBus==1){
                estado="OCUPADO";
            }
            matriz[i][7]=estado;
            
            
        }
        Object[][] data=matriz;
        String[] cabecera={"Codigo","N° Bus","Placa","Marca","Modelo","Kilometraje","N° Asientos","Estado"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }
    
    /*public void habilitarBotones(boolean b1,boolean b2,boolean b3,boolean b4,boolean b5){
        btnNuevo.setEnabled(b1);
        btnGrabar.setEnabled(b2);
        btnEditar.setEnabled(b3);
        btnEliminar.setEnabled(b4);
        btnCancelar.setEnabled(b5);
    }
    
    public void limpiarCajas(){
        txtCodigo.setText("-");
        txtNBus.setText("");
        txtNBus.requestFocus();
        txtMarca.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtAsientos.setText("");
        txtKmt.setText("");
        
    }
    
    public void habilitarCajas(){
        txtNBus.setEnabled(true);
        txtMarca.setEnabled(true);
        txtPlaca.setEnabled(true);
        txtModelo.setEnabled(true);
        txtAsientos.setEnabled(true);
        txtKmt.setEnabled(true);
    }
    
    public void deshabilitarCajas(){
        
        txtNBus.setEnabled(false);
        txtMarca.setEnabled(false);
        txtPlaca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtAsientos.setEnabled(false);
        txtKmt.setEnabled(false);
    }*/


}
