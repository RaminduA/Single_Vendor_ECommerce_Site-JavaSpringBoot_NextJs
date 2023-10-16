package com.martymart.entity;

/*
Messages Table:
- message_id (varchar, primary key)
- sender_id (varchar, foreign key)
- receiver_id (varchar, foreign key)
- message (varchar)
- date (date)
- time (time)
- read (boolean)
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Message {
    @Id
    private String message_id;
    private String sender_id;
    private String receiver_id;
    private String message;
    private LocalDate message_date;
    private LocalTime message_time;
}
