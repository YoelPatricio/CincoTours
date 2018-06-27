
package view;

import dao.GenericDAO;
import dao.HorarioDAO;
import dao.RutaDAO;
import entity.Horario;
import entity.Ruta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class frmHorario extends javax.swing.JDialog {

   DefaultTableModel dtm;
   String accion="";
    public frmHorario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
       
       
        cargarDatos();
        tamañoColumnas();
        
        
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
        lblDospuntos1 = new javax.swing.JLabel();
        cboSM = new javax.swing.JComboBox<>();
        cboST = new javax.swing.JComboBox<>();
        cboSH = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JLabel();
        cboLH = new javax.swing.JComboBox<>();
        lblDospuntos2 = new javax.swing.JLabel();
        cboLM = new javax.swing.JComboBox<>();
        cboLT = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HORARIO.png"))); // NOI18N

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
                "Código", "Hora Salida", "Hora Est. Llegada"
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
        jLabel4.setText("Hora de salida:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Hora Aprox. de llegada:");

        lblDospuntos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDospuntos1.setText(":");

        cboSM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cboSM.setSelectedIndex(-1);
        cboSM.setEnabled(false);

        cboST.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        cboST.setSelectedIndex(-1);
        cboST.setEnabled(false);

        cboSH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cboSH.setSelectedIndex(-1);
        cboSH.setEnabled(false);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        cboLH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cboLH.setSelectedIndex(-1);
        cboLH.setEnabled(false);

        lblDospuntos2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDospuntos2.setText(":");

        cboLM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cboLM.setSelectedIndex(-1);
        cboLM.setEnabled(false);

        cboLT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        cboLT.setSelectedIndex(-1);
        cboLT.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboLH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSH, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDospuntos2)
                            .addComponent(lblDospuntos1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cboLM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboLT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cboSM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboST, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboSH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDospuntos1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboLH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDospuntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            int sh=cboSH.getSelectedIndex();
            int sm=cboSM.getSelectedIndex();
            int st=cboST.getSelectedIndex();
            int lh=cboLH.getSelectedIndex();
            int lm=cboLM.getSelectedIndex();
            int lt=cboLT.getSelectedIndex();
            
            String mensaje="";
            if(sh==0 || sh==-1 || sm==-1 || st==-1 || lh==0 || lh==-1 || lm==-1 || lt==-1){
              JOptionPane.showMessageDialog(null, "Falta completar campos!");  
              return;
            }
            Horario hor = new Horario();
            
            GenericDAO genericDAO = new GenericDAO();
            
            
            hor.setSaliHor(cboSH.getSelectedItem().toString()+":"+cboSM.getSelectedItem().toString()+" "+cboST.getSelectedItem().toString());
            hor.setLlegHor(cboLH.getSelectedItem().toString()+":"+cboLM.getSelectedItem().toString()+" "+cboLT.getSelectedItem().toString());

            hor.setIsDeleted(0);
            
            if(accion.equals("add")){
                hor.setIdHor(0);
                genericDAO.insert(hor);
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            }else{
                hor.setIdHor(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(hor);
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

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        
    }//GEN-LAST:event_tableDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        RutaDAO dao = new RutaDAO();
        GenericDAO g = new GenericDAO();
        accion="add";
        String id=String.valueOf(g.generarID("idHor","Horario"));
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
                //OBTENIENDO HORARIO DE SALIDA
                txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
                int sh=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(0, 2));
                int sm=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(3, 5));
                String st=tableDatos.getValueAt(selection, 1).toString().substring(6, 8);
                int turno=1;
                if(st.equals("AM")){
                    turno=0;
                }
                cboSH.setSelectedIndex(sh);
                cboSM.setSelectedIndex(sm);
                cboST.setSelectedIndex(turno);
                
                //OBTENIENDO HORARIO DE LLEGADA
                int lh=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(0, 2));
                int lm=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(3, 5));
                String lt=tableDatos.getValueAt(selection, 2).toString().substring(6, 8);
                int lturno=1;
                if(st.equals("AM")){
                    lturno=0;
                }
                cboLH.setSelectedIndex(lh);
                cboLM.setSelectedIndex(lm);
                cboLT.setSelectedIndex(lturno);
            }
            
            
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion="edit";
        String codigo=txtCodigo.getText();
        if(!codigo.equals("-")){
            habilitarCajas();
            habilitarBotones(false, true, false, false, true);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }
            
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Horario hor = new Horario();
            GenericDAO genericDAO = new GenericDAO();
            String codigo=txtCodigo.getText();
            if(!codigo.equals("-")){
            hor.setIdHor(Integer.parseInt(txtCodigo.getText()));
            hor.setSaliHor(cboSH.getSelectedItem().toString()+":"+cboSM.getSelectedItem().toString()+" "+cboST.getSelectedItem().toString());
            hor.setLlegHor(cboLH.getSelectedItem().toString()+":"+cboLM.getSelectedItem().toString()+" "+cboLT.getSelectedItem().toString());

            hor.setIsDeleted(1);
           
                
                genericDAO.delete(hor);
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
            
            //OBTENIENDO HORARIO DE SALIDA
                txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
                int sh=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(0, 2));
                int sm=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(3, 5));
                String st=tableDatos.getValueAt(selection, 1).toString().substring(6, 8);
                int turno=1;
                if(st.equals("AM")){
                    turno=0;
                }
                cboSH.setSelectedIndex(sh);
                cboSM.setSelectedIndex(sm);
                cboST.setSelectedIndex(turno);
                
                //OBTENIENDO HORARIO DE LLEGADA
                int lh=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(0, 2));
                int lm=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(3, 5));
                String lt=tableDatos.getValueAt(selection, 2).toString().substring(6, 8);
                int lturno=1;
                if(st.equals("AM")){
                    lturno=0;
                }
                cboLH.setSelectedIndex(lh);
                cboLM.setSelectedIndex(lm);
                cboLT.setSelectedIndex(lturno);
            
        }
        
    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed
        
    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
       if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            //OBTENIENDO HORARIO DE SALIDA
                txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
                int sh=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(0, 2));
                int sm=Integer.parseInt(tableDatos.getValueAt(selection, 1).toString().substring(3, 5));
                String st=tableDatos.getValueAt(selection, 1).toString().substring(6, 8);
                int turno=1;
                if(st.equals("AM")){
                    turno=0;
                }
                cboSH.setSelectedIndex(sh);
                cboSM.setSelectedIndex(sm);
                cboST.setSelectedIndex(turno);
                
                //OBTENIENDO HORARIO DE LLEGADA
                int lh=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(0, 2));
                int lm=Integer.parseInt(tableDatos.getValueAt(selection, 2).toString().substring(3, 5));
                String lt=tableDatos.getValueAt(selection, 2).toString().substring(6, 8);
                int lturno=1;
                if(st.equals("AM")){
                    lturno=0;
                }
                cboLH.setSelectedIndex(lh);
                cboLM.setSelectedIndex(lm);
                cboLT.setSelectedIndex(lturno);
            
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
            java.util.logging.Logger.getLogger(frmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmHorario dialog = new frmHorario(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cboLH;
    private javax.swing.JComboBox<String> cboLM;
    private javax.swing.JComboBox<String> cboLT;
    private javax.swing.JComboBox<String> cboSH;
    private javax.swing.JComboBox<String> cboSM;
    private javax.swing.JComboBox<String> cboST;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDospuntos1;
    private javax.swing.JLabel lblDospuntos2;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
       
        HorarioDAO hDAO = new HorarioDAO();
        
        Horario h=new Horario();
        List<Horario> datos=hDAO.buscarHorario(txtBuscar.getText());
        
        Object[][] matriz = new Object[datos.size()][3];
        
        for (int i = 0; i < datos.size(); i++) {
            matriz[i][0]=datos.get(i).getIdHor();
            matriz[i][1]=datos.get(i).getSaliHor();
            matriz[i][2]=datos.get(i).getLlegHor();           
        }
        Object[][] data=matriz;
        String[] cabecera={"Codigo","Hora Salida","Hora Aprox. Llegada"};
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
        cboSH.setSelectedIndex(-1);
        cboSM.setSelectedIndex(-1);
        cboST.setSelectedIndex(-1);
        
        cboLH.setSelectedIndex(-1);
        cboLM.setSelectedIndex(-1);
        cboLT.setSelectedIndex(-1);
    }
    
    public void habilitarCajas(){
        
        cboSH.setEnabled(true);
        cboSM.setEnabled(true);
        cboST.setEnabled(true);
        
        cboLH.setEnabled(true);
        cboLM.setEnabled(true);
        cboLT.setEnabled(true);
        
    }
    
    public void deshabilitarCajas(){
        cboSH.setEnabled(false);
        cboSM.setEnabled(false);
        cboST.setEnabled(false);
        
        cboLH.setEnabled(false);
        cboLM.setEnabled(false);
        cboLT.setEnabled(false);
    }

    public void tamañoColumnas(){
    
    TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(80);
    columnModel.getColumn(1).setPreferredWidth(200);
    columnModel.getColumn(2).setPreferredWidth(200);
    
    }
}
