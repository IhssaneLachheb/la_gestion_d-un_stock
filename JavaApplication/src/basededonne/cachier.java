
package basededonne;

import application.parameter;
import application.tablemodel;
import application.connection;
import java.sql.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class cachier extends javax.swing.JFrame {

        
    ResultSet rs;
    connection db;
        JOptionPane p=new JOptionPane();
       private int old ,dec,now;
         
        
    public cachier() {
        
        db = new connection(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, new parameter().IPHOST, new parameter().PORT);
         
        this.setResizable(false);
        this.setBounds(195, 10, 900, 700);
       
         
      initComponents(); 
      p1.setVisible(false);
        
    
    }
    public void actualiser(){
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t9.setText("");
    cache.setText("");
    payer.setText("");
    RPlabel.setText("");
  
    }

    
    
    public void table() {
        String colon[] = {"id","code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};  
        rs = db.querySelect(colon, "produit");
        tableProduit.setModel(new tablemodel(rs));
    }

    public void importer() {
        String colon[] = {"num_facture","code_produit","reference","prix_vente","stock_sortie","subtotal"};
        rs = db.fcSelectCommand(colon, "vente", "num_facture='" + t9.getText() + "'");
        tableVent.setModel(new tablemodel(rs));
    }
     
  public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}   
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AjouterVente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        RPlabel = new javax.swing.JLabel();
        RechercherListVent = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cache = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        payer = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        imprimer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        listvent = new javax.swing.JLabel();
        liste = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        p1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        catégory = new javax.swing.JComboBox();
        ihssane = new javax.swing.JTextField();
        rechercher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduit = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("cachier");
        setMinimumSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        p3.setBackground(new java.awt.Color(0, 153, 153));
        p3.setForeground(new java.awt.Color(255, 255, 255));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
        });
        p3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("code_produit :");
        p3.add(jLabel2);
        jLabel2.setBounds(80, 170, 100, 17);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        p3.add(t1);
        t1.setBounds(210, 160, 160, 30);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        p3.add(t2);
        t2.setBounds(210, 200, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("reference     :");
        p3.add(jLabel3);
        jLabel3.setBounds(80, 210, 100, 17);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        p3.add(t3);
        t3.setBounds(210, 240, 160, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prix        :");
        p3.add(jLabel4);
        jLabel4.setBounds(80, 330, 100, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("rangement :");
        p3.add(jLabel6);
        jLabel6.setBounds(80, 250, 100, 17);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        p3.add(t4);
        t4.setBounds(210, 280, 160, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("fournisseur :");
        p3.add(jLabel7);
        jLabel7.setBounds(80, 290, 100, 17);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        p3.add(t5);
        t5.setBounds(210, 320, 160, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("remise     :");
        p3.add(jLabel8);
        jLabel8.setBounds(500, 170, 100, 17);

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        p3.add(t6);
        t6.setBounds(630, 160, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("nouveau Prix  :");
        p3.add(jLabel9);
        jLabel9.setBounds(500, 210, 100, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Stock sortire  :");
        p3.add(jLabel10);
        jLabel10.setBounds(500, 250, 100, 17);

        AjouterVente.setBackground(new java.awt.Color(153, 0, 0));
        AjouterVente.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        AjouterVente.setForeground(new java.awt.Color(255, 255, 255));
        AjouterVente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/ajouter_1.png"))); // NOI18N
        AjouterVente.setText("Ajouter ");
        AjouterVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterVenteActionPerformed(evt);
            }
        });
        p3.add(AjouterVente);
        AjouterVente.setBounds(300, 570, 120, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RP : ");
        p3.add(jLabel13);
        jLabel13.setBounds(530, 340, 50, 30);

        RPlabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        RPlabel.setForeground(new java.awt.Color(255, 255, 255));
        RPlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RPlabel.setText("0");
        p3.add(RPlabel);
        RPlabel.setBounds(580, 340, 170, 30);

        RechercherListVent.setBackground(new java.awt.Color(153, 0, 0));
        RechercherListVent.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        RechercherListVent.setForeground(new java.awt.Color(255, 255, 255));
        RechercherListVent.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\rechercher.png")); // NOI18N
        RechercherListVent.setText("recherche ");
        RechercherListVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherListVentActionPerformed(evt);
            }
        });
        p3.add(RechercherListVent);
        RechercherListVent.setBounds(500, 570, 130, 40);

        Supprimer.setBackground(new java.awt.Color(153, 0, 0));
        Supprimer.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Supprimer.setForeground(new java.awt.Color(255, 255, 255));
        Supprimer.setIcon(new javax.swing.ImageIcon("C:\\Users\\lachh\\Documents\\NetBeansProjects\\JavaApplication\\src\\basededonne\\supprimer.png")); // NOI18N
        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        p3.add(Supprimer);
        Supprimer.setBounds(710, 570, 130, 40);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Num de facture :");
        p3.add(jLabel14);
        jLabel14.setBounds(500, 290, 100, 17);

        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        p3.add(t9);
        t9.setBounds(630, 280, 160, 30);

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        p3.add(t7);
        t7.setBounds(630, 200, 160, 30);

        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t8KeyReleased(evt);
            }
        });
        p3.add(t8);
        t8.setBounds(630, 240, 160, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("cash :");
        p3.add(jLabel20);
        jLabel20.setBounds(230, 440, 50, 30);

        cache.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cacheKeyReleased(evt);
            }
        });
        p3.add(cache);
        cache.setBounds(290, 440, 130, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("payé aprés :");
        p3.add(jLabel18);
        jLabel18.setBounds(440, 440, 90, 30);
        p3.add(payer);
        payer.setBounds(550, 440, 130, 30);

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vente");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel16);
        jLabel16.setBounds(30, 10, 81, 49);

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("date1");
        jPanel4.add(lbl1);
        lbl1.setBounds(160, 40, 120, 15);

        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("date2");
        jPanel4.add(lbl2);
        lbl2.setBounds(160, 10, 120, 20);

        p3.add(jPanel4);
        jPanel4.setBounds(290, 0, 330, 60);

        imprimer.setBackground(new java.awt.Color(153, 0, 0));
        imprimer.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        imprimer.setForeground(new java.awt.Color(255, 255, 255));
        imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/imprimer.png"))); // NOI18N
        imprimer.setText("Imprimer");
        imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimerActionPerformed(evt);
            }
        });
        p3.add(imprimer);
        imprimer.setBounds(90, 570, 130, 40);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        listvent.setBackground(new java.awt.Color(153, 0, 0));
        listvent.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        listvent.setForeground(new java.awt.Color(255, 255, 255));
        listvent.setText("   List vent");
        listvent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        listvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listventMouseClicked(evt);
            }
        });
        jPanel1.add(listvent);
        listvent.setBounds(110, 0, 100, 30);

        liste.setBackground(new java.awt.Color(153, 0, 0));
        liste.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        liste.setForeground(new java.awt.Color(255, 255, 255));
        liste.setText(" Liste Produit");
        liste.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        liste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeMouseClicked(evt);
            }
        });
        jPanel1.add(liste);
        liste.setBounds(10, 0, 100, 30);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(800, 0, 90, 30);

        p3.add(jPanel1);
        jPanel1.setBounds(0, 60, 910, 30);

        getContentPane().add(p3);
        p3.setBounds(0, 0, 920, 730);

        p1.setBackground(new java.awt.Color(0, 153, 153));
        p1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("recherche par catégorie :");
        p1.add(jLabel5);
        jLabel5.setBounds(80, 10, 250, 20);

        catégory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock" }));
        p1.add(catégory);
        catégory.setBounds(10, 70, 360, 30);
        p1.add(ihssane);
        ihssane.setBounds(20, 140, 180, 30);

        rechercher.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rechercher.setText("recherche ");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });
        p1.add(rechercher);
        rechercher.setBounds(220, 140, 131, 30);

        getContentPane().add(p1);
        p1.setBounds(40, 140, 380, 210);

        tableProduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProduitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduit);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 950, 640, 90);

        tableVent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "Prix de vente", "Stock sortire", "total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableVent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableVent);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 840, 640, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededonne/login_2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1830, 1070);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void AjouterVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterVenteActionPerformed
        if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")
            || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("")|| t8.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer vos donneé");
        } else if (t9.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
        } else {
            String[] colon1 = {"num_facture","code_produit", "reference", "prix_vente", "stock_sortie", "subtotal"};
            String[] isi = {t9.getText(), t1.getText(), t2.getText(), t7.getText(), t8.getText(), RPlabel.getText()};
            System.out.println(db.queryInsert("vente", colon1, isi));
            try {
                if (!test_stock()) {
                    JOptionPane.showMessageDialog(this, "le stock est Limiter");
                } else {
                    def(); //true
                    table(); //true
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
            importer();
            total();
            actualiser();
            p.showMessageDialog(null, tableVent ,"le résultat de recherche",JOptionPane.INFORMATION_MESSAGE);
           
            
            
        }
    }//GEN-LAST:event_AjouterVenteActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        if (ihssane.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP complete le champ de recherche");
        } else {
            if (catégory.getSelectedItem().equals("code_produit")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "code_produit LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("reference")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "reference LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("deseignation")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "deseignation LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("rangement")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "rangement LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("fournisseur")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "fournisseur LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("remise")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "remise LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("prix")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "prix LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));
            } else if (catégory.getSelectedItem().equals("stock")) {
                String colon[] = {"code_produit","reference","deseignation","rangement","fournisseur","remise","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "stock LIKE '" + ihssane.getText() + "' ");
                tableProduit.setModel(new tablemodel(rs));

            }
        }
    }//GEN-LAST:event_rechercherActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        String id = String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux supprimer ", "Attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION ) {
            db.queryDelete("vente", "id=" + id);
        } else {
            return;
        }
        importer();
        total();
        actualiser();
    }//GEN-LAST:event_SupprimerActionPerformed

    private void RechercherListVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherListVentActionPerformed
        importer();
        total();
        RPlabel.setText("0");
        p.showMessageDialog(null, tableVent ,"le résultat de recherche",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_RechercherListVentActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void tableProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProduitMouseClicked
     
        t1.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 1)));
        t2.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 2)));
        t3.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 4)));
        t4.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 5)));
        t6.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 6)));
        t5.setText(String.valueOf(tableProduit.getValueAt(tableProduit.getSelectedRow(), 7)));
        cout();
    }//GEN-LAST:event_tableProduitMouseClicked

    private void listeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeMouseClicked
        rs = db.querySelectAll("produit");
        tableProduit.setModel(new tablemodel(rs));
        p.showMessageDialog(null, tableProduit ,"le résultat de recherche",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_listeMouseClicked

    private void tableVentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVentMouseClicked
       t9.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),1)));
        t1.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),2)));
        t2.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),3)));
        t5.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),4)));
        t8.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),5)));
        RPlabel.setText(String.valueOf(tableVent.getValueAt(tableVent.getSelectedRow(),6)));
    }//GEN-LAST:event_tableVentMouseClicked

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyReleased
        subtotal();        // TODO add your handling code here:
    }//GEN-LAST:event_t8KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login l=new login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listventMouseClicked
        rs = db.querySelectAll("vente");
        tableVent.setModel(new tablemodel(rs));
        p.showMessageDialog(null, tableVent ,"le résultat de recherche",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_listventMouseClicked

    private void cacheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cacheKeyReleased
        payaprés();        // TODO add your handling code here:
    }//GEN-LAST:event_cacheKeyReleased

    private void imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimerActionPerformed
       recu n = new recu();
        n.setVisible(true);
        n.setBounds(300, 170, 700, 400);
        payaprés();
        actualiser();
    }//GEN-LAST:event_imprimerActionPerformed

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
        jam();
    }//GEN-LAST:event_p3MouseEntered

    
     public void cout() {
        double a = Double.parseDouble(t5.getText());
        double b = Double.parseDouble(t6.getText());
        double c = a - a * (b / 100);
        t7.setText(String.valueOf(c));
    }
     public void subtotal() {
        double a = Double.parseDouble(t7.getText());
        double b = Double.parseDouble(t8.getText());
        double c = a * b;
        RPlabel.setText(String.valueOf(c));}
     
      public void total() {
        rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_facture = '" + t9.getText() + "'");
        try {
            rs.next();
            RPlabel.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public boolean test_stock() throws SQLException {
        boolean teststock;
        
        rs = db.querySelectAll("produit","code_produit='" + t1.getText() + "'");
        while (rs.next()) {
             old = rs.getInt("stock");
        }
         dec = Integer.parseInt(t8.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;  
    }

    public void def() throws SQLException {
        rs = db.querySelectAll("produit", "code_produit='" + t1.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(t8.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "code_produit='" + t1.getText() + "'"));
    }
    
    public void payaprés() {
        double a = Integer.parseInt(RPlabel.getText());
        double b = Integer.parseInt(cache.getText());
        double c = b - a;
        payer.setText(Double.toString(c));
    }
    
    
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
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton AjouterVente;
    public static javax.swing.JLabel RPlabel;
    public static javax.swing.JButton RechercherListVent;
    public static javax.swing.JButton Supprimer;
    public static javax.swing.JTextField cache;
    public static javax.swing.JComboBox catégory;
    public static javax.swing.JTextField ihssane;
    private javax.swing.JButton imprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    private javax.swing.JLabel liste;
    private javax.swing.JLabel listvent;
    private javax.swing.JPanel p1;
    public static javax.swing.JPanel p3;
    public static javax.swing.JTextField payer;
    public static javax.swing.JButton rechercher;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    public static javax.swing.JTextField t5;
    public static javax.swing.JTextField t6;
    public static javax.swing.JTextField t7;
    public static javax.swing.JTextField t8;
    public static javax.swing.JTextField t9;
    public static javax.swing.JTable tableProduit;
    public static javax.swing.JTable tableVent;
    // End of variables declaration//GEN-END:variables
}
