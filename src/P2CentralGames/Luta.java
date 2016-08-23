package P2CentralGames;
/**
 * 
 * @author thaisnat
 *
 */
public class Luta extends Jogo{
	/**
	 * Construtor da classe Luta
	 * Sub Classe de Jogo
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public Luta(String nome, double preco) throws Exception {
		super(nome, preco);
	}
	

	@Override
	public int pontosExtra() {
		int valor = 0;
		valor = valor + (super.getMaiorScore()/1000);
		return valor;
	}
}
