package com.publica.pont.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.publica.pont.modelo.PontModelo;

public interface PontRepositorio extends Repository<PontModelo, Integer>{
	
	//Cadastrar jogo
	void save(PontModelo produto);
	
	//Selecionar
	List<PontModelo> findAll();
	
	//Selecionar jogo especifico
	PontModelo findByJogos(Integer jogos);
	
	//Excluir jogo
	void delete(PontModelo produto);

}

