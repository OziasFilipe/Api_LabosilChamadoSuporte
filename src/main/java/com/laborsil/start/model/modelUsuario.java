package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class modelUsuario {
	
	// usuario 
	// Id
	// NomeUsuario
	// senha
	// nome completo
	// permissao
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id; 
	
	@Column(name = "nome_usuario")
	private String nome_usuario;  // Usuario para logar 
	
	@Column(name = "senha")
	private String senha;     // Senha para logar 
	
	@Column(name = "nome_completo") // nome para identificar 
	private String nome_completo;
	
	@Column(name = "permissao")
	private String permissao; // Basico, medio, administrativo
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	
	
	
}
