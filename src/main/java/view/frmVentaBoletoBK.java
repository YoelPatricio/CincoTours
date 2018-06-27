package view;

import dao.BusDAO;
import dao.EmpleadoDAO;
import dao.GenericDAO;
import dao.HorarioDAO;
import dao.ParametroDAO;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmVentaBoletoBK extends javax.swing.JDialog {

    DefaultTableModel dtm;
    String accion = "";
    int contador = 0;

    public frmVentaBoletoBK(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);//PARA CENTRAR EL JDIALOG

        ParametroDAO param=new ParametroDAO();
        List<Parametros> listParam = param.list(2);
        
        String[] valueParams=listParam.get(0).getValorParam().split(",");
        String idUsu=valueParams[0];
        txtIdUsu.setText(idUsu);
        
        
        
        
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
        
        /*txtIdBus.setVisible(false);
        txtIdPiloto.setVisible(false);
        txtIdCoPiloto.setVisible(false);
        txtIdRuta.setVisible(false);
        txtIdHorario.setVisible(false);
        txtValCoPi.setVisible(false);*/
        
        txtFechaExpe.setDate(new Date());
        
        
        
        GenericDAO g = new GenericDAO();
        String id=String.valueOf(g.generarID("idBol","Boleto"));
        txtCodigo.setText(id);


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
        txtRUC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombEmpre = new javax.swing.JTextField();
        btnPilotoSelect = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombPasajero = new javax.swing.JTextField();
        btnCoPilotoSelect = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaExpe = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cboRuta = new javax.swing.JComboBox<>();
        txtIdRuta = new javax.swing.JLabel();
        txtIdUsu = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPrecioPasaje = new javax.swing.JTextField();
        txtCargaAdicional = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deta.png"))); // NOI18N

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
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIdProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(30, Short.MAX_VALUE))
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
                            .addComponent(txtBusNumProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(txtIdProg))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBusSelect)
                .addGap(32, 32, 32))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("R.U.C :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Razón Social:");

        btnPilotoSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombEmpre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPilotoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPilotoSelect)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombEmpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(21, 21, 21))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasajero"));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("DNI:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Nombres:");

        btnCoPilotoSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa-22x22.png"))); // NOI18N
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNombPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCoPilotoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCoPilotoSelect))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(21, 21, 21))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Número Boleto:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setText("-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Expedición:");

        txtFechaExpe.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ruta:");

        cboRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRutaActionPerformed(evt);
            }
        });

        txtIdRuta.setText("0");

        txtIdUsu.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaExpe, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cboRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdRuta)
                    .addComponent(txtIdUsu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaExpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
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

        txtPrecioPasaje.setEditable(false);
        txtPrecioPasaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPrecioPasaje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtCargaAdicional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCargaAdicional.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCargaAdicional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargaAdicionalKeyReleased(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pasaje:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Carga Adicional:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(911, 911, 911)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(850, 850, 850)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(921, 921, 921)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtPrecioPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(txtCargaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            Boleto bol = new Boleto();
            
            bol.setIdBol(0);
            
            Programacion pro = new Programacion();
            pro.setIdPro(Integer.parseInt(txtIdProg.getText()));
           
            bol.setProgramacion(pro);
            
            Ruta rut = new Ruta();
            rut.setIdRut(Integer.parseInt(txtIdRuta.getText()));
            
            bol.setRuta(rut);
            
            Usuario usu = new Usuario();
            usu.setIdUsu(Integer.parseInt(txtIdUsu.getText()));
            
            bol.setUsuario(usu);
            
            bol.setRucEmpr(txtRUC.getText());
            bol.setNombEmpr(txtNombEmpre.getText());
            bol.setDniCli(txtDNI.getText());
            bol.setNombCli(txtNombPasajero.getText());
            bol.setPrecBol(new BigDecimal(txtPrecioPasaje.getText()));
            
            if(txtCargaAdicional.getText().equals("")){
                bol.setAcarBol(new BigDecimal("0.00"));
            }else{
                bol.setAcarBol(new BigDecimal(txtCargaAdicional.getText()));
            }
            
            bol.setTotaBol(new BigDecimal(txtTotal.getText()));
            bol.setFcomBol(txtFechaExpe.getDate());
            
            GenericDAO genericDAO = new GenericDAO();

            genericDAO.insert(bol);
                
            JOptionPane.showMessageDialog(null, "Venta Registrada exitosamente !");
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error !");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*limpiarCajas();
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
        }*/


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBusSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusSelectActionPerformed
        frmListProgramacion listProg = new frmListProgramacion(null, rootPaneCheckingEnabled);
        listProg.setVisible(true);

    }//GEN-LAST:event_btnBusSelectActionPerformed

    private void btnPilotoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilotoSelectActionPerformed
        
        
    }//GEN-LAST:event_btnPilotoSelectActionPerformed

    private void btnCoPilotoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoPilotoSelectActionPerformed
        
        
    }//GEN-LAST:event_btnCoPilotoSelectActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentaBoletoBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentaBoletoBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentaBoletoBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentaBoletoBK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmVentaBoletoBK dialog = new frmVentaBoletoBK(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnPilotoSelect;
    private javax.swing.JComboBox<String> cboRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JTextField txtBusNumProg;
    private javax.swing.JTextField txtCargaAdicional;
    private javax.swing.JLabel txtCodigo;
    public static javax.swing.JTextField txtDNI;
    private com.toedter.calendar.JDateChooser txtFechaExpe;
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

   /* public void cargarDatos() {

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
    }*/

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
    
    public void tamañoColumnas(){
        TableColumnModel columnModel = tableDatos.getColumnModel();

    columnModel.getColumn(0).setPreferredWidth(50);
    columnModel.getColumn(1).setPreferredWidth(150);
    columnModel.getColumn(2).setPreferredWidth(200);
    columnModel.getColumn(3).setPreferredWidth(250);
    }*/

}
