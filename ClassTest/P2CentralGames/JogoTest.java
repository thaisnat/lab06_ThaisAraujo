package P2CentralGames;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import P2CentralGames.Jogo;
import P2CentralGames.Usuario;
import P2CentralGames.LojaFachada;

public class JogoTest {
	
	private Jogo gameSix;
	
	@Before
	public void setUp() throws Exception{
		gameSix = new P2CentralGames.RPG("Forsaken World", 45.0);
	}
	
	@Test
	public void testCriaJogo() throws Exception{
			Jogo gameOne = new P2CentralGames.RPG("League of Angels", 30.0);
			Jogo gameTwo = new P2CentralGames.Luta("Street Fighter", 50.0);
			Jogo gameThree = new P2CentralGames.Plataforma("Sonic the Hedgehog", 20.0);
			
			assertEquals(gameOne.getNome(), "League of Angels");
			assertEquals(gameTwo.getNome(), "Street Fighter");
			assertEquals(gameThree.getNome(), "Sonic the Hedgehog");	
	}
	
	@Test
	public void testandoConstrutorWithException(){
		
		try{
			Jogo jogo.gameSix = new P2CentralGames.RPG(" ", 45.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		}
	}
		
		
	}


