
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bran
 */
public class SERVICE extends javax.swing.JFrame {
    private Object dateChooser;
    private Object JoptionPane;

    /**
     * Creates new form SERVICE
     */
    public SERVICE() {
        initComponents();
    }
    private static java.sql.Date getCurrentDate() {
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        serviceId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        service = new javax.swing.JTable();
        back = new javax.swing.JButton();
        display = new javax.swing.JButton();
        collectionDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        problem = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        solution = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        customerId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SERVICE INFORMATION");

        jLabel2.setText("SERVICE ID");

        jLabel3.setText("PROBLEM");

        jLabel4.setText("SOLUTION");

        jLabel5.setText("COLLECTION DATE");

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        serviceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceIdActionPerformed(evt);
            }
        });

        service.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERVICE ID", "CUSTOMER ID", "PROBLEM", "SOLUTION", "GIVEN DATE", "COLLECTION DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(service);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        display.setText("DISPLAY");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        problem.setColumns(20);
        problem.setRows(5);
        jScrollPane2.setViewportView(problem);

        solution.setColumns(20);
        solution.setRows(5);
        jScrollPane3.setViewportView(solution);

        jLabel6.setText("CUSTOMER ID");

        customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(back)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(serviceId, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(collectionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(display)
                        .addGap(364, 364, 364))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collectionDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display)
                    .addComponent(back))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        String sid = serviceId.getText();
        String solu = solution.getText();
        try {
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mini_project","Dhanush@1234");
            PreparedStatement st1 =c.prepareStatement("insert into service values('"+sid+"','"+solu+"')");
            String sql = "insert into customer_gives_for_service values(?,?,?,?,?)";
            PreparedStatement st2 =c.prepareStatement(sql);
            st1.executeQuery();
            
            st2.setString(1, customerId.getText());
            st2.setString(2, serviceId.getText());
            st2.setString(3, problem.getText());
            st2.setDate(4, getCurrentDate());
            st2.setDate(5,new java.sql.Date(collectionDate.getDate().getTime()));
            st2.execute();
            st2.close();
            
            PreparedStatement s1 = c.prepareStatement("select cgs.sid,cgs.cid,cgs.cproblem,s.sdetails,cgs.given_date,cgs.collection_date from service s,customer_gives_for_service cgs where  s.sid=cgs.sid order by cgs.sid,cgs.cid");
            ResultSet rs = s1.executeQuery();
            service.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            try {
                Connection c;
                c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mini_project","Dhanush@1234");
                PreparedStatement st1 =c.prepareStatement("delete from service where sid='"+sid+"'");
                st1.executeQuery();
            } catch (SQLException ex1) {
                Logger.getLogger(SERVICE.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            Logger.getLogger(SERVICE.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
        customerId.setText(null);
        serviceId.setText(null);
        problem.setText(null);
        solution.setText(null);
        collectionDate.setDate(null);
        
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String sid = serviceId.getText();
        String solu = solution.getText();
        String cid = customerId.getText();
        String prob = problem.getText();
        
        
        
       try {
           
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mini_project","Dhanush@1234");
            PreparedStatement st1 =c.prepareStatement("update service set sdetails='"+solu+"' where sid='"+sid+"'");
           //String sql = ",collection_date=? where cid='"+cid+"' and sid='"+sid+"'";
            PreparedStatement st2 =c.prepareStatement("update customer_gives_for_service set cproblem='"+prob+"' where cid='"+cid+"' and sid='"+sid+"'");
            st1.executeQuery();
            st2.executeQuery();
            
            
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            String dateString = dateFormat.format(collectionDate.getDate());
            System.out.println();
            System.out.println(dateString);
            
            PreparedStatement st3 =c.prepareStatement("update customer_gives_for_service set collection_date='"+dateString+"' where cid='"+cid+"' and sid='"+sid+"'");
            st3.executeQuery();
            
            //st2.setString(1, problem.getText());
           // st2.setDate(2,new java.sql.Date(collectionDate.getDate().getTime()));
            PreparedStatement s1 = c.prepareStatement("select cgs.sid,cgs.cid,cgs.cproblem,s.sdetails,cgs.given_date,cgs.collection_date from service s,customer_gives_for_service cgs where  s.sid=cgs.sid order by cgs.sid,cgs.cid");
            ResultSet rs = s1.executeQuery();
            service.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException ex) {
            Logger.getLogger(SERVICE.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
        }
        customerId.setText(null);
        serviceId.setText(null);
        problem.setText(null);
        solution.setText(null);
        collectionDate.setDate(null);
    }//GEN-LAST:event_updateActionPerformed

    private void serviceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceIdActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        HOME h = new HOME();
        h.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            String sid=serviceId.getText();
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mini_project","Dhanush@1234");
            PreparedStatement st1 =c.prepareStatement("delete from service where sid='"+sid+"'");
            st1.executeQuery();
            
            
            PreparedStatement s1 = c.prepareStatement("select cgs.sid,cgs.cid,cgs.cproblem,s.sdetails,cgs.given_date,cgs.collection_date from service s,customer_gives_for_service cgs where  s.sid=cgs.sid order by cgs.sid,cgs.cid");
            ResultSet rs = s1.executeQuery();
            service.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
            Logger.getLogger(SERVICE.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);
        }
         customerId.setText(null);
        serviceId.setText(null);
        problem.setText(null);
        solution.setText(null);
        collectionDate.setDate(null);
    }//GEN-LAST:event_deleteActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        try{
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mini_project","Dhanush@1234");
            PreparedStatement s1 = c.prepareStatement("select cgs.sid,cgs.cid,cgs.cproblem,s.sdetails,cgs.given_date,cgs.collection_date from service s,customer_gives_for_service cgs where  s.sid=cgs.sid order by cgs.sid,cgs.cid");
            ResultSet rs = s1.executeQuery();
            service.setModel(DbUtils.resultSetToTableModel(rs));
             
        }
        catch (SQLException ex) {
            Logger.getLogger(SERVICE.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_displayActionPerformed

    private void customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdActionPerformed

    private void serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceMouseClicked
        DefaultTableModel model = (DefaultTableModel)service.getModel();
        int row = service.getSelectedRow();
        serviceId.setText(model.getValueAt(row, 0).toString());
        customerId.setText(model.getValueAt(row, 1).toString());
        problem.setText(model.getValueAt(row, 2).toString());
        solution.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_serviceMouseClicked

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
            java.util.logging.Logger.getLogger(SERVICE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVICE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVICE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVICE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SERVICE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private com.toedter.calendar.JDateChooser collectionDate;
    private javax.swing.JTextField customerId;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea problem;
    private javax.swing.JTable service;
    private javax.swing.JTextField serviceId;
    private javax.swing.JTextArea solution;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private String toDate(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
