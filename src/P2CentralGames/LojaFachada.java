package P2CentralGames;

import java.util.ArrayList;
import P2CentralGames.Usuario;

public class LojaFachada {
	
	// atributos
	private ArrayList<Usuario> clientes;
	private Usuario usuario;
	
	
	public LojaFachada(ArrayList<Usuario> clientes, Usuario usuario) {
		super();
			
		this.clientes = clientes;
		this.usuario = usuario;
		
	}

	public boolean vendeJogo(Jogo jogo) throws Exception{
		if(jogo == null){
			throw new Exception("Jogo nao pode ser null");
		} else{
			return usuario.compraJogo(jogo);
		}
		
	}
	
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
	
	public boolean adicionaUsuario(Usuario usuario){
		if(!clientes.contains(usuario)){
			return clientes.add(usuario);
		}
		return false;
	}
	
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
