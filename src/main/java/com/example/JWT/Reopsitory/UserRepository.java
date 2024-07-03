package com.example.JWT.Reopsitory;

import com.example.JWT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<Object> findByEmail(String username);

}
