/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author admin pc
 */
public class data_pesanan extends javax.swing.JFrame {

    /**
     * Creates new form data_pesanan
     */

    public data_pesanan() {
        initComponents();
        setLocationRelativeTo(null);
    }
        public void ktotal(KeyListener a){
            banyak_pesanan1.addKeyListener(a);
    }

    public JTextField get_total_harga() {
        return total_harga1;
    }
    
    
    public JTextField getid_pesanan() {
        return id_pesanan1;
    }
    public JComboBox getid_customer() {
        return id_customer1;
    }
    public void comboid_customer(String[] data){
        int x = 0;
        while (x < data.length) {
            id_customer1.addItem(data[x]);
            x++;
        }
    }
    public JComboBox getjenis_pesanan() {
        return jenis_pesanan1;
    }
    public JTextField getmodel_pesanan() {
        return model_pesanan1;
    }
    public JComboBox getid_bahan() {
        return id_bahan1;
    }
    public void comboid_bahan(String[] data){
        int x = 0;
        while (x < data.length) {
            id_bahan1.addItem(data[x]);
            x++;
        }
    }
    public JComboBox getukuran() {
        return ukuran1;
    }
    public JTextField getbanyak_pesanan() {
        return banyak_pesanan1;
    }
    public JTextField gettanggal_pesanan() {
        return tanggal_pesanan1;
    }
    public JTextField getselesai_pesanan() {
        return selesai_pesanan1;
    }


      public JTextField getharga_per_barang() {
        return harga_per_barang1;
    }
      public void setharga_per_barang(String a) {
        harga_per_barang1.setText(a);
    }

          public void setOnClikid_bahan(ItemListener a) {
        id_bahan1.addItemListener(a);
    }
          public String getSelectedid_bahan() {
        return id_bahan1.getSelectedItem().toString();
    }
    public JButton getsave() {
        return save_pesanan;
    }
    public JButton getcancel() {
        return cancel_pesanan;
    }
    public JButton gettambah() {
        return tambah_pesanan;
    }
    public JButton gethapus() {
        return hapus_pesanan;
    }
    public JButton getedit() {
        return edit_pesanan;
    }
    public JTable gettabel(){
        return tabel_pesanan;
    }
    public JButton getlanjut() {
        return lanjut_data_pesanan;
    }
    public JButton getkembali() {
        return kembali_data_pesanan;
    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fauzia_collection = new javax.swing.JLabel();
        data_pesanan = new javax.swing.JLabel();
        id_customer = new javax.swing.JLabel();
        id_bahan = new javax.swing.JLabel();
        harga_per_barang = new javax.swing.JLabel();
        harga_per_barang1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pesanan = new javax.swing.JTable();
        save_pesanan = new javax.swing.JButton();
        cancel_pesanan = new javax.swing.JButton();
        tambah_pesanan = new javax.swing.JButton();
        hapus_pesanan = new javax.swing.JButton();
        edit_pesanan = new javax.swing.JButton();
        ukuran = new javax.swing.JLabel();
        banyak_pesanan = new javax.swing.JLabel();
        banyak_pesanan1 = new javax.swing.JTextField();
        id_pesanan = new javax.swing.JLabel();
        id_pesanan1 = new javax.swing.JTextField();
        kembali_data_pesanan = new javax.swing.JButton();
        lanjut_data_pesanan = new javax.swing.JButton();
        jenis_pesanan = new javax.swing.JLabel();
        tanggal_pesanan = new javax.swing.JLabel();
        tanggal_pesanan1 = new javax.swing.JTextField();
        model_pesanan = new javax.swing.JLabel();
        model_pesanan1 = new javax.swing.JTextField();
        selesai_pesanan = new javax.swing.JLabel();
        selesai_pesanan1 = new javax.swing.JTextField();
        id_customer1 = new javax.swing.JComboBox<>();
        id_bahan1 = new javax.swing.JComboBox<>();
        ukuran1 = new javax.swing.JComboBox<>();
        id_bahan2 = new javax.swing.JLabel();
        total_harga = new javax.swing.JLabel();
        total_harga1 = new javax.swing.JTextField();
        jenis_pesanan1 = new javax.swing.JComboBox<>();
        background_data_pesanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fauzia_collection.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        fauzia_collection.setText("Fauzia Collection");
        getContentPane().add(fauzia_collection, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 170, -1));

