/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.c_bahan;
import controller.c_pesanan;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin pc
 */
public class m_pesanan extends m_model{
//    m_koneksi kon;
    private Component tabel;
    String query;
    public m_pesanan() throws SQLException{
//        kon=new m_koneksi("pbo2","root","");
super();
    }
    public DefaultTableModel getTabel(){
        String[] header = {"Id Pesanan", "Id customer", "Jenis Pesanan", "Model Pesanan", "Id Bahan","Ukuran","Banyak Pesanan","Tanggal Pesanan","Selesai Pesanan","Harga per Barang","Total Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from id_pesanann";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[11];
                kolom[0] = rs.getString("id_pesanan");
                kolom[1] = rs.getString("id_customer");
                kolom[2] = rs.getString("jenis_pesanan");
                kolom[3] = rs.getString("model_pesanan");
                kolom[4] = rs.getString("id_bahan");
                kolom[5] = rs.getString("ukuran");
                kolom[6] = rs.getString("banyak_pesanan");
                kolom[7] = rs.getString("tanggal_pesanan");
                kolom[8] = rs.getString("selesai_pesanan");
                kolom[9] = rs.getString("harga_per_barang");
                kolom[10] = rs.getString("total_harga");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }
    
    public String getharga_per_barang(String id) throws SQLException{
        System.out.println(id);
        String biaya = null;
        try{
            Statement stm = kon.koneksi.createStatement();
            ResultSet rs = stm.executeQuery("select harga from idbahan where id_bahan= " + id + " ");
            rs.next();
            biaya = String.valueOf(rs.getInt("harga"));
        }catch (SQLException ex) {
            Logger.getLogger(m_pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    return biaya;
}
    
        public String[] getid_customer() {
            String[] id_customer = null;
            int x=0;
            try {
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_customer from idcustomer");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_customer = new String [row];
                while(rs.next()){
                    id_customer[x] = rs.getString("id_customer");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_customer;
}

        public String[] getid_bahan(){
            String[] id_bahan = null;
            int x=0;
            try{
                Statement stm = kon.koneksi.createStatement();
                ResultSet rs = stm.executeQuery(" select id_bahan from idbahan");
                rs.last();
                int row = rs.getRow();
                rs.beforeFirst();
                id_bahan = new String [row];
                while(rs.next()){
                    id_bahan[x] = rs.getString("id_bahan");
                    x++;
                }
        } catch (SQLException ex) {
            Logger.getLogger(m_pesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
            return id_bahan;
}

    public void insert(String id_customer, String jenis_pesanan, String model_pesanan, String id_bahan, String id_ukuran, String banyak_pesanan, String tanggal_pesanan, String selesai_pesanan, String harga_per_barang, String total_harga) {
        try {
            String query="INSERT INTO `pbo2`.`id_pesanann` (`id_pesanan`, `id_customer`, `jenis_pesanan`, `model_pesanan`, `id_bahan`, `ukuran`, `banyak_pesanan`, `tanggal_pesanan`, `selesai_pesanan`, `harga_per_barang`, `total_harga`) "
                    + "VALUES (NULL, '" + id_customer + "', '" + jenis_pesanan + "', '" + model_pesanan + "', '" + id_bahan + "', '" + id_ukuran + "', '" + banyak_pesanan + "', '" + tanggal_pesanan + "', '" + selesai_pesanan + "', '" + harga_per_barang + "', '" + total_harga + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }

    public void Edit(String id_customer, String jenis_pesanan, String model_pesanan, String id_bahan, String ukuran, String banyak_pesanan, String tanggal_pesanan, String selesai_pesanan, String harga_per_barang, String total_harga, String id_pesanan) {
        try {
            String query = "UPDATE `id_pesanann` SET `id_customer` ='" + id_customer + "', `jenis_pesanan` = '" + jenis_pesanan + "', `model_pesanan` = '" + model_pesanan + "', `id_bahan` = '" + id_bahan + "', `ukuran` = '" + ukuran + "', `banyak_pesanan` = '" + banyak_pesanan + "', `tanggal_pesanan` = '" + tanggal_pesanan + "', `selesai_pesanan` = '" + selesai_pesanan + "', `harga_per_barang` = '" + harga_per_barang + "', `total_harga` = '" + total_harga + "' where `id_pesanann`.`id_pesanan` = '" + id_pesanan + "'";
            kon.execute(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void hapus(String id_pesanan) {
        try {
            String query = "DELETE FROM `id_pesanann` WHERE `id_pesanann`.`id_pesanan` ='" + id_pesanan + "'";
            kon.execute(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    
    }
           

    

    

