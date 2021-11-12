/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap2;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Calculator extends javax.swing.JFrame {

    private long soHang1;
    private String phepToan = "";

    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
        this.txtSo.setText("0");
        this.txtSo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhamTram = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        lblSoHang1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CASIO ");

        txtSo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSo.setForeground(new java.awt.Color(51, 51, 255));
        txtSo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel2.setLayout(new java.awt.GridLayout(4, 5));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnChia);

        btnCan.setText("sqrt");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });
        jPanel2.add(btnCan);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhan);

        btnPhamTram.setText("%");
        jPanel2.add(btnPhamTram);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });
        jPanel2.add(btntru);

        jButton15.setText("1/x");
        jPanel2.add(jButton15);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);

        jButton17.setText("+/-");
        jPanel2.add(jButton17);

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        jPanel2.add(btnCong);

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel2.add(btnBang);

        lblSoHang1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSoHang1.setForeground(new java.awt.Color(255, 51, 51));
        lblSoHang1.setText("o");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSo)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSoHang1)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSoHang1)
                        .addGap(3, 3, 3)))
                .addComponent(txtSo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }
            long so = Long.parseLong(txt + this.btn1.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }
            long so = Long.parseLong(txt + this.btn2.getText());
            this.txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }
            long so = Long.parseLong(txt + this.btn3.getText());
            this.txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }
            long so = Long.parseLong(txt + this.btn4.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn5.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn6.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn7.getText());
            this.txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn8.getText());
            this.txtSo.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn9.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String txt = this.txtSo.getText();
        if (txt.length() < 12) {
            if (txt.equals("0")) {
                txt = "";
            }

            long so = Long.parseLong(txt + this.btn0.getText());
            this.txtSo.setText(String.valueOf(so));
        }

    }//GEN-LAST:event_btn0ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.txtSo.setText("0");
        this.lblSoHang1.setText("0");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        this.soHang1 = Long.parseLong(this.txtSo.getText());
        if (this.soHang1 != 0) {
            this.phepToan = "/";
            this.lblSoHang1.setText(this.txtSo.getText());
            this.txtSo.setText("0");
        } else {
            JOptionPane.showMessageDialog(this, "0 không thể chia cho một số khác !");
            this.txtSo.setBackground(Color.YELLOW);
        }
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        this.soHang1 = Long.parseLong(this.txtSo.getText());
        this.phepToan = "*";
         this.lblSoHang1.setText(this.txtSo.getText());
        this.txtSo.setText("0");
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        this.soHang1 = Long.parseLong(this.txtSo.getText());
        this.phepToan = "-";
         this.lblSoHang1.setText(this.txtSo.getText());
        this.txtSo.setText("0");
    }//GEN-LAST:event_btntruActionPerformed

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        this.soHang1 = Long.parseLong(this.txtSo.getText());
        this.phepToan = "+";
         this.lblSoHang1.setText(this.txtSo.getText());
        this.txtSo.setText("0");
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        long soHang2 = Long.parseLong(this.txtSo.getText());
        if (this.phepToan.equals("+")) {
            this.txtSo.setText(String.valueOf(this.soHang1 + soHang2));
        } else if (this.phepToan.equals("-")) {
            this.txtSo.setText(String.valueOf(this.soHang1 - soHang2));
        } else if (this.phepToan.equals("*")) {
            this.txtSo.setText(String.valueOf(this.soHang1 * soHang2));
        } else if (this.phepToan.equals("/")) {
            this.txtSo.setText(String.valueOf(this.soHang1 / soHang2));
        }
        this.soHang1 = 0;
        this.phepToan = "";
        this.lblSoHang1.setText("0");
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        this.soHang1 = Long.parseLong(this.txtSo.getText());
        this.txtSo.setText(String.valueOf(Math.sqrt(this.soHang1)));
        this.soHang1 =0;
    }//GEN-LAST:event_btnCanActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPhamTram;
    private javax.swing.JButton btntru;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSoHang1;
    private javax.swing.JTextField txtSo;
    // End of variables declaration//GEN-END:variables
}
