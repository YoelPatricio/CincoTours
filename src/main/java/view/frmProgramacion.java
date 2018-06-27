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

public class frmProgramacion extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmProgramacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        cargarDatos();
        
        //this.cboxRol.removeAllItems();

        //LLENAR COMBO HORARIO
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
        txtValCoPi.setVisible(false);
        
        

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
        jPanel2 = new javax.swing.JPanel();
        btnBusSelect = new javax.swing.JButton();
        txtBusPlaca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBusNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDNIPiloto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombPiloto = new javax.swing.JTextField();
        btnPilotoSelect = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtDNICoPiloto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombCoPiloto = new javax.swing.JTextField();
        btnCoPilotoSelect = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cboHorario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboRuta = new javax.swing.JComboBox<>();
        txtIdRuta = new javax.swing.JLabel();
        txtIdHorario = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cboEstadoFiltro = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtValCoPi = new javax.swing.JLabel();
        txtIdPiloto = new javax.swing.JLabel();
        txtIdCoPiloto = new javax.swing.JLabel();
        txtIdBus = new javax.swing.JLabel();

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
                "Código", "Fecha", "Horario", "Ruta", "N° Bus", "Placa", "Piloto DNI", "Piloto Nombres", "CoPiloto DNI", "CoPiloto  Nombres", "Estado"
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
            tableDatos.getColumnModel().getColumn(2).setMinWidth(100);
            tableDatos.getColumnModel().getColumn(2).setMaxWidth(100);
            tableDatos.getColumnModel().getColumn(3).setMinWidth(120);
            tableDatos.getColumnModel().getColumn(3).setMaxWidth(120);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bus"));

        btnBusSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnBusSelect.setEnabled(false);
        btnBusSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusSelectActionPerformed(evt);
            }
        });

        txtBusPlaca.setEditable(false);
        txtBusPlaca.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Placa:");

        txtBusNum.setEditable(false);
        txtBusNum.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("N° Bus:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtBusNum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtBusNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtBusPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBusSelect))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Piloto"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");

        txtDNIPiloto.setEditable(false);
        txtDNIPiloto.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombres:");

        txtNombPiloto.setEditable(false);
        txtNombPiloto.setEnabled(false);

        btnPilotoSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnPilotoSelect.setEnabled(false);
        btnPilotoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilotoSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNIPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPilotoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPilotoSelect)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDNIPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("CoPiloto"));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("DNI:");

        txtDNICoPiloto.setEditable(false);
        txtDNICoPiloto.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Nombres:");

        txtNombCoPiloto.setEditable(false);
        txtNombCoPiloto.setEnabled(false);

        btnCoPilotoSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnCoPilotoSelect.setEnabled(false);
        btnCoPilotoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoPilotoSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDNICoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombCoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCoPilotoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCoPilotoSelect)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombCoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDNICoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Programación"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        txtFecha.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Horario:");

        cboHorario.setEnabled(false);
        cboHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHorarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ruta:");

        cboRuta.setEnabled(false);
        cboRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRutaActionPerformed(evt);
            }
        });

        txtIdRuta.setText("0");

        txtIdHorario.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdHorario)
                        .addComponent(txtIdRuta))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        cboEstadoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "PROGRAMADO", "EN CURSO", "FINALIZADO" }));
        cboEstadoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoFiltroActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Estado:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cambiar.png"))); // NOI18N
        jButton1.setText("CAMBIAR ESTADO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtValCoPi.setText("-");

        txtIdPiloto.setText("0");

        txtIdCoPiloto.setText("0");

        txtIdBus.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtValCoPi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCoPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdBus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(cboEstadoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValCoPi)
                        .addComponent(txtIdPiloto)
                        .addComponent(txtIdCoPiloto)
                        .addComponent(txtIdBus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            
            String fecha=txtFecha.getDate().toString();
            int horario=cboHorario.getSelectedIndex();
            int ruta=cboRuta.getSelectedIndex();
            String piloto2=txtDNIPiloto.getText();
            String copiloto2=txtDNICoPiloto.getText();
            String bus2=txtBusNum.getText();
            String mensaje="";
            if(fecha.equals("") || piloto2.equals("") || copiloto2.equals("") || bus2.equals("") || horario==0 || ruta==0){
                mensaje = mensaje + (String)(fecha.equals("")?"\n - Fecha":"");
                mensaje = mensaje + (horario==0?"\n - Horario":"");
                mensaje = mensaje + (ruta==0?"\n - Ruta":"");
                mensaje = mensaje + (String)(bus2.equals("")?"\n - Bus":"");
                mensaje = mensaje + (String)(piloto2.equals("")?"\n - Piloto":"");
                mensaje = mensaje + (String)(copiloto2.equals("")?"\n - CoPiloto":"");
              JOptionPane.showMessageDialog(null, "Falta ingresar !" + mensaje);  
              return;
            }
            
            
            
            
            Ruta rut = new Ruta();
            rut.setIdRut(Integer.parseInt(txtIdRuta.getText()));
            
            Horario hor = new Horario();
            hor.setIdHor(Integer.parseInt(txtIdHorario.getText()));
            
            Bus bus = new Bus();
            bus.setIdBus(Integer.parseInt(txtIdBus.getText()));
            
            Empleado piloto = new Empleado();
            piloto.setIdEmp(Integer.parseInt(txtIdPiloto.getText()));
            
            Empleado copiloto = new Empleado();
            copiloto.setIdEmp(Integer.parseInt(txtIdCoPiloto.getText()));
            
            Programacion pro = new Programacion();
            
            GenericDAO genericDAO = new GenericDAO();
            
            pro.setFechPro(txtFecha.getDate());
            pro.setHorario(hor);
            pro.setRuta(rut);
            pro.setBus(bus);
            pro.setEmpleadoByIdEpi(piloto);
            pro.setEmpleadoByIdEco(copiloto);
            

            //pro.setIsDeleted(0);

            if (accion.equals("add")) {
                pro.setIdPro(0);
                pro.setEstaPro(0);
                genericDAO.insert(pro);
                
                BusDAO busDAO = new BusDAO();
                EmpleadoDAO empDAO = new EmpleadoDAO();
            
                busDAO.cambiarEstado(1, txtBusPlaca.getText());
                empDAO.cambiarEstado(1, txtDNIPiloto.getText());
                empDAO.cambiarEstado(1, txtDNICoPiloto.getText());
                
                JOptionPane.showMessageDialog(null, "Se Registro exitosamente !");
            } else {
                pro.setIdPro(Integer.parseInt(txtCodigo.getText()));
                genericDAO.update(pro);
                
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
        String id = String.valueOf(g.generarID("idPro", "Programacion"));
        habilitarCajas();
        limpiarCajas();
        txtFecha.setDate(new Date());
        txtCodigo.setText(id);
        habilitarBotones(false, true, false, false, true, true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCajas();
        habilitarBotones(true, false, true, true, false,false);
        deshabilitarCajas();
        accion = "";

        int selection = tableDatos.getSelectedRow();
        if (selection != -1) {
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
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
          
            GenericDAO genericDAO = new GenericDAO();
            String codigo = txtCodigo.getText();
            if (!codigo.equals("-")) {
                

                genericDAO.delete("programacion", "id_pro", Integer.parseInt(codigo));
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
        
        
            
        }

    }//GEN-LAST:event_tableDatosMousePressed

    private void tableDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyPressed

    }//GEN-LAST:event_tableDatosKeyPressed

    private void tableDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDatosKeyReleased
        if (!accion.equals("add")) {
            int selection = tableDatos.getSelectedRow();
            txtCodigo.setText(String.valueOf(tableDatos.getValueAt(selection, 0)));
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
        }
    }//GEN-LAST:event_tableDatosKeyReleased

    private void cboHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHorarioActionPerformed
        if (contador > 0) {
            HorarioDAO horDAO = new HorarioDAO();
            Integer idHor = horDAO.getIdHorarioSeleccionado(cboHorario.getSelectedItem().toString());
            txtIdHorario.setText(String.valueOf(idHor));
        }
    }//GEN-LAST:event_cboHorarioActionPerformed

    private void btnBusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSelectActionPerformed
        frmListBus listBus = new frmListBus(null, rootPaneCheckingEnabled);
        listBus.setVisible(true);

    }//GEN-LAST:event_btnBusSelectActionPerformed

    private void btnPilotoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilotoSelectActionPerformed
        txtValCoPi.setText("PILOTO");
        frmListEmpleadoProg as = new frmListEmpleadoProg(null, rootPaneCheckingEnabled);
        as.setVisible(true);
    }//GEN-LAST:event_btnPilotoSelectActionPerformed

    private void btnCoPilotoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoPilotoSelectActionPerformed
        txtValCoPi.setText("COPILOTO");
        frmListEmpleadoProg as = new frmListEmpleadoProg(null, rootPaneCheckingEnabled);
        as.setVisible(true);
    }//GEN-LAST:event_btnCoPilotoSelectActionPerformed

    private void cboRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRutaActionPerformed
        if (contador > 0) {
            RutaDAO rutDAO = new RutaDAO();
            Integer idRut = rutDAO.getIdRutaSeleccionado(cboRuta.getSelectedItem().toString());
            txtIdRuta.setText(String.valueOf(idRut));
        }
    }//GEN-LAST:event_cboRutaActionPerformed

    private void cboEstadoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoFiltroActionPerformed
        cargarDatos();
    }//GEN-LAST:event_cboEstadoFiltroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      
        frmCambiarEstadoProg ce = new frmCambiarEstadoProg(null, rootPaneCheckingEnabled);
        int selection = tableDatos.getSelectedRow();
        if(selection!=-1){
            String estado=String.valueOf(tableDatos.getValueAt(selection, 10));
            if(estado.equals("FINALIZADO")){
                JOptionPane.showMessageDialog(null, "La programacion ya ha finalizado !");
                return;
            }
            
            String cod=String.valueOf(tableDatos.getValueAt(selection, 0));
            String placa=String.valueOf(tableDatos.getValueAt(selection, 5));
            String dniPiloto=String.valueOf(tableDatos.getValueAt(selection, 6));
            String dniCoPiloto=String.valueOf(tableDatos.getValueAt(selection, 8));
            ce.txtIdProg.setText(cod);
            ce.txtPlaca.setText(placa);
            ce.txtDNIPiloto.setText(dniPiloto);
            ce.txtDNICoPiloto.setText(dniCoPiloto);
            ce.setVisible(true);
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro !");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmProgramacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProgramacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProgramacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProgramacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmProgramacion dialog = new frmProgramacion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBusSelect;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCoPilotoSelect;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPilotoSelect;
    private javax.swing.JComboBox<String> cboEstadoFiltro;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cboRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    public static javax.swing.JTextField txtBusNum;
    public static javax.swing.JTextField txtBusPlaca;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    public static javax.swing.JTextField txtDNICoPiloto;
    public static javax.swing.JTextField txtDNIPiloto;
    private com.toedter.calendar.JDateChooser txtFecha;
    public static javax.swing.JLabel txtIdBus;
    public static javax.swing.JLabel txtIdCoPiloto;
    private javax.swing.JLabel txtIdHorario;
    public static javax.swing.JLabel txtIdPiloto;
    private javax.swing.JLabel txtIdRuta;
    public static javax.swing.JTextField txtNombCoPiloto;
    public static javax.swing.JTextField txtNombPiloto;
    public static javax.swing.JLabel txtValCoPi;
    // End of variables declaration//GEN-END:variables

    public void cargarDatos() {

        ProgramacionDAO proDAO = new ProgramacionDAO();
        Empleado bus = new Empleado();
        int cbEstado=-1;
        if(cboEstadoFiltro.getSelectedItem().toString().equals("PROGRAMADO")){
            cbEstado=0;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("EN CURSO")){
            cbEstado=1;
        }else if(cboEstadoFiltro.getSelectedItem().toString().equals("FINALIZADO")){
            cbEstado=2;
        }
        
        List<Object> datos = proDAO.buscarProgramacion(txtBuscar.getText(),cbEstado);

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
            matriz[i][6] = s[6];
            matriz[i][7] = s[7];
            matriz[i][8] = s[8];
            matriz[i][9] = s[9];
            
            String estado="";
            if(s[10].equals(0)){
                estado="PROGRAMADO";
            }else if(s[10].equals(1)){
                estado="EN CURSO";
            }else if(s[10].equals(2)){
                estado="FINALIZADO";
            }
            
            matriz[i][10] = estado;
            matriz[i][11] = s[11];
            
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"Codigo", "Fecha", "Horario", "Ruta", "N° Bus","Placa","DNI Piloto","Nombres Piloto","DNI CoPiloto","Nombres CoPiloto","Estado Prog.","Hora Llegada"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }

    public void habilitarBotones(boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean lupa) {
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
    }

}
