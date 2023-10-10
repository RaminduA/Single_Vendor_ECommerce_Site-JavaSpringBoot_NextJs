package com.martymart.dto;

public class MessageDTO {
    private String message_id;
    private String sender_id;
    private String receiver_id;
    private String message;
    private String date;
    private String time;
    private boolean read;

    public MessageDTO() {
    }

    public MessageDTO(String message_id, String sender_id, String receiver_id, String message, String date, String time, boolean read) {
        this.message_id = message_id;
        this.sender_id = sender_id;
        this.receiver_id = receiver_id;
        this.message = message;
        this.date = date;
        this.time = time;
        this.read = read;
    }

    public String get_message_id() {
        return this.message_id;
    }

    public String get_sender_id() {
        return this.sender_id;
    }

    public String get_receiver_id() {
        return this.receiver_id;
    }

    public String get_message() {
        return this.message;
    }

    public String get_date() {
        return this.date;
    }

    public String get_time() {
        return this.time;
    }

    public boolean get_read() {
        return this.read;
    }

    public void set_message_id(String message_id) {
        this.message_id = message_id;
    }

    public void set_sender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public void set_receiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public void set_message(String message) {
        this.message = message;
    }

    public void set_date(String date) {
        this.date = date;
    }

    public void set_time(String time) {
        this.time = time;
    }

    public void set_read(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id='" + message_id + '\'' +
                ", sender_id='" + sender_id + '\'' +
                ", receiver_id='" + receiver_id + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", read=" + read +
                '}';
    }
}
