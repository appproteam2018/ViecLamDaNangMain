package com.example.sangha.vieclamnhanh.JDBC;

/**
 * Created by SangHa on 1/20/2018.
 */

public class Objects {
    private String sServerName;
    private String sUserID;
    private String sPwd;
    private String sDatabase;
    private String sClass;
    private String sPort;

    public Objects(String sServerName, String sUserID, String sPwd, String sDatabase, String sPort) {
        this.sServerName = sServerName;
        this.sUserID = sUserID;
        this.sPwd = sPwd;
        this.sDatabase = sDatabase;
        this.sClass = "net.sourceforge.jtds.jdbc.Driver";
        this.sPort = sPort;
    }

    public String getsServerName() {
        return sServerName;
    }

    public void setsServerName(String sServerName) {
        this.sServerName = sServerName;
    }

    public String getsUserID() {
        return sUserID;
    }

    public void setsUserID(String sUserID) {
        this.sUserID = sUserID;
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd;
    }

    public String getsDatabase() {
        return sDatabase;
    }

    public void setsDatabase(String sDatabase) {
        this.sDatabase = sDatabase;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getsPort() {
        return sPort;
    }

    public void setsPort(String sPort) {
        this.sPort = sPort;
    }
}
