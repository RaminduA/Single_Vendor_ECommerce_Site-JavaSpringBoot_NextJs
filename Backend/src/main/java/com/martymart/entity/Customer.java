package com.martymart.entity;

/*
Customers Table:
- customer_id (varchar, primary key)
- first_name (varchar)
- last_name (varchar)
- email (varchar)
- phone_number (varchar)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
}
