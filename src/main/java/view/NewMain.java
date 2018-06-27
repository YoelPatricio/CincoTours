/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author limati
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Login log = new Login(null, true);
        log.setVisible(true);
        /*frmPrincipal pr = new frmPrincipal();
        pr.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        pr.setVisible(true);
         pr.setUndecorated(true);*/
        
    }
    
}
