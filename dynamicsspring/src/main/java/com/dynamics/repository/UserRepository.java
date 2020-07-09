package com.dynamics.repository;

import org.springframework.data.repository.CrudRepository;

import com.dynamics.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
