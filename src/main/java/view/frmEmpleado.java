package view;

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

public class frmEmpleado extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        cargarDatos();
        //this.cboxRol.removeAllItems();

        RolDAO rolDAO = new RolDAO();
        List<Rol> list = rolDAO.listRol();

        this.cboxRol.addItem("--Seleccione--");
        for (int i = 0; i < list.size(); i++) {
            this.cboxRol.addItem(list.get(i).getNombRol());
        }
        contador++;
        
        txtIdRol.setVisible(false);
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
        jLabel7 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboxRol = new javax.swing.JComboBox<>();
        txtIdRol = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombres:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Celular:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");

        txtDNI.setEnabled(false);
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtNombres.setEnabled(false);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtCelular.setEnabled(false);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        txtDireccion.setEnabled(false);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Rol:");

        cboxRol.setEnabled(false);
        cboxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxRolActionPerformed(evt);
            }
        });

        txtIdRol.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI)
                    .addComponent(txtCelular)
                    .addComponent(cboxRol, 0, 120, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtDireccion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdRol)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(12, 12, 12)
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
            String nombres=txtNombres.getText();
            String cel=txtCelular.getText();
            String dire=txtDireccion.getText();
            int rol2=cboxRol.getSelectedIndex();
            String mensaje="";
            if(dni.equals("") || nombres.equals("") || cel.equals("") || dire.equals("") || rol2==0){
                mensaje = mensaje + (String)(dni.equals("")?"\n - DNI":"");
                mensaje = mensaje + (String)(nombres.equals("")?"\n - Nombres":"");
                mensaje = mensaje + (String)(cel.equals("")?"\n - Celular":"");
                mensaje = mensaje + (String)(dire.equals("")?"\n - Direccion":"");
                mensaje = mensaje + (rol2==0?"\n - Rol":"");
              JOptionPane.showMessageDialog(null, "Falta ingresar !" + mensaje);  
              return;
            }
            
            
            
            
            Empleado emp = new Empleado();
            Rol rol = new Rol();
            GenericDAO genericDAO = new GenericDAO();

            emp.setDniEmp(txtDNI.getText());
            emp.setCeluEmp(txtCelular.getText());
            emp.setNombEmp(txtNombres.getText());
            emp.setDireEmp(txtDireccion.getText());
            rol.setIdRol(Integer.parseInt(txtIdRol.getText()));
            emp.setRol(rol);
            emp.setIsDeleted(0);

            if (accion.equals("add")) {
                emp.setIdEmp(0);
                genericDAO.insert(emp);
                
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            } else {
                emp.setIdEmp(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(emp);
                
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

        GenericDAO g = new GenericDAO();
        accion = "add";
        String id = String.valueOf(g.generarID("idEmp", "Empleado"));
        habilitarCajas();
        limpiarCajas();
        txtCodigo.setText(id);
        habilitarBotones(false, true, false, false, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCajas();
        habilitarBotones(true, false, true, true, false);
        deshabilitarCajas();
        accion = "";

        int selection = tableDatos.getSelectedRow();
        if (selection != -1) {
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtCelular.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtDireccion.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            cboxRol.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 5)));
        }


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        accion = "edit";
        String codigo = txtCodigo.getText();
        if (!codigo.equals("-")) {
            habilitarCajas();

            habilitarBotones(false, true, false, false, true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Empleado emp = new Empleado();
            Rol rol = new Rol();
            GenericDAO genericDAO = new GenericDAO();
            String codigo = txtCodigo.getText();
            if (!codigo.equals("-")) {
                if(codigo.equals("1")){
                    JOptionPane.showMessageDialog(null, "No se puede eliminar al gerente !");
                    return;
                }
                emp.setIdEmp(Integer.parseInt(codigo));
                emp.setDniEmp(txtDNI.getText());
                emp.setCeluEmp(txtCelular.getText());
                emp.setNombEmp(txtNombres.getText());
                emp.setDireEmp(txtDireccion.getText());
                rol.setIdRol(Integer.parseInt(txtIdRol.getText()));
                emp.setRol(rol);
                emp.setIsDeleted(1);

                genericDAO.delete(emp);
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
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtCelular.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtDireccion.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            cboxRol.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 5)));
        }

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
            txtDNI.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
            txtNombres.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
            txtCelular.setText(String.valueOf(tableDatos.getValueAt(selection, 3)));
            txtDireccion.setText(String.valueOf(tableDatos.getValueAt(selection, 4)));
            cboxRol.setSelectedItem(String.valueOf(tableDatos.getValueAt(selection, 5)));
            

        }
    }//GEN-LAST:event_tableDatosKeyReleased

    private void cboxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxRolActionPerformed
        if (contador > 0) {
            RolDAO rolDAO = new RolDAO();
            Integer idRol = rolDAO.getIdRolSeleccionado(cboxRol.getSelectedItem().toString());
            txtIdRol.setText(String.valueOf(idRol));
        }
    }//GEN-LAST:event_cboxRolActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
        
        int num=txtDNI.getText().length();
        if(num>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
       char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCelularKeyTyped

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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmEmpleado dialog = new frmEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cboxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtIdRol;
    private javax.swing.JTextField txtNombres;
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

    public void habilitarBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5) {
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
        
    }

}
