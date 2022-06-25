package EX1;

/*
* - Exercici 1
Crea una classe anomenada Restaurant amb dos atributs:
* nom(String) i puntuació(int). Implementa els mètodes
* necessaris perquè no es puguin introduir objectes
* Restaurant amb el mateix nom i la mateixa puntuació
* en un HashSet creat en el main() de l’aplicació.

 Important

Pot haver-hi restaurants amb el mateix nom amb diferent
*  puntuació, però no pot haver-hi restaurants amb el
* mateix nom i la mateixa puntuació.
*
*
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        //Declaración de variables
        int score, index;

        //Declaración e inicialización de la lista
        Set<Restaurant> restaurantsList = new HashSet<>();

        //Se agregan objetos a la lista
        restaurantsList.add(new Restaurant(1, "McDonalds"));
        restaurantsList.add(new Restaurant(3, "El méxicano"));
        restaurantsList.add(new Restaurant(6, "La Tagliatella"));
        restaurantsList.add(new Restaurant(5, "Pepe"));
        restaurantsList.add(new Restaurant(5, "Pepe"));
        restaurantsList.add(new Restaurant(5, "Juan"));

        System.out.println(restaurantsList);

    }
}
