
package view;

import dao.GenericDAO;
import dao.RutaDAO;
import entity.Ruta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmRuta extends javax.swing.JDialog {

   DefaultTableModel dtm;
   String accion="";
    public frmRuta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
       
        rbtnNS.setSelected(true);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtPrecioNormal = new javax.swing.JTextField();
        txtPrecioFeriado = new javax.swing.JTextField();
        rbtnNS = new javax.swing.JRadioButton();
        rbtnSN = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/RUTAS.png"))); // NOI18N

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
                "Código", "Origen", "Destino", "Precio Normal", "Precio Feriados", "Orientacion"
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Origen:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Destino:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Precio Normal:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Precio Feriados:");

        txtOrigen.setEnabled(false);

        txtDestino.setEnabled(false);

        txtPrecioNormal.setEnabled(false);

        txtPrecioFeriado.setEnabled(false);

        rbtnNS.setText("Norte a Sur");
        rbtnNS.setEnabled(false);
        rbtnNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNSActionPerformed(evt);
            }
        });

        rbtnSN.setText("Sur a Norte");
        rbtnSN.setEnabled(false);
        rbtnSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSNActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Orientación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioNormal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtPrecioFeriado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnNS)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnSN)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioFeriado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNS)
                    .addComponent(rbtnSN)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nuevo2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grabar.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            
            String origen=txtOrigen.getText();
            String destino=txtDestino.getText();
            String normal=txtPrecioNormal.getText();
            String mensaje="";
            if(origen.equals("") || destino.equals("") || normal.equals("")){
                mensaje = mensaje + (String)(origen.equals("")?"\n - Origen":"");
                mensaje = mensaje + (String)(destino.equals("")?"\n - Destino":"");
                mensaje = mensaje + (String)(normal.equals("")?"\n - Precio Normal":"");
              JOptionPane.showMessageDialog(null, "Falta ingresar !" + mensaje);  
              return;
            }
            
            Ruta ruta = new Ruta();
            RutaDAO rutaDAO = new RutaDAO();
            GenericDAO genericDAO = new GenericDAO();
            
            
            ruta.setNombRut(txtOrigen.getText()+" - "+txtDestino.getText());
            ruta.setPnorRut(new BigDecimal(txtPrecioNormal.getText()));
            ruta.setPferRut(new BigDecimal(txtPrecioFeriado.getText()));
            ruta.setIsDeleted(0);
            if(rbtnNS.isSelected()==true){
                ruta.setNorsurRut(0);
            }else if(rbtnSN.isSelected()==true){
                ruta.setNorsurRut(1);
            }
                 
            if(accion.equals("add")){
                ruta.setIdRut(0);
                genericDAO.insert(ruta);
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            }else{
                ruta.setIdRut(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(ruta);
                JOptionPane.showMessageDialog(null, "Registro editado exitosamente !");
            }
            accion="";
            cargarDatos();
            limpiarCajas();
            deshabilitarCajas();
            habilitarBotones(true, false, true, true, false);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void rbtnSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSNActionPerformed
        rbtnNS.setSelected(false);
    }//GEN-LAST:event_rbtnSNActionPerformed

    private void rbtnNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNSActionPerformed
        rbtnSN.setSelected(false);
    }//GEN-LAST:event_rbtnNSActionPerformed

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        
    }//GEN-LAST:event_tableDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RutaDAO dao = new RutaDAO();
        GenericDAO g = new GenericDAO();
        accion="add";
        String id=String.valueOf(g.generarID("idRut","Ruta"));
        habilitarCajas();
        limpiarCajas();
        txtCodigo.setText(id);
        habilitarBotones(false, true, false, false, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCajas();
        habilitarBotones(true, false, true, true, false);
        deshabilitarCajas();
        accion="";
        
            int selection = tableDatos.getSelectedRow();
            if(selection!=-1){
                txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtOrigen.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDestino.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtPrecioNormal.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtPrecioFeriado.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            if(tableDatos.getValueAt(selection, 5).equals("Norte a Sur")){
                rbtnNS.setSelected(true);
                rbtnSN.setSelected(false);
            }else{
                rbtnNS.setSelected(false);
                rbtnSN.setSelected(true);
            } 
            }
            
            
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion="edit";
        String codigo=txtCodigo.getText();
        if(!codigo.equals("-")){
            habilitarCajas();
            txtCodigo.requestFocus();
            habilitarBotones(false, true, false, false, true);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }
            
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Ruta ruta = new Ruta();
            RutaDAO rutaDAO = new RutaDAO();
            GenericDAO genericDAO = new GenericDAO();
            String codigo=txtCodigo.getText();
            if(!codigo.equals("-")){
            ruta.setIdRut(Integer.parseInt(txtCodigo.getText()));
            ruta.setNombRut(txtOrigen.getText()+" - "+txtDestino.getText());
            ruta.setPnorRut(new BigDecimal(txtPrecioNormal.getText()));
            ruta.setPferRut(new BigDecimal(txtPrecioFeriado.getText()));
            ruta.setIsDeleted(1);
            if(rbtnNS.isSelected()==true){
                ruta.setNorsurRut(0);
            }else if(rbtnSN.isSelected()==true){
                ruta.setNorsurRut(1);
            }
                
                genericDAO.delete(ruta);
                JOptionPane.showMessageDialog(null, "Registro eliminado !");
            }else{
                
                JOptionPane.showMessageDialog(null, "Seleccione un Registro !");
            }
            cargarDatos();
            limpiarCajas();
          
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargarDatos();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMousePressed
        
        if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtOrigen.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDestino.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtPrecioNormal.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtPrecioFeriado.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            if(tableDatos.getValueAt(selection, 5).equals("Norte a Sur")){
                rbtnNS.setSelected(true);
                rbtnSN.setSelected(false);
            }else{
                rbtnNS.setSelected(false);
                rbtnSN.setSelected(true);
            } 
        }
        
    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed
        
    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
       if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtOrigen.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDestino.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtPrecioNormal.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtPrecioFeriado.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            if(tableDatos.getValueAt(selection, 5).equals("Norte a Sur")){
                rbtnNS.setSelected(true);
                rbtnSN.setSelected(false);
            }else{
                rbtnNS.setSelected(false);
                rbtnSN.setSelected(true);
            } 
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
            java.util.logging.Logger.getLogger(frmRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRuta dialog = new frmRuta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnNS;
    private javax.swing.JRadioButton rbtnSN;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecioFeriado;
    private javax.swing.JTextField txtPrecioNormal;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
        RutaDAO rutaDAO = new RutaDAO();
        Ruta ruta = new Ruta();
        List<Ruta> datos=rutaDAO.buscarRuta(txtBuscar.getText());
        
        Object[][] matriz = new Object[datos.size()][6];
        
        for (int i = 0; i < datos.size(); i++) {
            matriz[i][0]=datos.get(i).getIdRut();
            String[] nombRuta=datos.get(i).getNombRut().split("-");
            matriz[i][1]=nombRuta[0].trim();
            matriz[i][2]=nombRuta[1].trim();
            matriz[i][3]=datos.get(i).getPnorRut();
            matriz[i][4]=datos.get(i).getPferRut();
            String orientacion= "";
            if(datos.get(i).getNorsurRut()==0){
                orientacion="Norte a Sur";
            }else{
                orientacion="Sur a Norte";
            }
            matriz[i][5]=orientacion;
        }
        Object[][] data=matriz;
        String[] cabecera={"Codigo","Origen","Destino","Precio Normal","Precio Feriado","Orientacion"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }
    
    public void habilitarBotones(boolean b1,boolean b2,boolean b3,boolean b4,boolean b5){
        btnNuevo.setEnabled(b1);
        btnGrabar.setEnabled(b2);
        btnEditar.setEnabled(b3);
        btnEliminar.setEnabled(b4);
        btnCancelar.setEnabled(b5);
    }
    
    public void limpiarCajas(){
        txtCodigo.setText("-");
        txtOrigen.setText("");
        txtOrigen.requestFocus();
        txtDestino.setText("");
        txtPrecioNormal.setText("");
        txtPrecioFeriado.setText("");
        rbtnNS.setSelected(true);
        rbtnSN.setSelected(false);
    }
    
    public void habilitarCajas(){
        rbtnNS.setEnabled(true);
        rbtnSN.setEnabled(true);
        txtOrigen.setEnabled(true);
        txtDestino.setEnabled(true);
        txtPrecioNormal.setEnabled(true);
        txtPrecioFeriado.setEnabled(true);
    }
    
    public void deshabilitarCajas(){
        rbtnNS.setEnabled(false);
        rbtnSN.setEnabled(false);
        txtOrigen.setEnabled(false);
        txtDestino.setEnabled(false);
        txtPrecioNormal.setEnabled(false);
        txtPrecioFeriado.setEnabled(false);
    }


}
