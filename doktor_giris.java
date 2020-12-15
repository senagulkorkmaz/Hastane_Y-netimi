
import java.util.ArrayList;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class doktor_giris extends javax.swing.JFrame {

    DefaultTableModel model;

    public doktor_giris() {
        initComponents();
        model = (DefaultTableModel) tableDoktor1.getModel();
        try {
            ArrayList<doktor> doktorr = getDoktor();
            for (doktor d : doktorr) {
                Object[] row = {d.getIsim(),
                    d.getSoyisim(),
                    d.getCalisacakHemsire(),
                    d.getCalisacakStajyer(),
                    d.getNobetgünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }

        model = (DefaultTableModel) tableDoktor2.getModel();
        try {
            ArrayList<doktor1> doktorr1 = getDoktor1();
            for (doktor1 d : doktorr1) {
                Object[] row = {d.getIsim(),
                    d.getSoyisim(),
                    d.getCalisacakHemsire(),
                    d.getCalisacakStajyer(),
                    d.getNobetgünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }

        model = (DefaultTableModel) tableDoktor3.getModel();
        try {
            ArrayList<doktor2> doktorr2 = getDoktor2();
            for (doktor2 d : doktorr2) {
                Object[] row = {d.getIsim(),
                    d.getSoyisim(),
                    d.getCalisacakHemsire(),
                    d.getCalisacakStajyer(),
                    d.getNobetgünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }

    }

    public ArrayList<doktor> getDoktor() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<doktor> Doktor = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from doktor1");
            Doktor = new ArrayList<doktor>();
            while (resultSet.next()) {
                Doktor.add(new doktor(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakHemsire"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nöbetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Doktor;
    }

    public ArrayList<doktor1> getDoktor1() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<doktor1> Doktor1 = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from doktor2");
            Doktor1 = new ArrayList<doktor1>();
            while (resultSet.next()) {
                Doktor1.add(new doktor1(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakHemsire"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nöbetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Doktor1;
    }

    public ArrayList<doktor2> getDoktor2() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<doktor2> Doktor2 = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from doktor3");
            Doktor2 = new ArrayList<doktor2>();
            while (resultSet.next()) {
                Doktor2.add(new doktor2(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakHemsire"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nöbetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Doktor2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hastalar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDoktor1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableDoktor3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDoktor2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hastalar.setBackground(new java.awt.Color(204, 153, 255));
        hastalar.setText("HASTALAR");
        hastalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastalarActionPerformed(evt);
            }
        });

        tableDoktor1.setBackground(new java.awt.Color(204, 153, 255));
        tableDoktor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "caisacakHemsire", "caisacakStajyer", "nöbetGünü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane3.setViewportView(tableDoktor1);
        if (tableDoktor1.getColumnModel().getColumnCount() > 0) {
            tableDoktor1.getColumnModel().getColumn(0).setResizable(false);
            tableDoktor1.getColumnModel().getColumn(1).setResizable(false);
            tableDoktor1.getColumnModel().getColumn(2).setResizable(false);
            tableDoktor1.getColumnModel().getColumn(3).setResizable(false);
            tableDoktor1.getColumnModel().getColumn(4).setResizable(false);
        }

        tableDoktor3.setBackground(new java.awt.Color(204, 153, 255));
        tableDoktor3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "caisacakHemsire", "caisacakStajyer", "nöbetGünü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane4.setViewportView(tableDoktor3);
        if (tableDoktor3.getColumnModel().getColumnCount() > 0) {
            tableDoktor3.getColumnModel().getColumn(0).setResizable(false);
            tableDoktor3.getColumnModel().getColumn(1).setResizable(false);
            tableDoktor3.getColumnModel().getColumn(2).setResizable(false);
            tableDoktor3.getColumnModel().getColumn(3).setResizable(false);
            tableDoktor3.getColumnModel().getColumn(4).setResizable(false);
        }

        tableDoktor2.setBackground(new java.awt.Color(255, 153, 153));
        tableDoktor2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "caisacakHemsire", "caisacakStajyer", "nöbetGünü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane5.setViewportView(tableDoktor2);
        if (tableDoktor2.getColumnModel().getColumnCount() > 0) {
            tableDoktor2.getColumnModel().getColumn(0).setResizable(false);
            tableDoktor2.getColumnModel().getColumn(1).setResizable(false);
            tableDoktor2.getColumnModel().getColumn(2).setResizable(false);
            tableDoktor2.getColumnModel().getColumn(3).setResizable(false);
            tableDoktor2.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(653, Short.MAX_VALUE)
                .addComponent(hastalar)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(hastalar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hastalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastalarActionPerformed
        // TODO add your handling code here:
        hasta_listesi h1 = new hasta_listesi();
        h1.setVisible(true);
    }//GEN-LAST:event_hastalarActionPerformed

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
            java.util.logging.Logger.getLogger(doktor_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doktor_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doktor_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doktor_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doktor_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hastalar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableDoktor1;
    private javax.swing.JTable tableDoktor2;
    private javax.swing.JTable tableDoktor3;
    // End of variables declaration//GEN-END:variables

    private String getRandomElement(ArrayList<String> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
