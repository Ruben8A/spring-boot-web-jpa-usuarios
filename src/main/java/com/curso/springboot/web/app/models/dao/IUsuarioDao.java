package com.curso.springboot.web.app.models.dao;

import java.util.List;

import com.curso.springboot.web.app.models.entity.Usuario;

public interface IUsuarioDao {
	List<Usuario> findAll();
}
