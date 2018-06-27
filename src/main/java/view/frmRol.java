
package view;

import dao.BusDAO;
import dao.GenericDAO;
import dao.RolDAO;
import dao.RutaDAO;
import entity.Bus;
import entity.Permiso;
import entity.Rol;
import entity.Ruta;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmRol extends javax.swing.JDialog {

   DefaultTableModel dtm;
   String accion="";
    public frmRol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
       
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
        txtNombRol = new javax.swing.JTextField();
        txtDescRol = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        unoRuta = new javax.swing.JCheckBox();
        dosHorario = new javax.swing.JCheckBox();
        tresBus = new javax.swing.JCheckBox();
        cincoEmpleado = new javax.swing.JCheckBox();
        seisUsuario = new javax.swing.JCheckBox();
        cuatroRol = new javax.swing.JCheckBox();
        sieteProgramacion = new javax.swing.JCheckBox();
        ochoControlMov = new javax.swing.JCheckBox();
        nueveEncomienda = new javax.swing.JCheckBox();
        diezVentaBoleto = new javax.swing.JCheckBox();
        onceRegistroBoleto = new javax.swing.JCheckBox();
        doceIngresos = new javax.swing.JCheckBox();
        treceAflueRuta = new javax.swing.JCheckBox();
        catorceAflueClientes = new javax.swing.JCheckBox();
        quinceConfig = new javax.swing.JCheckBox();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ROLES.png"))); // NOI18N

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
                "Código", "Nombre de Rol", "Descripción"
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
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Permisos:");

        txtNombRol.setEnabled(false);

        txtDescRol.setEnabled(false);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        unoRuta.setText("Rutas");
        unoRuta.setEnabled(false);

        dosHorario.setText("Horarios");
        dosHorario.setEnabled(false);

        tresBus.setText("Buses");
        tresBus.setEnabled(false);

        cincoEmpleado.setText("Empleados");
        cincoEmpleado.setEnabled(false);
        cincoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoEmpleadoActionPerformed(evt);
            }
        });

        seisUsuario.setText("Usuarios");
        seisUsuario.setEnabled(false);

        cuatroRol.setText("Roles");
        cuatroRol.setEnabled(false);

        sieteProgramacion.setText("Programación");
        sieteProgramacion.setEnabled(false);

        ochoControlMov.setText("Control Mov.");
        ochoControlMov.setEnabled(false);
        ochoControlMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoControlMovActionPerformed(evt);
            }
        });

        nueveEncomienda.setText("Encomienda");
        nueveEncomienda.setEnabled(false);

        diezVentaBoleto.setText("Venta Boleto");
        diezVentaBoleto.setEnabled(false);

        onceRegistroBoleto.setText("Registro Boletos");
        onceRegistroBoleto.setEnabled(false);

        doceIngresos.setText("Ingresos");
        doceIngresos.setEnabled(false);

        treceAflueRuta.setText("Afluencia Rutas");
        treceAflueRuta.setEnabled(false);

        catorceAflueClientes.setText("Afluencia Clientes");
        catorceAflueClientes.setEnabled(false);

        quinceConfig.setText("Configuración");
        quinceConfig.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tresBus)
                                    .addComponent(dosHorario)
                                    .addComponent(unoRuta)
                                    .addComponent(cincoEmpleado)
                                    .addComponent(seisUsuario)
                                    .addComponent(cuatroRol))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diezVentaBoleto)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sieteProgramacion)
                                            .addComponent(ochoControlMov)
                                            .addComponent(nueveEncomienda)
                                            .addComponent(onceRegistroBoleto))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(doceIngresos)
                                            .addComponent(treceAflueRuta)
                                            .addComponent(catorceAflueClientes)))))
                            .addComponent(quinceConfig)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombRol, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(txtDescRol, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                .addContainerGap())
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
                    .addComponent(txtNombRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unoRuta)
                    .addComponent(sieteProgramacion)
                    .addComponent(doceIngresos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dosHorario)
                    .addComponent(ochoControlMov)
                    .addComponent(treceAflueRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tresBus)
                    .addComponent(nueveEncomienda)
                    .addComponent(catorceAflueClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diezVentaBoleto)
                    .addComponent(cuatroRol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onceRegistroBoleto)
                    .addComponent(cincoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seisUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quinceConfig)
                .addContainerGap())
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
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
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            String nrol=txtNombRol.getText();
            String drol=txtDescRol.getText();
            
            String mensaje="";
            if(nrol.equals("") || drol.equals("")){
                mensaje = mensaje + (String)(nrol.equals("")?"\n - Nombre":"");
                mensaje = mensaje + (String)(drol.equals("")?"\n - Descripcion":"");
                
              JOptionPane.showMessageDialog(null, "Falta ingresar !" + mensaje);  
              return;
            }
            
            
            Rol rol = new Rol();
            GenericDAO genericDAO = new GenericDAO();
            
            rol.setNombRol(txtNombRol.getText());
            rol.setDescRol(txtDescRol.getText());
            HashSet<Permiso> permisos = new HashSet<Permiso>();
            ArrayList<Integer> listPermisos=listPermisos();
            for (int i = 0; i < listPermisos.size(); i++) {
                permisos.add(new Permiso(listPermisos.get(i)));
            }
            rol.setPermiso(permisos);
                       
            if(accion.equals("add")){
                rol.setIdRol(0);
                genericDAO.insert(rol);
             
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            }else{
                rol.setIdRol(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(rol);
               
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
        accion="add";
        String id=String.valueOf(g.generarID("idRol","Rol"));
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
                txtNombRol.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
                txtDescRol.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
                
                Integer idRol=Integer.parseInt(txtCodigo.getText());
                
                RolDAO r=new RolDAO();
                List<Integer> perm=r.listPermisos(idRol);
                limpiaCbox();
                for (int i = 0; i < perm.size(); i++) {
                    System.out.println(perm.get(i));
                    if(perm.get(i)==1){
                        unoRuta.setSelected(true);
                    }else if (perm.get(i)==2) {
                        dosHorario.setSelected(true);
                    }else if (perm.get(i)==3) {
                        tresBus.setSelected(true);
                    }else if (perm.get(i)==4) {
                        cuatroRol.setSelected(true);
                    }else if (perm.get(i)==5) {
                        cincoEmpleado.setSelected(true);
                    }else if (perm.get(i)==6) {
                        seisUsuario.setSelected(true);
                    }else if (perm.get(i)==7) {
                        sieteProgramacion.setSelected(true);
                    }else if (perm.get(i)==8) {
                        ochoControlMov.setSelected(true);
                    }else if (perm.get(i)==9) {
                        nueveEncomienda.setSelected(true);
                    }else if (perm.get(i)==10) {
                        diezVentaBoleto.setSelected(true);
                    }else if (perm.get(i)==11) {
                        onceRegistroBoleto.setSelected(true);
                    }else if (perm.get(i)==12) {
                        doceIngresos.setSelected(true);
                    }else if (perm.get(i)==13) {
                        treceAflueRuta.setSelected(true);
                    }else if (perm.get(i)==14) {
                        catorceAflueClientes.setSelected(true);
                    }else if (perm.get(i)==15) {
                        quinceConfig.setSelected(true);
                    }
                }    
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
            
            Rol rol = new Rol();
            GenericDAO genericDAO = new GenericDAO();
            String codigo=txtCodigo.getText();
            if(!codigo.equals("-")){
                if(codigo.equals("1") || codigo.equals("2") || codigo.equals("3") || codigo.equals("4")){
                    JOptionPane.showMessageDialog(null, "El registro seleccionado es un rol obligatorio y no puede ser eliminado !");
                    return;
                }
            rol.setIdRol(Integer.parseInt(txtCodigo.getText()));
            rol.setNombRol(txtNombRol.getText());
            rol.setDescRol(txtDescRol.getText());
            HashSet<Permiso> permisos = new HashSet<Permiso>();
            ArrayList<Integer> listPermisos=listPermisos();
            for (int i = 0; i < listPermisos.size(); i++) {
                permisos.add(new Permiso(listPermisos.get(i)));
            }
            rol.setPermiso(permisos); 
            rol.setIsDeleted(1);
            
                
                genericDAO.delete(rol);
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
                txtNombRol.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
                txtDescRol.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
                
                Integer idRol=Integer.parseInt(txtCodigo.getText());
                
                RolDAO r=new RolDAO();
                List<Integer> perm=r.listPermisos(idRol);
                limpiaCbox();
                for (int i = 0; i < perm.size(); i++) {
                    System.out.println(perm.get(i));
                    if(perm.get(i)==1){
                        unoRuta.setSelected(true);
                    }else if (perm.get(i)==2) {
                        dosHorario.setSelected(true);
                    }else if (perm.get(i)==3) {
                        tresBus.setSelected(true);
                    }else if (perm.get(i)==4) {
                        cuatroRol.setSelected(true);
                    }else if (perm.get(i)==5) {
                        cincoEmpleado.setSelected(true);
                    }else if (perm.get(i)==6) {
                        seisUsuario.setSelected(true);
                    }else if (perm.get(i)==7) {
                        sieteProgramacion.setSelected(true);
                    }else if (perm.get(i)==8) {
                        ochoControlMov.setSelected(true);
                    }else if (perm.get(i)==9) {
                        nueveEncomienda.setSelected(true);
                    }else if (perm.get(i)==10) {
                        diezVentaBoleto.setSelected(true);
                    }else if (perm.get(i)==11) {
                        onceRegistroBoleto.setSelected(true);
                    }else if (perm.get(i)==12) {
                        doceIngresos.setSelected(true);
                    }else if (perm.get(i)==13) {
                        treceAflueRuta.setSelected(true);
                    }else if (perm.get(i)==14) {
                        catorceAflueClientes.setSelected(true);
                    }else if (perm.get(i)==15) {
                        quinceConfig.setSelected(true);
                    }
                }    
        }
        
    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed
        
    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
       if(!accion.equals("add")){
           int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
                txtNombRol.setText(String.valueOf(tableDatos.getValueAt(selection, 1)));
                txtDescRol.setText(String.valueOf(tableDatos.getValueAt(selection, 2)));
                
                Integer idRol=Integer.parseInt(txtCodigo.getText());
                
                RolDAO r=new RolDAO();
                List<Integer> perm=r.listPermisos(idRol);
                limpiaCbox();
                for (int i = 0; i < perm.size(); i++) {
                    System.out.println(perm.get(i));
                    if(perm.get(i)==1){
                        unoRuta.setSelected(true);
                    }else if (perm.get(i)==2) {
                        dosHorario.setSelected(true);
                    }else if (perm.get(i)==3) {
                        tresBus.setSelected(true);
                    }else if (perm.get(i)==4) {
                        cuatroRol.setSelected(true);
                    }else if (perm.get(i)==5) {
                        cincoEmpleado.setSelected(true);
                    }else if (perm.get(i)==6) {
                        seisUsuario.setSelected(true);
                    }else if (perm.get(i)==7) {
                        sieteProgramacion.setSelected(true);
                    }else if (perm.get(i)==8) {
                        ochoControlMov.setSelected(true);
                    }else if (perm.get(i)==9) {
                        nueveEncomienda.setSelected(true);
                    }else if (perm.get(i)==10) {
                        diezVentaBoleto.setSelected(true);
                    }else if (perm.get(i)==11) {
                        onceRegistroBoleto.setSelected(true);
                    }else if (perm.get(i)==12) {
                        doceIngresos.setSelected(true);
                    }else if (perm.get(i)==13) {
                        treceAflueRuta.setSelected(true);
                    }else if (perm.get(i)==14) {
                        catorceAflueClientes.setSelected(true);
                    }else if (perm.get(i)==15) {
                        quinceConfig.setSelected(true);
                    }
                }    
            
        }
    }//GEN-LAST:event_tableDatosKeyReleased

    private void cincoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cincoEmpleadoActionPerformed

    private void ochoControlMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoControlMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ochoControlMovActionPerformed

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
            java.util.logging.Logger.getLogger(frmRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRol dialog = new frmRol(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox catorceAflueClientes;
    private javax.swing.JCheckBox cincoEmpleado;
    private javax.swing.JCheckBox cuatroRol;
    private javax.swing.JCheckBox diezVentaBoleto;
    private javax.swing.JCheckBox doceIngresos;
    private javax.swing.JCheckBox dosHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nueveEncomienda;
    private javax.swing.JCheckBox ochoControlMov;
    private javax.swing.JCheckBox onceRegistroBoleto;
    private javax.swing.JCheckBox quinceConfig;
    private javax.swing.JCheckBox seisUsuario;
    private javax.swing.JCheckBox sieteProgramacion;
    private javax.swing.JTable tableDatos;
    private javax.swing.JCheckBox treceAflueRuta;
    private javax.swing.JCheckBox tresBus;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtDescRol;
    private javax.swing.JTextField txtNombRol;
    private javax.swing.JCheckBox unoRuta;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        
        RolDAO rolDAO = new RolDAO();
        Rol rol = new Rol();
        List<Rol> datos=rolDAO.buscarRol(txtBuscar.getText());
        
        Object[][] matriz = new Object[datos.size()][3];
        
        for (int i = 0; i < datos.size(); i++) {
            matriz[i][0]=datos.get(i).getIdRol();
            matriz[i][1]=datos.get(i).getNombRol();
            matriz[i][2]=datos.get(i).getDescRol();
                        
        }
        Object[][] data=matriz;
        String[] cabecera={"Código","Nombre de Rol","Descripción"};
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
        txtNombRol.setText("");
        txtNombRol.requestFocus();
        txtDescRol.setText("");
        
        unoRuta.setSelected(false);
        dosHorario.setSelected(false);
        tresBus.setSelected(false);
        cuatroRol.setSelected(false);
        cincoEmpleado.setSelected(false);
        seisUsuario.setSelected(false);
        sieteProgramacion.setSelected(false);
        ochoControlMov.setSelected(false);
        nueveEncomienda.setSelected(false);
        diezVentaBoleto.setSelected(false);
        onceRegistroBoleto.setSelected(false);
        doceIngresos.setSelected(false);
        treceAflueRuta.setSelected(false);
        catorceAflueClientes.setSelected(false);
        quinceConfig.setSelected(false);
        
    }
    
    public void habilitarCajas(){
        txtNombRol.setEnabled(true);
        txtDescRol.setEnabled(true);
        
        unoRuta.setEnabled(true);
        dosHorario.setEnabled(true);
        tresBus.setEnabled(true);
        cuatroRol.setEnabled(true);
        cincoEmpleado.setEnabled(true);
        seisUsuario.setEnabled(true);
        sieteProgramacion.setEnabled(true);
        ochoControlMov.setEnabled(true);
        nueveEncomienda.setEnabled(true);
        diezVentaBoleto.setEnabled(true);
        onceRegistroBoleto.setEnabled(true);
        doceIngresos.setEnabled(true);
        treceAflueRuta.setEnabled(true);
        catorceAflueClientes.setEnabled(true);
        quinceConfig.setEnabled(true);
    }
    
    public void deshabilitarCajas(){
        
        txtNombRol.setEnabled(false);
        txtDescRol.setEnabled(false);
        
        unoRuta.setEnabled(false);
        dosHorario.setEnabled(false);
        tresBus.setEnabled(false);
        cuatroRol.setEnabled(false);
        cincoEmpleado.setEnabled(false);
        seisUsuario.setEnabled(false);
        sieteProgramacion.setEnabled(false);
        ochoControlMov.setEnabled(false);
        nueveEncomienda.setEnabled(false);
        diezVentaBoleto.setEnabled(false);
        onceRegistroBoleto.setEnabled(false);
        doceIngresos.setEnabled(false);
        treceAflueRuta.setEnabled(false);
        catorceAflueClientes.setEnabled(false);
        quinceConfig.setEnabled(false);
        
    }
    
    public ArrayList<Integer> listPermisos(){

        ArrayList<Integer> permisos= new ArrayList<Integer>();
        
        if(unoRuta.isSelected()==true){
            permisos.add(1);
        }
        if(dosHorario.isSelected()==true){
            permisos.add(2);
        }
        if(tresBus.isSelected()==true){
            permisos.add(3);
        }
        if(cuatroRol.isSelected()==true){
            permisos.add(4);
        }
        if(cincoEmpleado.isSelected()==true){
            permisos.add(5);
        }
        if(seisUsuario.isSelected()==true){
            permisos.add(6);
        }
        if(sieteProgramacion.isSelected()==true){
            permisos.add(7);
        }
        if(ochoControlMov.isSelected()==true){
            permisos.add(8);
        }
        if(nueveEncomienda.isSelected()==true){
            permisos.add(9);
        }
        if(diezVentaBoleto.isSelected()==true){
            permisos.add(10);
        }
        if(onceRegistroBoleto.isSelected()==true){
            permisos.add(11);
        }
        if(doceIngresos.isSelected()==true){
            permisos.add(12);
        }
        if(treceAflueRuta.isSelected()==true){
            permisos.add(13);
        }
        if(catorceAflueClientes.isSelected()==true){
            permisos.add(14);
        } 
        if(quinceConfig.isSelected()==true){
            permisos.add(15);
        } 
        return permisos;
    }

    public void limpiaCbox(){
        unoRuta.setSelected(false);
        dosHorario.setSelected(false);
        tresBus.setSelected(false);
        cuatroRol.setSelected(false);
        cincoEmpleado.setSelected(false);
        seisUsuario.setSelected(false);
        sieteProgramacion.setSelected(false);
        ochoControlMov.setSelected(false);
        nueveEncomienda.setSelected(false);
        diezVentaBoleto.setSelected(false);
        onceRegistroBoleto.setSelected(false);
        doceIngresos.setSelected(false);
        treceAflueRuta.setSelected(false);
        catorceAflueClientes.setSelected(false);
        quinceConfig.setSelected(false);
    }

}
