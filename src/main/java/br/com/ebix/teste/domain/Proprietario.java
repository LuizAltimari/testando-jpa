package br.com.ebix.teste.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//1)Implemente uma classe Proprietário
@Entity
public class Proprietario {
	// 2)Declare os seguintes atributos na classe:
	@Column(length = 50, nullable = false)
	private String nome;
	@Id
	@Column(length = 11)
	private String cpf;
	@Column(length = 9)
	private String rg;
	@Temporal(TemporalType.DATE)
	private Date dataDeNascimento;
	// 10)Altere a classe Proprietário para que o atributo Endereço vire uma classe;	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;

	// 4)Os atributos nome, cpf e rg são obrigatórios (crie um construtor com esses
	// parâmetros)

	public Proprietario(String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		
	}
	
	public Proprietario() {
		
	}

	// 3)Faça o encapsulamento dos atributos da classe Proprietário

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataDeNascimento=" + dataDeNascimento
				+ ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}