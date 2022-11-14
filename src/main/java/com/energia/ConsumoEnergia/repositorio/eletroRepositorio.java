package com.energia.ConsumoEnergia.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.energia.ConsumoEnergia.entities.Eletrodomestico;

@Repository
public interface eletroRepositorio extends CrudRepository<Eletrodomestico, Integer> {

	// listar produtos
	List<Eletrodomestico> findAll();	
	
	// pesquisar por codigo
	Eletrodomestico findById(int id);
	
	// remover usuario
	void delete(Eletrodomestico eletro);
	
	// cadastrar/alterar usuario
	<Eletro extends Eletrodomestico>Eletro save(Eletro eletro);
	
}