package view;

import dao.BusDAO;
import dao.BusquedaCookie;
import dao.ControlDAO;
import dao.EmpleadoDAO;
import dao.GenericDAO;
import dao.HorarioDAO;
import dao.ParametroDAO;
import dao.PeticionCookie;
import dao.ProgramacionDAO;
import dao.RolDAO;
import dao.RutaDAO;
import entity.Boleto;
import entity.Bus;
import entity.Control;
import entity.Empleado;
import entity.Encomienda;
import entity.Encomiendadetalle;
import entity.Horario;
import entity.Movimiento;
import entity.Parametros;
import entity.Programacion;
import entity.Rol;
import entity.Ruta;
import entity.Usuario;
import java.awt.Image;
import java.math.BigDecimal;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmRegistrarControlMovimiento extends javax.swing.JDialog {

    DefaultTableModel dtm = new DefaultTableModel();
    String accion = "";
    int contador = 0;
    
    //CONSULTAR DNI
    public int posicion = -1;
    private int tipo = 1;//1:DNI, 2:RUC
    private int tipoPersona=1;
    private List<Object> buscarCookieLogueo;
    public String urls[] = new String[3];
    String[] buscarCookieLogueo1 = new String[3];
    String[] ubigeo;
    String direccion;
    boolean entrodni=false;
    Image buscarCookieLogueoimagenreniec;
    
    int contadorMatriz=0;
    Object[][] matrizDatos = new Object[100][13];
    List<Object> listDatos = new ArrayList<>();
    
    
    List<Movimiento> detalleList=new ArrayList<>();
    int index=0;
    
    public frmRegistrarControlMovimiento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
        //this.setSize(this.getToolkit().getScreenSize());
        ParametroDAO param=new ParametroDAO();
        List<Parametros> listParam = param.list(2);
        
        String[] valueParams=listParam.get(0).getValorParam().split(",");
        String idUsu=valueParams[0];
        txtIdUsu.setText(idUsu);
        
   
        
        
        
        cargarDatos();
        
        //cargarDatos();
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
        }*/
        
        contador++;
        //txtIdRuta.setVisible(false);
        txtIdUsu.setVisible(false);
        txtIdProg.setVisible(false);
        /*txtIdBus.setVisible(false);
        txtIdPiloto.setVisible(false);
        txtIdCoPiloto.setVisible(false);
        txtIdRuta.setVisible(false);
        txtIdHorario.setVisible(false);
        txtValCoPi.setVisible(false);*/
        
        //txtFechaExpe.setDate(new Date());
        
        
        
        GenericDAO g = new GenericDAO();
        String id=String.valueOf(g.generarID("idBol","Boleto"));
        //txtCodigo.setText(id);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtDesc = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTotalIng = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalEgre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnBusSelect = new javax.swing.JButton();
        txtHorarioProg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFechaProg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBusNumProg = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPlacaBusProg = new javax.swing.JTextField();
        txtIdProg = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro de mpovimientos.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimientos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDatos);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus.png"))); // NOI18N
        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descripción");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mas-22x22.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tipo");

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "INGRESO", "EGRESO" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("INGRESOS : S/");

        txtTotalIng.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalIng.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotalIng.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("EGRESOS : S/");

        txtTotalEgre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalEgre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotalEgre.setText("0.00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL : S/");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTipo, 0, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(208, 208, 208)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalEgre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalEgre)
                            .addComponent(jLabel8)))
                    .addComponent(txtTotalIng))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal)
                    .addComponent(jLabel9))
                .addGap(220, 220, 220))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Programación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnBusSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnBusSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusSelectActionPerformed(evt);
            }
        });

        txtHorarioProg.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Horario:");

        txtFechaProg.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Viaje:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("N° Bus:");

        txtBusNumProg.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Placa:");

        txtPlacaBusProg.setEditable(false);

        txtIdProg.setText("0");

        txtIdUsu.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIdProg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaProg, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(txtBusNumProg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlacaBusProg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorarioProg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtHorarioProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPlacaBusProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUsu)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtBusNumProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProg))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBusSelect)
                .addGap(32, 32, 32))
        );

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grabar.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
        if(txtIdProg.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Seleccione la programacion e ingrese los movimientos !");
            return;
        }
        
        if(detalleList.size()==0){
            JOptionPane.showMessageDialog(null, "No hay registros !");
            return;
        }
        
        try {
            Usuario u = new Usuario();
            u.setIdUsu(Integer.parseInt(txtIdUsu.getText()));
            
            Programacion p = new Programacion();
            p.setIdPro(Integer.parseInt(txtIdProg.getText()));
            
            Control cont=new Control();
            cont.setIdCon(0);
            cont.setUsuario(u);
            cont.setProgramacion(p);
            cont.setMingCont(new BigDecimal(txtTotalIng.getText()));
            cont.setMegrCont(new BigDecimal(txtTotalEgre.getText()));
            cont.setTotaCon(new BigDecimal(txtTotal.getText()));
           
            GenericDAO g = new GenericDAO();

            HashSet<Movimiento> mov = new HashSet<>();
            for (int i = 0; i < detalleList.size(); i++) {
                Movimiento m = new Movimiento();
                    m.setTipoMov(detalleList.get(i).getTipoMov());
                    m.setNombMov(detalleList.get(i).getNombMov());
                    m.setMontMov(detalleList.get(i).getMontMov());
                //ed.setDescEnc(detalleList.get(i).getDescEnc());
                //ed.setPrecEnc(detalleList.get(i).getPrecEnc());

                mov.add(m);
            }

            cont.setMovimientoDet(mov);

            g.insert(cont);

            JOptionPane.showMessageDialog(null, "Movimientos Registrados exitosamente !");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSelectActionPerformed
        frmListProgramacion4 listProg = new frmListProgramacion4(null, rootPaneCheckingEnabled);
        listProg.setVisible(true);
        
        detalleList.removeAll(detalleList);
        ControlDAO c = new ControlDAO();
        BigDecimal total= c.totalBoletos(Integer.parseInt(txtIdProg.getText()));
        BigDecimal totalEnc=c.totalEncomiendas(Integer.parseInt(txtIdProg.getText()));
        Movimiento mov = new Movimiento();
        mov.setTipoMov("INGRESO");
        mov.setNombMov("TOTAL DE VENTA DE BOLETOS");
        mov.setMontMov(total);
        Movimiento mov2 = new Movimiento();
        mov2.setTipoMov("INGRESO");
        mov2.setNombMov("TOTAL DE ENCOMIENDAS");
        mov2.setMontMov(totalEnc);
        detalleList.add(mov);
        detalleList.add(mov2);
        cargarDatos();
        calcularTotal();
        

    }//GEN-LAST:event_btnBusSelectActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selection = tableDatos.getSelectedRow();
        if(selection>=0){
            if(selection!=0 && selection!=1){
                detalleList.remove(selection);
                cargarDatos();
                calcularTotal();
            }else{
                if(selection==0){
                    JOptionPane.showMessageDialog(null, "El Registro del total de boletos no puede ser eliminado!");
                }else{
                    JOptionPane.showMessageDialog(null, "El Registro del total de encomiendas no puede ser eliminado!");
                }
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtIdProg.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Primero seleccione la programacion para obtener el total de los boletos vendidos y encomiendas !");
            return;
        }
        
        
        
        String desc=txtDesc.getText();
        String precio=txtMonto.getText();
        if(desc.equals("") && precio.equals("") && txtTipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione el Tipo e Ingrese la descripcion y el precio !");
            return;
        }else if(desc.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la descripcion !");
            return;
        }else if(precio.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el precio !");
            return;
        }else if(txtTipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione el tipo !");
            return;
        }
        /*Object datos[]=new Object[13];

        datos[0]=0;
        datos[1]=txtIdProg.getText();
        datos[2]=txtIdRuta.getText();
        datos[3]=cboRuta.getSelectedItem();
        datos[4]=txtIdUsu.getText();
        

        listDatos.add(datos);*/
        //detalle.add();
        Movimiento mov = new Movimiento();
        mov.setTipoMov(txtTipo.getSelectedItem().toString());
        mov.setNombMov(txtDesc.getText());
        mov.setMontMov(new BigDecimal("0.00").add(new BigDecimal(txtMonto.getText())));
        detalleList.add(mov);
        index++;
        txtDesc.setText("");
        txtMonto.setText("");
        txtDesc.requestFocus();
        cargarDatos();

        
        
        calcularTotal();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoKeyTyped

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
            java.util.logging.Logger.getLogger(frmRegistrarControlMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarControlMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarControlMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarControlMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmRegistrarControlMovimiento dialog = new frmRegistrarControlMovimiento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableDatos;
    public static javax.swing.JTextField txtBusNumProg;
    private javax.swing.JTextField txtDesc;
    public static javax.swing.JTextField txtFechaProg;
    public static javax.swing.JTextField txtHorarioProg;
    public static javax.swing.JLabel txtIdProg;
    private javax.swing.JLabel txtIdUsu;
    private javax.swing.JTextField txtMonto;
    public static javax.swing.JTextField txtPlacaBusProg;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalEgre;
    private javax.swing.JLabel txtTotalIng;
    // End of variables declaration//GEN-END:variables
    private void cargarDatos() {

        Object[][] matriz = new Object[detalleList.size()][3];
        Object[] s = new Object[]{};
        for (int i = 0; i < detalleList.size(); i++) {
            
            matriz[i][0] = detalleList.get(i).getTipoMov();
            matriz[i][1] = detalleList.get(i).getNombMov();
            matriz[i][2] = detalleList.get(i).getMontMov();
 
        }
        Object[][] data = matriz;
        String[] cabecera = {"Tipo","Descripción", "Precio"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }
   

    public void limpiarCajas() {
       /*txtRUC.setText("");
       txtNombEmpre.setText("");
       txtDNIremi.setText("");
       txtNombremi.setText("");
       
       txtPrecioPasaje.setText("");
       txtCargaAdicional.setText("");
       txtTotal.setText("");*/
       
       

    }

    
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(150);
    columnModel.getColumn(2).setPreferredWidth(200);
    columnModel.getColumn(3).setPreferredWidth(250);
    }

    
    public void calcularTotal(){
            BigDecimal total=new BigDecimal("0.00");
        for (int i = 0; i < detalleList.size(); i++) {
            if(detalleList.get(i).getTipoMov().equals("INGRESO")){
                total =total.add(detalleList.get(i).getMontMov());
            }else{
                total =total.subtract(detalleList.get(i).getMontMov());
            }
            
        }
        
        
            BigDecimal totalIng=new BigDecimal("0.00");
            BigDecimal totalEgre=new BigDecimal("0.00");
        for (int i = 0; i < detalleList.size(); i++) {
            if(detalleList.get(i).getTipoMov().equals("INGRESO")){
                totalIng =totalIng.add(detalleList.get(i).getMontMov());
            }else{
                totalEgre =totalEgre.add(detalleList.get(i).getMontMov());
            }
            
        }
        
        if(detalleList.size()==0){
            txtTotalIng.setText("0.00");
            txtTotal.setText("0.00");
            txtTotalEgre.setText("0.00");
            
        }else{
            txtTotalIng.setText(String.valueOf(totalIng));
            txtTotal.setText(String.valueOf(total));
            txtTotalEgre.setText(String.valueOf(totalEgre));
        }
        
    }
    
    
                                             
}
