package Observer;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publisher {
	List<Subscriber> subs = new ArrayList<Subscriber>();
	@Override
	public void addSubscriber(Subscriber s) {
		subs.add( s );
	}
	@Override
	public void removeSubscriber(Subscriber s) {
		subs.remove( s );
	}
	@Override
	public void notificarTodos(String noticia) {
		for ( Subscriber s : this.subs ) { 
			s.updates(noticia);
		}
	}
}