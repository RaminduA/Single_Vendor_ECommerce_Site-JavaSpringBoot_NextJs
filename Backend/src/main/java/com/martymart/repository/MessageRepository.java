package com.martymart.repository;

import com.martymart.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, String> {
    @Query(value = "SELECT message_id FROM message ORDER BY message_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM message WHERE message_id=:id LIMIT 1", nativeQuery = true)
    Message getMessage(@Param("id")String message_id);

    @Modifying
    @Query(value = "INSERT INTO message (message_id, sender_id, receiver_id, message, message_date, message_time) VALUES (:#{#message.message_id}, :#{#message.sender_id}, :#{#message.receiver_id}, :#{#message.message}, :#{#message.message_date}, :#{#message.message_time})", nativeQuery = true)
    void saveMessage(@Param("message")Message message);

    @Modifying
    @Query(value = "UPDATE message SET sender_id=:#{#message.sender_id}, receiver_id=:#{#message.receiver_id}, message=:#{#message.message}, message_date=:#{#message.message_date}, message_time=:#{#message.message_time} WHERE message_id=:#{#message.message_id}", nativeQuery = true)
    void updateMessage(@Param("message")Message message);

    @Modifying
    @Query(value = "DELETE FROM message WHERE message_id=:id", nativeQuery = true)
    void deleteMessage(@Param("id")String message_id);

    @Query(value = "SELECT * FROM message WHERE sender_id=:id", nativeQuery = true)
    List<Message> getAllMessagesBySender(@Param("id")String sender_id);

    @Query(value = "SELECT * FROM message WHERE receiver_id=:id", nativeQuery = true)
    List<Message> getAllMessagesByReceiver(@Param("id")String receiver_id);
}
