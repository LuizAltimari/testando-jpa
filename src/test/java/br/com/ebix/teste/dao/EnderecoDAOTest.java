package br.com.ebix.teste.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.ebix.teste.domain.Endereco;

public class EnderecoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Endereco e = new Endereco("Ladeira do Barroso", "Gamboa", "Rio de Janeiro", "RJ", "20221310", "Casa");
		EnderecoDAO dao = new EnderecoDAO();
		dao.save(e);
	}

	@Test
	@Ignore
	public void listar() {
		EnderecoDAO dao = new EnderecoDAO();
		List<Endereco> Enderecos = dao.selectAll();
		System.out.println(Enderecos.get(0));
	}

	@Test
	@Ignore
	public void buscar() {
		EnderecoDAO dao = new EnderecoDAO();
		Endereco Endereco = dao.select("20221310");

		System.out.println(Endereco);
	}

	@Test
	@Ignore
	public void excluir() {
		EnderecoDAO dao = new EnderecoDAO();

		dao.delete("20221310");

		System.out.println(dao.selectAll());
	}
	
	@Test
	
	public void atualizar() {
		EnderecoDAO dao = new EnderecoDAO();
		Endereco e = dao.select("20221310");
		e.setRua("Ladeira do Barroso, 183");
		dao.update(e);
	}
}
