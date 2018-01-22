package com.example.sangha.vieclamnhanh.JDBC;

import com.example.sangha.vieclamnhanh.JDBC.JDBCController;
import com.example.sangha.vieclamnhanh.User;


import junit.framework.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by SangHa on 1/20/2018.
 */

public class UserModel {
    private JDBCController jdbcController = new JDBCController();
    public Connection connection;

    public UserModel() { connection = jdbcController.ConnectionData();
    } // Tạo kết nối tới database

    public boolean Insert(User infor) throws SQLException
    {
        Statement statement = connection.createStatement();
        String sql = "insert into dang(timejob,nameperson,namejob,details,address,salary,phone,email) values ("+infor.getTimejob()+",N'"+infor.getNameperson()+"',N'"+infor.getNamejob()+"',N'"+infor.getDetails()+"',N'"+infor.getAddress()+"',N'"+infor.getSalary()+"',N'"+infor.getPhone()+"',N'"+infor.getEmail()+"')";
        if (statement.executeUpdate(sql) > 0) {
            connection.close();
            return true;
        } else {
            connection.close();
            return false;
        }
    }
}
