/**
 * Form for the checksum calculator, using Oracles swing UI.
 *
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package at.andaris.keyutil;

import java.awt.EventQueue;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 * Swing-based form for the checksum calculation.
 *
 * @author Andreas Erhard <developer@andaris.at>
 */
public class CalculatorForm extends javax.swing.JFrame {

    public static final String VERSION = "0.1.2";

    /**
     * Creates new form ContactEditor
     */
    public CalculatorForm() {
        initComponents();

        lblInfo.setText("v " + VERSION + " (c) Andreas Erhard");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblKey = new javax.swing.JLabel();
        lblBytes = new javax.swing.JLabel();
        txtBytes = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        txtKey = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnGenerate = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AES-256 Key Generator & Checksum Calculator");
        setIconImages(null);
        setResizable(false);

        lblKey.setText("AES-256 Key");

        lblBytes.setText("Number of bytes");

        txtBytes.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        txtBytes.setText("3");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblResult.setText("Result");

        txtResult.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        txtKey.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("AES-256 Key Generator & Checksum Calculator");

        lblInfo.setForeground(new java.awt.Color(153, 153, 153));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblHeading, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSeparator1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblKey)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblResult))
                        .add(36, 36, 36)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(txtResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(174, 174, 174)
                                .add(lblInfo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(txtBytes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(300, 300, 300))
                                    .add(layout.createSequentialGroup()
                                        .add(txtKey)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(btnCalculate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(btnGenerate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(lblBytes))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(lblHeading)
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblKey, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnGenerate)
                    .add(txtKey, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblBytes)
                    .add(btnCalculate)
                    .add(txtBytes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblResult)
                    .add(txtResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblInfo))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Validates the input and performs the calculation.
     *
     * @param evt
     */
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        String key = txtKey.getText();
        String numberBytes = txtBytes.getText();

        if (44 != key.length()) {
            JOptionPane.showMessageDialog(this, "Key must be 44 characters!");

            return;
        }

        int n = 3;

        try {
            n = Integer.parseInt(numberBytes);
            if (n < 1 || n > 32) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number of bytes!");

            return;
        }

        String result = "";
        try {
            result = Calculator.calcCheckSumFromKey(key, n);
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(this, "Hash SHA-256 is not supported on your platform.");

            return;
        }

        txtResult.setText(result);

    }//GEN-LAST:event_btnCalculateActionPerformed

    /**
     * Generates a key and writes it into the key input.
     *
     * @param evt
     */
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        txtKey.setText(KeyGenerator.generateKeyBase64());
        txtResult.setText("");
    }//GEN-LAST:event_btnGenerateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnGenerate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBytes;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtBytes;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

}
