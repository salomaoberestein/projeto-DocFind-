package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Item;

public class ItemDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public ItemDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(Item item) {
		em.getTransaction().begin();
		em.merge(item);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(Item item) {
		em.getTransaction().begin();
		em.remove(item);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<Item> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select item from Item item");
		List<Item> item = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return item;
	}

}