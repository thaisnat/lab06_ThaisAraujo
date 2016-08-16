package lab06;

public class TestesUsuario extends Exception {
	/**
	 * Metodo do tratamento de erro do exception
	 * Verifica se o nome do usuario eh null ou vazio
	 * @param nomeUsuario
	 * @throws Exception
	 */
	public static void testandoNome(String nomeUsuario) throws Exception{
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
	public static void testandoLogin(String login) throws Exception{
	       if (login == null || login.trim().equals("")) {
	           throw new Exception("Login do usuario nao pode ser nulo ou vazio");
	       }
	   }
	
	/**
	 * Metodo do tratamento de erro do exception
	 * verfica se o valor do dinheiro passado eh menor ou igual a zero
	 * @param dinheiro
	 * @throws Exception
	 */
	public static void testandoDinheiro(double dinheiro) throws Exception{
		if(dinheiro < 0.0){
			throw new Exception("O valor de dinheiro nao pode ser menor ou igual a zero");
		}
	}
	
	/**
	 * Metodo do tratamento de erro do exception
	 * verifica se o jogo eh null
	 * @param jogo
	 * @throws Exception
	 */
	public void testandoJogo(Jogo jogo) throws Exception{
		if (jogo == null){
			throw new Exception("Jogo nao pode ser null");
		}
	}

}
