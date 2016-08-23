package P2CentralGames;
/**
 * 
 * @author thaisnat
 *
 */
public class Noob extends Usuario{
	/**
	 * Construtor da classe Noob
	 * Sub Classe de Usuario
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 * @throws Exception 
	 */
	public Noob(String nomeUsuario, String login, double dinheiro) throws Exception {
		super(nomeUsuario, login, dinheiro);
		super.setX2p(0);
	}
	
	/**
	 * metodo que sobreescreve o mesmo que está na super classe
	 * calcula e retorna o valor do desconto atribuido a classe
	 * @return
	 */
	@Override
	double calculaDesconto(double preco) {
		double valor = preco - (preco * 0.10);
		return valor;
	}
	
	/**
	 * retorna o valor do bonus informado da classe
	 * @return
	 */
	public int bonificacaoJogo(){
		return 10;
	}
	

}
