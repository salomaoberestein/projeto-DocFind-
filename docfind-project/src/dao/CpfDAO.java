package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Cpf;

public class CpfDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public CpfDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(Cpf cpf) {
		em.getTransaction().begin();
		em.merge(cpf);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(Cpf cpf) {
		em.getTransaction().begin();
		em.remove(cpf);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<Cpf> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select cpf from Cpf cpf");
		List<Cpf> cpf = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return cpf;
	}

}