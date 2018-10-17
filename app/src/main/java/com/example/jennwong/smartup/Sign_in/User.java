package com.example.jennwong.smartup.Sign_in;

public class User {
    private String user_name;
    private String password;
    private String email;


    public User() {

    }

    public User(String user_name, String password, String email) {
        this.user_name = user_name;
        this.password = password;
        this.email = email;
    }



    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
