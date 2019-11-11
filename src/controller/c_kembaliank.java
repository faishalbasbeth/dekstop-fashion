/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.kembalian;

/**
 *
 * @author admin pc
 */
public class c_kembaliank {
    kembalian views;
    
    public c_kembaliank() throws SQLException {
        views = new kembalian();
        views.setVisible(true);
        
        views.totbay(new klikbayar());
        views.get_selesai().addActionListener(new klikselesai());

    }

    private  class klikbayar implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int total1,bayar1,totbayar;
            String totbayar1;
            total1 = Integer.parseInt(views.get_total().getText());
            bayar1 = Integer.parseInt(views.get_bayar().getText());
            totbayar = bayar1 - total1;
            totbayar1 = String.valueOf((totbayar));
            views.get_kembali().setText(totbayar1);
        }

        
    }

    private  class klikselesai implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_menuk();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }


    
}
