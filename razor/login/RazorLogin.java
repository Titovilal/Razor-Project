/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razor.login;

import java.awt.Color;
import razor.viewController.RazorViewController;

/**
 *
 * @author scast
 */
public class RazorLogin extends javax.swing.JFrame {
    
    private int xMouse;
    private int yMouse;
    private RazorViewController view;
    
    public RazorLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonSalir = new javax.swing.JButton();
        labelLoginDragged = new javax.swing.JLabel();
        buttonMinimizar = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        buttonOk = new javax.swing.JButton();
        lebelSesion = new javax.swing.JLabel();
        labelInfo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(158, 132, 76));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(43, 50, 62));

        buttonSalir.setBackground(new java.awt.Color(43, 50, 62));
        buttonSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonSalir.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalir.setText("X");
        buttonSalir.setBorder(null);
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        labelLoginDragged.setBackground(new java.awt.Color(43, 50, 62));
        labelLoginDragged.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelLoginDragged.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginDragged.setText("Login - Razor Project 1.0");
        labelLoginDragged.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labelLoginDraggedMouseDragged(evt);
            }
        });
        labelLoginDragged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelLoginDraggedMousePressed(evt);
            }
        });

        buttonMinimizar.setBackground(new java.awt.Color(43, 50, 62));
        buttonMinimizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        buttonMinimizar.setText("M");
        buttonMinimizar.setBorder(null);
        buttonMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonMinimizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        buttonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinimizarActionPerformed(evt);
            }
        });

        labelIcon.setBackground(new java.awt.Color(43, 50, 62));
        labelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/razor/login/icons8_straight_razor_16.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLoginDragged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalir)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonMinimizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelLoginDragged, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        labelUser.setBackground(new java.awt.Color(158, 132, 76));
        labelUser.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelUser.setForeground(new java.awt.Color(247, 246, 244));
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("USUARIO");

        labelPassword.setBackground(new java.awt.Color(158, 132, 76));
        labelPassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(247, 246, 244));
        labelPassword.setText("CONTRASEÑA");

        textUser.setBackground(new java.awt.Color(158, 132, 76));
        textUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textUser.setForeground(new java.awt.Color(247, 246, 244));
        textUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textUser.setBorder(null);

        textPassword.setBackground(new java.awt.Color(158, 132, 76));
        textPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textPassword.setForeground(new java.awt.Color(247, 246, 244));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.setBorder(null);

        buttonOk.setBackground(new java.awt.Color(43, 50, 62));
        buttonOk.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonOk.setForeground(new java.awt.Color(247, 246, 244));
        buttonOk.setText("Login");
        buttonOk.setBorder(null);
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        lebelSesion.setBackground(new java.awt.Color(158, 132, 76));
        lebelSesion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lebelSesion.setForeground(new java.awt.Color(247, 246, 244));
        lebelSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lebelSesion.setText("Iniciar Sesión");

        labelInfo.setBackground(new java.awt.Color(158, 132, 76));
        labelInfo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(247, 246, 244));
        labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfo.setText("DESARROLLADO Y CREADO POR SALVA CASTELLS JUAN 2020/2021");

        jSeparator1.setBackground(new java.awt.Color(247, 246, 244));

        jSeparator2.setBackground(new java.awt.Color(247, 246, 244));
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 6));

        labelError.setBackground(new java.awt.Color(158, 132, 76));
        labelError.setForeground(new java.awt.Color(158, 132, 76));
        labelError.setText("Combinación incorrecta! Inténtalo de nuevo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
            .addComponent(lebelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textUser)
                            .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lebelSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInfo)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinimizarActionPerformed
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizarActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void labelLoginDraggedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginDraggedMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_labelLoginDraggedMouseDragged

    private void labelLoginDraggedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginDraggedMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_labelLoginDraggedMousePressed

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        // TODO add your handling code here:
        if ("root".equals(textUser.getText()) && "root".equals(textPassword.getText())){
            view = new RazorViewController ();
            view.setVisible(true);
            this.setVisible(false);
        }
        else if ("root".equals(textUser.getText()) == false && "root".equals(textPassword.getText()) == false)
            labelError.setForeground(Color.white);
    }//GEN-LAST:event_buttonOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMinimizar;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelLoginDragged;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel lebelSesion;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
