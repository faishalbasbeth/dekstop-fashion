/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin pc
 */
public class m_login extends m_model{
//    m_koneksi kon;
    Component tabel;
    String query;
    public m_login() throws SQLException{
        super();
    }

    public int ok(String username, String password) throws SQLException {
        String query = "SELECT * FROM iduser WHERE username='"
                + username + "' AND password='" + password + "'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        if (rs.getRow() == 1) {
            String query2 = "SELECT * FROM idkaryawan WHERE id_karyawan="
                    + rs.getString("id_karyawan");
            ResultSet rs2 = kon.getResult(query2);
            rs2.next();
            String title = rs2.getString("jabatan_karyawan");
            
            if (title.equals("pemilik")) {
                return 1;
            } else if (title.equals("Kasir")) {
                return 2;
            }else if (title.equals("Penjahit")) {
                return 3;
            } else {
                return 4;
            }
        } else {
            return 0;
        }

    }
    
    
}
