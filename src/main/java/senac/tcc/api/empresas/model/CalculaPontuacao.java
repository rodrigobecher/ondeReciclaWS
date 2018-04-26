package senac.tcc.api.empresas.model;

import java.math.BigDecimal;

public class CalculaPontuacao {
	
	private static BigDecimal calculaPontuacao(Integer ponto, double qtdCondicao, Integer quantidade) {
		double resultado = ((quantidade * ponto) / qtdCondicao);
		return new BigDecimal(resultado);
	}

}
