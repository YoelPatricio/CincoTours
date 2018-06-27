/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.GenericDAO;
import dao.RolDAO;
import dao.UsuarioDAO;
import static dao.UsuarioDAO.usuarioInSession;
import entity.Parametros;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author limati
 */
public class Login extends javax.swing.JDialog {

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 150, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 150, -1));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CHECK48X48.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 152, 61));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 130, 61));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        ingresar();
        
        
        

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ingresar();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void ingresar() {

        UsuarioDAO ud=new UsuarioDAO();
        RolDAO r=new RolDAO();
        frmPrincipal principal= new frmPrincipal();
        
        String usu=txtUser.getText();
        String pass=txtPassword.getText();
        
        if(pass.equals("") && usu.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el Usuario y la Contraseña !");
            return;
        }else{
            if (usu.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del Usuario!");
            return;
            }else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la Contraseña!");
            return;
            }
        }
        Integer idRol=ud.validarUsuario(usu, pass);
        
        if (idRol != 0) {
            
            List<Integer> perm =r.listPermisos(idRol);
            principal.activarModulos(perm);
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            userInSession();
            dispose();          
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos !");
        }

    }
    
    public void userInSession(){
        String user=txtUser.getText();
        String pass=txtPassword.getText();
        
        List<Object> sa = usuarioInSession(user, pass);
        
        Parametros param= new Parametros();
        GenericDAO g = new GenericDAO();
        Object[] a = new Object[4];
        a=(Object[]) sa.get(0);
        String userParam=a[0].toString()+","+a[1].toString()+","+a[2].toString()+","+a[3].toString();
        param.setIdParam(2);
        param.setCodeParam("USER");
        param.setNombParam("USER");
        param.setValorParam(userParam);
        g.update(param);
    }
}
