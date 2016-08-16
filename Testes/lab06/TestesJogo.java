package lab06;

public class TestesJogo extends Exception{
	
	/**
	 * Metodo do tratamento de erro do exception
	 * Verfica se o nome do jogo eh null ou vazio
	 * @param nome
	 * @throws Exception
	 */
	public static void testandoNome(String nome) throws Exception{
	       if (nome == null || nome.trim().equals("")) {
	           throw new Exception("Nome do jogo nao pode ser nulo ou vazio");
	       }
	   }
	/**
	 * Metodo do tratamento de erro do exception
	 * Verifica se o preco do jogo eh menor ou igual a zero
	 * @param preco
	 * @throws Exception
	 */
	public static void testandoPreco(double preco) throws Exception{
	       if (preco <= 0.0) {
	           throw new Exception("Preco do jogo nao pode ser menor ou igual a zero");
	       }
	   }
}
