/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Home;

/**
 *
 * @author Ruan
 */
public class Academia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Academia
     */
    public Academia() {
        initComponents();
         setSize(650,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Desktop = new javax.swing.JDesktopPane();
        Peito = new javax.swing.JButton();
        Abdomem = new javax.swing.JButton();
        bicepis = new javax.swing.JButton();
        bicepis2 = new javax.swing.JButton();
        triceps1 = new javax.swing.JButton();
        tricepis2 = new javax.swing.JButton();
        ombro1 = new javax.swing.JButton();
        ombro2 = new javax.swing.JButton();
        trapezio = new javax.swing.JButton();
        trapezio2 = new javax.swing.JButton();
        costas = new javax.swing.JButton();
        antebraco1 = new javax.swing.JButton();
        antebraco2 = new javax.swing.JButton();
        perna1 = new javax.swing.JButton();
        perna2 = new javax.swing.JButton();
        perna3 = new javax.swing.JButton();
        perna4 = new javax.swing.JButton();
        gluteo = new javax.swing.JButton();
        pantu1 = new javax.swing.JButton();
        pantu2 = new javax.swing.JButton();
        pantu3 = new javax.swing.JButton();
        pantu4 = new javax.swing.JButton();
        ombro3 = new javax.swing.JButton();
        ombro4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (7).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 50, 340, 260);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escolha um grupo muscular para treinar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 390, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background (3).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 559, 315);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(Desktop);
        Desktop.setBounds(0, 0, 670, 390);

        Peito.setText("jButton1");
        Peito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeitoActionPerformed(evt);
            }
        });
        getContentPane().add(Peito);
        Peito.setBounds(170, 100, 30, 20);

        Abdomem.setText("jButton1");
        Abdomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbdomemActionPerformed(evt);
            }
        });
        getContentPane().add(Abdomem);
        Abdomem.setBounds(160, 130, 50, 40);

        bicepis.setText("jButton1");
        bicepis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicepisActionPerformed(evt);
            }
        });
        getContentPane().add(bicepis);
        bicepis.setBounds(210, 120, 20, 20);

        bicepis2.setText("jButton2");
        bicepis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bicepis2ActionPerformed(evt);
            }
        });
        getContentPane().add(bicepis2);
        bicepis2.setBounds(143, 120, 20, 20);

        triceps1.setText("jButton2");
        triceps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triceps1ActionPerformed(evt);
            }
        });
        getContentPane().add(triceps1);
        triceps1.setBounds(370, 120, 20, 20);

        tricepis2.setText("jButton3");
        tricepis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tricepis2ActionPerformed(evt);
            }
        });
        getContentPane().add(tricepis2);
        tricepis2.setBounds(313, 120, 20, 20);

        ombro1.setText("jButton4");
        ombro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ombro1ActionPerformed(evt);
            }
        });
        getContentPane().add(ombro1);
        ombro1.setBounds(370, 95, 10, 20);

        ombro2.setText("jButton5");
        ombro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ombro2ActionPerformed(evt);
            }
        });
        getContentPane().add(ombro2);
        ombro2.setBounds(323, 95, 10, 20);

        trapezio.setText("jButton6");
        trapezio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapezioActionPerformed(evt);
            }
        });
        getContentPane().add(trapezio);
        trapezio.setBounds(340, 100, 20, 20);

        trapezio2.setText("jButton7");
        trapezio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapezio2ActionPerformed(evt);
            }
        });
        getContentPane().add(trapezio2);
        trapezio2.setBounds(330, 95, 40, 10);

        costas.setText("jButton8");
        costas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costasActionPerformed(evt);
            }
        });
        getContentPane().add(costas);
        costas.setBounds(330, 120, 40, 50);

        antebraco1.setText("jButton10");
        antebraco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antebraco1ActionPerformed(evt);
            }
        });
        getContentPane().add(antebraco1);
        antebraco1.setBounds(210, 140, 30, 25);

        antebraco2.setText("jButton11");
        antebraco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antebraco2ActionPerformed(evt);
            }
        });
        getContentPane().add(antebraco2);
        antebraco2.setBounds(129, 140, 30, 25);

        perna1.setText("jButton12");
        perna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perna1ActionPerformed(evt);
            }
        });
        getContentPane().add(perna1);
        perna1.setBounds(190, 170, 20, 60);

        perna2.setText("jButton13");
        perna2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perna2ActionPerformed(evt);
            }
        });
        getContentPane().add(perna2);
        perna2.setBounds(159, 170, 20, 60);

        perna3.setText("jButton14");
        perna3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perna3ActionPerformed(evt);
            }
        });
        getContentPane().add(perna3);
        perna3.setBounds(350, 190, 30, 40);

        perna4.setText("jButton15");
        perna4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perna4ActionPerformed(evt);
            }
        });
        getContentPane().add(perna4);
        perna4.setBounds(329, 190, 20, 40);

        gluteo.setText("jButton16");
        gluteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gluteoActionPerformed(evt);
            }
        });
        getContentPane().add(gluteo);
        gluteo.setBounds(329, 170, 40, 25);

        pantu1.setText("jButton17");
        pantu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantu1ActionPerformed(evt);
            }
        });
        getContentPane().add(pantu1);
        pantu1.setBounds(360, 230, 10, 60);

        pantu2.setText("jButton18");
        pantu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantu2ActionPerformed(evt);
            }
        });
        getContentPane().add(pantu2);
        pantu2.setBounds(329, 230, 20, 60);

        pantu3.setText("jButton19");
        pantu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantu3ActionPerformed(evt);
            }
        });
        getContentPane().add(pantu3);
        pantu3.setBounds(190, 230, 20, 50);

        pantu4.setText("jButton20");
        pantu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantu4ActionPerformed(evt);
            }
        });
        getContentPane().add(pantu4);
        pantu4.setBounds(169, 230, 10, 50);

        ombro3.setText("jButton1");
        ombro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ombro3ActionPerformed(evt);
            }
        });
        getContentPane().add(ombro3);
        ombro3.setBounds(200, 95, 20, 20);

        ombro4.setText("jButton2");
        ombro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ombro4ActionPerformed(evt);
            }
        });
        getContentPane().add(ombro4);
        ombro4.setBounds(153, 95, 10, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeitoActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);

