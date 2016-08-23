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
	private Jogo gameSeven;
	private Jogo gameEight;
	
	@Before
	public void setUp() throws Exception{
		gameSix = new P2CentralGames.RPG("Forsaken World", 45.0);
		gameSeven = new P2CentralGames.Luta("Final Fight", 55.0);
		gameEight = new P2CentralGames.Plataforma("Super Mario", 65.0);
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
		
		/**
		 * Teste para a Sub Classe RPG
		 */
		
		// Vazio Test
		try{
			Jogo gameSix = new P2CentralGames.RPG(" ", 45.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Null Test
		try{
			Jogo gameSix = new P2CentralGames.RPG(null, 45.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo null");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Preco Test Negativo
		try{
			Jogo gameSix = new P2CentralGames.RPG("Forsaken World", -45.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preco Test Igual a Zero
		try{
			Jogo gameSix = new P2CentralGames.RPG("Forsaken World", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		
		/**
		 * Teste para a Sub Classe Luta
		 */
		
		// Vazio Test
		try{
			Jogo gameSeven = new P2CentralGames.Luta(" ", 55.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Null Test
		try{
			Jogo gameSeven = new P2CentralGames.Luta(null, 55.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Preco Test Negativo
		try{
			Jogo gameSeven = new P2CentralGames.RPG("Final Fight", -55.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preco Test Igual a Zero
		try{
			Jogo gameSeven = new P2CentralGames.RPG("Final Fight", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		
		/**
		 * Teste para a Sub Classe Plataforma
		 */
		
		// Vazio Test
		try{
			Jogo gameEight = new P2CentralGames.Plataforma(" ", 65.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Null Test
		try{
			Jogo gameEight = new P2CentralGames.Plataforma(null, 65.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Preco Test Negativo
		try{
			Jogo gameEight = new P2CentralGames.RPG("Super Mario", -65.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preco Test Igual a Zero
		try{
			Jogo gameEight = new P2CentralGames.RPG("Super Mario", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
	}
		@Test
		public void registraJogadaTest(){
			
			gameSix.registraJogada(750, false);
			gameSeven.registraJogada(850, false);
			gameEight.registraJogada(950, false);
			
			Assert.assertEquals(750, gameSix.getMaiorScore());
			Assert.assertEquals(false, gameSeven.zerou())
		}
		
}

