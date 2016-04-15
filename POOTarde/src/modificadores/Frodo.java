package modificadores;

/*
 * 04/03/2016 Exercício Modificadores
 * @author 142016-1-Fernando Moraes Oliveira
 */
public class Frodo extends Hobbit{
    public static void main (String [] args){
        Short myGold = 7;
        
        Frodo f = new Frodo();
        System.out.println(f.countGold(myGold, 6));
    }
}
