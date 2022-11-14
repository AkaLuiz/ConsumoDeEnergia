package com.energia.ConsumoEnergia.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.energia.ConsumoEnergia.entities.Usuario;

@Repository
public interface usuarioRepositorio extends CrudRepository<Usuario, Integer> {

	// listar usuarios
	List<Usuario> findAll();	
	
	// pesquisar por codigo
	Usuario findById(int id);
	
	// remover usuario
	void delete(Usuario usuario);
	
	// cadastrar/alterar usuario
	<Usu extends Usuario>Usu save(Usu usuario);

	String findAllById(int i);
	
	
	
}
