/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasijava.view;

import javax.swing.JOptionPane;

/**
 *
 * @author RFR
 */
public class FrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
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

        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mainSignOut = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        mainHome = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mainRumus = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPanjang = new javax.swing.JTextField();
        txtLebar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtAlas = new javax.swing.JTextField();
        txtTinggi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtJari = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mainLogout = new javax.swing.JPanel();
        mainGaleri = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mainAbout = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        jLabel10.setText("Hitung Luas Segitiga");

        jButton3.setText("Hitung");

        jLabel11.setText("Hitung Luas Segitiga");

        jButton4.setText("Hitung");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Home_48px.png"))); // NOI18N
        btnHome.setText("HOME");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Test_Tube_48px.png"))); // NOI18N
        jLabel2.setText("RUMUS");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Gallery_48px.png"))); // NOI18N
        jLabel3.setText("GALERI");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        mainSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainSignOut.setForeground(new java.awt.Color(255, 255, 255));
        mainSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Sign_Out_48px.png"))); // NOI18N
        mainSignOut.setText("SIGN OUT");
        mainSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainSignOutMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_About_48px.png"))); // NOI18N
        jLabel21.setText("ABOUT");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(mainSignOut)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(btnHome))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnHome)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jLabel21)
                .addGap(40, 40, 40)
                .addComponent(mainSignOut)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        panelMain.setLayout(new java.awt.CardLayout());

        mainHome.setBackground(new java.awt.Color(255, 255, 255));
        mainHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome");
        mainHome.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("to MathHub");
        mainHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/envelope-blue.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        mainHome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        panelMain.add(mainHome, "card2");

        mainRumus.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Hitung Luas Persegi");

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Hitung Luas Segitiga");

        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Hitung");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Hitung Luas Lingkaran");

        jLabel13.setText("Panjang");

        jLabel14.setText("Lebar");

        jLabel15.setText("Alas");

        jLabel16.setText("Tinggi");

        jLabel17.setText("Jari-jari");

        javax.swing.GroupLayout mainRumusLayout = new javax.swing.GroupLayout(mainRumus);
        mainRumus.setLayout(mainRumusLayout);
        mainRumusLayout.setHorizontalGroup(
            mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainRumusLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jLabel12)
                    .addComponent(txtJari, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(txtTinggi)
                        .addComponent(txtAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(txtLebar)
                        .addComponent(txtPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        mainRumusLayout.setVerticalGroup(
            mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainRumusLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(mainRumusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        panelMain.add(mainRumus, "card3");

        mainLogout.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainLogoutLayout = new javax.swing.GroupLayout(mainLogout);
        mainLogout.setLayout(mainLogoutLayout);
        mainLogoutLayout.setHorizontalGroup(
            mainLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        mainLogoutLayout.setVerticalGroup(
            mainLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        panelMain.add(mainLogout, "card4");

        mainGaleri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Square_96px.png"))); // NOI18N
        jLabel18.setText("PERSEGI");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Triangle_96px_1.png"))); // NOI18N
        jLabel19.setText("SEGITIGA");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/icons8_Circle_96px.png"))); // NOI18N
        jLabel20.setText("LINGKARAN");

        javax.swing.GroupLayout mainGaleriLayout = new javax.swing.GroupLayout(mainGaleri);
        mainGaleri.setLayout(mainGaleriLayout);
        mainGaleriLayout.setHorizontalGroup(
            mainGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGaleriLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(mainGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        mainGaleriLayout.setVerticalGroup(
            mainGaleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainGaleriLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addGap(47, 47, 47)
                .addComponent(jLabel19)
                .addGap(64, 64, 64)
                .addComponent(jLabel20)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        panelMain.add(mainGaleri, "card5");

        mainAbout.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setText("NAMA");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("NIM");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("ALAMAT");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("Royhan Faisal Reza");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setText("10116550");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setText("Bandung");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setText("MathHub version 1.0.0 (Beta)");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasijava/asset/envelope-blue.jpg"))); // NOI18N
        jLabel29.setText("jLabel29");

        javax.swing.GroupLayout mainAboutLayout = new javax.swing.GroupLayout(mainAbout);
        mainAbout.setLayout(mainAboutLayout);
        mainAboutLayout.setHorizontalGroup(
            mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainAboutLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addGroup(mainAboutLayout.createSequentialGroup()
                        .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(75, 75, 75)
                        .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        mainAboutLayout.setVerticalGroup(
            mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAboutLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25))
                .addGap(26, 26, 26)
                .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addGap(26, 26, 26)
                .addGroup(mainAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addGap(76, 76, 76)
                .addComponent(jLabel28)
                .addContainerGap())
        );

        panelMain.add(mainAbout, "card6");

        jPanel1.add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 610, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int p = Integer.parseInt(txtPanjang.getText());
        int l = Integer.parseInt(txtLebar.getText());
        
        int hasil = p*l;
        JOptionPane.showMessageDialog(this, "hasil = "+hasil);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = Integer.parseInt(txtAlas.getText());
        int t = Integer.parseInt(txtTinggi.getText());
        
        double hasil = 0.5*a*t;
        JOptionPane.showMessageDialog(this, "hasil = "+hasil);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double phi= 3.14;
        int r = Integer.parseInt(txtJari.getText());
        double kuadrat = Math.pow(r, 2);
        double hasil = phi*kuadrat;
        JOptionPane.showMessageDialog(this, "hasil = "+hasil);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        panelMain.removeAll();
        panelMain.add(mainHome);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        panelMain.removeAll();
        panelMain.add(mainRumus);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        panelMain.removeAll();
        panelMain.add(mainGaleri);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        panelMain.removeAll();
        panelMain.add(mainAbout);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void mainSignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSignOutMouseClicked
        FrameExit fr = new FrameExit();
        fr.setVisible(true);
    }//GEN-LAST:event_mainSignOutMouseClicked

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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel mainAbout;
    private javax.swing.JPanel mainGaleri;
    private javax.swing.JPanel mainHome;
    private javax.swing.JPanel mainLogout;
    private javax.swing.JPanel mainRumus;
    private javax.swing.JLabel mainSignOut;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtAlas;
    private javax.swing.JTextField txtJari;
    private javax.swing.JTextField txtLebar;
    private javax.swing.JTextField txtPanjang;
    private javax.swing.JTextField txtTinggi;
    // End of variables declaration//GEN-END:variables
}
