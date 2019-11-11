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
/**
 *
 * @author admin pc
 */
public class c_customerk {
    data_customer views;
    m_customer models;

    public c_customerk() throws SQLException {
        views = new data_customer();
        models = new m_customer();
        views.gettabel().setModel(models.getTabel());
        views.setVisible(true);
        
        views.gettambah().addActionListener(new Kliktambah());
        views.getsave().addActionListener(new Kliksave());
        views.getcancel().addActionListener(new Klikcancel());
        views.gethapus().addActionListener(new Klikhapus());
        views.getedit().addActionListener(new Klikedit());
        views.getkembali().addActionListener(new Klikkembali());
    }

    private class Klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_menuk();
            } catch (SQLException ex) {
                Logger.getLogger(c_customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
//
    private class Kliklanjut implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_pesanan();
            } catch (SQLException ex) {
                Logger.getLogger(c_customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private class Klikedit implements ActionListener {
//
//        
//
        @Override
        public void actionPerformed(ActionEvent e) {
            int baris = views.gettabel().getSelectedRow();
            String id_customer = views.gettabel().getValueAt(baris, 0).toString();
            String nama_customer = views.gettabel().getValueAt(baris, 1).toString();
            String alamat_customer = views.gettabel().getValueAt(baris, 2).toString();
            String noHp = views.gettabel().getValueAt(baris, 3).toString();
            
            views.getid_customer().setText(id_customer);
            views.getnama_customer().setText(nama_customer);
            views.getalamat_customer().setText(alamat_customer);
            views.getnoHp().setText(noHp);
//            
//            
        }
    }
//
    private  class Klikhapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id_customer1 = views.getid_customer().getText();
            int baris = views.gettabel().getSelectedRow();
            String id_customer = views.gettabel().getValueAt(baris, 0).toString();
            models.hapus(id_customer);
            views.gettabel().setModel(models.getTabel());
//            
        }
    }
//
    private class Klikcancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.getid_customer().setText("");
            views.getnama_customer().setText("");
            views.getalamat_customer().setText("");
            views.getnoHp().setText("");
            awal();
        }
    }
//    
    private class Kliksave implements ActionListener {

        private Component tabel;

        @Override
        public void actionPerformed(ActionEvent e) {
            
//        models.insert(views.getnama_customer().getText().toString(), views.getalamat_customer().getText().toString()
//        ,views.getnoHp().getText().toString());
//        views.gettabel().setModel(models.getTabel());

            views.gettabel().setModel(models.getTabel());
            String id_customer = views.getid_customer().getText();
            String nama_customer = views.getnama_customer().getText();
            String alamat_customer = views.getalamat_customer().getText();
            String noHp = views.getnoHp().getText();
            
            if (id_customer.equals("")) {
                models.insert(nama_customer, alamat_customer, noHp);
            } else {
                models.Edit(nama_customer, alamat_customer, noHp, id_customer);
            }

            views.gettabel().setModel(models.getTabel());
            
             
        }
        
    }
    private class Kliktambah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            save();
        }
        
    }
    public void save() {
        views.getid_customer().setEnabled(false);
        views.getnama_customer().setEnabled(true);
        views.getalamat_customer().setEnabled(true);
        views.getnoHp().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
    }
    public void ubah() {
        views.getid_customer().setEnabled(false);
        views.getnama_customer().setEnabled(true);
        views.getalamat_customer().setEnabled(true);
        views.getnoHp().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
        
    }
    public void awal() {
        views.getid_customer().setEnabled(false);
        views.getnama_customer().setEnabled(false);
        views.getalamat_customer().setEnabled(false);
        views.getnoHp().setEnabled(false);
        views.getsave().setEnabled(false);
        views.gettambah().setEnabled(true);
        views.getcancel().setEnabled(false);
        views.gethapus().setEnabled(true);
        views.getedit().setEnabled(true);
    }
     
}




