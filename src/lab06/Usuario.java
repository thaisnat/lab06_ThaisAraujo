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
	
	public boolean compraJogos(String nomeJogo){
		for (Jogo jogo : listaJogos) {
			if (listaJogos.contains(nomeJogo)) {
				return false;
			} else {
				listaJogos.add(jogo);
				return true;
			}
		}
		return false;
	}
	
}
