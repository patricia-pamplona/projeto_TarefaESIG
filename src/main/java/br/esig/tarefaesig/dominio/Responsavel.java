package br.esig.tarefaesig.dominio;

import java.util.Date;

public class Responsavel {
	private int id;
	private String nome;
	
	public Responsavel (int id, String nome) {
		this.id = id;
		this.nome= nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
