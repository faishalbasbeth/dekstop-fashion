/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author admin pc
 */
public class data_pesananp extends javax.swing.JFrame {

    /**
     * Creates new form data_pesananp
     */
    public data_pesananp() {
        initComponents();
        setLocationRelativeTo(null);
    }
       public JButton getkembali() {
        return kembali_data_pesanan;
    }
           public JTable gettabel(){
        return tabel_pesanan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data_pesanan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pesanan = new javax.swing.JTable();
        fauzia_collection = new javax.swing.JLabel();
        kembali_data_pesanan = new javax.swing.JButton();
        background_data_pesanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        data_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        data_pesanan.setText("DATA PESANAN");
        getContentPane().add(data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tabel_pesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_pesanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 840, 420));

        fauzia_collection.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        fauzia_collection.setText("Fauzia Collection");
        getContentPane().add(fauzia_collection, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 170, -1));

        kembali_data_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 12)); // NOI18N
        kembali_data_pesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back-button.png"))); // NOI18N
        getContentPane().add(kembali_data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, 50));

        background_data_pesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Yellow Background.png"))); // NOI18N
        getContentPane().add(background_data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data_pesananp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_pesananp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_pesananp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_pesananp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_pesananp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_data_pesanan;
    private javax.swing.JLabel data_pesanan;
    private javax.swing.JLabel fauzia_collection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali_data_pesanan;
    private javax.swing.JTable tabel_pesanan;
    // End of variables declaration//GEN-END:variables
}
