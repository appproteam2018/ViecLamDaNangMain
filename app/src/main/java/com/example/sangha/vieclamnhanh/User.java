package com.example.sangha.vieclamnhanh;

import java.util.Date;

/**
 * Created by SangHa on 1/20/2018.
 */

public class User {
    public int timejob,number;


    public String nameperson,namejob,details,address,salary,phone,email;

    public User(int timejob, String nameperson, String namejob, String details, String address, String salary, String phone, String email,int number) {
        this.timejob = timejob;
        this.nameperson = nameperson;
        this.namejob = namejob;
        this.details = details;
        this.address = address;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.number=number;

    }

    public int getTimejob() {
        return timejob;
    }

    public void setTimejob(int timejob) {
        this.timejob = timejob;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getNamejob() {
        return namejob;
    }

    public void setNamejob(String namejob) {
        this.namejob = namejob;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
