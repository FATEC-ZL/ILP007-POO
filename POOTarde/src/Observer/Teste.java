package Observer;

public class Teste {
	
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao Silva");
		Pessoa maria = new Pessoa("Maria Antonieta");
		
		Jornal correioBrasiliense = new Jornal();
		
		correioBrasiliense.addSubscriber( joao );
		correioBrasiliense.addSubscriber( maria );
		
		
		correioBrasiliense.removeSubscriber( maria );
		
		correioBrasiliense.notificarTodos("Donald Trumph perde as elei��es...");
		
		correioBrasiliense.addSubscriber( maria );
		
		correioBrasiliense.notificarTodos("Profiss�es em TI tem alta valoriza��o no mercado");

	}
}
