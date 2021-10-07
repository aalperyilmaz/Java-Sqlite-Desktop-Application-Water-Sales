/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPack;

import DB.DB;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aalpe
 */
public class Edit extends javax.swing.JFrame {

    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("/icon/su .png")).getImage());
    }

     int cid;
    public void customerId(int customerid){
        cid = customerid;
        
        
    }
    
    public Edit(String name,String surname,String number, String address){
        initComponents();
        u_txt_name.setText(name);
        u_txt_surname.setText(surname);
        u_txt_number.setText(number);
        u_txt_address.setText(address);
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        u_txt_name = new javax.swing.JTextField();
        u_txt_surname = new javax.swing.JTextField();
        u_txt_number = new javax.swing.JTextField();
        u_txt_address = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setMaximumSize(new java.awt.Dimension(470, 600));
        setMinimumSize(new java.awt.Dimension(470, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Adı");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 230, 46, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Soyadı");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 270, 46, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefon");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 310, 51, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Adres");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 350, 51, 17);
        getContentPane().add(u_txt_name);
        u_txt_name.setBounds(180, 220, 180, 30);
        getContentPane().add(u_txt_surname);
        u_txt_surname.setBounds(180, 260, 180, 30);
        getContentPane().add(u_txt_number);
        u_txt_number.setBounds(180, 300, 180, 30);
        getContentPane().add(u_txt_address);
        u_txt_address.setBounds(180, 340, 180, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/müşteri_düzenle_64.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 380, 110, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -14, 450, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cid>0){
            String name = u_txt_name.getText().trim().toLowerCase(); //update edilen değerleri alınır
            String surname = u_txt_surname.getText().trim().toLowerCase();
            String number = u_txt_number.getText().trim();
            String address = u_txt_address.getText().trim();

            DB db = new DB();
            int status = db.customerEdit(name, surname, number, address, cid);
            db.close();

            if( status>0){

                System.out.println("Düzenleme başarılı");
                MainFrame m = new MainFrame();
                m.setVisible(true);
                dispose();

            }
            if(status == -1){
                JOptionPane.showMessageDialog(rootPane, "Bu telefon numarası kayıtlı");
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField u_txt_address;
    private javax.swing.JTextField u_txt_name;
    private javax.swing.JTextField u_txt_number;
    private javax.swing.JTextField u_txt_surname;
    // End of variables declaration//GEN-END:variables
}
