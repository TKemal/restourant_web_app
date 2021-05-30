package com.tihic.restourant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tihic.restourant.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findUserByEmail(String email);       
    
}
