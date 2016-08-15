package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public class Veterano extends Usuario{
	/**
	 * Construtor da classe Veterano
	 * Sub Classe
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 * @throws Exception
	 */
	public Veterano(String nomeUsuario, String login, double dinheiro) throws Exception {
		super(nomeUsuario, login, dinheiro);
	}

	@Override
	double calculaDesconto(double preco) {
		double valor = preco - (preco * 0.15);
		return valor;
	}
	
	public int bonificacaoJogo(){
		return 15;
	}
	
	
}
