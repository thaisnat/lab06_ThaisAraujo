package P2CentralGames;
/**
 * 
 * @author thaisnat
 *
 */
public abstract class Jogo {
	
	// atributos
	private String nome;
	private double preco;
	private int maiorScore, quantidadeJogadas, jogadorZerou;
	private boolean zerou;
	private Jogabilidade tipo;
	
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
	public int registraJogada(int score, boolean zerou){
		if (maiorScore < score) {
			maiorScore = score;
		}if (zerou == true){
			zerou = true;
			jogadorZerou = jogadorZerou + 1;
		}
		
		this.quantidadeJogadas += 1;
		
		/**
		 * chamei o x2p de usuario
		 * criei uma nova variavel para auxilio na adicao da pontuacao
		 * usei o set para alterar o valor do x2p
		 */
		int x2pAtual = pontosExtra();
		return x2pAtual;
	}
	
	abstract int pontosExtra();
	
	/**
	 * Metodos Get e Set
	 * HashCode
	 * Equals
	 * toString 
	 */
	
	@Override
	public String toString() {
		StringBuilder essaString = new StringBuilder();
		essaString.append("+" + this.nome + "-" + this.getClass().getSimpleName() + ":\n");
		essaString.append("==> Jogou " + this.getQuantidadeJogadas() + " vez(es)\n");
		essaString.append("==> Zerou " + this.getJogadorZerou() + " vez(es)\n");
		essaString.append("==> Maior score " + this.getMaiorScore() + ":\n");
		return essaString.toString();
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
	public int getJogadorZerou() {
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
	public void setJogadorZerou(int jogadorZerou) {
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
