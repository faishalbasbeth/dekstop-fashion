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
import javax.swing.table.TableModel;

/**
 *
 * @author admin pc
 */
public class m_customer extends m_model {

//    m_koneksi kon;
//        private Component tabel;
String query;
    public m_customer() throws SQLException {
//        kon = new m_koneksi("pbo2", "root", "");
super();
    }

    public DefaultTableModel getTabel() {
        String[] header = {"Id Customer", "Nama", "Alamat", "No HandPhone"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from idcustomer";
            ResultSet rs = kon.getResult(query);

            while (rs.next()) {
                String[] kolom = new String[4];
                kolom[0] = rs.getString("id_Customer");
                kolom[1] = rs.getString("nama");
                kolom[2] = rs.getString("alamat");
                kolom[3] = rs.getString("no_HandPhone");
                dtm.addRow(kolom);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }

    public void insert(String nama_customer, String alamat_customer, String noHp) {
        try {
            String query = "INSERT INTO `pbo2`.`idcustomer` (`id_Customer`, `nama`, `alamat`, `no_handphone`) "
                    + "VALUES (NULL, '" + nama_customer + "', '" + alamat_customer + "', '" + noHp + "');";
            kon.execute(query);
//            query = "SELECT `id_customer` FROM `idcustomer` order by `id_customer` desc limit 1";
//            ResultSet rs = kon.getResult(query);
//            while (rs.next()) {
//                System.out.println(rs.getString(1));
//            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void hapus(String id_customer) {

        try {
            String query = "DELETE FROM `idcustomer` WHERE `idcustomer`.`id_Customer` ='" + id_customer + "'";
            kon.execute(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void Edit(String nama_customer, String alamat_customer, String noHp, String id_customer) {

        try {
            String query = "UPDATE `idcustomer` SET `nama` ='" + nama_customer + "', `alamat` = '" + alamat_customer + "', `no_handphone` = '" + noHp + "' where `idcustomer`.`id_customer` = '" + id_customer + "'";
            kon.execute(query);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
