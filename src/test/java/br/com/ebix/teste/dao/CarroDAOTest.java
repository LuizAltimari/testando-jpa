package br.com.ebix.teste.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import br.com.ebix.teste.domain.Carro;

public class CarroDAOTest {
	@Test
	@Ignore
	public void salvar() {
		ProprietarioDAO daoP = new ProprietarioDAO();
		MarcaDAO daoM = new MarcaDAO();
		Carro e = new Carro("Econômico", "Prata", 2019, daoM.select(2), "546951316", daoP.select("11111111111"), 400, 4, false, 8, true, 300);
		CarroDAO dao = new CarroDAO();
		dao.save(e);
	}

	@Test
	@Ignore
	public void listar() {
		CarroDAO dao = new CarroDAO();
		List<Carro> Carros = dao.selectAll();
		System.out.println(Carros.get(0));
	}

	@Test
	@Ignore
	public void buscar() {
		CarroDAO dao = new CarroDAO();
		Carro Carro = dao.select("546951316");

		System.out.println(Carro);
	}

	@Test
	@Ignore
	public void excluir() {
		CarroDAO dao = new CarroDAO();

		dao.delete("546951316");

		System.out.println(dao.selectAll());
	}
	
	@Test
	
	public void atualizar() {
		CarroDAO dao = new CarroDAO();
		Carro e = dao.select("546951316");
		e.setModelo("Luxo");
		dao.update(e);
	}
}
