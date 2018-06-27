package view;

import dao.BusDAO;
import dao.BusquedaCookie;
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
import entity.Empleado;
import entity.Horario;
import entity.Parametros;
import entity.Programacion;
import entity.Rol;
import entity.Ruta;
import entity.Usuario;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmRegistrarBoletos extends javax.swing.JDialog {

    DefaultTableModel dtm = new DefaultTableModel();
    String accion = "";
    int contador = 0;
    
    //CONSULTAR DNI
    public int posicion = -1;
    private int tipo = 1;//1:DNI, 2:RUC
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
    Integer reniec=1;

    public frmRegistrarBoletos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
        this.setSize(this.getToolkit().getScreenSize());
        ParametroDAO param=new ParametroDAO();
        List<Parametros> listParam = param.list(2);
        
        String[] valueParams=listParam.get(0).getValorParam().split(",");
        String idUsu=valueParams[0];
        txtIdUsu.setText(idUsu);
        
        ParametroDAO parare=new ParametroDAO();
        List<Parametros> listParamre = parare.list(3);

        reniec=Integer.parseInt(listParamre.get(0).getValorParam());
        
        if(reniec==0){
            txtCodigoImagenDNI.setEnabled(false);
            btnBuscarDNI.setEnabled(false);
        }
        
        
        
        cargarDatos();
        
        //cargarDatos();
        //this.cboxRol.removeAllItems();

        //LLENAR COMBO HORARIO
        /*HorarioDAO horarioDAO = new HorarioDAO();
        List<Object> list = horarioDAO.listHorario();
        this.cboHorario.addItem("--Seleccione--");
            
        for (int i = 0; i < list.size(); i++) {
            this.cboHorario.addItem( list.get(i).toString());
        }*/
        
        //LLENAR COMBO RUTA
        RutaDAO rutaDAO = new RutaDAO();
        List<Ruta> listRuta = rutaDAO.listRuta();
        this.cboRuta.addItem("--Seleccione--");
            
        for (int i = 0; i < listRuta.size(); i++) {
            this.cboRuta.addItem( listRuta.get(i).getNombRut());
        }
        
        contador++;
        txtIdRuta.setVisible(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombEmpre = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboRuta = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoImagenDNI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombPasajero = new javax.swing.JTextField();
        btnBuscarDNI = new javax.swing.JButton();
        txtIdRuta = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioPasaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCargaAdicional = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblImagenDNI = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro de boletos.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Programación"));

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
                .addComponent(btnBusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(txtPlacaBusProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("R.U.C :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Razón Social:");

        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUCKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ruta:");

        cboRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRutaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Código");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("RENIEC:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("DNI:");

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Nombres:");

        txtNombPasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombPasajeroKeyTyped(evt);
            }
        });

        btnBuscarDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        txtIdRuta.setText("0");

        txtIdUsu.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pasaje:");

        txtPrecioPasaje.setEditable(false);
        txtPrecioPasaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPrecioPasaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Carga Adicional:");

        txtCargaAdicional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCargaAdicional.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCargaAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargaAdicionalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargaAdicionalKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mas-22x22.png"))); // NOI18N
        jButton1.setText("AGREGAR BOLETO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCodigoImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(61, 61, 61)
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrecioPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCargaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(71, 71, 71)
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombEmpre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(txtNombEmpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(txtCodigoImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(btnBuscarDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdRuta)
                            .addComponent(txtIdUsu)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(txtCargaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grabar.png"))); // NOI18N
        btnGrabar.setText("Registrar Boletos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addComponent(btnGrabar)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane1)))
                        .addGap(24, 24, 24))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
        
        
        if(listDatos.size()==0){
            JOptionPane.showMessageDialog(null, "No hay registros !");
            return;
        }
        
        String nbus=txtBusNumProg.getText();
        if(nbus.equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione la Programación !");
            return;
        }
        
        try {
            
            for (int i = 0; i < listDatos.size(); i++) {

                Object[] s = new Object[]{};
                s=(Object[]) listDatos.get(i);

                Boleto bol = new Boleto();

                bol.setIdBol(0);

                Programacion pro = new Programacion();
                pro.setIdPro(Integer.parseInt(s[1].toString()));

                bol.setProgramacion(pro);

                Ruta rut = new Ruta();
                rut.setIdRut(Integer.parseInt(s[2].toString()));

                bol.setRuta(rut);

                Usuario usu = new Usuario();
                usu.setIdUsu(Integer.parseInt(s[4].toString()));

                bol.setUsuario(usu);

                bol.setRucEmpr(s[5].toString());
                bol.setNombEmpr(s[6].toString());
                bol.setDniCli(s[7].toString());
                bol.setNombCli(s[8].toString());
                bol.setPrecBol(new BigDecimal(s[9].toString()));

                if(txtCargaAdicional.getText().equals("")){
                    bol.setAcarBol(new BigDecimal("0.00"));
                }else{
                    bol.setAcarBol(new BigDecimal(s[10].toString()));
                }

                bol.setTotaBol(new BigDecimal(s[11].toString()));
                bol.setFcomBol(new Date());

                GenericDAO genericDAO = new GenericDAO();

                genericDAO.insert(bol);

            }
 
            JOptionPane.showMessageDialog(null, "Boletos Registrados exitosamente !");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSelectActionPerformed
        frmListProgramacion2 listProg = new frmListProgramacion2(null, rootPaneCheckingEnabled);
        listProg.setVisible(true);

    }//GEN-LAST:event_btnBusSelectActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        tipo=1;
        consultarDNI();
        
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void cboRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRutaActionPerformed
        if (contador > 0) {
            RutaDAO rutDAO = new RutaDAO();
            Integer idRut = rutDAO.getIdRutaSeleccionado(cboRuta.getSelectedItem().toString());
            txtIdRuta.setText(String.valueOf(idRut));
            
            //PARA TRAER PRECIOS
            ParametroDAO param=new ParametroDAO();
            List<Parametros> listParam = param.list(1);

            Integer dia=Integer.parseInt(listParam.get(0).getValorParam());
            
            List<Ruta> listRuta = rutDAO.listRuta(idRut);
            String precio = "";
            if(dia==0){
                precio=listRuta.get(0).getPnorRut().toString();
            }else if(dia==1){
                precio=listRuta.get(0).getPferRut().toString();
            }
            txtPrecioPasaje.setText(precio);
            txtTotal.setText(precio);
            if(txtCargaAdicional.getText().equals("")){
                txtCargaAdicional.setText("0.00");
            }
        }
        
        
        
    }//GEN-LAST:event_cboRutaActionPerformed

    private void txtCargaAdicionalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaAdicionalKeyReleased
        if(!txtCargaAdicional.getText().equals("") ){
        BigDecimal precio = new BigDecimal(txtPrecioPasaje.getText());
        BigDecimal cargaAdi = new BigDecimal(txtCargaAdicional.getText());
        BigDecimal total = precio.add(cargaAdi);
        txtTotal.setText(total.toString());
        }else{
            txtTotal.setText(txtPrecioPasaje.getText());
        }
    }//GEN-LAST:event_txtCargaAdicionalKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(reniec==1){
            cargarImagenDNI();
        }
        
        //cargarImagenRUC();
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            String dni=txtDNI.getText();
            String pasajero=txtNombPasajero.getText();
            int cboruta=cboRuta.getSelectedIndex();
            String mensaje="";
            if(dni.equals("") || pasajero.equals("") || cboruta==0){
                mensaje = mensaje + (String)(dni.equals("")?"\n - Ingrese DNI del Pasajero":"");
                mensaje = mensaje + (String)(pasajero.equals("")?"\n - Ingrese Nombres del Pasajero":"");
                mensaje = mensaje + (String)(cboruta==0?"\n - Seleccione la ruta":"");
              JOptionPane.showMessageDialog(null, mensaje);  
              return;
            }
        
        
        
        Object datos[]=new Object[13];
        
        datos[0]=0;
        datos[1]=txtIdProg.getText();
        datos[2]=txtIdRuta.getText();
        datos[3]=cboRuta.getSelectedItem();
        datos[4]=txtIdUsu.getText();
        datos[5]=txtRUC.getText();
        datos[6]=txtNombEmpre.getText();
        datos[7]=txtDNI.getText();
        datos[8]=txtNombPasajero.getText();
        datos[9]=new BigDecimal(txtPrecioPasaje.getText());
        datos[10]=new BigDecimal(txtCargaAdicional.getText());
        datos[11]=new BigDecimal(txtTotal.getText());
        datos[12]=new Date();
        
        listDatos.add(datos);
        
        cargarDatos();
        
        limpiarCajas();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selection = tableDatos.getSelectedRow();
        if(selection>=0){
            listDatos.remove(selection);
            cargarDatos();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void txtNombPasajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombPasajeroKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombPasajeroKeyTyped

    private void txtRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
        
        int num=txtRUC.getText().length();
        if(num>=11){
            evt.consume();
        }
    }//GEN-LAST:event_txtRUCKeyTyped

    private void txtCargaAdicionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaAdicionalKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCargaAdicionalKeyTyped

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(reniec==1){
            tipo=1;
            consultarDNI();
        }else{
                txtNombPasajero.requestFocus();
            }
            
        }
    }//GEN-LAST:event_txtDNIKeyPressed

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
            java.util.logging.Logger.getLogger(frmRegistrarBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRegistrarBoletos dialog = new frmRegistrarBoletos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cboRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenDNI;
    private javax.swing.JTable tableDatos;
    public static javax.swing.JTextField txtBusNumProg;
    private javax.swing.JTextField txtCargaAdicional;
    public static javax.swing.JTextField txtCodigoImagenDNI;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtFechaProg;
    public static javax.swing.JTextField txtHorarioProg;
    public static javax.swing.JLabel txtIdProg;
    private javax.swing.JLabel txtIdRuta;
    private javax.swing.JLabel txtIdUsu;
    public static javax.swing.JTextField txtNombEmpre;
    public static javax.swing.JTextField txtNombPasajero;
    public static javax.swing.JTextField txtPlacaBusProg;
    private javax.swing.JTextField txtPrecioPasaje;
    public static javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    private void cargarDatos() {

        Object[][] matriz = new Object[listDatos.size()][8];
        Object[] s = new Object[]{};
        for (int i = 0; i < listDatos.size(); i++) {
            
            s=(Object[]) listDatos.get(i);
            System.out.println(s[0]);
            
            matriz[i][0] = s[5];
            matriz[i][1] = s[6];
            matriz[i][2] = s[7];
            matriz[i][3] = s[8];
            matriz[i][4] = s[3];
            matriz[i][5] = s[9];
            matriz[i][6] = s[10];
            matriz[i][7] = s[11];
            
            
        }
        Object[][] data = matriz;
        String[] cabecera = {"RUC", "Razon Social", "DNI", "Nombres", "Ruta","Pasaje S/","C. Adicional S/","Total S/"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }
   /*public void cargarDatos() {

        
        
        
        //List<Object> datos = proDAO.buscarProgramacion(txtBuscar.getText(),cbEstado);

        Object[][] matriz = new Object[matrizDatos.length][8];
        Object[] s = new Object[]{};
        for (int i = 0; i < matrizDatos.length; i++) {

            
            matriz[i][0] = matrizDatos[i][5];
            matriz[i][1] = matrizDatos[i][6];
            matriz[i][2] = matrizDatos[i][7];
            matriz[i][3] = matrizDatos[i][8];
            matriz[i][4] = matrizDatos[i][3];
            matriz[i][5] = matrizDatos[i][9];
            matriz[i][6] = matrizDatos[i][10];
            matriz[i][7] = matrizDatos[i][11];
            
            
           

        }
        Object[][] data = matriz;
        String[] cabecera = {"RUC", "Razon Social", "DNI", "Nombres", "Ruta","Pasaje S/","C. Adicional S/","Total S/"};
        dtm = new DefaultTableModel(data, cabecera);
        tableDatos.setModel(dtm);
    }*/

    public void limpiarCajas() {
       txtRUC.setText("");
       txtNombEmpre.setText("");
       txtDNI.setText("");
       txtNombPasajero.setText("");
       
       txtPrecioPasaje.setText("");
       txtCargaAdicional.setText("");
       txtTotal.setText("");
       
       

    }

    
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(150);
    columnModel.getColumn(2).setPreferredWidth(200);
    columnModel.getColumn(3).setPreferredWidth(250);
    }

    
    public void cargarImagenDNI(){
        try {
            tipo = 1;
            urls[0] = "https://cel.reniec.gob.pe/valreg/valreg.do;";
            urls[1] = "https://cel.reniec.gob.pe/valreg/codigo.do";
            urls[2] = "https://cel.reniec.gob.pe/valreg/valreg.do;";
            //PARA RENIEC ES CON SSL               
//            JOptionPane.showMessageDialog(null,"Esperar 10 segundos", "Boton Consultar", JOptionPane.ERROR_MESSAGE);             
            buscarCookieLogueo = new BusquedaCookie().buscarCookieLogueoSSL(urls[0]);
            buscarCookieLogueoimagenreniec = new PeticionCookie().peticionConCookieImagenSSL(urls[1], "POST", "", (List<HttpCookie>) buscarCookieLogueo.get(0));
            lblImagenDNI.setIcon(new ImageIcon(buscarCookieLogueoimagenreniec));
           

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error no se puede cargar la imagen" + ex, "Boton Consultar", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void consultarDNI(){
        nocontinuar:

        if ((txtDNI.getText().trim().length() == 8 && tipo == 1)) {

            StringBuilder sb_parametros = new StringBuilder();

            if (tipo == 1)//DNI
            {
                sb_parametros.append("accion=buscar&");
                sb_parametros.append("nuDni=");
                sb_parametros.append(txtDNI.getText().trim());
                sb_parametros.append("&");
                sb_parametros.append("imagen=");
                sb_parametros.append(txtCodigoImagenDNI.getText().toUpperCase().trim());
            }

            String parametros = sb_parametros.toString();
            StringBuilder sb_url = new StringBuilder();
            sb_url.append(urls[2]);

            List<HttpCookie> cookies = (List<HttpCookie>) buscarCookieLogueo.get(0);
            for (HttpCookie httpCookie : cookies) {
                if (httpCookie.getName().compareToIgnoreCase("jsessionid") == 0) {
                    sb_url.append(httpCookie.getName());
                    sb_url.append("=");
                    sb_url.append(httpCookie.getValue());
                }
            }
            try {

                String[] rpta;
                buscarCookieLogueo1[0] = txtDNI.getText();

                if (tipo == 1) {
                    rpta = new PeticionCookie().peticionConCookieStringSSL(sb_url.toString(), "POST", parametros, (List<HttpCookie>) buscarCookieLogueo.get(0));
                    buscarCookieLogueo1[1] = rpta[0];
                    buscarCookieLogueo1[2] = "";
                }

                //direcion(referencia)131-132-<nos-sabe>
                String[] cadena = buscarCookieLogueo1[2].split("-");
                int tamanio = 0;
                //encontramos el tamanio de la ultima cadena(distrito)

                tamanio = 265 + tamanio;
                //direcion(referencia)131-132-tamanio                
                //tamanio =265+tamanio
                //"hamb urge r".substring(4, 8) returns "urge"
                // 1234 5678 9
                //direccion ubigeo
                //123456789 012345

                if (tipo == 1) {
                    //txtRpta.setText(buscarCookieLogueo1[0]+"\n"+buscarCookieLogueo1[1]);
                    txtNombPasajero.setText(buscarCookieLogueo1[1]);
                }

                

            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Formato incorrecto ", "Boton Consultar", JOptionPane.ERROR_MESSAGE);
        }
    }
                                             
}
