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
		super.setX2p(1000);
	}
	
	/**
	 * metodo que sobreescreve o mesmo que está na super classe
	 * calcula e retorna o valor do desconto atribuido a classe
	 * @return
	 */
	@Override
	double calculaDesconto(double preco) {
		double valor = preco - (preco * 0.20);
		return valor;
	}
	
	/**
	 * retorna o valor do bonus informado da classe
	 * @return
	 */
	public int bonificacaoJogo(){
		return 15;
	}
	
	
}