jLabel2.setVisible(false);
        ExerPeito pe = new ExerPeito();
pe.setVisible(true);
Desktop.add(pe);        // TODO add your handling code here:
    }//GEN-LAST:event_PeitoActionPerformed

    private void AbdomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbdomemActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        ExerAbdomem abs = new ExerAbdomem();
abs.setVisible(true);
Desktop.add(abs);  // TODO add your handling code here:
    }//GEN-LAST:event_AbdomemActionPerformed

    private void bicepisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicepisActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerBicepis bi = new exerBicepis();
bi.setVisible(true);
Desktop.add(bi);        // TODO add your handling code here:
    }//GEN-LAST:event_bicepisActionPerformed

    private void bicepis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bicepis2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerBicepis bi = new exerBicepis();
bi.setVisible(true);
Desktop.add(bi);        // TODO add your handling code here:
    }//GEN-LAST:event_bicepis2ActionPerformed

    private void triceps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triceps1ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerTricepis abs = new exerTricepis();
abs.setVisible(true);
Desktop.add(abs);        // TODO add your handling code here:
    }//GEN-LAST:event_triceps1ActionPerformed

    private void tricepis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tricepis2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerTricepis abs = new exerTricepis();
abs.setVisible(true);
Desktop.add(abs);     // TODO add your handling code here:
    }//GEN-LAST:event_tricepis2ActionPerformed

    private void ombro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ombro1ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);


        exerOmbro abs = new exerOmbro();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_ombro1ActionPerformed

    private void ombro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ombro2ActionPerformed
    ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerOmbro abs = new exerOmbro();
abs.setVisible(true);
Desktop.add(abs);     // TODO add your handling code here:
    }//GEN-LAST:event_ombro2ActionPerformed

    private void trapezioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapezioActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);

