package com.mohammad.certificatemanagementsystem.repository;

import com.mohammad.certificatemanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository <User, Long>{
}
