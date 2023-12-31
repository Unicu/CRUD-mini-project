package com.example.crudspringminiproject.repository;

import com.example.crudspringminiproject.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public Long countById(Integer id);
}
