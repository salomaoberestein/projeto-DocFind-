package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

public class UsuarioDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public UsuarioDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(Usuario usuario) {
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<Usuario> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select usuario from Usuario usuario");
		List<Usuario> usuario = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return usuario;
	}

}