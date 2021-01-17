
package basededonne;



import application.parameter;
import application.tablemodel;
import application.connection;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class Produit extends javax.swing.JFrame {

    
    ResultSet rs;
    connection db;
   
    public Produit(){
        
        db = new connection(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);
       
        
        initComponents();
         jPanel3.setVisible(false);
         this.setResizable(false);
         list.setVisible(false);
         table();
         mod.setVisible(false);
         sup.setVisible(false);
         this.setBounds(195, 10, 900, 700);
    }
	 	 	 	 	 	 	 	 
    public void table() {
        String a[] = {"id","code_produit","reference", "deseignation", "rangement", "fournisseur","remise","prix","stock"};
        rs = db.querySelect(a, "produit");
        tableProd.setModel(new tablemodel(rs));
    }
    
    void actualiser() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t5.setText("");
        t7.setText("");
        t6.setText("");
        t4.setText("");
        t8.setText("");
       
    } 
    
   
    
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        m = new javax.swing.JComboBox<>();
        b = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        actualiser = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        k = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        list = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("gestion des produits");
        setMinimumSize(new java.awt.Dimension(900, 700));
        setName("gestion des produits"); // NOI18N
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(111, 186, 186));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recherche par catégorie :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 140, 184, 30);

        m.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock" }));
        jPanel3.add(m);
        m.setBounds(320, 140, 178, 30);

        b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(b);
        b.setBounds(180, 220, 192, 35);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\rechercher.png")); // NOI18N
        jButton1.setText("Rechercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(460, 340, 150, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Rechercher Un Produit");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(480, 0, 200, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(310, 290, 650, 420);

        jPanel2.setBackground(new java.awt.Color(111, 186, 186));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("code produit :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 90, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("reference :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 140, 100, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("deseignation :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 190, 110, 30);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1);
        t1.setBounds(190, 90, 110, 30);
        jPanel2.add(t2);
        t2.setBounds(190, 140, 110, 30);
        jPanel2.add(t3);
        t3.setBounds(190, 190, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("fournisseur :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(370, 90, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("remise % :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(370, 140, 100, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("prix :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(370, 190, 90, 30);
        jPanel2.add(t5);
        t5.setBounds(490, 90, 106, 30);
        jPanel2.add(t6);
        t6.setBounds(490, 140, 106, 30);
        jPanel2.add(t7);
        t7.setBounds(490, 190, 106, 30);

        actualiser.setBackground(new java.awt.Color(153, 0, 0));
        actualiser.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        actualiser.setForeground(new java.awt.Color(255, 255, 255));
        actualiser.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\actualiser.png")); // NOI18N
        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });
        jPanel2.add(actualiser);
        actualiser.setBounds(170, 350, 140, 40);

        ajouter.setBackground(new java.awt.Color(153, 0, 0));
        ajouter.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\ajouter_1.png")); // NOI18N
        ajouter.setText("    Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        jPanel2.add(ajouter);
        ajouter.setBounds(380, 350, 140, 40);

        k.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        k.setForeground(new java.awt.Color(153, 0, 0));
        k.setText("   Ajouter Un Produit ");
        jPanel2.add(k);
        k.setBounds(490, 0, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" rangement :");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 244, 100, 30);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel2.add(t4);
        t4.setBounds(190, 240, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("stock :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(370, 240, 80, 30);
        jPanel2.add(t8);
        t8.setBounds(490, 240, 110, 30);

        list.setBackground(new java.awt.Color(153, 0, 0));
        list.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        list.setForeground(new java.awt.Color(255, 255, 255));
        list.setText("Liste Produit");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel2.add(list);
        list.setBounds(20, 350, 130, 40);

        mod.setBackground(new java.awt.Color(153, 0, 0));
        mod.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\modifier.png")); // NOI18N
        mod.setText("    Modifier");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        jPanel2.add(mod);
        mod.setBounds(380, 310, 140, 40);

        sup.setBackground(new java.awt.Color(153, 0, 0));
        sup.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        sup.setForeground(new java.awt.Color(255, 255, 255));
        sup.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\supprimer.png")); // NOI18N
        sup.setText("Supprimer");
        sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supActionPerformed(evt);
            }
        });
        jPanel2.add(sup);
        sup.setBounds(380, 273, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 220, 650, 420);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("   Gestion Des Produits    ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 20, 470, 30);

        tableProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableProd.setForeground(new java.awt.Color(102, 0, 0));
        tableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProd);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 670, 770, 118);

        jPanel1.setBackground(new java.awt.Color(111, 186, 186));
        jPanel1.setLayout(null);

        l1.setBackground(new java.awt.Color(153, 0, 0));
        l1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(153, 0, 0));
        l1.setText("   Ajouter");
        l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        l1.setMaximumSize(new java.awt.Dimension(60, 30));
        l1.setMinimumSize(new java.awt.Dimension(60, 30));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        jPanel1.add(l1);
        l1.setBounds(0, 0, 92, 40);

        l2.setBackground(new java.awt.Color(153, 0, 0));
        l2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(153, 0, 0));
        l2.setText(" Supprimer");
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        l2.setMaximumSize(new java.awt.Dimension(60, 30));
        l2.setMinimumSize(new java.awt.Dimension(60, 30));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        jPanel1.add(l2);
        l2.setBounds(100, 0, 92, 40);

        l3.setBackground(new java.awt.Color(153, 0, 0));
        l3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(153, 0, 0));
        l3.setText("   Modifier");
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        l3.setMaximumSize(new java.awt.Dimension(60, 30));
        l3.setMinimumSize(new java.awt.Dimension(60, 30));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        jPanel1.add(l3);
        l3.setBounds(200, 0, 100, 40);

        l4.setBackground(new java.awt.Color(153, 0, 0));
        l4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(153, 0, 0));
        l4.setText(" Rechercher");
        l4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        l4.setMaximumSize(new java.awt.Dimension(60, 30));
        l4.setMinimumSize(new java.awt.Dimension(60, 30));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        jPanel1.add(l4);
        l4.setBounds(310, 0, 100, 40);

        logout.setBackground(new java.awt.Color(0, 153, 153));
        logout.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 0, 0));
        logout.setText("LogOut");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        logout.setBorderPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(800, 0, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 1010, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/login_2.jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1006, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
         actualiser();
    }//GEN-LAST:event_actualiserActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
         jPanel2.setVisible(true);
         k.setText("Ajouter Un produit");
         jPanel3.setVisible(false);
         list.setVisible(false);
         actualiser.setLocation(170,350);
         ajouter.setVisible(true);
         sup.setVisible(false);
         mod.setVisible(false);

    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
         jPanel2.setVisible(true);
         k.setText("Supprimer Un produit");
         jPanel3.setVisible(false);
         list.setVisible(true);
         sup.setLocation(400,350);
         actualiser.setLocation(250,350);
         list.setLocation(100,350);
         ajouter.setVisible(false);
         sup.setVisible(true);
         mod.setVisible(false);
         
         
         
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
         jPanel2.setVisible(true);
         k.setText("Modifier Un produit");
         jPanel3.setVisible(false);
         list.setVisible(true);
         mod.setLocation(400,350);
         actualiser.setLocation(250,350);
         list.setLocation(100,350);
         ajouter.setVisible(false);
         mod.setVisible(true);
         sup.setVisible(false);
         
         
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
          jPanel3.setLocation(120,220); 
    }//GEN-LAST:event_l4MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login l=new login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        
    if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
                || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("")
                || t4.getText().equals("") || t8.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
            String[] inf = {t1.getText(), t2.getText(), t3.getText(),t4.getText(),t5.getText(),t6.getText(),t7.getText(),t8.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            table();
            actualiser();
            JOptionPane.showMessageDialog(null,tableProd ,"la liste des Produit",JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_ajouterActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void tableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdMouseClicked
        t1.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),1)));
        t2.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),2)));
        t3.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),3)));
        t4.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),4)));
        t5.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),5)));
        t6.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),6)));
        t7.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),7)));
        t8.setText(String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(),8)));
    }//GEN-LAST:event_tableProdMouseClicked

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        rs = db.querySelectAll("produit");
        tableProd.setModel(new tablemodel(rs));
        
        JOptionPane.showMessageDialog(null,tableProd ,"la liste des produit",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_listActionPerformed

    private void supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supActionPerformed
       
        String id = String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suprimer", "attention!!!", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produit", "id=" + id);
        } else {
            return;
        }
        table();
        actualiser();
    }//GEN-LAST:event_supActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
         if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
                || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("")
                || t7.getText().equals("") || t8.getText().equals("")
                ) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
                  String[] colon = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
              String[] inf = {t1.getText(), t2.getText(), t3.getText(),t4.getText(),t5.getText()
            ,t6.getText(),t7.getText(),t8.getText()};
            String id = String.valueOf(tableProd.getValueAt(tableProd.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "id='" + id + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_modActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (b.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (m.getSelectedItem().equals("code_produit")) {
                rs = db.querySelectAll("produit", "code_produit LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("reference")) {
                rs = db.querySelectAll("produit", "reference LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("deseignation")) {
                rs = db.querySelectAll("produit", "deseignation LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("rangement")) {
                rs = db.querySelectAll("produit", "rangement LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("fournisseur")) {
                rs = db.querySelectAll("produit", "fournisseur LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("remise")) {
                rs = db.querySelectAll("produit", "remise LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("prix")) {
                rs = db.querySelectAll("produit", "prix LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));
            } else if (m.getSelectedItem().equals("stock")) {
                rs = db.querySelectAll("produit", "stock LIKE '%" + b.getText() + "%' ");
                tableProd.setModel(new tablemodel(rs));

            } 
        }
        JOptionPane.showMessageDialog(null,tableProd ,"la liste des produit",JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Produit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    private javax.swing.JButton ajouter;
    private javax.swing.JTextField b;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JButton list;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JButton mod;
    private javax.swing.JButton sup;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTable tableProd;
    // End of variables declaration//GEN-END:variables
}
