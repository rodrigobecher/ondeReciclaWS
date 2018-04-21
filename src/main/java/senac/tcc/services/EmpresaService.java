package senac.tcc.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import senac.tcc.api.empresas.model.Empresa;
import senac.tcc.api.empresas.model.Residuo;

@Repository
public class EmpresaService {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void salvar(Empresa empresa){
	  entityManager.merge(empresa);
	}
	@Transactional
	public void alterar(Empresa empresa){
	  entityManager.merge(empresa);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Empresa> lista(){
		String jpql = "select e from Empresa e ";
		return  entityManager.createQuery(jpql).getResultList();
	}
	
	@Transactional
	public Empresa find(int id) {
		return entityManager.find(Empresa.class, id);
	}

	@Transactional
	public void delete(int id) {
		Empresa empresa = entityManager.find(Empresa.class, id);
	    entityManager.remove(empresa);
	}

}
