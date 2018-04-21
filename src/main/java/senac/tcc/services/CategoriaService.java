package senac.tcc.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import senac.tcc.api.empresas.model.Categoria;

@Repository
public class CategoriaService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Categoria categoria){
	  entityManager.merge(categoria);
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Categoria> lista(){
		String jpql = "select c from Categoria c ";
		return  entityManager.createQuery(jpql).getResultList();
	}
	
	@Transactional
	public Categoria find(int id) {
		return entityManager.find(Categoria.class, id);
	}

	@Transactional
	public void delete(int id) {
		Categoria categoria = entityManager.find(Categoria.class, id);
	    entityManager.remove(categoria);
	}
	
}
