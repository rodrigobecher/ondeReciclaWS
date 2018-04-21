package senac.tcc.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import senac.tcc.api.empresas.model.Categoria;
import senac.tcc.api.empresas.model.Residuo;

@Repository
public class ResiduoService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Residuo residuo){
	  entityManager.merge(residuo);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Residuo> lista(){
		String jpql = "select r from Residuo r ";
		return  entityManager.createQuery(jpql).getResultList();
	}
	
	@Transactional
	public Residuo find(int id) {
		return entityManager.find(Residuo.class, id);
	}

	@Transactional
	public void delete(int id) {
		Residuo residuo = entityManager.find(Residuo.class, id);
	    entityManager.remove(residuo);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Categoria> listaCategoria(){
		String jpql = "select c from categoria c ";
		return  entityManager.createQuery(jpql).getResultList();
	}
	
	
}
