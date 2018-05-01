package senac.tcc.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import senac.tcc.api.empresas.model.Cliente;
import senac.tcc.api.empresas.model.QCliente;
@Transactional
@Repository
public class ClienteService {

	@PersistenceContext
	private EntityManager em;
	
	
	public Cliente salvar(Cliente cliente){
	  return em.merge(cliente);
	}
	
	public Cliente verificaUsuario(Cliente cliente) {
		QCliente qCliente = QCliente.cliente;
		return new JPAQuery<Cliente>(em).from(qCliente).where(qCliente.email.eq(cliente.getEmail()).and(qCliente.senha.eq(cliente.getSenha()))).fetchFirst();				
	}
	
}
