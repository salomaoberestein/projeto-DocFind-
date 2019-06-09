package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Rg;

public class RgDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public RgDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(Rg rg) {
		em.getTransaction().begin();
		em.merge(rg);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(Rg rg) {
		em.getTransaction().begin();
		em.remove(rg);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<Rg> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select rg from Rg rg");
		List<Rg> rg = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return rg;
	}

}