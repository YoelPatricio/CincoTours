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
import entity.Encomienda;
import entity.Encomiendadetalle;
import entity.Horario;
import entity.Parametros;
import entity.Programacion;
import entity.Rol;
import entity.Ruta;
import entity.Usuario;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
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

public class frmRegistrarEncomienda extends javax.swing.JDialog {

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
    
    
    List<Encomiendadetalle> detalleList=new ArrayList<>();
    int index=0;
    Integer reniec=0;
    
    public frmRegistrarEncomienda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG
        //this.setSize(this.getToolkit().getScreenSize());
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
            btnBuscarDNI1.setEnabled(false);
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
        txtFechaRe.setDate(new Date());
         txtFechaRe.setEnabled(false);
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
        jLabel8 = new javax.swing.JLabel();
        cboRuta = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCodigoImagenDNI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDNIremi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombremi = new javax.swing.JTextField();
        btnBuscarDNI = new javax.swing.JButton();
        txtIdRuta = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JLabel();
        lblImagenDNI = new javax.swing.JLabel();
        txtFechaRe = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        txtDNIrece = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNombrece = new javax.swing.JTextField();
        btnBuscarDNI1 = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtDesc = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registro encomienda.png"))); // NOI18N

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
        jLabel9.setText("F. Recepcion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Origen - Dest.:");

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
        jLabel14.setText("DNI Remitente:");

        txtDNIremi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIremiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIremiKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Nombres:");

        txtNombremi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombremiKeyTyped(evt);
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

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("DNI Receptor:");

        txtDNIrece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIreceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIreceKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Nombres:");

