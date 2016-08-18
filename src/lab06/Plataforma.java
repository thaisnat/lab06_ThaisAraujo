package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public class Plataforma extends Jogo{
	/**
	 * Construtor da classe Plataforma
	 * Sub classe
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public Plataforma(String nome, double preco) throws Exception {
		super(nome, preco);
		
	}
	
	@Override
	public int pontosExtra() {
		int valor = 0;
		valor = valor + (int)(super.getJogadorZerou()*20);
		return valor;
	}

}
