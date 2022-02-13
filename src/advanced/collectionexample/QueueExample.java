package advanced.collectionexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> pokemons = new LinkedList<String>();
        pokemons.offer("Pikachu");
        pokemons.add("Charamnder");
        System.out.println(pokemons.offer("Covid"));

        System.out.println(pokemons);

        System.out.println(pokemons.peek());

    }
}
