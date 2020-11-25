
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sena Gül KORKMAZ
 */
public class hasta_kayit_giris extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    public hasta_kayit_giris() {
         initComponents();
         populateTable();
    }
    
    public void populateTable(){ // Tekrar kullanılabiirlik sağlaması için metod içine aldım.
         model=(DefaultTableModel)tablehastalar.getModel();
         model.setRowCount(0); //Kayıtları en baştan yazılmasını engellemek için.
        try {
            ArrayList<hasta> Hasta =getHasta();
            for(hasta hst: Hasta){
                Object [] row={hst.getId(),hst.getIsim(),hst.getSoyisim(),hst.getBolum(),hst.getSikayet()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            
        }
    }
    
    public ArrayList<hasta> getHasta() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet ;
        ArrayList<hasta> hasta = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from hasta");
            hasta = new ArrayList<hasta>();
            while (resultSet.next()) {
                hasta.add(new hasta(
                        resultSet.getInt("id"),
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("bolum"),
                        resultSet.getString("sikayet")
               ));
            }
        } catch(SQLException exception)  {
           DbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return hasta;
    }
    
                 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hasta_kayit_isim = new javax.swing.JLabel();
        lblisim = new javax.swing.JLabel();
        lblsoyisim = new javax.swing.JLabel();
        lblbolum = new javax.swing.JLabel();
        lblsikayet = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        txtsoyisim = new javax.swing.JTextField();
        txtsikayet = new javax.swing.JTextField();
        buttonkayit = new javax.swing.JButton();
        txtbolum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablehastalar = new javax.swing.JTable();
        lblsira = new javax.swing.JLabel();
        txtsira = new javax.swing.JTextField();
        lblarama = new javax.swing.JLabel();
        txtarama = new javax.swing.JTextField();
        buttonsilme = new javax.swing.JButton();
        uyarilbl = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblisim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblisim.setText("İSİM:");

        lblsoyisim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsoyisim.setText("SOYİSİM:");

        lblbolum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblbolum.setText("BÖLÜM:");

        lblsikayet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsikayet.setText("ŞİKAYET:");

        buttonkayit.setBackground(new java.awt.Color(204, 153, 255));
        buttonkayit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonkayit.setText("KAYIT OLUŞTUR");
        buttonkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkayitActionPerformed(evt);
            }
        });

        tablehastalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SIRA", "İSİM", "SOYİSİM", "BÖLÜM", "ŞİKAYET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tablehastalar);
        if (tablehastalar.getColumnModel().getColumnCount() > 0) {
            tablehastalar.getColumnModel().getColumn(0).setResizable(false);
            tablehastalar.getColumnModel().getColumn(1).setResizable(false);
            tablehastalar.getColumnModel().getColumn(2).setResizable(false);
            tablehastalar.getColumnModel().getColumn(3).setResizable(false);
            tablehastalar.getColumnModel().getColumn(4).setResizable(false);
        }

        lblsira.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsira.setText("SIRA:");

        lblarama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblarama.setText("ARAMA:");

        txtarama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaramaActionPerformed(evt);
            }
        });
        txtarama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtaramaKeyReleased(evt);
            }
        });

        buttonsilme.setBackground(new java.awt.Color(204, 153, 255));
        buttonsilme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonsilme.setText("KAYDİ SİL");
        buttonsilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblarama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtarama, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasta_kayit_isim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblsoyisim)
                                            .addComponent(lblbolum))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtbolum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblsikayet)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsikayet, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 33, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonkayit)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblisim)
                            .addComponent(lblsira))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtisim, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtsira))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonsilme)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(uyarilbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblbolum, lblisim, lblsikayet, lblsoyisim});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtisim, txtsikayet, txtsoyisim});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonsilme)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblisim)
                            .addComponent(txtisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hasta_kayit_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblarama)
                                .addComponent(txtarama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsira, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(lblsira))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uyarilbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoyisim)
                    .addComponent(txtsoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbolum)
                    .addComponent(txtbolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsikayet)
                    .addComponent(txtsikayet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonkayit)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkayitActionPerformed
        //KAYIT EKLEME İŞLEMİNİN YAPILDIĞI YER
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        PreparedStatement statement = null;
        try{
            connection = DbHelper.getConnection();
            String sql = "insert into hasta (id,isim,soyisim,bolum,sikayet) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(txtsira.getText()));
            statement.setString(2, txtisim.getText());
            statement.setString(3, txtsoyisim.getText());
            statement.setString(4, txtbolum.getText());
            statement.setString(5, txtsikayet.getText());
            int result = statement.executeUpdate();
            populateTable(); //Eklediklerimizin anında görünmesi için.
        }catch(SQLException exception){
            DbHelper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                
            }
        }
    }//GEN-LAST:event_buttonkayitActionPerformed

    private void txtaramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaramaActionPerformed

    private void txtaramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaramaKeyReleased
        //TABLODA ARAMA İŞlEMİNİN YAPILDIĞI KISIM
        String aramaKey=txtarama.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter= new TableRowSorter<DefaultTableModel>(model);
        tablehastalar.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(aramaKey));
    }//GEN-LAST:event_txtaramaKeyReleased

    private void buttonsilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsilmeActionPerformed
       //ŞEÇİLİ HASTANIN KAYDINI SİLME İŞLEMİ
        int row = tablehastalar.getSelectedRow();
        if (row != -1) { 
            model.removeRow(row);
        }else{
            uyarilbl.setText("Hasta Kaydı Yok!");
        }
    }//GEN-LAST:event_buttonsilmeActionPerformed

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
            java.util.logging.Logger.getLogger(hasta_kayit_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasta_kayit_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasta_kayit_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonkayit;
    private javax.swing.JButton buttonsilme;
    private javax.swing.JLabel hasta_kayit_isim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblarama;
    private javax.swing.JLabel lblbolum;
    private javax.swing.JLabel lblisim;
    private javax.swing.JLabel lblsikayet;
    private javax.swing.JLabel lblsira;
    private javax.swing.JLabel lblsoyisim;
    private javax.swing.JTable tablehastalar;
    private javax.swing.JTextField txtarama;
    private javax.swing.JTextField txtbolum;
    private javax.swing.JTextField txtisim;
    private javax.swing.JTextField txtsikayet;
    private javax.swing.JTextField txtsira;
    private javax.swing.JTextField txtsoyisim;
    private javax.swing.JLabel uyarilbl;
    // End of variables declaration//GEN-END:variables
}
