package com.martymart.entity;

/*
Customers Table:
- customer_id (varchar, primary key)
- first_name (varchar)
- last_name (varchar)
- email (varchar)
- phone_number (varchar)
*/

public class Customer {
    private String customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;

    public Customer() {
    }

    public Customer(String customer_id, String first_name, String last_name, String email, String phone_number) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public String get_customer_id() {
        return customer_id;
    }

    public String get_first_name() {
        return first_name;
    }

    public String get_last_name() {
        return last_name;
    }

    public String get_email() {
        return email;
    }

    public String get_phone_number() {
        return phone_number;
    }

    public void set_customer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void set_first_name(String first_name) {
        this.first_name = first_name;
    }

    public void set_last_name(String last_name) {
        this.last_name = last_name;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public void set_phone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", phone_number=" + phone_number + '}';
    }
}
