package com.reserve.bookzy.repository;

import com.reserve.bookzy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
