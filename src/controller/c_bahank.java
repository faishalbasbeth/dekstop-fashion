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
import model.m_bahan;
import view.data_bahan;
import view.data_bahank;

/**
 *
 * @author admin pc
 */
public class c_bahank {
    data_bahank views;
    m_bahan models;
    
     public c_bahank() throws SQLException {
        views = new data_bahank();
        models = new m_bahan();
        views.gettabel().setModel(models.getTabel());
        views.setVisible(true);
        
        views.getkembali().addActionListener(new Klikkembali());


    }

    private  class Klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menuk();
            } catch (SQLException ex) {
                Logger.getLogger(c_bahank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}




