package senac.tcc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUTIL {
	
private static 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresas");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
