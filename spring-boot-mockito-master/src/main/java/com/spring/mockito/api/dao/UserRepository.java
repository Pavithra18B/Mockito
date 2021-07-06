package com.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.mockito.api.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}
