package P2CentralGames;
/**
 * 
 * @author thaisnat
 *
 */
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import P2CentralGames.Usuario;

public class LojaFachadaTest {
	
	private LojaFachada P2CG;
	private Usuario michele, daniele, andre;
	
	@Before
	public void setUp() throws Exception{
		michele = new P2CentralGames.Noob("Michele Ventura", "michele.pink", 250.0);
		daniele = new P2CentralGames.Noob("Daniele Ventura", "dani.ventura", 350.0);
		
		P2CG.adicionaUsuario(michele);
		P2CG.adicionaUsuario(daniele);
	}
	
	@Test
	public void adicionaUsuarioTest() throws Exception {
		
		assertEquals(true,P2CG.adicionaUsuario(michele));
		assertEquals(true,P2CG.adicionaUsuario(daniele));
		
		try{
			P2CG.adicionaUsuario(michele);
			fail("Lancamento de excecao do exception");
		} catch (Exception e){
			Assert.assertEquals("ja contem o usuario na lista de clientes", e.getMessage());
		}
	}
	
	@Test
	public void upgradeTest() throws Exception{
		andre = new P2CentralGames.Noob("Andre Andrade", "andre.andrade", 450.0);
		
		andre.setX2p(1200);
		P2CG.adicionaUsuario(andre);
		
		assertEquals(1200, andre.getX2p());
		P2CG.upgradeUsuario("andre.andrade");
		
		assertEquals("Veterano", andre.getClass().getSimpleName());
		
		assertEquals(true, P2CG.upgradeUsuario("andre.andrade"));
	}	
}
