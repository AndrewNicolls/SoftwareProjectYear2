/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spy2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrew
 */
public class returningStudentForm2 extends javax.swing.JFrame {

    /**
     * Creates new form returningStudentForm2
     */
    public returningStudentForm2() {
        super("Returning Student Form2");
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

        jPanel1 = new javax.swing.JPanel();
        reminderLbl = new javax.swing.JLabel();
        sponsorTitleLbl = new javax.swing.JLabel();
        firstnameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        initialsLbl = new javax.swing.JLabel();
        idNumLbl = new javax.swing.JLabel();
        mariStatLbl = new javax.swing.JLabel();
        emailAddLbl = new javax.swing.JLabel();
        cNumLbl = new javax.swing.JLabel();
        hNumLbl = new javax.swing.JLabel();
        resAddLbl = new javax.swing.JLabel();
        resZipLbl = new javax.swing.JLabel();
        postAddLbl = new javax.swing.JLabel();
        postZipLbl = new javax.swing.JLabel();
        sponsorTitleTxf = new javax.swing.JTextField();
        firstNameTxf = new javax.swing.JTextField();
        surnameTxf = new javax.swing.JTextField();
        starLbl1 = new javax.swing.JLabel();
        starLbl2 = new javax.swing.JLabel();
        starLbl3 = new javax.swing.JLabel();
        starLbl4 = new javax.swing.JLabel();
        starLbl5 = new javax.swing.JLabel();
        starLbl7 = new javax.swing.JLabel();
        starLbl6 = new javax.swing.JLabel();
        starLbl9 = new javax.swing.JLabel();
        starLbl8 = new javax.swing.JLabel();
        starLbl10 = new javax.swing.JLabel();
        starLbl11 = new javax.swing.JLabel();
        starLbl12 = new javax.swing.JLabel();
        starLbl13 = new javax.swing.JLabel();
        initialsTxf = new javax.swing.JTextField();
        emailTxf = new javax.swing.JTextField();
        cNumTxf = new javax.swing.JTextField();
        maritalCbx = new javax.swing.JComboBox<>();
        idNumTxf = new javax.swing.JTextField();
        hNumTxf = new javax.swing.JTextField();
        resAddTxf1 = new javax.swing.JTextField();
        resAddTxf2 = new javax.swing.JTextField();
        resZipTxf = new javax.swing.JTextField();
        postAddTxf1 = new javax.swing.JTextField();
        postZipTxf = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        postAddTxf2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student's sponsor details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        reminderLbl.setForeground(new java.awt.Color(255, 0, 0));
        reminderLbl.setText("Please confirm that all the information below is correct");

        sponsorTitleLbl.setText("Title");

        firstnameLbl.setText("Firstname");

        surnameLbl.setText("Surname");

        initialsLbl.setText("Initials");

        idNumLbl.setText("ID Number");

        mariStatLbl.setText("Marital Status");

        emailAddLbl.setText("Email addresss");

        cNumLbl.setText("Cell number");

        hNumLbl.setText("Home number");

        resAddLbl.setText("Residential address");

        resZipLbl.setText("Area code");

        postAddLbl.setText("Postal address");

        postZipLbl.setText("Area code");

        starLbl1.setForeground(new java.awt.Color(255, 0, 0));
        starLbl1.setText(" *");

        starLbl2.setForeground(new java.awt.Color(255, 0, 0));
        starLbl2.setText(" *");

        starLbl3.setForeground(new java.awt.Color(255, 0, 0));
        starLbl3.setText(" *");

        starLbl4.setForeground(new java.awt.Color(255, 0, 0));
        starLbl4.setText(" *");

        starLbl5.setForeground(new java.awt.Color(255, 0, 0));
        starLbl5.setText(" *");

        starLbl7.setForeground(new java.awt.Color(255, 0, 0));
        starLbl7.setText(" *");

        starLbl6.setForeground(new java.awt.Color(255, 0, 0));
        starLbl6.setText(" *");

        starLbl9.setForeground(new java.awt.Color(255, 0, 0));
        starLbl9.setText(" *");

        starLbl8.setForeground(new java.awt.Color(255, 0, 0));
        starLbl8.setText(" *");

        starLbl10.setForeground(new java.awt.Color(255, 0, 0));
        starLbl10.setText(" *");

        starLbl11.setForeground(new java.awt.Color(255, 0, 0));
        starLbl11.setText(" *");

        starLbl12.setForeground(new java.awt.Color(255, 0, 0));
        starLbl12.setText(" *");

        starLbl13.setForeground(new java.awt.Color(255, 0, 0));
        starLbl13.setText(" *");

        maritalCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Divorced", "Single", "Widowed" }));

        postAddTxf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAddTxf1ActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        postAddTxf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAddTxf2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstnameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reminderLbl)
                            .addComponent(starLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sponsorTitleLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(starLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(initialsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(starLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(surnameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mariStatLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailAddLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(starLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hNumLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(surnameTxf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(initialsTxf)
                                .addComponent(firstNameTxf)
                                .addComponent(sponsorTitleTxf)
                                .addComponent(idNumTxf)
                                .addComponent(maritalCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cNumTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hNumTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resAddLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resZipLbl)
                                .addGap(1, 1, 1)
                                .addComponent(starLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(postAddLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(postZipLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(starLbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(postZipTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(306, 306, 306))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(resZipTxf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resAddTxf2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resAddTxf1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(postAddTxf1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(postAddTxf2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(44, 44, 44)
                                .addComponent(nextBtn)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sponsorTitleLbl)
                            .addComponent(starLbl1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(reminderLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sponsorTitleTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLbl)
                    .addComponent(firstNameTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starLbl2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLbl)
                    .addComponent(surnameTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starLbl3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialsLbl)
                    .addComponent(starLbl4)
                    .addComponent(initialsTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNumLbl)
                    .addComponent(starLbl5)
                    .addComponent(idNumTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mariStatLbl)
                    .addComponent(maritalCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starLbl6))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddLbl)
                    .addComponent(starLbl7)
                    .addComponent(emailTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNumLbl)
                    .addComponent(cNumTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starLbl8))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hNumLbl)
                    .addComponent(starLbl9)
                    .addComponent(hNumTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resAddLbl)
                    .addComponent(starLbl10)
                    .addComponent(resAddTxf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(resAddTxf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resZipLbl)
                        .addComponent(starLbl11))
                    .addComponent(resZipTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postAddLbl)
                    .addComponent(starLbl12)
                    .addComponent(postAddTxf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(postAddTxf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postZipLbl)
                            .addComponent(starLbl13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(postZipTxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(nextBtn))))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("LogOut");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        greetFrame object=new greetFrame();
        object.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void postAddTxf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAddTxf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postAddTxf1ActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        if(evt.getSource()==nextBtn)
      {
         String firstName=firstNameTxf.getText();
         String initials=initialsTxf.getText();
         String surname=surnameTxf.getText();
         String sponsorTitle=sponsorTitleTxf.getText();
         String homeNum=hNumTxf.getText();
         String email=emailTxf.getText(); 
         String maritalStatus = (String) maritalCbx.getSelectedItem();
         String cellNum = cNumTxf.getText();
         String resAddress = resAddTxf1.getText()+resAddTxf2.getText();
         String resZip = resZipTxf.getText();
         String postAddress = postAddTxf1.getText()+postAddTxf2.getText();
         String postZip = postZipTxf.getText();
         String idNum = idNumTxf.getText();
      
       Connection connection;
           try{
             connection = DriverManager.getConnection("jdbc:mysql://localhost/ease", "root", "");
             Statement st = connection.createStatement();
             
           st.executeUpdate("UPDATE `sponsor` SET(`firstName`='"+firstName+"',`lastName`='"+surname+"'"
                     + ",`homeNum'="+homeNum+"'`,`email`='"+email+"',`maritalStatus`='"+maritalStatus+"',`Initials`='"+initials+"'"
                     + ",`cellNum`='"+cellNum+"',`resAddress`='"+resAddress+"',`resZip`='"+resZip+"',`postAddress`='"+postAddress+"',`postZip`='"+postZip+"',`Title`='"+sponsorTitle+"')"
                     + "WHERE IDnum='"+idNum+"'");    
           
           }catch(SQLException ex){
               Logger.getLogger(adminLoginFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
        setVisible(false);
        finishScreen object=new finishScreen();
        object.setVisible(true);
      }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         setVisible(false);
        returningStudentForm1 object=new returningStudentForm1();
        object.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void postAddTxf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAddTxf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postAddTxf2ActionPerformed

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
            java.util.logging.Logger.getLogger(returningStudentForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returningStudentForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returningStudentForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returningStudentForm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returningStudentForm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel cNumLbl;
    private javax.swing.JTextField cNumTxf;
    private javax.swing.JLabel emailAddLbl;
    private javax.swing.JTextField emailTxf;
    private javax.swing.JTextField firstNameTxf;
    private javax.swing.JLabel firstnameLbl;
    private javax.swing.JLabel hNumLbl;
    private javax.swing.JTextField hNumTxf;
    private javax.swing.JLabel idNumLbl;
    private javax.swing.JTextField idNumTxf;
    private javax.swing.JLabel initialsLbl;
    private javax.swing.JTextField initialsTxf;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mariStatLbl;
    private javax.swing.JComboBox<String> maritalCbx;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel postAddLbl;
    private javax.swing.JTextField postAddTxf1;
    private javax.swing.JTextField postAddTxf2;
    private javax.swing.JLabel postZipLbl;
    private javax.swing.JTextField postZipTxf;
    private javax.swing.JLabel reminderLbl;
    private javax.swing.JLabel resAddLbl;
    private javax.swing.JTextField resAddTxf1;
    private javax.swing.JTextField resAddTxf2;
    private javax.swing.JLabel resZipLbl;
    private javax.swing.JTextField resZipTxf;
    private javax.swing.JLabel sponsorTitleLbl;
    private javax.swing.JTextField sponsorTitleTxf;
    private javax.swing.JLabel starLbl1;
    private javax.swing.JLabel starLbl10;
    private javax.swing.JLabel starLbl11;
    private javax.swing.JLabel starLbl12;
    private javax.swing.JLabel starLbl13;
    private javax.swing.JLabel starLbl2;
    private javax.swing.JLabel starLbl3;
    private javax.swing.JLabel starLbl4;
    private javax.swing.JLabel starLbl5;
    private javax.swing.JLabel starLbl6;
    private javax.swing.JLabel starLbl7;
    private javax.swing.JLabel starLbl8;
    private javax.swing.JLabel starLbl9;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JTextField surnameTxf;
    // End of variables declaration//GEN-END:variables
}
