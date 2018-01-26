package com.example.sangha.vieclamnhanh.JDBC;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by SangHa on 1/20/2018.
 */

@SuppressLint("NewApi")
public class JDBCModel {

    public Connection getConnectionOf() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection objConn = null;
        String sConnURL = null;
        Objects objEntity = new Objects("192.168.0.82", "haxuansang123", "anhsang1233", "ViecLamDaNang", "1433");
        try {
            Class.forName(objEntity.getsClass());
            sConnURL = "jdbc:jtds:sqlserver://"
                    + objEntity.getsServerName() + ":" + objEntity.getsPort() + ";"
                    + "databaseName=" + objEntity.getsDatabase()
                    + ";user=" + objEntity.getsUserID()
                    + ";password=" + objEntity.getsPwd() + ";";
            objConn = DriverManager.getConnection(sConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return objConn;
    }
}
