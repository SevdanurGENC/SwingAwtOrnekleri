/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzemgorsel03;

/**
 *
 * @author Nano
 */
public class UzemGorsel03 extends javax.swing.JFrame {

    /**
     * Creates new form UzemGorsel03
     */
    public UzemGorsel03() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesaplama Uygulaması");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 40, 280, 60);

        jTextField2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 130, 280, 60);

        jTextField3.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(280, 330, 280, 60);

        jButton1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 230, 280, 70);

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Birinci Sayı Giriniz : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 230, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel2.setText("İkinci Sayıyı Giriniz : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 230, 50);

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel3.setText("Sonuç : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 330, 230, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int sayi1 = Integer.parseInt(jTextField1.getText());
        int sayi2 = Integer.parseInt(jTextField2.getText());
        int sonuc = sayi1 + sayi2;
        jTextField3.setText(String.valueOf(sonuc));
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
            java.util.logging.Logger.getLogger(UzemGorsel03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UzemGorsel03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UzemGorsel03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UzemGorsel03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UzemGorsel03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}