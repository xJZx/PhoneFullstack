package com.example.phonefullstack.repository;

import com.example.phonefullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    finding username by his email, needed for logging in
    User findByEmail(String email);
}
