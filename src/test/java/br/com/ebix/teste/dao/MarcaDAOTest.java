package br.com.ebix.teste.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.ebix.teste.domain.Marca;

public class MarcaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Marca m = new Marca("Ferrari", 100, 2019);
		MarcaDAO dao = new MarcaDAO();
		dao.save(m);
	}

	@Test
	@Ignore
	public void listar() {
		MarcaDAO dao = new MarcaDAO();
		List<Marca> marcas = dao.selectAll();
		System.out.println(marcas.get(0));
	}

	@Test
	@Ignore
	public void buscar() {
		MarcaDAO dao = new MarcaDAO();
		Marca marca = dao.select(1);

		System.out.println(marca);
	}

	@Test
	@Ignore
	public void excluir() {
		MarcaDAO dao = new MarcaDAO();

		dao.delete(1);

		System.out.println(dao.selectAll());
	}
	
	@Test
	public void atualizar() {
		MarcaDAO dao = new MarcaDAO();
		Marca m = dao.select(2);
		m.setNome("Mercedes");
		dao.update(m);
	}
}
