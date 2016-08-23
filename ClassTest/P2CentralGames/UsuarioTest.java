package P2CentralGames;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import P2CentralGames.Usuario;

public class UsuarioTest {
	
	private Usuario pamela;
	private Usuario hyvilly;
	private Usuario luan;
	private Usuario lucas;

	@Before
	public void setUp() throws Exception{
		
		pamela = new Noob("Pamela Nicole", "pamela.linda", 450.0);
		hyvilly = new Noob("Hyvilly Maria", "hyvilly.maria", 550.0);
		luan = new Veterano("Luan Santana", "luan.luanjo", 650.0);
		lucas = new Veterano("Lucas Lucco", "lucas.lucco", 750.0);
		
	}
	
	@Test
	public void testCriaUsuario() throws Exception{
			Usuario isabelly = new P2CentralGames.Noob("Isabelly Araujo", "isa.araujo", 50.0);
			Usuario hektor = new P2CentralGames.Noob("Hektor Farias", "hektor.farias", 60.0);
			Usuario luiza = new P2CentralGames.Veterano("Luiza Carla", "luiza.carla", 70.0);
			Usuario iaara = new P2CentralGames.Veterano("Iaara Catielly", "iaara.catielly", 80.0);
			
			assertEquals(isabelly.getNomeUsuario(), "Isabelly Araujo");
			assertEquals(hektor.getNomeUsuario(), "Hektor Farias");
			assertEquals(luiza.getLogin(),"luiza.carla");	
			assertEquals(iaara.getLogin(),"iaara.catielly");
	}
	
	@Test
	public void testandoConstrutorWithException(){
		
		/**
		 * Test for the Sub Class: Noob
		 */
		
		// Name Empty Test
		try{
			pamela = new P2CentralGames.Noob(" ", "pamela.linda", 450.0);
			Assert.fail("Lancamento de Exception com nome do Usuario vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do usuario nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Name Null Test
		try{
			hyvilly = new P2CentralGames.Noob(null, "hyvilly.maria", 550.0);
			Assert.fail("Lancamento de Exception com nome do Usuario null");
		} catch(Exception e){
			Assert.assertEquals("Nome do usuario nao pode ser nulo ou vazio.", e.getMessage());
		  } 
		
		// Login Empty Test
		try{
			pamela = new P2CentralGames.Noob("Pamela Nicole", " ", 450.0);
			Assert.fail("Lancamento de Exception com login do Usuario vazio");
		} catch(Exception e){
			Assert.assertEquals("Login do usuario nao pode ser nulo ou vazio.", e.getMessage());
			}
		// Login Null Test
		try{
			hyvilly = new P2CentralGames.Noob("Hyvilly Maria",null, 550.0);
			Assert.fail("Lancamento de Exception com login do Usuario null");
		} catch(Exception e){
			Assert.assertEquals("Login do usuario nao pode ser nulo ou vazio.", e.getMessage());
			 } 
		// Money Test Negative
		try{
			pamela = new P2CentralGames.Noob("Pamela Nicole", "pamela.linda", -450.0);
			Assert.fail("Lancamento de Exception com dinheiro do usuario inferior ao esperado");
		} catch(Exception e){
			Assert.assertEquals("O valor de dinheiro nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Money Test Equal the Zero
		try{
			hyvilly = new P2CentralGames.Noob("Hyvilly Maria", "hyvilly.maria",0.0);
			Assert.fail("Lancamento de Exception com dinheiro do usuario inferior ao esperado");
		} catch (Exception e){
			Assert.assertEquals("O valor de dinheiro nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		
		/**
		 * Test for the Sub Class: Veterano
		 */
		
		// Name Empty Test
		try{
			luan = new P2CentralGames.Veterano(" ", "luan.luanjo", 650.0);
			Assert.fail("Lancamento de Exception com nome do Usuario vazio");
		} catch(Exception e){
			Assert.assertEquals("Nome do usuario nao pode ser nulo ou vazio.", e.getMessage());
		  }
		// Name Null Test
		try{
			lucas = new P2CentralGames.Veterano(null, "lucas.lucco", 750.0);
			Assert.fail("Lancamento de Exception com nome do Usuario null");
		} catch(Exception e){
			Assert.assertEquals("Nome do usuario nao pode ser nulo ou vazio.", e.getMessage());
		  } 
		
		// Login Empty Test
		try{
			luan = new P2CentralGames.Veterano("Luan Santana", " ", 650.0);
			Assert.fail("Lancamento de Exception com login do Usuario vazio");
		} catch(Exception e){
			Assert.assertEquals("Login do usuario nao pode ser nulo ou vazio.", e.getMessage());
			}
		// Login Null Test
		try{
			lucas = new P2CentralGames.Veterano("Lucas Lucco", null, 750.0);
			Assert.fail("Lancamento de Exception com login do Usuario null");
		} catch(Exception e){
			Assert.assertEquals("Login do usuario nao pode ser nulo ou vazio.", e.getMessage());
			 } 
		// Money Test Negative
		try{
			luan = new P2CentralGames.Veterano("Luan Santana", "luan.luanjo", -650.0);
			Assert.fail("Lancamento de Exception com dinheiro do usuario inferior ao esperado");
		} catch(Exception e){
			Assert.assertEquals("O valor de dinheiro nao pode ser menor ou igual a zero.", e.getMessage());
		  }
		// Money Test Equal a Zero
		try{
			lucas = new P2CentralGames.Veterano("Lucas Lucco", "lucas.lucco", 0.0);
			Assert.fail("Lancamento de Exception com dinheiro do usuario inferior ao esperado");
		} catch(Exception e){
			Assert.assertEquals("O valor de dinheiro nao pode ser menor ou igual a zero.", e.getMessage());
		  }
	}
	
	@Test
	public void compraJogoTest(){
		
	}
	
	
	
	
	
	
	
	
}
