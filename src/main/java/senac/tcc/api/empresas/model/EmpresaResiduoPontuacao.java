package senac.tcc.api.empresas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmpresaResiduoPontuacao {
	
	@Id
	private Integer id;
	
	@OneToOne
	private Residuo residuo;
	
	@OneToOne
	private Empresa empresa;
	
	private Integer ponto;
	
	private double qtdeCondicao;
	
	

}
