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
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

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
    private String date;
    private String time;
    private boolean read;
}
