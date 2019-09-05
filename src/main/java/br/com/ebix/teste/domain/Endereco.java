package br.com.ebix.teste.domain;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//10)Altere a classe Proprietário para que o atributo Endereço vire uma classe;
@Entity
public class Endereco {
	
	@Column(length = 30)
	private String rua;
	@Column(length = 30)
	private String bairro;
	@Column(length = 30)
	private String cidade;
	@Column(length = 30)
	private String estado;
	@Id
	@Column(length = 8)
	private String cep;
	@Column(length = 50)
	private String complemento;

	public Endereco() {
	}

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento,
			ArrayList<Proprietario> proprietarios) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep="
				+ cep + ", complemento=" + complemento + "]";
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}