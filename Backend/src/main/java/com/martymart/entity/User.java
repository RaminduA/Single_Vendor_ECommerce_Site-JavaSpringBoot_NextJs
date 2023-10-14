package com.martymart.entity;

/*
Users Table:
- user_id (varchar, primary key)
- role_id (varchar, foreign key)
- username (varchar)
- password (varchar)
- email (varchar)
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
public class User {
    @Id
    private String user_id;
    private String role_id;
    private String username;
    private String password;
    private String email;
}
