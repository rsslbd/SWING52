package com.idb.dao;

import com.idb.common.ICommonDAO;
import com.idb.model.Employee;
import com.swing.util.DBCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO implements ICommonDAO<Employee>{

    @Override
    public int save(Employee employee) {
        int status = 0;
        Connection con = DBCon.getConnection();
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
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
