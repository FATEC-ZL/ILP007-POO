package Observer;

public class Pessoa implements Subscriber {

	private String nome;
	public Pessoa() {
	}
	public Pessoa(String nome) {
		this.setNome(nome);
	}
	@Override
	public void updates(String msg) {
		System.out.println(nome + " recebeu a seguinte noticia " + msg);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}