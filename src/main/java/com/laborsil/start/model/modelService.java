package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Serviços")
public class modelService {
	
	//  id
    // setor
	// descrição do problema
	// andamento do chamado
	// Relatorio de todos os chamados
	// tipo de chamado 
	// prioridade do chamado
	// Protocolo
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome_usuario")
	private String nome_usuario;
	
	@Column(name = "setor") // 
	private String setor; 
	
	@Column(name = "desc_chamado")
	private String desc_chamado; //
	
	@Column(name = "andamento_chamado")
	private String andamento_chamado;
	
	@Column(name = "tipo_chamado")
	private String tipo_chamado; //DUVIDAS,SUPORTE
	
	@Column(name = "prioridade_chamado")
	private String prioridade_chamado;
	
	@Column(name = "protocolo_chamado")
	private Long protocolo_chamado;

	@Column(name = "data_chamado")
	private String data_chamado;
	
	@Column(name = "desc_resolucao")
	private String desc_resolucao;
	
	@Column(name = "fechamento_chamado")
	private String fechamento_chamado;
	
	public String getFechamento_chamado() {
		return fechamento_chamado;
	}

	public void setFechamento_chamado(String fechamento_chamado) {
		this.fechamento_chamado = fechamento_chamado;
	}

	public String getDesc_resolucao() {
		return desc_resolucao;
	}

	public void setDesc_resolucao(String desc_resolucao) {
		this.desc_resolucao = desc_resolucao;
	}

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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDesc_chamado() {
		return desc_chamado;
	}

	public void setDesc_chamado(String desc_chamado) {
		this.desc_chamado = desc_chamado;
	}

	public String getAndamento_chamado() {
		return andamento_chamado;
	}

	public void setAndamento_chamado(String andamento_chamado) {
		this.andamento_chamado = andamento_chamado;
	}

	public String getTipo_chamado() {
		return tipo_chamado;
	}

	public void setTipo_chamado(String tipo_chamado) {
		this.tipo_chamado = tipo_chamado;
	}

	public String getPrioridade_chamado() {
		return prioridade_chamado;
	}

	public void setPrioridade_chamado(String prioridade_chamado) {
		this.prioridade_chamado = prioridade_chamado;
	}

	public Long getProtocolo_chamado() {
		return protocolo_chamado;
	}

	public void setProtocolo_chamado(Long protocolo_chamado) {
		this.protocolo_chamado = protocolo_chamado;
	}

	public String getData_chamado() {
		return data_chamado;
	}

	public void setData_chamado(String data_chamado) {
		this.data_chamado = data_chamado;
	}
	
	
}
