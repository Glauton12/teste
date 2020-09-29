package com.publica.pont.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Criação da tabela no DB
@Table(name="pontuacao")
@Entity
public class PontModelo {
	
	//Criação das colunas no DB
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="jogos")
	private int jogos;
	
	@Column(name="placar")
	private int placar;
	
	@Column(name="minT")
	private int minT;
	
	@Column(name="maxT")
	private int maxT;
	
	@Column(name="quebraMin")
	private int quebraMin;
	
	@Column(name="quebraMax")
	private int quebraMax;

	//GET AND SET
	public int getJogos() {
		return jogos;
	}

	public void setJogos(int jogos) {
		this.jogos = jogos;
	}

	public int getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

	public int getMinT() {
		return minT;
	}

	public void setMinT(int minT) {
		this.minT = minT;
	}

	public int getMaxT() {
		return maxT;
	}

	public void setMaxT(int maxT) {
		this.maxT = maxT;
	}

	public int getQuebraMin() {
		return quebraMin;
	}

	public void setQuebraMin(int quebraMin) {
		this.quebraMin = quebraMin;
	}

	public int getQuebraMax() {
		return quebraMax;
	}

	public void setQuebraMax(int quebraMax) {
		this.quebraMax = quebraMax;
	}



	
	
}


