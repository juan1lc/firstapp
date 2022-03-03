package com.bstest.newsbs.repository;

import com.bstest.newsbs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    User getByUsername(String username);
}
