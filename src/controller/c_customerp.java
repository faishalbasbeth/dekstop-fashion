/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.m_customer;
import model.m_login;
import view.data_customer;
import view.data_customerp;
/**
 *
 * @author admin pc
 */
public class c_customerp {
    data_customerp views;
    m_customer models;
    
    public c_customerp() throws SQLException {
        views = new data_customerp();
        models = new m_customer();
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
                Logger.getLogger(c_customerp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
}