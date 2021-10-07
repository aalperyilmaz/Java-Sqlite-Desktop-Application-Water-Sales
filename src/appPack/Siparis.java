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
public class Siparis extends javax.swing.JFrame {

    /**
     * Creates new form Siparis
     */
    public Siparis() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("/icon/su .png")).getImage());
    }
public Siparis(String name,String surname,String address){
        initComponents();
        o_txt_name.setText(name);
        o_txt_surname.setText(surname);
        o_txt_address.setText(address);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        o_txt_name = new javax.swing.JTextField();
        o_txt_surname = new javax.swing.JTextField();
        o_txt_address = new javax.swing.JTextField();
        o_txt_total = new javax.swing.JTextField();
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
        jLabel1.setBounds(120, 240, 44, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Soyadı");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 280, 46, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Adres");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 320, 46, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tutar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 360, 46, 17);

        o_txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(o_txt_name);
        o_txt_name.setBounds(190, 240, 169, 30);
        getContentPane().add(o_txt_surname);
        o_txt_surname.setBounds(190, 280, 169, 30);
        getContentPane().add(o_txt_address);
        o_txt_address.setBounds(190, 320, 169, 30);
        getContentPane().add(o_txt_total);
        o_txt_total.setBounds(190, 360, 169, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sipariş ekle 64.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 407, 90, 73);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/background.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -4, 470, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void o_txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o_txt_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = o_txt_name.getText().trim();
        String surname = o_txt_surname.getText().trim();
        String address = o_txt_address.getText().trim();
        String total =o_txt_total.getText().trim();

        if( total.equals("") ){ //boş olup olmadıkları kontrol edilir.
            JOptionPane.showMessageDialog(rootPane, "Lütfen tutarı Girin");
            o_txt_total.requestFocus();

        }else{
            DB db = new DB();

            int status = db.getOrder(name, surname, address, total);
            db.close();

            MainFrame m = new MainFrame();
            m.setVisible(true);
            dispose();

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
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Siparis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Siparis().setVisible(true);
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
    private javax.swing.JTextField o_txt_address;
    private javax.swing.JTextField o_txt_name;
    private javax.swing.JTextField o_txt_surname;
    private javax.swing.JTextField o_txt_total;
    // End of variables declaration//GEN-END:variables
}
