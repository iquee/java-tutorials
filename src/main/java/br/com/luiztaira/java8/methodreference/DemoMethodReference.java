package br.com.luiztaira.java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * There are four types of method references:
 * 
 * - A method reference to a static method.
 * - A method reference to an instance method of an object of a particular type.
 * - A method reference to an instance method of an existing object.
 * - A method reference to a constructor.
 *  
 *  
 *  Some examples of new functional interfaces:
 *  
 *  Function<T, R> − recebe T como entrada, retorna R como saída;
 *  Predicate<T> − recebe T como entrada, retorna um valor booleano como saída;
 *  Consumer<T> − recebe T como entrada, não retorna nada como saída;
 *  Supplier<T> − não recebe entrada, retorna T como saída;
 *  BinaryOperator<T> − recebe duas entradas T, retorna um T como saída.
 * 
 */
public class DemoMethodReference {

    public static void main(String[] args) {
    	
    	Random random = new Random();
    	int i = 0;
        
        // A method reference to a static method.
        Consumer<Integer> c = CheckNumber::addingInt;
        c.accept(random.nextInt());
        System.out.println("");
    	
    	// A method reference to an instance method of an object of a particular type.
    	i = random.nextInt();
        CheckNumber cn = new CheckNumber();        
        Function<Integer, Boolean> f = cn::isEven;
        boolean result = f.apply(i);
        System.out.println("Number " +i+ " is even? -> " + result);        
        System.out.println("");
        
        List<Player> players = new ArrayList<>();
        
        // A method reference to an instance method of an existing object.        
        players.add(new Player(random.nextInt()));
        players.add(new Player(random.nextInt()));
        players.add(new Player(random.nextInt()));
        players.forEach(System.out::println);
        System.out.println("");
        
        //  A method reference to a constructor.
        Function<Integer, Player> playerCreator = Player::new;
        players.add(playerCreator.apply(random.nextInt()));
        players.add(playerCreator.apply(random.nextInt()));
        players.forEach(System.out::println); 
        System.out.println("");
    }
    
    static class Player{
    	Integer id;
    	public Player(Integer id) {
    		this.id = id;
    	}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Player [id=" + id + "]";
		}
    }
}
