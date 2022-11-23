package com.idb.dao;

import com.idb.common.ICommonDAO;
import com.idb.model.Employee;
import com.swing.util.DBCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements ICommonDAO<Employee>{
    Connection con;

    public EmployeeDAO() {
        con = DBCon.getConnection();
    }
        
    @Override
    public int save(Employee employee) {
        int status = 0;
        
        String sql = "insert into employee (name, age, course, salary) values (?, ?, ?, ?)";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, employee.getName());
            psmt.setInt(2, employee.getAge());
            psmt.setString(3, employee.getCourse());
            psmt.setDouble(4, employee.getSalary());
            status = psmt.executeUpdate();
        } catch (SQLException ex) {
        }
        return status;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> empList = new ArrayList<Employee>();
        try {
            String sql = "select * from employee";
            PreparedStatement psmt = con.prepareStatement(sql); //statement
            ResultSet rs = psmt.executeQuery(); //resultset
            while (rs.next()) {                
                Employee e = new Employee();
                e.setName(rs.getString("name"));
                e.setAge(rs.getInt("age"));
                e.setCourse(rs.getString("course"));
                e.setSalary(rs.getDouble("salary"));
                empList.add(e);
            }
        } catch (Exception e) {
        }
        return empList;
    }
    
    
    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
