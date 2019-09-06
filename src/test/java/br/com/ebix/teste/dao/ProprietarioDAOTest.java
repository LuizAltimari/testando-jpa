package br.com.ebix.teste.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.ebix.teste.domain.Proprietario;

public class ProprietarioDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EnderecoDAO daoE = new EnderecoDAO();
		Proprietario e = new Proprietario("Luiz Carlos Altimari", "11111111111", "111111111", daoE.select("20221310"));
		ProprietarioDAO dao = new ProprietarioDAO();
		dao.save(e);
	}

	@Test
	@Ignore
	public void listar() {
		ProprietarioDAO dao = new ProprietarioDAO();
		List<Proprietario> Proprietarios = dao.selectAll();
		System.out.println(Proprietarios.get(0));
	}

	@Test
	@Ignore
	public void buscar() {
		ProprietarioDAO dao = new ProprietarioDAO();
		Proprietario Proprietario = dao.select("11111111111");

		System.out.println(Proprietario);
	}

	@Test
	@Ignore
	public void excluir() {
		ProprietarioDAO dao = new ProprietarioDAO();

		dao.delete("11111111111");

		System.out.println(dao.selectAll());
	}
	
	@Test
	
	public void atualizar() {
		ProprietarioDAO dao = new ProprietarioDAO();
		Proprietario e = dao.select("11111111111");
		e.setNome("Luiz Altimari");
		dao.update(e);
	}
}
