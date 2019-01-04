package com.ceiba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@SuppressWarnings("unchecked" )
	User save(User user);
}
