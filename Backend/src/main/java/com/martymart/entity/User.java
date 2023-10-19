package com.martymart.entity;

/*
Users Table:
- user_id (varchar, primary key)
- role (varchar)
- username (varchar)
- password (varchar)
- email (varchar)
*/

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class User {
    @Id
    @Column(length = 10)
    private String user_id;
    @Column(nullable = false, length = 10)
    private String role;
    @Column(nullable = false, length = 30)
    private String username;
    @Column(nullable = false, length = 30)
    private String password;
    @Column(length = 40)
    private String email;
}
