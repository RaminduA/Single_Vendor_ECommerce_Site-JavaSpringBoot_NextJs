package com.martymart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MessageDTO {
    private String message_id;
    private String sender_id;
    private String receiver_id;
    private String message;
    private LocalDate message_date;
    private LocalTime message_time;
}
