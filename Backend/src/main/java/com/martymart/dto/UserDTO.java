package com.martymart.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String user_id;
    private String role;
    private String username;
    private String password;
    private String email;
}
