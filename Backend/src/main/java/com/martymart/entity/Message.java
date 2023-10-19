package com.martymart.entity;

/*
Messages Table:
- message_id (varchar, primary key)
- sender_id (varchar, foreign key)
- receiver_id (varchar, foreign key)
- message (varchar)
- message_date (date)
- message_time (time)
*/

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Message {
    @Id
    @Column(length = 12)
    private String message_id;
    @Column(nullable = false, length = 8)
    private String sender_id;
    @Column(nullable = false, length = 8)
    private String receiver_id;
    @Column(nullable = false)
    private String message;
    private LocalDate message_date;
    private LocalTime message_time;
}
