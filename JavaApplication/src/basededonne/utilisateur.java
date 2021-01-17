
package basededonne;

import application.parameter;
import application.tablemodel;
import application.connection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class utilisateur extends javax.swing.JFrame {

    ResultSet rs;
    connection db;
    
    public utilisateur() {
       
        db = new connection(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);
        initComponents();
        //table(); 
        
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        this.setResizable(false);
        
        this.setBounds(195, 10, 900, 700);
        
        table();
        
       
        mod.setVisible(false);
        supp.setVisible(false);
        f1.setVisible(false);
        jButton5.setVisible(false);
    }
    
    public void table() {
        String a[] = {"id","id_user", "username", "password", "type"};
        rs = db.querySelect(a, "utilisateur");
        tableUser.setModel(new tablemodel(rs));
    }
    
    void actualiser() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setSelectedItem("type");}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t4 = new javax.swing.JComboBox<>();
        t3 = new javax.swing.JPasswordField();
        supp = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        k = new javax.swing.JLabel();
        f1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        s = new javax.swing.JComboBox<>();
        tl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rechercher = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("gestion des utilisateur");
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(111, 186, 186));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id_user :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 70, 80, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("username :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(120, 110, 80, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("password :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(120, 150, 76, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("type :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(120, 190, 67, 17);

        t1.setForeground(new java.awt.Color(153, 0, 0));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1);
        t1.setBounds(240, 70, 130, 30);

        t2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(t2);
        t2.setBounds(240, 110, 130, 30);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\ajouter_1.png")); // NOI18N
        jButton1.setText("    Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(310, 280, 140, 40);

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/actualiser.png"))); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(15, 280, 135, 40);

        t4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t4.setForeground(new java.awt.Color(153, 0, 0));
        t4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "type", "cachier", "directeur" }));
        jPanel2.add(t4);
        t4.setBounds(240, 190, 130, 30);

        t3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        t3.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(t3);
        t3.setBounds(240, 150, 130, 30);

        supp.setBackground(new java.awt.Color(153, 0, 0));
        supp.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        supp.setForeground(new java.awt.Color(255, 255, 255));
        supp.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\supprimer.png")); // NOI18N
        supp.setText("Supprimer");
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });
        jPanel2.add(supp);
        supp.setBounds(310, 233, 140, 40);

        mod.setBackground(new java.awt.Color(153, 0, 0));
        mod.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/modifier.png"))); // NOI18N
        mod.setText("    Modifier");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel2.add(mod);
        mod.setBounds(310, 320, 140, 40);

        jButton5.setBackground(new java.awt.Color(153, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("List Users");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(170, 280, 120, 40);

        k.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        k.setForeground(new java.awt.Color(153, 0, 0));
        k.setText("    Ajouter un utilisateur");
        jPanel2.add(k);
        k.setBounds(150, 10, 190, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(290, 150, 480, 360);

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "id_user", "username", "password", "type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        f1.setViewportView(tableUser);

        getContentPane().add(f1);
        f1.setBounds(70, 40, 452, 100);

        jPanel3.setBackground(new java.awt.Color(111, 186, 186));
        jPanel3.setLayout(null);

        jButton4.setBackground(new java.awt.Color(153, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\rechercher.png")); // NOI18N
        jButton4.setText("  Rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(305, 280, 155, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recherche par catégorie :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 100, 180, 30);

        s.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s.setForeground(new java.awt.Color(153, 0, 0));
        s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_user", "username", "password", "type" }));
        jPanel3.add(s);
        s.setBounds(260, 100, 140, 30);

        tl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(tl);
        tl.setBounds(140, 180, 200, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("    Rechercher un utilisateur");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(120, 20, 230, 17);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(410, 150, 480, 360);

        jPanel1.setBackground(new java.awt.Color(111, 186, 186));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Ajouter");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 77, 100, 30);

        jLabel3.setBackground(new java.awt.Color(153, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   Supprimer");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 127, 100, 30);

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   Modifier");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 187, 100, 30);

        rechercher.setBackground(new java.awt.Color(153, 0, 0));
        rechercher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rechercher.setForeground(new java.awt.Color(255, 255, 255));
        rechercher.setText("Rechercher");
        rechercher.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercherMouseClicked(evt);
            }
        });
        jPanel1.add(rechercher);
        rechercher.setBounds(20, 247, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 150, 140, 360);

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("                      Gestion Des Utilisateurs");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 10, 920, 60);

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 580, 110, 40);

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/login_2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 2260, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login l=new login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        actualiser();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
                || t4.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"id_user", "username", "password", "type"};
            String[] inf = {t1.getText(), t2.getText(), t3.getText(), t4.getSelectedItem().toString()};
            System.out.println(db.queryInsert("utilisateur", colon, inf));
            table();
            actualiser();
            JOptionPane.showMessageDialog(null,tableUser ,"la liste des utilisateurs",JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jPanel2.setVisible(true);
         k.setText("Ajouter un utilisateur");
        jPanel3.setVisible(false);
        jButton1.setVisible(true);
        mod.setVisible(false);
        f1.setVisible(false);
        jButton5.setVisible(false);
        
        
        
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         jPanel2.setVisible(true);
         jPanel3.setVisible(false);
          jButton1.setVisible(false);
        supp.setVisible(true);
        supp.setLocation(310,280);
        mod.setVisible(false);
       f1.setVisible(false);
        jButton5.setVisible(true);
         k.setText("Supprimer un utilisateur");
       
        
       
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jButton1.setVisible(false);
        mod.setVisible(true);
        mod.setLocation(310,280);
        supp.setVisible(false);
        f1.setVisible(false);
        k.setText("Modifier un utilisateur");
         jButton5.setVisible(true);
        
        
       
    }//GEN-LAST:event_jLabel4MouseClicked

    private void rechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherMouseClicked
         jButton5.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel3.setLocation(292,150); 
        f1.setVisible(false);
         jButton5.setVisible(false);
        
    }//GEN-LAST:event_rechercherMouseClicked

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        jButton5.setVisible(true);
        String idd = String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(), 1));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("utilisateur", "id_user=" + idd);
        } else {
            return;
        }
       
        table();
        
        actualiser();
        
    }//GEN-LAST:event_suppActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        
        jButton5.setVisible(true);
        if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"id_user", "username", "password", "type"};
            String[] inf = {t1.getText(), t2.getText(), t3.getText(), t4.getSelectedItem().toString()};
            String idr = String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(), 1));
            System.out.println(db.queryUpdate("utilisateur", colon, inf, "id_user='" + idr + "'"));
            table();
            actualiser();

        }
        
        
    }//GEN-LAST:event_modActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton5.setVisible(true);
        if (tl.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (s.getSelectedItem().equals("id_user")) {
                rs = db.querySelectAll("utilisateur", "id_user LIKE '%" + tl.getText() + "%' ");
                tableUser.setModel(new tablemodel(rs));
            } else if(s.getSelectedItem().equals("username")) {
                rs = db.querySelectAll("utilisateur", "username LIKE '%" + tl.getText() + "%' ");
                tableUser.setModel(new tablemodel(rs));
            } else if (s.getSelectedItem().equals("password")) {
                rs = db.querySelectAll("utilisateur", "password LIKE '%" + tl.getText() + "%' ");
                tableUser.setModel(new tablemodel(rs));
            } else if (s.getSelectedItem().equals("type")) {
                rs = db.querySelectAll("utilisateur", "type LIKE '%" + tl.getText() + "%' ");
                tableUser.setModel(new tablemodel(rs));
            }
        } 
     JOptionPane.showMessageDialog(null,tableUser ,"le résultat de recherche",JOptionPane.INFORMATION_MESSAGE); 
       
        actualiser(); 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        t1.setText(String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(),1)));
        t2.setText(String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(),2)));
        t3.setText(String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(),3)));
        t4.setSelectedItem(String.valueOf(tableUser.getValueAt(tableUser.getSelectedRow(),4)));
    }//GEN-LAST:event_tableUserMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        rs = db.querySelectAll("utilisateur");
        tableUser.setModel(new tablemodel(rs));
        
        JOptionPane.showMessageDialog(null,tableUser ,"la liste des utilisateurs",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane f1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel k;
    private javax.swing.JButton mod;
    private javax.swing.JLabel rechercher;
    private javax.swing.JComboBox<String> s;
    private javax.swing.JButton supp;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JPasswordField t3;
    private javax.swing.JComboBox<String> t4;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField tl;
    // End of variables declaration//GEN-END:variables
}
