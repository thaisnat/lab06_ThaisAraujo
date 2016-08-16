package lab06;
/**
 * 
 * @author thaisnat
 *
 */
public abstract class Jogo {
	
	// atributos
	private String nome;
	private double preco, jogadorZerou;
	private int maiorScore, quantidadeJogadas;
	private Jogabilidade tipo;
	private Usuario usuario;
	
	/**
	 * Construtor da classe Jogo
	 * Super Classe
	 * @param nome
	 * @param preco
	 */
	public Jogo(String nome, double preco) throws Exception{
		
		TestesJogo.testandoNome(nome);
		TestesJogo.testandoPreco(preco);
		
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
	
	abstract int pontosExtra();
	
	/**
	 * Metodos Get e Set
	 * HashCode
	 * Equals
	 * toString 
	 */
	
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
	 * @param preco
	 * @param jogadorZerou
	 * @param maiorScore
	 * @param quantidadeJogadas
	 * @param tipo
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
