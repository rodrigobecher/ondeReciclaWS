package senac.tcc.api.empresas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "cliente" )
public class Cliente {
	
	@Id
	private Integer id;
	
	private BigDecimal pontuacao;
	
	private String senha;
	
	private String nome;
	
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(BigDecimal pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
