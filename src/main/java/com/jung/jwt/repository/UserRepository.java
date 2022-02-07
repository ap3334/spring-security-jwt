package com.jung.jwt.repository;

import com.jung.jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

}
