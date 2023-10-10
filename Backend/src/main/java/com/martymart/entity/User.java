package com.martymart.entity;

/*
Users Table:
- user_id (varchar, primary key)
- role_id (varchar, foreign key)
- username (varchar)
- password (varchar)
- email (varchar)
*/

public class User {
    private String user_id;
    private String role_id;
    private String username;
    private String password;
    private String email;

    public User() {
    }

    public User(String user_id, String role_id, String username, String password, String email) {
        this.user_id = user_id;
        this.role_id = role_id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String get_user_id() {
        return user_id;
    }

    public String get_role_id() {
        return role_id;
    }

    public String get_username() {
        return username;
    }

    public String get_password() {
        return password;
    }

    public String get_email() {
        return email;
    }

    public void set_user_id(String user_id) {
        this.user_id = user_id;
    }

    public void set_role_id(String role_id) {
        this.role_id = role_id;
    }

    public void set_username(String username) {
        this.username = username;
    }

    public void set_password(String password) {
        this.password = password;
    }

    public void set_email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", role_id=" + role_id + ", username=" + username + ", password=" + password + ", email=" + email + '}';
    }
}