        data_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        data_pesanan.setText("DATA PESANAN");
        getContentPane().add(data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        id_customer.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        id_customer.setText("Id Customer                        :");
        getContentPane().add(id_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        id_bahan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        id_bahan.setText("Id Bahan                               :");
        getContentPane().add(id_bahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        harga_per_barang.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        harga_per_barang.setText("Harga per Barang          :");
        getContentPane().add(harga_per_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));
        getContentPane().add(harga_per_barang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 170, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 850, 100));

        save_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        save_pesanan.setText("Simpan");
        getContentPane().add(save_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, -1));

        cancel_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        cancel_pesanan.setText("Batal");
        getContentPane().add(cancel_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 110, -1));

        tambah_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        tambah_pesanan.setText("Tambah");
        getContentPane().add(tambah_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 110, -1));

        hapus_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        hapus_pesanan.setText("Hapus");
        getContentPane().add(hapus_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 110, -1));

        edit_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        edit_pesanan.setText("Ubah");
        getContentPane().add(edit_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 110, -1));

        ukuran.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        ukuran.setText("Ukuran                                  :");
        getContentPane().add(ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        banyak_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        banyak_pesanan.setText("Banyak  Pesanan             :");
        getContentPane().add(banyak_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));
        getContentPane().add(banyak_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 170, 30));

        id_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        id_pesanan.setText("Id Pesanan                            :");
        getContentPane().add(id_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(id_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 170, 30));

        kembali_data_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 12)); // NOI18N
        kembali_data_pesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back-button.png"))); // NOI18N
        getContentPane().add(kembali_data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, 50));

        lanjut_data_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 12)); // NOI18N
        lanjut_data_pesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/next-button.png"))); // NOI18N
        getContentPane().add(lanjut_data_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 50, 50));

        jenis_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jenis_pesanan.setText("Jenis Pesanan                     :");
        getContentPane().add(jenis_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        tanggal_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        tanggal_pesanan.setText("Tanggal  Pesanan             :");
        getContentPane().add(tanggal_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));
        getContentPane().add(tanggal_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 170, 30));

        model_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        model_pesanan.setText("Model Pesanan                  :");
        getContentPane().add(model_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(model_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 30));

        selesai_pesanan.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        selesai_pesanan.setText("Selesai Pesanan                 :");
        getContentPane().add(selesai_pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));
        getContentPane().add(selesai_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 170, 30));

        id_customer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        getContentPane().add(id_customer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 170, 30));

        id_bahan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu" }));
        getContentPane().add(id_bahan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 170, 30));

        ukuran1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(ukuran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 170, 30));

        id_bahan2.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        id_bahan2.setText("Id Bahan                               :");
        getContentPane().add(id_bahan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        total_harga.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        total_harga.setText("Total Harga                         :");
        getContentPane().add(total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));
        getContentPane().add(total_harga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 170, 30));

        jenis_pesanan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baju", "Kemeja", "Kaus", "Jubah", "Celana", "Rok" }));
        getContentPane().add(jenis_pesanan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 30));

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
            java.util.logging.Logger.getLogger(data_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_data_pesanan;
    private javax.swing.JLabel banyak_pesanan;
    private javax.swing.JTextField banyak_pesanan1;
    private javax.swing.JButton cancel_pesanan;
    private javax.swing.JLabel data_pesanan;
    private javax.swing.JButton edit_pesanan;
    private javax.swing.JLabel fauzia_collection;
    private javax.swing.JButton hapus_pesanan;
    private javax.swing.JLabel harga_per_barang;
    private javax.swing.JTextField harga_per_barang1;
    private javax.swing.JLabel id_bahan;
    private javax.swing.JComboBox<String> id_bahan1;
    private javax.swing.JLabel id_bahan2;
    private javax.swing.JLabel id_customer;
    private javax.swing.JComboBox<String> id_customer1;
    private javax.swing.JLabel id_pesanan;
    private javax.swing.JTextField id_pesanan1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jenis_pesanan;
    private javax.swing.JComboBox<String> jenis_pesanan1;
    private javax.swing.JButton kembali_data_pesanan;
    private javax.swing.JButton lanjut_data_pesanan;
    private javax.swing.JLabel model_pesanan;
    private javax.swing.JTextField model_pesanan1;
    private javax.swing.JButton save_pesanan;
    private javax.swing.JLabel selesai_pesanan;
    private javax.swing.JTextField selesai_pesanan1;
    private javax.swing.JTable tabel_pesanan;
    private javax.swing.JButton tambah_pesanan;
    private javax.swing.JLabel tanggal_pesanan;
    private javax.swing.JTextField tanggal_pesanan1;
    private javax.swing.JLabel total_harga;
    private javax.swing.JTextField total_harga1;
    private javax.swing.JLabel ukuran;
    private javax.swing.JComboBox<String> ukuran1;
    // End of variables declaration//GEN-END:variables

   



}
