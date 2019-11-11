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
import model.m_pesanan;
import view.data_pesanan;
import view.data_pesananp;

/**
 *
 * @author admin pc
 */
public class c_pesananp {
    data_pesananp views;
    m_pesanan models;
    
    public c_pesananp() throws SQLException {
        views = new data_pesananp();
        models = new m_pesanan();
        views.gettabel().setModel(models.getTabel());
        views.setVisible(true);
        
        views.getkembali().addActionListener(new Klikkembali());
    }

    private  class Klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menup();
            } catch (SQLException ex) {
                Logger.getLogger(c_pesananp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}