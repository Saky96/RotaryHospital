package com.example.jain.rotaryhospital;

/**
 * Created by $aK&HaM on 05-08-2017.
 */

public class RegistrationDetails {
    String userName;
    String fatherName;
    String email;
    String password;
    String address;
    double phoneNo;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

   /* public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

}
