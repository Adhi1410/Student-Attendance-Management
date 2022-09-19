import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddCourse extends javax.swing.JFrame {

        /**
         * Creates new form AddCourse
         */
        public AddCourse() {
                initComponents();
                try
                {


                        {
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",Login.orclusername,"Kirthic2002");//your username and password
                                String sql="select * from course order by courseid";
                                PreparedStatement ps=conn.prepareStatement(sql);
                                ResultSet rs=ps.executeQuery();
                                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                        }
                }
                catch (Exception e)
                {
                        System.out.println(e);
                }
        }


        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                setMaximumSize(new java.awt.Dimension(1152, 740));
                setMinimumSize(new java.awt.Dimension(1152, 740));
                //setUndecorated(true);
                setPreferredSize(new java.awt.Dimension(1152, 740));
                //setResizable(false);

                jPanel1.setForeground(new java.awt.Color(255, 255, 255));
                jPanel1.setMaximumSize(new java.awt.Dimension(1152, 720));
                jPanel1.setMinimumSize(new java.awt.Dimension(1152, 720));
                jPanel1.setPreferredSize(new java.awt.Dimension(1152, 720));
                jPanel1.setLayout(null);

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel1.setText("ADD COURSE");
                jPanel1.add(jLabel1);
                jLabel1.setBounds(30, 11, 950, 43);

                jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                jLabel3.setText("COURSE ID");
                jPanel1.add(jLabel3);
                jLabel3.setBounds(30, 200, 130, 29);

                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });
                jPanel1.add(jTextField2);
                jTextField2.setBounds(30, 250, 273, 24);

                jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                jLabel4.setText("COURSE NAME");
                jPanel1.add(jLabel4);
                jLabel4.setBounds(30, 100, 180, 29);

                jTextField3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField3ActionPerformed(evt);
                        }
                });
                jPanel1.add(jTextField3);
                jTextField3.setBounds(30, 150, 273, 26);

                jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                jButton1.setText("ADD");
                jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                jPanel1.add(jButton1);
                jButton1.setBounds(968, 650, 116, 33);

                jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
                jButton2.setText("BACK");
                jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                jPanel1.add(jButton2);
                jButton2.setBounds(30, 650, 80, 33);


                jScrollPane1.setViewportView(jTable1);
                if (jTable1.getColumnModel().getColumnCount() > 0) {
                        jTable1.getColumnModel().getColumn(0).setResizable(false);
                        jTable1.getColumnModel().getColumn(1).setResizable(false);
                }

                jPanel1.add(jScrollPane1);
                jScrollPane1.setBounds(360, 95, 740, 500);

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("BACKGROUND.jpg"))); // NOI18N
                jPanel1.add(jLabel2);
                jLabel2.setBounds(0, 0, 1152, 720);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here COURSE NAME:
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here COURSE ID:
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here ADD:
                try
                {
                        if(jTextField2.getText().length()==0 || jTextField3.getText().length()==0)
                        {
                                JOptionPane.showMessageDialog(null,"Please Fill up all the Fields!!");
                        }
                        else
                        {
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",Login.orclusername,"Kirthic2002");//your username and password
                                String sql="insert into course values('"+jTextField3.getText()+"','"+jTextField2.getText()+"')";
                                PreparedStatement ps=conn.prepareStatement(sql);
                                ResultSet rs=ps.executeQuery();
                                if(rs.next())
                                {
                                        JOptionPane.showMessageDialog(null,"Course Added Successfully!!");
                                        dispose();
                                        AdminHome adminHome=new AdminHome();
                                        adminHome.setVisible(true);
                                        String sql1="select rollno from student";
                                        PreparedStatement ps1 = conn.prepareStatement(sql1);
                                        ResultSet rs1= ps1.executeQuery();
                                        while (rs1.next()) {
                                                String sql2 = "insert into attendance values ('" +rs1.getString("rollno")  + "','" + jTextField2.getText() + "',0,0,0,0,0)";
                                                PreparedStatement ps2 = conn.prepareStatement(sql2);
                                                ResultSet rs2 = ps2.executeQuery();
                                        }
                                }
                        }
                }
                catch (Exception e)
                {
                        System.out.println(e.getStackTrace());
                }
        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here BACK:
                dispose();
                AdminHome adminhome = new AdminHome();
                adminhome.setVisible(true);
        }



        // Variables declaration - do not modify
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration
}