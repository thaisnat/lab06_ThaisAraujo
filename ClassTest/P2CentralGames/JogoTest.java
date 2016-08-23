package P2CentralGames;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import P2CentralGames.Jogo;

public class JogoTest {
	
	private Jogo gameThree;
	private Jogo gameFour;
	private Jogo gameFive;
	
	private Jogo gameSix;
	private Jogo gameSeven;
	private Jogo gameEight;
	
	@Before
	public void setUp() throws Exception{
		
		gameThree = new P2CentralGames.RPG("World of Warcraft", 15.0);
		gameFour = new P2CentralGames.Luta("Rampage", 25.0);
		gameFive = new P2CentralGames.Plataforma("Megamen", 35.0);
		
		gameSix = new P2CentralGames.RPG("Forsaken World", 45.0);
		gameSeven = new P2CentralGames.Luta("Final Fight", 55.0);
		gameEight = new P2CentralGames.Plataforma("Super Mario", 65.0);
	}
	
	@Test
	public void testCriaJogo() throws Exception{
			Jogo gameZero = new P2CentralGames.RPG("League of Angels", 30.0);
			Jogo gameOne = new P2CentralGames.Luta("Street Fighter", 50.0);
			Jogo gameTwo = new P2CentralGames.Plataforma("Sonic the Hedgehog", 20.0);
			
			assertEquals(gameZero.getNome(), "League of Angels");
			assertEquals(gameOne.getNome(), "Street Fighter");
			assertEquals(gameTwo.getNome(), "Sonic the Hedgehog");	
	}
	
	@Test
	public void testandoConstrutorWithException(){
		
		/**
		 * Test for the Sub Class: RPG
		 */
		
		// Name Empty Test
		try{
			gameSix = new P2CentralGames.RPG(" ", 45.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Name Null Test
		try{
			gameSix = new P2CentralGames.RPG(null, 45.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo null");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  } 
		// Preach Test Negative
		try{
			gameSix = new P2CentralGames.RPG("Forsaken World", -45.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preach Test Equal a Zero
		try{
			gameSix = new P2CentralGames.RPG("Forsaken World", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		
		/**
		 * Test for the Sub Class: Luta
		 */
		
		// Name Empty Test
		try{
			gameSeven = new P2CentralGames.Luta(" ", 55.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Name Null Test
		try{
			gameSeven = new P2CentralGames.Luta(null, 55.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Preach Test Negative
		try{
			gameSeven = new P2CentralGames.RPG("Final Fight", -55.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preach Test Equal a Zero
		try{
			gameSeven = new P2CentralGames.RPG("Final Fight", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		
		/**
		 * Test for the Sub Class: Plataforma
		 */
		
		// Name Empty Test
		try{
			gameEight = new P2CentralGames.Plataforma(" ", 65.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Name Null Test
		try{
			gameEight = new P2CentralGames.Plataforma(null, 65.0);
			Assert.fail("Lancamento de Exception com Nome do Jogo vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do jogo nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Preco Test Negativo
		try{
			gameEight = new P2CentralGames.RPG("Super Mario", -65.0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Preco Test Igual a Zero
		try{
			gameEight = new P2CentralGames.RPG("Super Mario", 0);
			Assert.fail("Lancamento de Exception com preco do jogo menor ao esperado");
		} catch(Exception e){
			Assert.assertEquals("Preco do jogo nao pode ser menor ou igual a zero.", e.getMessage());
		  }
	}
	/**
	 * Registry Joked
	 * @throws Exception
	 */
	@Test
	public void testCriaRegistraJogada() throws Exception{
		gameFive.registraJogada(650, false);
		gameSix.registraJogada(750, false);
		gameSeven.registraJogada(850, false);
		gameEight.registraJogada(950, false);
	}
	
	@Test
	public void registraJogadaTest() throws Exception{
		testCriaRegistraJogada();
		
		Assert.assertNotEquals(true, gameFive.getZerou());
		Assert.assertEquals(750, gameSix.getMaiorScore());
		Assert.assertEquals(false, gameSeven.getZerou());
		Assert.assertNotEquals(940, gameEight.getMaiorScore());
		
		try{
			gameThree.registraJogada(-15, true);
			Assert.fail("Deveria ter lancado excecao de score");
		} catch(Exception e){
			Assert.assertEquals("Score nao pode ser menor ou igual a zero.",e.getMessage());
		}
		
		try{
			gameFour.registraJogada(0, true);
			Assert.fail("Deveria ter lancado excecao de score");
		} catch(Exception e){
			Assert.assertEquals("Score nao pode ser menor ou igual a zero.",e.getMessage());
		}
	}
		
}

