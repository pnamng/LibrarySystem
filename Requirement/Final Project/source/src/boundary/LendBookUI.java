/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import controller.LendBookController;
import entity.Registration;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pnam2
 */
public class LendBookUI extends javax.swing.JFrame {
    LendBookController lendBookController;
    

    /**
     * Creates new form LendBookUI
     */
    public LendBookUI() {
        lendBookController = new LendBookController();
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLendLable1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLendSearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLendLabel2 = new javax.swing.JLabel();
        jLendLabel3 = new javax.swing.JLabel();
        jLendLabel4 = new javax.swing.JLabel();
        jLendLabel5 = new javax.swing.JLabel();
        jLendAccept = new javax.swing.JButton();
        jLendCancel = new javax.swing.JButton();
        jMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLendLable1.setText("Card ID");

        jScrollPane1.setViewportView(jTextPane1);

        jLendSearchButton.setText("Search");
        jLendSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLendSearchButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Registration ID", "UserID", "Book No.", "Sequence No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLendLabel2.setText("Lend Date:");

        jLendLabel4.setText("Expire Date:");

        jLendAccept.setText("Accept");
        jLendAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLendAcceptActionPerformed(evt);
            }
        });

        jLendCancel.setText("Cancel");
        jLendCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLendCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLendLable1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLendSearchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLendLabel2)
                                    .addComponent(jLendAccept)
                                    .addComponent(jLendLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLendLabel5)
                                    .addComponent(jLendCancel)
                                    .addComponent(jLendLabel3)))
                            .addComponent(jMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLendSearchButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLendLable1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendLabel2)
                    .addComponent(jLendLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendLabel4)
                    .addComponent(jLendLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLendAccept)
                    .addComponent(jLendCancel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLendAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLendAcceptActionPerformed
        // TODO add your handling code here:
        int rowCount = jTable1.getRowCount();
        List<Integer> reg_id = new ArrayList<>();
        for (int i = 0; i < rowCount; i++){
            reg_id.add((int) jTable1.getValueAt(i, 0));
        }
        try {
            lendBookController.acceptRegistration(reg_id);
        } catch (SQLException ex) {
            Logger.getLogger(LendBookUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLendAcceptActionPerformed

    private void jLendSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLendSearchButtonActionPerformed
        // TODO add your handling code here:
        String cardId = jTextPane1.getText();
        
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue() + 2;
        int year = localDate.getYear();
        if (month > 12) {
            month = month - 12;
            year = year + 1;
        }
        LocalDate localDate2 = localDate.of(year, month, localDate.getDayOfMonth());
        jLendLabel3.setText(localDate.toString());
        jLendLabel5.setText(localDate2.toString());
        
        DefaultTableModel tableModel = new DefaultTableModel(
                new String[]{"Registration ID", "UserID", "Book No.", "Sequence No."}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        
        try {
            if (cardId.equals("")){
                jMessage.setText("CardID is empty.");
            } 
            else if (lendBookController.findCardById(Integer.parseInt(cardId)) == null){
                jMessage.setText("Card not found.");
            } else {
                jMessage.setText("");
                List<Registration> mReg = lendBookController.getRegistered(Integer.parseInt(cardId));
                for (Registration reg : mReg){
                    tableModel.addRow(new Object[]{reg.getId(),reg.getUserId(),
                        reg.getBookNumber(), reg.getSequenceNumber()
                    });
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LendBookUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendBookUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTable1.setModel(tableModel);
    }//GEN-LAST:event_jLendSearchButtonActionPerformed

    private void jLendCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLendCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLendCancelActionPerformed

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
            java.util.logging.Logger.getLogger(LendBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendBookUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LendBookUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jLendAccept;
    private javax.swing.JButton jLendCancel;
    private javax.swing.JLabel jLendLabel2;
    private javax.swing.JLabel jLendLabel3;
    private javax.swing.JLabel jLendLabel4;
    private javax.swing.JLabel jLendLabel5;
    private javax.swing.JLabel jLendLable1;
    private javax.swing.JButton jLendSearchButton;
    private javax.swing.JLabel jMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
