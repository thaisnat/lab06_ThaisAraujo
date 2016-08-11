package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public class Jogo {
	
	// atributos
	private String nome;
	private double preco, jogadorZerou;
	private int maiorScore, quantidadeJogadas;
	
	/**
	 * Construtor da classe Jogo
	 * Super Classe
	 * @param nome
	 * @param preco
	 */
	public Jogo(String nome, double preco) throws Exception{
		
		testandoNome(nome);
		testandoPreco(preco);
		
		this.nome = nome;
		preco = 0.0;
	}
	/**
	 * Metodo que recebe um inteiro que indica a pontuacao atual do jogador
	 * verifica se o jogador zerou o jogo
	 * @param score
	 * @param zerou
	 */
	public void registraJogada(int score, boolean zerou){
		if (maiorScore < score) {
			maiorScore = score;
		}if (zerou == true){
			jogadorZerou = jogadorZerou + 1;

		}
	}
	/**
	 * Metodo do tratamento de erro do exception
	 * Verfica se o nome do jogo eh null ou vazio
	 * @param nome
	 * @throws Exception
	 */
	private void testandoNome(String nome) throws Exception{
	       if (nome == null || nome.trim().equals("")) {
	           throw new Exception("Nome do jogo nao pode ser nulo ou vazio");
	       }
	   }
	/**
	 * Metodo do tratamento de erro do exception
	 * Verifica se o preco do jogo eh menor ou igual a zero
	 * @param preco
	 * @throws Exception
	 */
	private void testandoPreco(double preco) throws Exception{
	       if (preco <= 0.0) {
	           throw new Exception("Preco do jogo nao pode ser menor ou igual a zero");
	       }
	   }
}
