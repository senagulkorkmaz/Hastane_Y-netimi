
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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
public class hasta_listesi extends javax.swing.JFrame {

    DefaultTableModel model;

    public hasta_listesi() {
        initComponents();
        model=(DefaultTableModel)tablehastalar.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hasta_sil = new javax.swing.JButton();
        uyarilbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablehastalar = new javax.swing.JTable();
        aramatxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HASTALAR");

        hasta_sil.setBackground(new java.awt.Color(204, 153, 255));
        hasta_sil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasta_sil.setText("HASTAYI SİL");
        hasta_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_silActionPerformed(evt);
            }
        });

        uyarilbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tablehastalar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SIRA", "İSİM", "SOYİSİM", "BÖLÜM", "ŞİKAYET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
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
        jScrollPane2.setViewportView(tablehastalar);
        if (tablehastalar.getColumnModel().getColumnCount() > 0) {
            tablehastalar.getColumnModel().getColumn(0).setResizable(false);
            tablehastalar.getColumnModel().getColumn(1).setResizable(false);
            tablehastalar.getColumnModel().getColumn(2).setResizable(false);
            tablehastalar.getColumnModel().getColumn(3).setResizable(false);
            tablehastalar.getColumnModel().getColumn(4).setResizable(false);
        }

        aramatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramatxtKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ARAMA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                                    .addComponent(uyarilbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(hasta_sil)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aramatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hasta_sil)
                    .addComponent(uyarilbl))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasta_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_silActionPerformed
        //ŞEÇİLİ HASTANIN KAYDINI SİLME İŞLEMİ
        int row = tablehastalar.getSelectedRow();
        if (row != -1) { 
            model.removeRow(row);
        }else{
            uyarilbl.setText("Hasta Kaydı Yok!");
        }


    }//GEN-LAST:event_hasta_silActionPerformed

    private void aramatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramatxtKeyReleased
       //TABLODA ARAMA İŞEMİNİN YAPILDIĞI KISIM
        String aramaKey=aramatxt.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter= new TableRowSorter<DefaultTableModel>(model);
        tablehastalar.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(aramaKey));
    }//GEN-LAST:event_aramatxtKeyReleased

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
            java.util.logging.Logger.getLogger(hasta_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasta_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasta_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasta_listesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasta_listesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aramatxt;
    private javax.swing.JButton hasta_sil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablehastalar;
    private javax.swing.JLabel uyarilbl;
    // End of variables declaration//GEN-END:variables
}
