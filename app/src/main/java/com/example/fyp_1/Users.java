package com.example.fyp_1;

public class Users {
    String firstName , lstName, age, userName;

    public Users(){

    }

    public Users(String firstName, String lstName, String age, String userName) {
        this.firstName = firstName;
        this.lstName = lstName;
        this.age = age;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLstName() {
        return lstName;
    }

    public String getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
