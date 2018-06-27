package view;

import dao.BusDAO;
import dao.EmpleadoDAO;
import dao.GenericDAO;
import dao.RolDAO;
import dao.RutaDAO;
import dao.UsuarioDAO;
import static dao.UsuarioDAO.obtenerCampos;
import entity.Bus;
import entity.Empleado;
import entity.Rol;
import entity.Ruta;
import entity.Usuario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUsuario extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        cargarDatos();
        //this.cboxRol.removeAllItems();

        RolDAO rolDAO = new RolDAO();
        List<Rol> list = rolDAO.listRol();

        
        contador++;
        
        txtCodEmp.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodEmp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRepetirPassword = new javax.swing.JPasswordField();
        btnLupaEmpleado = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/USUARIOS_1.png"))); // NOI18N

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombres:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Usuario:");

        txtDNI.setEnabled(false);

        txtNombres.setEnabled(false);

        txtUsuario.setEnabled(false);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña:");

        txtCodEmp.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Repetir Contraseña:");

        txtPassword.setEnabled(false);

        txtRepetirPassword.setEnabled(false);

        btnLupaEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnLupaEmpleado.setEnabled(false);
        btnLupaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLupaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtCodEmp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLupaEmpleado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGap(72, 72, 72))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            String dni=txtDNI.getText();
            String usua=txtUsuario.getText();
            String pass=txtPassword.getText();
            String passre=txtRepetirPassword.getText();
            String mensaje="";
            if(dni.equals("") || usua.equals("") || pass.equals("") || passre.equals("")){
                mensaje = mensaje + (String)(dni.equals("")?"\n - Seleccione el empleado ":"");
                mensaje = mensaje + (String)(usua.equals("")?"\n - Usuario":"");
                mensaje = mensaje + (String)(pass.equals("")?"\n - Contraseña":"");
                mensaje = mensaje + (String)(passre.equals("")?"\n - Repetir Contraseña":"");
              JOptionPane.showMessageDialog(null, "Falta completar campos!" + mensaje);  
              return;
            }
            
            if(!pass.equals(passre)){
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden !"); 
                return;
            }
            
            Empleado emp = new Empleado();
            Usuario usu = new Usuario();
            GenericDAO genericDAO = new GenericDAO();
            
            emp.setIdEmp(Integer.parseInt(txtCodEmp.getText()));
            usu.setEmpleado(emp);
            usu.setLogiUsu(txtUsuario.getText());
            usu.setPassUsu(txtPassword.getText());
            usu.setIsDeleted(0);

            if (accion.equals("add")) {
                usu.setIdUsu(0);
                genericDAO.insert(usu);
                
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            } else {
                usu.setIdUsu(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(usu);
                
                JOptionPane.showMessageDialog(null, "Registro editado exitosamente !");
            }
            accion="";
            cargarDatos();
            limpiarCajas();
            deshabilitarCajas();
            habilitarBotones(true, false, true, true, false,false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked

    }//GEN-LAST:event_tableDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        GenericDAO g = new GenericDAO();
        accion = "add";
        String id = String.valueOf(g.generarID("idUsu", "Usuario"));
        habilitarCajas();
        limpiarCajas();
        txtCodigo.setText(id);
        habilitarBotones(false, true, false, false, true,true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCajas();
        habilitarBotones(true, false, true, true, false, false);
        deshabilitarCajas();
        accion = "";

        int selection = tableDatos.getSelectedRow();
        if (selection != -1) {
            
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtUsuario.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            
            int codigo = (int) tableDatos.getValueAt(selection, 0);
            List<Object> sa = obtenerCampos(codigo);
            
            Object[] a = new Object[2];
            a=(Object[]) sa.get(0);
            txtCodEmp.setText(a[0].toString());
            txtPassword.setText(a[1].toString());
            txtRepetirPassword.setText(a[1].toString());
            
        }


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion = "edit";
        String codigo = txtCodigo.getText();
        if (!codigo.equals("-")) {
            habilitarCajas();

            habilitarBotones(false, true, false, false, true,true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Empleado emp = new Empleado();
            Usuario usu = new Usuario();
            GenericDAO genericDAO = new GenericDAO();
            String codigo = txtCodigo.getText();
            if (!codigo.equals("-")) {
            if(codigo.equals("1")){
                    JOptionPane.showMessageDialog(null, "No se puede eliminar al usuario del gerente !");
                    return;
                }
            usu.setIdUsu(Integer.parseInt(codigo));
            emp.setIdEmp(Integer.parseInt(txtCodEmp.getText()));
            usu.setEmpleado(emp);
            usu.setLogiUsu(txtUsuario.getText());
            usu.setPassUsu(txtPassword.getText());
            usu.setIsDeleted(1);

                genericDAO.delete(usu);
                JOptionPane.showMessageDialog(null, "Registro eliminado !");
            } else {

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

        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtUsuario.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            
            int codigo = (int) tableDatos.getValueAt(selection, 0);
            List<Object> sa = obtenerCampos(codigo);
            
            Object[] a = new Object[2];
            a=(Object[]) sa.get(0);
            txtCodEmp.setText(a[0].toString());
            txtPassword.setText(a[1].toString());
            txtRepetirPassword.setText(a[1].toString());
        }

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtUsuario.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            
            int codigo = (int) tableDatos.getValueAt(selection, 0);
            List<Object> sa = obtenerCampos(codigo);
            
            Object[] a = new Object[2];
            a=(Object[]) sa.get(0);
            txtCodEmp.setText(a[0].toString());
            txtPassword.setText(a[1].toString());
            txtRepetirPassword.setText(a[1].toString());
        }
    }//GEN-LAST:event_tableDatosKeyReleased

    private void btnLupaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaEmpleadoActionPerformed
        frmListEmpleado listEmp = new frmListEmpleado(null, rootPaneCheckingEnabled);
        listEmp.setVisible(true);
        
    }//GEN-LAST:event_btnLupaEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmUsuario dialog = new frmUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLupaEmpleado;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JLabel txtCodEmp;
    private javax.swing.JLabel txtCodigo;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepetirPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        UsuarioDAO usuDAO = new UsuarioDAO();
        Empleado bus = new Empleado();
        List<Object> datos = usuDAO.buscarUsuario(txtBuscar.getText());

        Object[][] matriz = new Object[datos.size()][4];
        Object[] s = new Object[]{};
        for (int i = 0; i < datos.size(); i++) {
            
            s=(Object[]) datos.get(i);
            System.out.println(s[0]);
            
            matriz[i][0] = s[0];
            matriz[i][1] = s[1];
            matriz[i][2] = s[2];
            matriz[i][3] = s[3];
            
        }
        Object[][] data = matriz;
        String[] cabecera = {"Codigo","Usuario","N° DNI", "Nombres y Apellidos"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }

    public void habilitarBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean lupa) {
        btnNuevo.setEnabled(b1);
        btnGrabar.setEnabled(b2);
        btnEditar.setEnabled(b3);
        btnEliminar.setEnabled(b4);
        btnCancelar.setEnabled(b5);
        btnLupaEmpleado.setEnabled(lupa);
    }

    public void limpiarCajas() {
        txtCodigo.setText("-");
        txtDNI.setText("");
        txtDNI.requestFocus();
        txtNombres.setText("");
        txtUsuario.setText("");
        txtPassword.setText("");
        txtRepetirPassword.setText("");
        txtCodEmp.setText("0");
        //cboxRol.setSelectedIndex(0);

    }

    public void habilitarCajas() {
        txtDNI.setEnabled(true);
        txtNombres.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtPassword.setEnabled(true);
        txtRepetirPassword.setEnabled(true);
        //cboxRol.setEnabled(true);
        txtDNI.setEditable(false);
        txtNombres.setEditable(false);
        
    }

    public void deshabilitarCajas() {

        txtDNI.setEnabled(false);
        txtNombres.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
        txtRepetirPassword.setEnabled(false);
        
        
    }

}
