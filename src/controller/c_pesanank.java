/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_pesanan;
import view.data_pesanan;

/**
 *
 * @author admin pc
 */
public class c_pesanank {
    data_pesanan views;
    m_pesanan models;
//    
    public c_pesanank() throws SQLException {
        views = new data_pesanan();
        models = new m_pesanan();
        views.gettabel().setModel(models.getTabel());
        views.setVisible(true);
        
        String[] id_customer = models.getid_customer();
        views.comboid_customer(id_customer);
        String[] id_bahan = models.getid_bahan();
        views.comboid_bahan(id_bahan);
        
        views.ktotal(new kliktotal());
        views.setOnClikid_bahan(new klikidbhan()); 
        views.gettambah().addActionListener(new Kliktambah());
        views.getsave().addActionListener(new Kliksave());
        views.getcancel().addActionListener(new Klikcancel());
        views.gethapus().addActionListener(new Klikhapus());
        views.getedit().addActionListener(new Klikedit());
        views.getlanjut().addActionListener(new Klilanjut());
        views.getkembali().addActionListener(new Klikkembali());
          
    }
    
    public void save() {
        views.getid_pesanan().setEnabled(false);
        views.getid_customer().setEnabled(true);
        views.getjenis_pesanan().setEnabled(true);
        views.getmodel_pesanan().setEnabled(true);
        views.getid_bahan().setEnabled(true);
        views.getukuran().setEnabled(true);
        views.getbanyak_pesanan().setEnabled(true);
        views.gettanggal_pesanan().setEnabled(true);
        views.getselesai_pesanan().setEnabled(true);
        views.getharga_per_barang().setEnabled(true);
        views.get_total_harga().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
    }
    public void ubah() {
        views.getid_pesanan().setEnabled(false);
        views.getid_customer().setEnabled(true);
        views.getjenis_pesanan().setEnabled(true);
        views.getmodel_pesanan().setEnabled(true);
        views.getid_bahan().setEnabled(true);
        views.getukuran().setEnabled(true);
        views.getbanyak_pesanan().setEnabled(true);
        views.gettanggal_pesanan().setEnabled(true);
        views.getselesai_pesanan().setEnabled(true);
        views.getharga_per_barang().setEnabled(true);
        views.get_total_harga().setEnabled(true);
        views.getsave().setEnabled(true);
        views.gettambah().setEnabled(false);
        views.getcancel().setEnabled(true);
        views.gethapus().setEnabled(false);
        views.getedit().setEnabled(false);
    }
    public void awal() {
        views.getid_pesanan().setEnabled(false);
        views.getid_customer().setEnabled(false);
        views.getjenis_pesanan().setEnabled(false);
        views.getmodel_pesanan().setEnabled(false);
        views.getid_bahan().setEnabled(false);
        views.getukuran().setEnabled(false);
        views.getbanyak_pesanan().setEnabled(false);
        views.gettanggal_pesanan().setEnabled(false);
        views.getselesai_pesanan().setEnabled(false);
        views.getharga_per_barang().setEnabled(false);
        views.get_total_harga().setEnabled(false);
        views.getsave().setEnabled(false);
        views.gettambah().setEnabled(true);
        views.getcancel().setEnabled(false);
        views.gethapus().setEnabled(true);
        views.getedit().setEnabled(true);
    }

