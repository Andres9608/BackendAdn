package com.ceiba.demo.service;

import java.util.List;

import com.ceiba.demo.model.User;

public interface UserService {

//	Guardar usuario
	User save(User user);

//	Listar todos los usuarios
	List<User> findAll();

//	Eliminar usuario por id
	void deleteUser(Long id);


}
