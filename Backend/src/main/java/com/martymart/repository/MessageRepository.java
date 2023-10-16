package com.martymart.repository;

import com.martymart.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, String> {
    @Query(value = "SELECT * FROM message WHERE message_id=:id LIMIT 1", nativeQuery = true)
    Message getMessage(@Param("id")String message_id);

    @Query(value = "INSERT INTO message VALUES (:#{#message.message_id}, :#{#message.sender_id}, :#{#message.receiver_id}, :#{#message.message}, :#{#message.message_date}, :#{#message.message_time})", nativeQuery = true)
    void saveMessage(@Param("message")Message message);

    @Query(value = "UPDATE message SET sender_id=:#{#message.sender_id}, receiver_id=:#{#message.receiver_id}, message=:#{#message.message}, message_date=:#{#message.message_date}, message_time=:#{#message.message_time} WHERE message_id=:#{#message.message_id}", nativeQuery = true)
    void updateMessage(@Param("message")Message message);

    @Query(value = "DELETE FROM message WHERE message_id=:id", nativeQuery = true)
    void deleteMessage(@Param("id")String message_id);

    @Query(value = "SELECT * FROM message WHERE sender_id=:id", nativeQuery = true)
    Message getAllMessagesBySender(@Param("id")String sender_id);

    @Query(value = "SELECT * FROM message WHERE receiver_id=:id", nativeQuery = true)
    Message getAllMessagesByReceiver(@Param("id")String receiver_id);
}
