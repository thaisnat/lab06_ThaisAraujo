package lab06;
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
		
	}

	@Override
	double calculaDesconto(double preco) {
		double valor = preco - (preco * 0.10);
		return valor;
	}
	
	public int bonificacaoJogo(){
		return 10;
	}
	

}
