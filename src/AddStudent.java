import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        try
        {


            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",Login.orclusername,"Kirthic2002");//your username and password
                String sql="select name , rollno ,department,section  from student order by rollno asc" ;
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1152, 720));
        setMinimumSize(new java.awt.Dimension(1152, 720));
        setPreferredSize(new java.awt.Dimension(1152, 720));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1552, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1552, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1552, 720));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("ADD STUDENT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 11, 280, 43);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("NAME");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 100, 100, 29);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 150, 273, 27);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(30, 250, 273, 27);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(30, 350, 273, 27);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("DEPARTMENT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 300, 180, 29);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("SECTION");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 400, 190, 29);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(30, 450, 273, 27);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("PASSWORD");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 500, 180, 29);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(30, 550, 273, 28);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 650, 116, 33);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1000, 650, 116, 33);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("ROLL NO / USERNAME");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 200, 270, 29);


        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(420, 95, 680, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("BACKGROUND.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1290, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here NAME:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here ROLLNO:
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here DEPARTMENT:
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here SECTION:
    }

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here PASSWORD:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here ADD:
        try
        {
            if(jTextField1.getText().length()==0||jTextField2.getText().length()==0 || jTextField3.getText().length()==0||jTextField4.getText().length()==0||jPasswordField1.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Please Fill up all the Fields!!");
            }
            else
            {
                System.out.println("begenning");
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",Login.orclusername,"Kirthic2002");//your username and password
                String sql="insert into student values('"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField2.getText()+"','"+jPasswordField1.getText()+"')";
                PreparedStatement ps=conn.prepareStatement(sql);
                ResultSet rs=ps.executeQuery();

                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Student Added Successfully!!");
                    dispose();
                    AdminHome adminHome=new AdminHome();
                    adminHome.setVisible(true);
                    sql = "insert into admin values('"+jTextField2.getText()+"','"+jPasswordField1.getText()+"','3')";
                    ps=conn.prepareStatement(sql);
                    rs=ps.executeQuery();
                    System.out.println("admin entry");

                    System.out.println("hii");
                    try
                    {
                        System.out.println("halo");
                        String sql1="select courseid from course";
                        PreparedStatement ps1 = conn.prepareStatement(sql1);
                        ResultSet rs1= ps1.executeQuery();

                        while(rs1.next())
                        {
                            System.out.println("innah");
                            String sql2="insert into attendance values ('"+jTextField2.getText()+"','"+rs1.getString("courseid")+"',0,0,0,0,0)";
                            PreparedStatement ps2=conn.prepareStatement(sql2);
                            ResultSet rs2=ps2.executeQuery();
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }


                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Invalid id!!!");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here BACK:
        dispose();
        AdminHome adminHome= new AdminHome();
        adminHome.setVisible(true);
    }



    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration
}