package com.dunka.userLoginDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.dunka.userLoginDemo.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
