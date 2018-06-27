package view;

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

public class frmListProgramacion3 extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmListProgramacion3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        cargarDatos();
        tamañoColumnas();
        //this.cboxRol.removeAllItems();

        //LLENAR COMBO HORARIO
        /*HorarioDAO horarioDAO = new HorarioDAO();
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
        txtValCoPi.setVisible(false);
        */
        

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/programacion_1.png"))); // NOI18N

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
                "Código", "Fecha", "Horario", "Ruta", "N° Bus", "Placa", "Estado"
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
            tableDatos.getColumnModel().getColumn(1).setMinWidth(90);
            tableDatos.getColumnModel().getColumn(1).setMaxWidth(90);
            tableDatos.getColumnModel().getColumn(2).setMinWidth(120);
            tableDatos.getColumnModel().getColumn(2).setMaxWidth(120);
            tableDatos.getColumnModel().getColumn(3).setMinWidth(150);
            tableDatos.getColumnModel().getColumn(3).setMaxWidth(150);
            tableDatos.getColumnModel().getColumn(4).setMinWidth(50);
            tableDatos.getColumnModel().getColumn(4).setMaxWidth(50);
            tableDatos.getColumnModel().getColumn(5).setMinWidth(80);
            tableDatos.getColumnModel().getColumn(5).setMaxWidth(80);
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
        jLabel8.setText("Nota: Para seleccionar la programación haga doble click en el registro.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        if(evt.getClickCount()==2){
            
            int selection = tableDatos.getSelectedRow();
            /*txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));*/
            frmRegistrarEncomienda.txtIdProg.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            frmRegistrarEncomienda.txtFechaProg.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            frmRegistrarEncomienda.txtHorarioProg.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            frmRegistrarEncomienda.txtBusNumProg.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            frmRegistrarEncomienda.txtPlacaBusProg.setText(String.valueOf(tableDatos.getValueAt(selection, 5)));
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
            txtIdCoPiloto.setText(ss[0].toString());
            */
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
            java.util.logging.Logger.getLogger(frmListProgramacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListProgramacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListProgramacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListProgramacion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmListProgramacion3 dialog = new frmListProgramacion3(new javax.swing.JFrame(), true);
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

    public void cargarDatos() {

        ProgramacionDAO proDAO = new ProgramacionDAO();
        Empleado bus = new Empleado();
        int cbEstado=-1;
        /*if(cboEstadoFiltro.getSelectedItem().toString().equals("PROGRAMADO")){
            cbEstado=0;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("EN CURSO")){
            cbEstado=1;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("FINALIZADO")){
            cbEstado=2;
        }*/
        
        List<Object> datos = proDAO.buscarProgramacion(txtBuscar.getText(),0);

        Object[][] matriz = new Object[datos.size()][12];
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
            
            String estado="";
            if(s[10].equals(0)){
                estado="PROGRAMADO";
            }else if(s[10].equals(1)){
                estado="EN CURSO";
            }else if(s[10].equals(2)){
                estado="FINALIZADO";
            }
            
            matriz[i][6] = estado;
           
            
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"Codigo", "Fecha", "Horario", "Ruta", "N° Bus","Placa","Estado Prog."};
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
    */
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(90);
    columnModel.getColumn(2).setPreferredWidth(120);
    columnModel.getColumn(3).setPreferredWidth(150);
    columnModel.getColumn(4).setPreferredWidth(70);
    columnModel.getColumn(5).setPreferredWidth(80);
    columnModel.getColumn(6).setPreferredWidth(100);
    }
    
}
