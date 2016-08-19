package lab06;

import java.util.ArrayList;
import lab06.Usuario;

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
	
	// fazer o upgrade
	// addDineiro
	// addusuario
	
	public void registraJogada(Jogo jogo, int score, boolean zerou){
		jogo.registraJogada(score, zerou);
	}

	public ArrayList<Usuario> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Usuario> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "=== Central P2-CG ==="+ usuario.toString();
		
	}
	
	
}
