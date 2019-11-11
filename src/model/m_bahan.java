/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin pc
 */
public class m_bahan extends m_model{//interface
//    m_koneksi kon;
//    private Component tabel;
    String query;

    
    public m_bahan() throws SQLException{
//        kon=new m_koneksi("pbo2","root","");
    super();
}
    public DefaultTableModel getTabel(){
        String[] header = {"Id Bahan", "Nama Bahan", "Warna Bahan", "Stok", "Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from idbahan";
            ResultSet rs = kon.getResult(query);
            
            while (rs.next()) {
                String[] kolom = new String[5];
                kolom[0] = rs.getString("id_bahan");
                kolom[1] = rs.getString("nama_bahan");
                kolom[2] = rs.getString("warna_bahan");
                kolom[3] = rs.getString("stok");
                kolom[4] = rs.getString("harga");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;//return values
}


    public void hapus(String id_bahan) {
        try {
            String query = "DELETE FROM `idbahan` WHERE `idbahan`.`id_bahan` ='" + id_bahan + "'";
            kon.execute(query);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insert(String nama_bahan, String warna_bahan, String stok, String harga) {
        try {
            String query="INSERT INTO `pbo2`.`idbahan` (`id_bahan`, `nama_bahan`, `warna_bahan`, `stok`, `harga`) "
                    + "VALUES (NULL, '" + nama_bahan + "', '" + warna_bahan + "', '" + stok + "', '" + harga + "');";
            kon.execute(query);
           
        } catch (SQLException e) {
            System.out.println(e);
            
        }
    }


    public void Edit(String nama_bahan, String warna_bahan, String stok, String harga, String id_bahan) {
        try {
            String query = "UPDATE `idbahan` SET `nama_bahan` ='" + nama_bahan + "', `warna_bahan` = '" + warna_bahan + "', `stok` = '" + stok + "', `harga` = '" + harga + "' where `idbahan`.`id_bahan` = '" + id_bahan + "'";
            kon.execute(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
