package EX2;

/*- Exercici 2
Utilitzant la classe del programa anterior, crea la
* implementació necessària perquè els objectes de la
* classe Restaurant estiguin ordenats per nom i per
* puntuació en ordre ascendent.

Exemple:

nom: restaurant1, puntuació: 8

nom: restaurant1, puntuació: 7*/

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Declaración e inicialización de la lista
        Set<Restaurant2> restaurantsList = new HashSet<>();

        //Se agregan objetos a la lista
        restaurantsList.add(new Restaurant2(1, "McDonalds"));
        restaurantsList.add(new Restaurant2(3, "El méxicano"));
        restaurantsList.add(new Restaurant2(6, "La Tagliatella"));
        restaurantsList.add(new Restaurant2(5, "Pepe"));
        orderBy(restaurantsList);
    }

    // Se crea un TreeMap y se le agregan los restaurantes del HashSet, para posteriormente
    //ordenar los restaurantes de manera ascendente teniendo en cuenta la puntuación
    private static void orderBy(Set<Restaurant2> restaurantsList) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        for (Restaurant2 rest : restaurantsList) {
            map1.put(rest.getScore(), rest.getName());
        }
        for (Integer s : map1.keySet()) {
            System.out.print("Nombre: " + map1.get(s) + ". Puntuación: " + s + "\n");
        }
    }
}