package sinemaotomasyonu;

import java.awt.Image;
import javax.swing.ImageIcon;


public class VizyondakilerForm extends javax.swing.JFrame {

    public VizyondakilerForm() {
        initComponents();
        scaleImage();
    }

    
    public void scaleImage( ){
String hukumetKadiniPath = "/photos/hukumetkadini.jpg";
String arifv216Path = "/photos/Arifv216.jpg";
String inceptionPath = "/photos/inception.jpg";
String mucizePath = "/photos/mucize.jpg";

// LblHK
ImageIcon iconHukumetKadini = new ImageIcon(getClass().getResource(hukumetKadiniPath));
LblHK.setIcon(new ImageIcon(iconHukumetKadini.getImage().getScaledInstance(220, 250, Image.SCALE_DEFAULT)));

// LblArifV
ImageIcon iconArifv216 = new ImageIcon(getClass().getResource(arifv216Path));
LblArifV.setIcon(new ImageIcon(iconArifv216.getImage().getScaledInstance(220, 250, Image.SCALE_DEFAULT)));

// LblInception
ImageIcon iconInception = new ImageIcon(getClass().getResource(inceptionPath));
LblInception.setIcon(new ImageIcon(iconInception.getImage().getScaledInstance(220, 250, Image.SCALE_DEFAULT)));

// LblMucize
ImageIcon iconMucize = new ImageIcon(getClass().getResource(mucizePath));
LblMucize.setIcon(new ImageIcon(iconMucize.getImage().getScaledInstance(220, 250, Image.SCALE_DEFAULT)));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnMucize = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        LblMucize = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LblInception = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LblArifV = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LblArifV1 = new javax.swing.JLabel();
        LblArifV2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BtnArifV = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblHK = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BtnInception = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        BtnHK = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Mucize");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("75 TL");

        BtnMucize.setBackground(new java.awt.Color(153, 0, 0));
        BtnMucize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnMucize.setForeground(new java.awt.Color(255, 255, 255));
        BtnMucize.setText("SEÇ");
        BtnMucize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Seanslar  10.00  12.00  14.00  16.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMucize, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMucize)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 220, 90));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VİZYONDAKİLER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 220, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblMucize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblMucize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMucizeMouseClicked(evt);
            }
        });
        jPanel9.add(LblMucize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 250));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, 220, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInception.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblInception.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblInceptionMouseClicked(evt);
            }
        });
        jPanel5.add(LblInception, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 250));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 220, 250));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblArifV.setBackground(new java.awt.Color(255, 255, 255));
        LblArifV.setForeground(new java.awt.Color(255, 255, 255));
        LblArifV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblArifV.setOpaque(true);
        LblArifV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblArifVMouseClicked(evt);
            }
        });
        jPanel1.add(LblArifV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 250));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblArifV1.setForeground(new java.awt.Color(255, 255, 255));
        LblArifV1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblArifV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblArifV1MouseClicked(evt);
            }
        });
        jPanel3.add(LblArifV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 190, 210));

        LblArifV2.setForeground(new java.awt.Color(255, 255, 255));
        LblArifV2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblArifV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblArifV2MouseClicked(evt);
            }
        });
        jPanel1.add(LblArifV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 220, 250));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel15.setText("ARİF V 216");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("75 TL");

        BtnArifV.setBackground(new java.awt.Color(153, 0, 0));
        BtnArifV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnArifV.setForeground(new java.awt.Color(255, 255, 255));
        BtnArifV.setText("SEÇ");
        BtnArifV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel17.setText("Seanslar  10.00  12.00  14.00  16.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnArifV, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnArifV)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 220, 90));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblHK.setBackground(new java.awt.Color(255, 255, 255));
        LblHK.setForeground(new java.awt.Color(255, 255, 255));
        LblHK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblHK.setOpaque(true);
        LblHK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblHKMouseClicked(evt);
            }
        });
        jPanel2.add(LblHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 220, 250));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel18.setText("Inception");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("120 TL");

        BtnInception.setBackground(new java.awt.Color(153, 0, 0));
        BtnInception.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnInception.setForeground(new java.awt.Color(255, 255, 255));
        BtnInception.setText("SEÇ");
        BtnInception.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel20.setText("Seanslar  10.00  12.00  14.00  16.00");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnInception, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(61, 61, 61))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInception)
                    .addComponent(jLabel19))
                .addContainerGap())
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 220, 90));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel21.setText("Hükümet Kadını");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("120 TL");

        BtnHK.setBackground(new java.awt.Color(153, 0, 0));
        BtnHK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnHK.setForeground(new java.awt.Color(255, 255, 255));
        BtnHK.setText("SEÇ");
        BtnHK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel23.setText("Seanslar  10.00  12.00  14.00  16.00");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHK, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(28, 28, 28))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHK)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 220, 90));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/mavi.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 1420, 680));

        setSize(new java.awt.Dimension(1344, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Salon1Form salon1Form = new Salon1Form();
        salon1Form.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void LblArifVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblArifVMouseClicked

    }//GEN-LAST:event_LblArifVMouseClicked

    private void LblHKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblHKMouseClicked
        Salon2Form salon2Form = new Salon2Form();
        salon2Form.setVisible(true);
    }//GEN-LAST:event_LblHKMouseClicked

    private void LblMucizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMucizeMouseClicked

    }//GEN-LAST:event_LblMucizeMouseClicked

    private void LblInceptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblInceptionMouseClicked

    }//GEN-LAST:event_LblInceptionMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked

    private void LblArifV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblArifV1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LblArifV1MouseClicked

    private void LblArifV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblArifV2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LblArifV2MouseClicked

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
            java.util.logging.Logger.getLogger(VizyondakilerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VizyondakilerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VizyondakilerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VizyondakilerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizyondakilerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnArifV;
    private javax.swing.JButton BtnHK;
    private javax.swing.JButton BtnInception;
    private javax.swing.JButton BtnMucize;
    private javax.swing.JLabel LblArifV;
    private javax.swing.JLabel LblArifV1;
    private javax.swing.JLabel LblArifV2;
    private javax.swing.JLabel LblHK;
    private javax.swing.JLabel LblInception;
    private javax.swing.JLabel LblMucize;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
