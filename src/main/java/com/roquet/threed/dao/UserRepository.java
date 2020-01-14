package com.roquet.threed.dao;

import com.roquet.threed.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String s);
}
