package com.martymart.repository;

import com.martymart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    @Query(value = "SELECT user_id FROM user ORDER BY user_id DESC LIMIT 1", nativeQuery = true)
    String getLastId();

    @Query(value = "SELECT * FROM user WHERE user_id=:id LIMIT 1", nativeQuery = true)
    User getUser(@Param("id")String user_id);

    @Modifying
    @Query(value = "INSERT INTO user (user_id, role, username, password, email) VALUES (:#{#user.user_id}, :#{#user.role}, :#{#user.username}, :#{#user.password}, :#{#user.email})", nativeQuery = true)
    void saveUser(@Param("user")User user);

    @Modifying
    @Query(value = "UPDATE user SET role=:#{#user.role}, username=:#{#user.username}, password=:#{#user.password}, email=:#{#user.email} WHERE user_id=:#{#user.user_id}", nativeQuery = true)
    void updateUser(@Param("user")User user);

    @Modifying
    @Query(value = "DELETE FROM user WHERE user_id=:id", nativeQuery = true)
    void deleteUser(@Param("id")String user_id);

    @Query(value = "SELECT * FROM user WHERE username=:username AND password=:password LIMIT 1", nativeQuery = true)
    User getUserByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = "SELECT COUNT(*)>0 FROM user WHERE user_id=:id", nativeQuery = true)
    Boolean isUserExists(@Param("id")String user_id);

    @Query(value = "SELECT COUNT(*)>0 FROM user WHERE username=:username AND password=:password", nativeQuery = true)
    Boolean isUserExists(@Param("username")String username, @Param("password")String password);
}
