/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.menu;




/**
 *
 * @author admin pc
 */
public class c_menu {
    menu views;
    
    public c_menu() throws SQLException {
        views = new menu();
        views.setVisible(true);

        views.getkeluar1().addActionListener(new Klikkeluar());
        views.getdata_customer1().addActionListener(new Klikdatacustomer());
        views.getdata_pesanan1().addActionListener(new Klikdatapesanan());
        views.getdata_bahan1().addActionListener(new Klikdatabahan());
    }

    private  class Klikdatabahan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_bahan();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikdatapesanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_pesanan();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private  class Klikdatacustomer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_customer();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Klikkeluar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
               int c_login = 0;
            System.exit(c_login);
 }
        }

       
    }
}
