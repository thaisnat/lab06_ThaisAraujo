package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public class Noob extends Usuario{
	/**
	 * Construtor da classe Noob
	 * Sub Classe
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 * @throws Exception
	 */
	public Noob(String nomeUsuario, String login, double dinheiro) throws Exception {
		super(nomeUsuario, login, dinheiro);
		
	}
	
	public double calculaDesconto(double valorDesconto){
		return 0.0;
	}

}
