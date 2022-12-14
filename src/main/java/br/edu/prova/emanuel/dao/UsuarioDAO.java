package br.edu.prova.emanuel.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;


import br.edu.prova.emanuel.model.Usuario;

@ApplicationScoped
public class UsuarioDAO {
	
	@Inject
	private EntityManager em;
	
	public Usuario findById(Long id) {
		return em.find(Usuario.class, id);
	}
	
	public List<Usuario> findAllHQL(){
		return em.createQuery("SELECT a FROM Usuario a", Usuario.class).getResultList();
	}
	
	public void save(Usuario u) {
		em.persist(u);
	}
	
}
