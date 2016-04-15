package observer;

public class Teste {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao Silva");
		Pessoa maria = new Pessoa("Maria Antonieta");
		
		Jornal correioBrasiliense = new Jornal();
		
		correioBrasiliense.addSubscriber( joao );
		correioBrasiliense.addSubscriber( maria );
		
		
		correioBrasiliense.removeSubscriber( maria );
		
		correioBrasiliense.notificarTodos("Donald Trumph perde as eleições...");
		
		correioBrasiliense.addSubscriber( maria );
		
		correioBrasiliense.notificarTodos("Profissıes em TI tem alta valorização no mercado");

	}

}