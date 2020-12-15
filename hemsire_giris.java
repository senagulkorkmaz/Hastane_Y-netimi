
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sena Gül KORKMAZ
 */
public class hemsire_giris extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public hemsire_giris() {
        initComponents();
        model = (DefaultTableModel) tableHemsire1.getModel();
        try {
            ArrayList<hemsire1> hemsire = getHemsire1();
            for (hemsire1 h : hemsire) {
                Object[] row = {h.getIsim(),
                    h.getSoyisim(),
                    h.getCalisacakDoktor(),
                    h.getCalisacakStajyer(),
                    h.getNobetGünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
        
         model = (DefaultTableModel) tableHemsire2.getModel();
        try {
            ArrayList<hemsire2> hemsire = getHemsire2();
            for (hemsire2 h : hemsire) {
                Object[] row = {h.getIsim(),
                    h.getSoyisim(),
                    h.getCalisacakDoktor(),
                    h.getCalisacakStajyer(),
                    h.getNobetGünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
        
         model = (DefaultTableModel) tableHemsire3.getModel();
        try {
            ArrayList<hemsire3> hemsire = getHemsire3();
            for (hemsire3 h1 : hemsire) {
                Object[] row = {h1.getIsim(),
                    h1.getSoyisim(),
                    h1.getCalisacakDoktor(),
                    h1.getCalisacakStajyer(),
                    h1.getNobetGünü()};
                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }
    
     public ArrayList<hemsire1> getHemsire1() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<hemsire1> Hemsire1 = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from hemsire1");
            Hemsire1 = new ArrayList<hemsire1>();
            while (resultSet.next()) {
                Hemsire1.add(new hemsire1(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakDoktor"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nobetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Hemsire1;
    }
     
     public ArrayList<hemsire2> getHemsire2() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<hemsire2> Hemsire2 = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from hemsire2");
            Hemsire2 = new ArrayList<hemsire2>();
            while (resultSet.next()) {
                Hemsire2.add(new hemsire2(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakDoktor"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nobetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Hemsire2;
    }
     public ArrayList<hemsire3> getHemsire3() throws SQLException {
        Connection connection = null;
        dbHelper DbHelper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<hemsire3> Hemsire3 = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from hemsire3");
            Hemsire3 = new ArrayList<hemsire3>();
            while (resultSet.next()) {
                Hemsire3.add(new hemsire3(
                        resultSet.getString("isim"),
                        resultSet.getString("soyisim"),
                        resultSet.getString("calisacakDoktor"),
                        resultSet.getString("calisacakStajyer"),
                        resultSet.getString("nobetGünü")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return Hemsire3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hemsire_isim = new javax.swing.JLabel();
        doktor_isim = new javax.swing.JLabel();
        stajyer_isim = new javax.swing.JLabel();
        nobet_gunu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHemsire3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHemsire2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableHemsire1 = new javax.swing.JTable();

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

        tableHemsire3.setBackground(new java.awt.Color(204, 153, 255));
        tableHemsire3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "calisacakDoktor", "calisacakStajyer", "nobetGünü"
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
        jScrollPane1.setViewportView(tableHemsire3);
        if (tableHemsire3.getColumnModel().getColumnCount() > 0) {
            tableHemsire3.getColumnModel().getColumn(0).setResizable(false);
            tableHemsire3.getColumnModel().getColumn(1).setResizable(false);
            tableHemsire3.getColumnModel().getColumn(2).setResizable(false);
            tableHemsire3.getColumnModel().getColumn(3).setResizable(false);
            tableHemsire3.getColumnModel().getColumn(4).setResizable(false);
        }

        tableHemsire2.setBackground(new java.awt.Color(204, 153, 255));
        tableHemsire2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "calisacakDoktor", "calisacakStajyer", "nobetGünü"
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
        jScrollPane2.setViewportView(tableHemsire2);
        if (tableHemsire2.getColumnModel().getColumnCount() > 0) {
            tableHemsire2.getColumnModel().getColumn(0).setResizable(false);
            tableHemsire2.getColumnModel().getColumn(1).setResizable(false);
            tableHemsire2.getColumnModel().getColumn(2).setResizable(false);
            tableHemsire2.getColumnModel().getColumn(3).setResizable(false);
            tableHemsire2.getColumnModel().getColumn(4).setResizable(false);
        }

        tableHemsire1.setBackground(new java.awt.Color(204, 153, 255));
        tableHemsire1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "isim", "soyisim", "calisacakDoktor", "calisacakStajyer", "nobetGünü"
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
        jScrollPane3.setViewportView(tableHemsire1);
        if (tableHemsire1.getColumnModel().getColumnCount() > 0) {
            tableHemsire1.getColumnModel().getColumn(0).setResizable(false);
            tableHemsire1.getColumnModel().getColumn(1).setResizable(false);
            tableHemsire1.getColumnModel().getColumn(2).setResizable(false);
            tableHemsire1.getColumnModel().getColumn(3).setResizable(false);
            tableHemsire1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hemsire_isim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nobet_gunu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(doktor_isim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stajyer_isim)))
                .addGap(708, 708, 708))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hemsire_isim)
                        .addGap(53, 53, 53)
                        .addComponent(doktor_isim))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stajyer_isim)
                        .addGap(44, 44, 44)
                        .addComponent(nobet_gunu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(hemsire_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hemsire_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hemsire_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hemsire_giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hemsire_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doktor_isim;
    private javax.swing.JLabel hemsire_isim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nobet_gunu;
    private javax.swing.JLabel stajyer_isim;
    private javax.swing.JTable tableHemsire1;
    private javax.swing.JTable tableHemsire2;
    private javax.swing.JTable tableHemsire3;
    // End of variables declaration//GEN-END:variables
}
