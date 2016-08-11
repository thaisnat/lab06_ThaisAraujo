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
	
	public double calculaDesconto(double valorDesconto){
		return 0.0;
	}
}
