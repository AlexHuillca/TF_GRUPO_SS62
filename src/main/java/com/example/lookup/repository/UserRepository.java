package com.example.lookup.repository;
import com.example.lookup.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.Nombre_Usuario = :userName")
    User findByUserName(@Param("userName") String userName);
}
