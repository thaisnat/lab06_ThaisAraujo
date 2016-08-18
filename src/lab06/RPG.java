package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public class RPG extends Jogo {
	
	/**
	 * Construtor da classe RPG
	 * Sub Classe
	 * @param nome
	 * @param preco
	 * @throws Exception
	 */
	public RPG(String nome, double preco) throws Exception {
		super(nome, preco);
		
	}
	
	@Override
	public int pontosExtra(){
		int valor;
		valor = (super.getJogadorZerou() * 10);
		return valor;
	}
	
	

}
