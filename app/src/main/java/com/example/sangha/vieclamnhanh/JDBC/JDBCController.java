package com.example.sangha.vieclamnhanh.JDBC;

import com.example.sangha.vieclamnhanh.JDBC.JDBCModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by SangHa on 1/20/2018.
 */

public class JDBCController {
    JDBCModel jdbcModel = new JDBCModel();

    public Connection ConnectionData()
    {
        return jdbcModel.getConnectionOf();
    }

}
