package com.ivan.taskmanager.repository;

import com.ivan.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
