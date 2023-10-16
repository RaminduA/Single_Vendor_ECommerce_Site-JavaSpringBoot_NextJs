package com.martymart.repository;

import com.martymart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {
    @Query(value = "SELECT * FROM users WHERE user_id=:id LIMIT 1", nativeQuery = true)
    User getUser(@Param("id")String user_id);

    @Query(value = "INSERT INTO users VALUES (:#{#user.user_id}, :#{#user.role_id}, :#{#user.username}, :#{#user.password}, :#{#user.email})", nativeQuery = true)
    User saveUser(@Param("user")User user);

    @Query(value = "UPDATE users SET role_id=:#{#user.role_id}, username=:#{#user.username}, password=:#{#user.password}, email=:#{#user.email} WHERE user_id=:#{#user.user_id}", nativeQuery = true)
    User updateUser(@Param("user")User user);

    @Query(value = "DELETE FROM users WHERE user_id=:id", nativeQuery = true)
    User deleteUser(@Param("id")String user_id);

    @Query(value = "SELECT * FROM users WHERE username=:username AND password=:password LIMIT 1", nativeQuery = true)
    User getUserByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}