    private class kliktotal implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int harga1,bayar1,totbayar;
            String totbayar1;
            harga1 = Integer.parseInt(views.getharga_per_barang().getText());
        bayar1 = Integer.parseInt(views.getbanyak_pesanan().getText());
        totbayar = harga1 * bayar1;
//        DecimalFormat f = new DecimalFormat("#.#");
        totbayar1 = String.valueOf((totbayar));
        views.get_total_harga().setText(totbayar1);
        }

        
    }

    private  class klikidbhan implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(views.getSelectedid_bahan());
            if (views.getid_bahan().getSelectedIndex() == 0) {
                views.setharga_per_barang("0");
            }else {
                try {
                    views.setharga_per_barang(String.valueOf(models.getharga_per_barang(views.getSelectedid_bahan())));
                } catch (SQLException ex) {
                    Logger.getLogger(c_pesanank.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//
//        
    }
//
    private class Klikedit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int baris = views.gettabel().getSelectedRow();
            String id_pesanan = views.gettabel().getValueAt(baris, 0).toString();
            String id_customer = views.gettabel().getValueAt(baris, 1).toString();
            String jenis_pesanan = views.gettabel().getValueAt(baris, 2).toString();
            String model_pesanan = views.gettabel().getValueAt(baris, 3).toString();
            String id_bahan = views.gettabel().getValueAt(baris, 4).toString();
            String ukuran = views.gettabel().getValueAt(baris, 5).toString();
            String banyak_pesanan = views.gettabel().getValueAt(baris, 6).toString();
            String tanggal_pesanan = views.gettabel().getValueAt(baris, 7).toString();
            String selesai_pesanan = views.gettabel().getValueAt(baris, 8).toString();
            String harga_per_barang = views.gettabel().getValueAt(baris, 9).toString();
            String total_harga = views.gettabel().getValueAt(baris, 10).toString();
            
            views.getid_pesanan().setText(id_pesanan);
            views.getid_customer().setSelectedItem(id_customer);
            views.getjenis_pesanan().setSelectedItem(jenis_pesanan);
            views.getmodel_pesanan().setText(model_pesanan);
            views.getid_bahan().setSelectedItem(id_bahan);
            views.getukuran().setSelectedItem(ukuran);
            views.getbanyak_pesanan().setText(banyak_pesanan);
            views.gettanggal_pesanan().setText(tanggal_pesanan);
            views.getselesai_pesanan().setText(selesai_pesanan);
            views.getharga_per_barang().setText(harga_per_barang);
            views.get_total_harga().setText(total_harga);
        }
//
//        
    }
//
    private  class Klikhapus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String id_pesanan1 = views.getid_pesanan().getText();
            int baris = views.gettabel().getSelectedRow();
            String id_pesanan = views.gettabel().getValueAt(baris, 0).toString();
            models.hapus(id_pesanan);
            views.gettabel().setModel(models.getTabel());
        }
//
//        
    }
//
    private  class Klikcancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            views.getid_pesanan().setText("");
            views.getid_customer().setSelectedItem("");
            views.getjenis_pesanan().setSelectedItem("");
            views.getmodel_pesanan().setText("");
            views.getid_bahan().setSelectedItem("");
            views.getukuran().setSelectedItem("");
            views.getbanyak_pesanan().setText("");
            views.gettanggal_pesanan().setText("");
            views.getselesai_pesanan().setText("");
            views.getharga_per_barang().setText("");
            views.get_total_harga().setText("");
            awal();
        }
//
        
    }
//
    private  class Klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_menuk();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        
    }
//
    private  class Klilanjut implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           views.dispose();
            try {
                new c_kembaliank();
            } catch (SQLException ex) {
                Logger.getLogger(c_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }

    private class Kliktambah implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           save();
        }

        
    }

    private class Kliksave implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          views.gettabel().setModel(models.getTabel());
            String id_pesanan = views.getid_pesanan().getText();
            String id_customer = (String) views.getid_customer().getSelectedItem();
            String jenis_pesanan = (String) views.getjenis_pesanan().getSelectedItem();
            String model_pesanan = (String) views.getmodel_pesanan().getText();
            String id_bahan = (String) views.getid_bahan().getSelectedItem();
            String id_ukuran = (String) views.getukuran().getSelectedItem();
            String banyak_pesanan = (String) views.getbanyak_pesanan().getText();
            String tanggal_pesanan = (String) views.gettanggal_pesanan().getText();
            String selesai_pesanan = (String) views.getselesai_pesanan().getText();
            String harga_per_barang = (String) views.getharga_per_barang().getText();
            String total_harga = (String) views.get_total_harga().getText();
            if (id_pesanan.equals("")) {
                models.insert(id_customer, jenis_pesanan, model_pesanan, id_bahan, id_ukuran, banyak_pesanan, tanggal_pesanan, selesai_pesanan,harga_per_barang ,total_harga);
            } else {
                models.Edit(id_customer, jenis_pesanan, model_pesanan, id_bahan, id_ukuran, banyak_pesanan, tanggal_pesanan, selesai_pesanan, harga_per_barang ,total_harga, id_pesanan);
            }

            views.gettabel().setModel(models.getTabel());
        }

        
    }

    
}
    
      

    
    