jLabel2.setVisible(false);
        exerTrapezio abs = new exerTrapezio();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_trapezioActionPerformed

    private void trapezio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapezio2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerTrapezio abs = new exerTrapezio();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_trapezio2ActionPerformed

    private void costasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costasActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerCostas abs = new exerCostas();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_costasActionPerformed

    private void antebraco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antebraco1ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerAntebraco abs = new exerAntebraco();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_antebraco1ActionPerformed

    private void antebraco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antebraco2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerAntebraco abs = new exerAntebraco();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_antebraco2ActionPerformed

    private void perna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perna1ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPerna abs = new exerPerna();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_perna1ActionPerformed

    private void perna2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perna2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPerna abs = new exerPerna();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_perna2ActionPerformed

    private void perna3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perna3ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);

jLabel2.setVisible(false);
        exerPerna abs = new exerPerna();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_perna3ActionPerformed

    private void perna4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perna4ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPerna abs = new exerPerna();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_perna4ActionPerformed

    private void gluteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gluteoActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerGluteo abs = new exerGluteo();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_gluteoActionPerformed

    private void pantu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantu1ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPantu abs = new exerPantu();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_pantu1ActionPerformed

    private void pantu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantu2ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPantu abs = new exerPantu();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_pantu2ActionPerformed

    private void pantu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantu3ActionPerformed

        ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
exerPantu abs = new exerPantu();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_pantu3ActionPerformed

    private void pantu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantu4ActionPerformed
ombro1.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerPantu abs = new exerPantu();
abs.setVisible(true);
Desktop.add(abs);          // TODO add your handling code here:
    }//GEN-LAST:event_pantu4ActionPerformed

    private void ombro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ombro3ActionPerformed
    ombro1.setVisible(false);
    ombro3.setVisible(false);
    ombro4.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerOmbro abs = new exerOmbro();
abs.setVisible(true);
Desktop.add(abs);         // TODO add your handling code here:
    }//GEN-LAST:event_ombro3ActionPerformed

    private void ombro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ombro4ActionPerformed
  ombro1.setVisible(false);
    ombro3.setVisible(false);
    ombro4.setVisible(false);
ombro2.setVisible(false);
triceps1.setVisible(false);
tricepis2.setVisible(false);
bicepis.setVisible(false);
bicepis2.setVisible(false);
Abdomem.setVisible(false);
Peito.setVisible(false);
trapezio.setVisible(false);
trapezio2.setVisible(false);
costas.setVisible(false);
antebraco1.setVisible(false);
antebraco2.setVisible(false);
perna1.setVisible(false);
perna2.setVisible(false);
perna3.setVisible(false);
perna4.setVisible(false);
gluteo.setVisible(false);
pantu1.setVisible(false);
pantu2.setVisible(false);
pantu3.setVisible(false);
pantu4.setVisible(false);
jLabel2.setVisible(false);
        exerOmbro abs = new exerOmbro();
abs.setVisible(true);
Desktop.add(abs);            // TODO add your handling code here:
    }//GEN-LAST:event_ombro4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abdomem;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton Peito;
    private javax.swing.JButton antebraco1;
    private javax.swing.JButton antebraco2;
    private javax.swing.JButton bicepis;
    private javax.swing.JButton bicepis2;
    private javax.swing.JButton costas;
    private javax.swing.JButton gluteo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton ombro1;
    private javax.swing.JButton ombro2;
    private javax.swing.JButton ombro3;
    private javax.swing.JButton ombro4;
    private javax.swing.JButton pantu1;
    private javax.swing.JButton pantu2;
    private javax.swing.JButton pantu3;
    private javax.swing.JButton pantu4;
    private javax.swing.JButton perna1;
    private javax.swing.JButton perna2;
    private javax.swing.JButton perna3;
    private javax.swing.JButton perna4;
    private javax.swing.JButton trapezio;
    private javax.swing.JButton trapezio2;
    private javax.swing.JButton tricepis2;
    private javax.swing.JButton triceps1;
    // End of variables declaration//GEN-END:variables
}
