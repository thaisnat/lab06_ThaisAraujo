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
	private Jogabilidade tipo;
	
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
	
	/**
	 * Getters
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public double getJogadorZerou() {
		return jogadorZerou;
	}
	public int getMaiorScore() {
		return maiorScore;
	}
	public int getQuantidadeJogadas() {
		return quantidadeJogadas;
	}
	public Jogabilidade getTipo() {
		return tipo;
	}
	
	/**
	 * Setters
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setJogadorZerou(double jogadorZerou) {
		this.jogadorZerou = jogadorZerou;
	}
	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}
	public void setQuantidadeJogadas(int quantidadeJogadas) {
		this.quantidadeJogadas = quantidadeJogadas;
	}
	public void setTipo(Jogabilidade tipo) {
		this.tipo = tipo;
	}
	

	
}
