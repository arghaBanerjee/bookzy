package com.reserve.bookzy.repository;

import com.reserve.bookzy.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
