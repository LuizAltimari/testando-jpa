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
	public void listar() {
		MarcaDAO dao = new MarcaDAO();
		List<Marca> marcas = dao.selectAll();
		System.out.println(marcas.get(0));
	}
}
