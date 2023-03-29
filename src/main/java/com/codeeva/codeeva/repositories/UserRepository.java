package com.codeeva.codeeva.repositories;

import com.codeeva.codeeva.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
