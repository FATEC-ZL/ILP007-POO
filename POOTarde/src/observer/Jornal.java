package observer;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publisher {
	List<Subscriber> subs = new ArrayList<Subscriber>();
	public void addSubscriber(Subscriber s) {
		subs.add( s );
	}
	public void removeSubscriber(Subscriber s) {
		subs.remove( s );
	}
	public void notificarTodos(String noticia) {
		for ( Subscriber s : this.subs ) { 
			s.update(noticia);
		}
	}
}