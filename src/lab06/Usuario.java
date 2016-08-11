package lab06;

import java.util.ArrayList;

/**
 * 
 * @author thaisnat
 *
 */
public class Usuario {
	
	// atributos
	private String nomeUsuario , login;
	private ArrayList<Jogo> listaJogos;
	private double dinheiro;
	
	/**
	 * Construtor da classe Usuario
	 * Super Classe 
	 * @param nomeUsuario
	 * @param login
	 * @param dinheiro
	 */
	public Usuario(String nomeUsuario, String login, double dinheiro) throws Exception{
		
		testandoNome(nomeUsuario);
		testandoLogin(login);
		
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.dinheiro = dinheiro;
		listaJogos = new ArrayList<Jogo>();	
	}
	
	/**
	 * Metodo do tratamento de erro do exception
	 * Verifica se o nome do usuario eh null ou vazio
	 * @param nomeUsuario
	 * @throws Exception
	 */
	private void testandoNome(String nomeUsuario) throws Exception{
	       if (nomeUsuario == null || nomeUsuario.trim().equals("")) {
	           throw new Exception("Nome do usuario nao pode ser nulo ou vazio");
	       }
	   }
	
	/**
	 * Metodo do tratamento de erro do exception
	 * Verifica se o login do usuario eh null ou vazio
	 * @param login
	 * @throws Exception
	 */
	private void testandoLogin(String login) throws Exception{
	       if (login == null || login.trim().equals("")) {
	           throw new Exception("Login do usuario nao pode ser nulo ou vazio");
	       }
	   }
	
	/**
	 * Metodo do tratamento de erro do exception
	 * verifica se o jogo eh null
	 * @param jogo
	 * @throws Exception
	 */
	private void testaJogo(Jogo jogo) throws Exception{
		if (jogo == null){
			throw new Exception("Jogo nao pode ser null");
		}
	}
	
	/**
	 * Metodo que verifica se o usuario tem o jogo
	 * se nao tiver ele o adiciona
	 * @param nomeJogo
	 * @return
	 */
	public boolean compraJogos(Jogo jogoRecebido){
		if (listaJogos.contains(jogoRecebido)) {
			return false;
		} else {
			listaJogos.add(jogoRecebido);
			return true;
		}
	}
	
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
	
	/**
	 * Setters
	 * @param nomeUsuario
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
}
