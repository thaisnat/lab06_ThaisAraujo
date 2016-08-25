package P2CentralGames;

import java.util.ArrayList;
import P2CentralGames.Usuario;
/**
 * 
 * @author thaisnat
 *
 */
public class LojaFachada {
	
	// atributos
	private ArrayList<Usuario> clientes;
	private Usuario usuario;
	
	/**
	 * Construtor da Classe LojaFachada
	 * @param clientes
	 * @param usuario
	 */
	public LojaFachada(ArrayList<Usuario> clientes, Usuario usuario) {
		super();
			
		this.clientes = clientes;
		this.usuario = usuario;
		
	}
	/**
	 * 
	 * @param jogo
	 * @return
	 * @throws Exception
	 */
	public boolean vendeJogo(Jogo jogo) throws Exception{
		if(jogo == null){
			throw new Exception("Jogo nao pode ser null");
		} else{
			return usuario.compraJogo(jogo);
		}
		
	}
	/**
	 * 
	 * @param valor
	 * @param login
	 * @return
	 * @throws Exception
	 */
	public boolean adicionaDinheiro(double valor, String login) throws Exception{
		Usuario esseUsuario;
		for (Usuario usuario : clientes) {
			if(usuario.getLogin().equalsIgnoreCase(login)){
				esseUsuario = usuario;
				return esseUsuario.adicionaDinheiro(valor);
			}
		}
		return false;
	}
	/**
	 * 
	 * @param usuario
	 * @return
	 * @throws Exception
	 */
	public boolean adicionaUsuario(Usuario usuario) throws Exception{
		if(clientes.contains(usuario)){
			throw new Exception("ja contem o usuario na lista de clientes");
		}else{
			return clientes.add(usuario);
		} 
	}
	/**
	 * Verifica se o usuario Noob tem x2p suficiente para se tornar um Veterano
	 * @param login
	 * @return
	 * @throws Exception
	 */
	public boolean upgradeUsuario(String login) throws Exception{
		Usuario esseUsuario = null;
		for (Usuario usuario : clientes) {
			if(usuario.getLogin().equalsIgnoreCase(login)){
				esseUsuario = usuario;
			} 
		}
		if(esseUsuario != null){
			if(esseUsuario.getClass() == Noob.class);
				if (esseUsuario.getX2p() >= 1000){
					
					String atribuindoNome = esseUsuario.getNomeUsuario();
					String atribuindoLogin = esseUsuario.getLogin();
					double atribuindoDinheiro = esseUsuario.getDinheiro();
					
					esseUsuario = new Veterano(atribuindoNome, atribuindoLogin, atribuindoDinheiro);
					int x2p = esseUsuario.getX2p();
					esseUsuario.setX2p(x2p);
					return true;
				}
		} else{
			throw new Exception("Usuario ja eh Veterano");
		}
		return false;
	}
	
	/**
	 * Metodos Get e Set
	 * HashCode
	 * Equals
	 * toString 
	 */
	public ArrayList<Usuario> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Usuario> clientes) {
		this.clientes = clientes;
	}
	
	/**
	 * HashCode igual ao Equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((clientes == null) ? 0 : clientes.hashCode());
		return result;
	}
	/**
	 * Equals pela lista de clientes
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof LojaFachada)){
			return false;
		}
		LojaFachada outro = (LojaFachada) obj;
		if(getClientes() == outro.getClientes()){
			return true;
		}else{
			return false;
		}

	}
	/**
	 * toString
	 */
	@Override
	public String toString() {
		StringBuilder essaString = new StringBuilder();
		essaString.append("=== Central P2-CG ===\n");
		
		double total;
		for (Usuario usuario : clientes) {
			total = 0;
			essaString.append(usuario.toString());
			essaString.append("Lista de Jogos:\n");
			for (Jogo jogo : usuario.getListaJogos()) {
				essaString.append(jogo.toString());
				total += jogo.getPreco();
			}
			essaString.append("\nTotal de preço dos jogos: R$ " + total);
			essaString.append("--------------------------------------------");
		}
		return essaString.toString();
	}
}
