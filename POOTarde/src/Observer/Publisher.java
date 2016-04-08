package Observer;

public interface Publisher {
	void addSubscriber(Subscriber s);
	void removeSubscriber(Subscriber s);
	void notificarTodos(String noticia);
}
