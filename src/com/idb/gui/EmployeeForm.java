/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.gui;

import com.idb.dao.EmployeeDAO;
import com.idb.model.Employee;
import com.swing.util.DBCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faculty-1
 */
public class EmployeeForm extends javax.swing.JFrame {

    EmployeeDAO employeeDAO;
    DefaultTableModel dtbl;

    /**
     * Creates new form EmployeeForm
     */
    public EmployeeForm() {
        initComponents();
        employeeDAO = new EmployeeDAO();
        List<String> cons = new ArrayList<>();
        cons.add("BD");
        cons.add("USA");
        cons.add("UK");
        cons.add("UAE");
        for (String con : cons) {
            comboCountry.addItem(con);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        btnSave = new javax.swing.JButton();
        createLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        empName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        empAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empCourse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        empSalary = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        getAll = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        ssc = new javax.swing.JCheckBox();
        hsc = new javax.swing.JCheckBox();
        bsc = new javax.swing.JCheckBox();
        msc = new javax.swing.JCheckBox();

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createLabel.setForeground(new java.awt.Color(51, 51, 255));
        createLabel.setText("Create Employee");

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Course");

        jLabel6.setText("Salary");

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(employeeTable);

        getAll.setText("Show");
        getAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        btnGender.add(btnMale);
        btnMale.setSelected(true);
        btnMale.setText("Male");

        btnGender.add(btnFemale);
        btnFemale.setText("Female");

        jLabel8.setText("Country");

        jLabel9.setText("Education");

        ssc.setText("SSC");

        hsc.setText("HSC");

        bsc.setText("BSC");

        msc.setText("MSC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(empAge, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(empCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ssc)
                                .addGap(18, 18, 18)
                                .addComponent(hsc)
                                .addGap(18, 18, 18)
                                .addComponent(bsc)
                                .addGap(18, 18, 18)
                                .addComponent(msc))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnMale)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getAll, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFemale, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getAll)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMale)
                    .addComponent(btnFemale))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssc)
                    .addComponent(hsc)
                    .addComponent(bsc)
                    .addComponent(msc))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        btnMale.setActionCommand("Male");
        btnFemale.setActionCommand("Female");
        btnGender.setSelected(null, rootPaneCheckingEnabled);
        String gender = btnGender.getSelection().getActionCommand();
        System.out.println(gender);
        
        String country = comboCountry.getSelectedItem().toString();
        System.out.println(country);
        
        if(ssc.isSelected()){
            System.out.println("ssc");
        }
        if(hsc.isSelected()){
            System.out.println("hsc");
        }
        if(bsc.isSelected()){
            System.out.println("bsc");
        }
        
        if(msc.isSelected()){
            System.out.println("msc");
        }
        
        Employee emp = new Employee();
        emp.setName(empName.getText());
        emp.setAge(Integer.valueOf(empAge.getText()));
        emp.setCourse(empCourse.getText());
        emp.setSalary(Double.valueOf(empSalary.getText()));

        int status = 0;//employeeDAO.save(emp);

        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Employee saved!");
            clearFields();
            String[] row = {emp.getName(), String.valueOf(emp.getAge()), emp.getCourse(), String.valueOf(emp.getSalary())};
            dtbl.addRow(row);
            //getAll();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Employee NOT saved!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void getAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllActionPerformed
        getAll();
    }//GEN-LAST:event_getAllActionPerformed
    private void getAll() {
        List<Employee> empList = employeeDAO.getAll();
        String[] columns = {"Name", "Age", "Course", "Salary"};
        String[][] rows = new String[empList.size()][columns.length];
        for (int i = 0; i < empList.size(); i++) {
            rows[i][0] = empList.get(i).getName();
            rows[i][1] = String.valueOf(empList.get(i).getAge());
            rows[i][2] = empList.get(i).getCourse();
            rows[i][3] = String.valueOf(empList.get(i).getSalary());
        }
        dtbl = new DefaultTableModel(rows, columns);
        employeeTable.setModel(dtbl);

    }

    private void clearFields() {
        empName.setText("");
        empAge.setText("");
        empCourse.setText("");
        empSalary.setText("");
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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bsc;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JLabel createLabel;
    private javax.swing.JTextField empAge;
    private javax.swing.JTextField empCourse;
    private javax.swing.JTextField empName;
    private javax.swing.JTextField empSalary;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton getAll;
    private javax.swing.JCheckBox hsc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox msc;
    private javax.swing.JCheckBox ssc;
    // End of variables declaration//GEN-END:variables
}
