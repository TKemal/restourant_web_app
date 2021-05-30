package com.tihic.restourant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tihic.restourant.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
