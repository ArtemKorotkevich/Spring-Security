package com.example.securety.repo;

import com.example.securety.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String > {
}