        txtNombrece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreceKeyTyped(evt);
            }
        });

        btnBuscarDNI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
        btnBuscarDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNI1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDNIrece, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscarDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombremi, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombrece, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigoImagenDNI)
                            .addComponent(txtDNIremi, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFechaRe, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFechaRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtIdRuta))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigoImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(14, 14, 14))))
                            .addComponent(lblImagenDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtIdUsu))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNIremi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(btnBuscarDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombremi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNIrece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addComponent(btnBuscarDNI1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mas-22x22.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descripción");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Ingrese los paquetes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL : S/");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
            String nbus=txtBusNumProg.getText();
            int od=cboRuta.getSelectedIndex();
            String dnir=txtDNIremi.getText();
            String nre=txtNombremi.getText();
            String dnico=txtDNIrece.getText();
            String ncon=txtNombrece.getText();
            
         
            String mensaje="";
            if(nbus.equals("") || dnir.equals("") || nre.equals("") || dnico.equals("") || od==0 || ncon.equals("")){
                mensaje = mensaje + (String)(nbus.equals("")?"\n - Elija la programación":"");
                mensaje = mensaje + (String)(od==0?"\n - Seleccione Origen y destino":"");
                mensaje = mensaje + (String)(dnir.equals("")?"\n - DNI Remitente":"");
                mensaje = mensaje + (String)(nre.equals("")?"\n - Nombres del Remitente":"");
                mensaje = mensaje + (String)(dnico.equals("")?"\n - DNI del receptor":"");
                mensaje = mensaje + (String)(ncon.equals("")?"\n - Nombres del receptor":"");
               
              JOptionPane.showMessageDialog(null, "Falta ingresar !" + mensaje);  
              return;
            }
        
        
        
        if(detalleList.size()==0){
            JOptionPane.showMessageDialog(null, "No ha ingresado paquetes!");
            return;
        }
        
        try {
            Programacion p = new Programacion();
            p.setIdPro(Integer.parseInt(txtIdProg.getText()));
            Ruta r=new Ruta();
            r.setIdRut(Integer.parseInt(txtIdRuta.getText()));
            Encomienda e=new Encomienda();
            e.setProgramacion(p);
            e.setRuta(r);
            e.setFechEnc(txtFechaRe.getDate());
            e.setDremEnc(txtDNIremi.getText());
            e.setNremEnc(txtNombremi.getText());
            e.setDconEnc(txtDNIrece.getText());
            e.setNconEnc(txtNombrece.getText());
            e.setTotaEnc(new BigDecimal(txtTotal.getText()));
            e.setEstaEnc(0);
            GenericDAO g = new GenericDAO();

            HashSet<Encomiendadetalle> enc = new HashSet<Encomiendadetalle>();
            for (int i = 0; i < detalleList.size(); i++) {
                Encomiendadetalle ed = new Encomiendadetalle();
                ed.setDescEnc(detalleList.get(i).getDescEnc());
                ed.setPrecEnc(detalleList.get(i).getPrecEnc());

                enc.add(ed);
            }

            e.setDetalle(enc);

            g.insert(e);

            JOptionPane.showMessageDialog(null, "Encomienda Registrada exitosamente !");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSelectActionPerformed
        frmListProgramacion3 listProg = new frmListProgramacion3(null, rootPaneCheckingEnabled);
        listProg.setVisible(true);

    }//GEN-LAST:event_btnBusSelectActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        tipo=1;
        tipoPersona=1;
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
            /*txtPrecioPasaje.setText(precio);
            txtTotal.setText(precio);
            if(txtCargaAdicional.getText().equals("")){
                txtCargaAdicional.setText("0.00");
            }*/
        }
        
        
        
    }//GEN-LAST:event_cboRutaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(reniec==1){
            cargarImagenDNI();
        }
        
        //cargarImagenRUC();
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selection = tableDatos.getSelectedRow();
        if(selection>=0){
            detalleList.remove(selection);
            cargarDatos();
            calcularTotal();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro!");
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNI1ActionPerformed
        tipo=1;
        tipoPersona=2;
        consultarDNI();
    }//GEN-LAST:event_btnBuscarDNI1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String desc=txtDesc.getText();
        String precio=txtPrecio.getText();
        if(desc.equals("") && precio.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la descripcion y el precio !");
            return;
        }else if(desc.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la descripcion !");
            return;
        }else if(precio.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el precio !");
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
        Encomiendadetalle enc = new Encomiendadetalle();
        enc.setDescEnc(desc);
        enc.setPrecEnc(new BigDecimal(precio));
        detalleList.add(enc);
        index++;
        txtDesc.setText("");
        txtPrecio.setText("");
        txtDesc.requestFocus();
        cargarDatos();

        
        
        calcularTotal();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDNIremiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIremiKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(reniec==1){
            tipo=1;
        tipoPersona=1;
        consultarDNI();
        }else{
                txtNombremi.requestFocus();
            }
            
            
        }
        
        
    }//GEN-LAST:event_txtDNIremiKeyPressed

    private void txtDNIreceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIreceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(reniec==1){
            tipo=1;
        tipoPersona=2;
        consultarDNI();
        }else{
                txtNombrece.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDNIreceKeyPressed

    private void txtDNIremiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIremiKeyTyped
         char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
        
        int num=txtDNIremi.getText().length();
        if(num>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIremiKeyTyped

    private void txtDNIreceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIreceKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
        
        int num=txtDNIrece.getText().length();
        if(num>=8){
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIreceKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNombremiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombremiKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombremiKeyTyped

    private void txtNombreceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreceKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreceKeyTyped

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
            java.util.logging.Logger.getLogger(frmRegistrarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarEncomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmRegistrarEncomienda dialog = new frmRegistrarEncomienda(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscarDNI1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cboRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenDNI;
    private javax.swing.JTable tableDatos;
    public static javax.swing.JTextField txtBusNumProg;
    public static javax.swing.JTextField txtCodigoImagenDNI;
    public static javax.swing.JTextField txtDNIrece;
    public static javax.swing.JTextField txtDNIremi;
    private javax.swing.JTextField txtDesc;
    public static javax.swing.JTextField txtFechaProg;
    private com.toedter.calendar.JDateChooser txtFechaRe;
    public static javax.swing.JTextField txtHorarioProg;
    public static javax.swing.JLabel txtIdProg;
    private javax.swing.JLabel txtIdRuta;
    private javax.swing.JLabel txtIdUsu;
    public static javax.swing.JTextField txtNombrece;
    public static javax.swing.JTextField txtNombremi;
    public static javax.swing.JTextField txtPlacaBusProg;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
    private void cargarDatos() {

        Object[][] matriz = new Object[detalleList.size()][2];
        Object[] s = new Object[]{};
        for (int i = 0; i < detalleList.size(); i++) {
            
            matriz[i][0] = detalleList.get(i).getDescEnc();
            matriz[i][1] = detalleList.get(i).getPrecEnc();
 
        }
        Object[][] data = matriz;
        String[] cabecera = {"Descripción", "Precio"};
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

        if ((txtDNIremi.getText().trim().length() == 8 && tipo == 1)) {

            StringBuilder sb_parametros = new StringBuilder();

            if (tipo == 1)//DNI
            {
                sb_parametros.append("accion=buscar&");
                sb_parametros.append("nuDni=");
                if(tipoPersona==1){
                    sb_parametros.append(txtDNIremi.getText().trim());
                }else{
                    sb_parametros.append(txtDNIrece.getText().trim());
                }
                
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
                if(tipoPersona==1){
                    buscarCookieLogueo1[0] = txtDNIremi.getText();
                }else{
                    buscarCookieLogueo1[0] = txtDNIrece.getText();
                }
                

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
                    if(tipoPersona==1){
                        txtNombremi.setText(buscarCookieLogueo1[1]);
                    }else{
                        txtNombrece.setText(buscarCookieLogueo1[1]);
                    }
                    
                }

                

            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Formato incorrecto ", "Boton Consultar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void calcularTotal(){
            BigDecimal total=new BigDecimal("0.00");
        for (int i = 0; i < detalleList.size(); i++) {
            total =total.add(detalleList.get(i).getPrecEnc());
        }
        if(detalleList.size()==0){
            txtTotal.setText("0.00");
        }else{
            txtTotal.setText(String.valueOf(total));
        }
        
    }
                                             
}
