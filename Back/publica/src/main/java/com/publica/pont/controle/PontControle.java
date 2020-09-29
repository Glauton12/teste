package com.publica.pont.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.publica.pont.modelo.PontModelo;
import com.publica.pont.modelo.RespostaModelo;
import com.publica.pont.repositorio.PontRepositorio;

@CrossOrigin
@RestController
@RequestMapping("/pontuacao")
public class PontControle {
	
	//Obter acesso as ações
	@Autowired
	private PontRepositorio acoes;
	
	//Selecionar todos os jogos
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<PontModelo> listar(){
		return acoes.findAll();
	}
	
	//Cadastrar jogo
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody PontModelo jogos) {
		try {
			acoes.save(jogos);
			return new RespostaModelo("Pontuação cadastrada com sucesso!");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: "+erro.getMessage());
		}
	}
	
	//Selecionar jogo especifico
	@RequestMapping(value="/{jogos}", method = RequestMethod.GET)
	public @ResponseBody PontModelo buscar(@PathVariable("jogos")Integer cod) {
		return acoes.findByJogos(cod);
	}
	
	//Alterar dados do jogo
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody PontModelo jogos) {
		try {
			acoes.save(jogos);
			return new RespostaModelo("Pontuação alterada com sucesso!");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao alterar: "+erro.getMessage());
		}
	}
	
	//Excluir um jogo especifico
	@RequestMapping(value="/{jogos}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("jogos")Integer cod) {
		try {
			PontModelo produto = acoes.findByJogos(cod);
			
			acoes.delete(produto);
			return new RespostaModelo("Pontuação excluida com sucesso!");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao excluir: "+erro.getMessage());
		}
	}
	

}
