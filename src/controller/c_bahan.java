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

/**
 *
 * @author admin pc
 */
public class c_bahan {
    data_bahan views; //objek atribut
    m_bahan models;
    
     public c_bahan() throws SQLException {
        views = new data_bahan();//konstruktor
        models = new m_bahan();
        views.gettabel().setModel(models.getTabel());
        views.setVisible(true);

        views.gettambah().addActionListener(new Kliktambah());
        views.getsave().addActionListener(new Kliksave());
        views.getcancel().addActionListener(new Klikcancel());
        views.gethapus().addActionListener(new Klikhapus());
        views.getedit().addActionListener(new Klikedit());
        views.getkembali().addActionListener(new Klikkembali());
    }
     public void save() {
        views.getid_bahan().setEnabled(false);
        views.getnama_bahan().setEnabled(true);
        views.getwarna_bahan().setEnabled(true);
        views.getstok().setEnabled(true);
        views.getharga().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
        
    }
    public void ubah() {
        views.getid_bahan().setEnabled(false);
        views.getnama_bahan().setEnabled(true);
        views.getwarna_bahan().setEnabled(true);
        views.getstok().setEnabled(true);
        views.getharga().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
        
        
    }
    public void awal() {
        views.getid_bahan().setEnabled(false);
        views.getnama_bahan().setEnabled(false);
        views.getwarna_bahan().setEnabled(false);
        views.getstok().setEnabled(false);
        views.getharga().setEnabled(false);
        views.getsave().setEnabled(false);
        views.gettambah().setEnabled(true);
        views.getcancel().setEnabled(false);
        views.gethapus().setEnabled(true);
        views.getedit().setEnabled(true);
        
    }

    private  class Klikedit implements ActionListener {//enkapsulasi

        @Override//polymorphism
        public void actionPerformed(ActionEvent e) {
            int baris = views.gettabel().getSelectedRow();//parameter input
            String id_bahan = views.gettabel().getValueAt(baris, 0).toString();//metode,parameter sama, isi beda
            String nama_bahan = views.gettabel().getValueAt(baris, 1).toString();
            String warna_bahan = views.gettabel().getValueAt(baris, 2).toString();
            String stok = views.gettabel().getValueAt(baris, 3).toString();
            String harga = views.gettabel().getValueAt(baris, 4).toString();
            
            views.getid_bahan().setText(id_bahan);
            views.getnama_bahan().setText(nama_bahan);
            views.getwarna_bahan().setText(warna_bahan);
            views.getstok().setText(stok);
            views.getharga().setText(harga);
        }

        
    }

    private class Klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.dispose();
            try {
                new c_menu();
            } catch (SQLException ex) {
                Logger.getLogger(c_bahan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }
    
    private class Klikhapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id_bahan1 = views.getid_bahan().getText();
            int baris = views.gettabel().getSelectedRow();
            String id_bahan = views.gettabel().getValueAt(baris, 0).toString();
            models.hapus(id_bahan);
            views.gettabel().setModel(models.getTabel());
        }

        
    }

    private class Klikcancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.getid_bahan().setText("");
            views.getnama_bahan().setText("");
            views.getwarna_bahan().setText("");
            views.getstok().setText("");
            views.getharga().setText("");
            awal();
        }

        
    }

    private class Kliksave implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.gettabel().setModel(models.getTabel());
            String id_bahan = views.getid_bahan().getText();
            String nama_bahan = views.getnama_bahan().getText();
            String warna_bahan = views.getwarna_bahan().getText();
            String stok = views.getstok().getText();
            String harga = views.getharga().getText();
            if (id_bahan.equals("")) {
                models.insert(nama_bahan, warna_bahan, stok, harga);
            } else {
                models.Edit(nama_bahan, warna_bahan, stok, harga, id_bahan);
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
}
