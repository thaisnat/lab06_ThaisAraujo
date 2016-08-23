package P2CentralGames;

import java.util.ArrayList;

/**
 * 
 * @author thaisnat
 *
 */
public abstract class Usuario {
	
	// atributos
	private String nomeUsuario , login;
	private ArrayList<Jogo> listaJogos;
	private double dinheiro;
	private int x2p; // eXperiente Player Privilege

	/**
	 * Construtor da classe Usuario
	 * Super Classe 
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 */
	public Usuario(String nomeUsuario, String login, double dinheiro) throws Exception{
		
		TestesDoUsuario.testandoNome(nomeUsuario);
		TestesDoUsuario.testandoLogin(login);
		TestesDoUsuario.testandoDinheiro(dinheiro);
		
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.dinheiro = dinheiro;
		this.listaJogos = new ArrayList<>();	
	}
	
	/**
	 * Metodo que verifica se o usuario tem o jogo
	 * se nao tiver ele o adiciona
	 * @param nomeJogo
	 * @return
	 */
	public boolean compraJogo(Jogo jogoRecebido){
		int preco = (int)jogoRecebido.getPreco();
		
		if(dinheiro >= calculaDesconto(jogoRecebido.getPreco())){
			if (listaJogos.contains(jogoRecebido)) {
				return false;
			} else {
				this.setDinheiro(this.getDinheiro() - this.calculaDesconto(jogoRecebido.getPreco()));
				this.setX2p(this.getX2p() + preco * bonificacaoJogo());
				return listaJogos.add(jogoRecebido);
			}
		}
		return false;
	}
	
	/**
	 * Metodo abstrato que sera utilizado no metodo compraJogo
	 * o mesmo esta nas classes Noob e Veterano 
	 * de onde sera utilizado
	 * @param preco
	 * @return
	 */
	abstract double calculaDesconto(double preco);
	
	/**
	 * Metodo que adiciona dinheiro para o usuario
	 * @param valor
	 * @return
	 * @throws Exception
	 */
	public boolean adicionaDinheiro(double valor) throws Exception {
		if (valor > 0) {
			this.setDinheiro(this.getDinheiro() + valor);
			return true;
		} else {
			throw new Exception("Valor nao pode ser menor ou igual a zero");
		}
	}
	
	/**
	 * Metodo que calcula o valor atual do x2p
	 * @param valor
	 * @return
	 */
	public int calculaX2p(Jogo jogoRecebido){
		int somaX2p;
		somaX2p = getX2p() + (int)jogoRecebido.getPreco() * bonificacaoJogo();
		this.setX2p(somaX2p);
		return getX2p();
	}
	
	/**
	 * 
	 * @return
	 */
	abstract int bonificacaoJogo();

	/**
	 * verifica se o usuario possui o jogo atribuido
	 * se sim, o metodo registra a jogada
	 * @param jogo
	 * @param score
	 * @param zerou
	 * @throws Exception
	 */
	public int registraJogada(Jogo jogo, int score, boolean zerou) throws Exception{
		if(listaJogos.contains(jogo)){
			int pontosDaJogada = jogo.registraJogada(score, zerou);
			this.setX2p(this.getX2p() + pontosDaJogada);
			return this.getX2p();			
		}else{
			throw new Exception("Jogo nao esta na lista do usuario");
		}	
	}
	
	/**
	 * metodo utilizado para auxiliar a chamada do set do x2p 
	 * nos construtores das Sub Classes
	 */
	private void adicionaX2p(){
		this.getX2p();
	}
	
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
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public String getLogin() {
		return login;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public ArrayList<Jogo> getListaJogos() {
		return listaJogos;
	}
	public int getX2p() {
		return x2p;
	}
	
	/**
	 * Setters
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public void setListaJogos(ArrayList<Jogo> listaJogos) {
		this.listaJogos = listaJogos;
	}
	public void setX2p(int x2p) {
		this.x2p = x2p;
		this.adicionaX2p();
	}
	
	// hashCode
	//Equals
	
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return this.login + "/n" + nomeUsuario + "- Jogador" + this.getClass().getSimpleName() + "\n";

	}
	
}
