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

        //Se piden datos para crear un nuevo restaurante
        score = askScore();

        //Se comprueba si la puntuación existe en la lista, ya que no pueden estar repetidas
        index = checkScore(score, restaurantsList);

        if (index == -1) {
            String name = askName();
            //Creación del restaurante
            Restaurant restaurant = createRestaurant(score, name);
            //Se añade el restaurante a la lista
            addRestaurantToList(restaurant, restaurantsList);
        }
    }

    //////////FUNCIONES
    private static int checkScore(int score, Set<Restaurant> restaurantsList) {
        int index = -1;
        for (Restaurant rest : restaurantsList) {
            if (rest.getScore() == score) {
                System.out.println("no puede haber dos restaurantes con la misma puntuación");
                index = 1;
            } else {
                System.out.println("la puntuación no existe en la lista");
            }
        }
        return index;
    }


    private static void addRestaurantToList(Restaurant restaurant, Set<Restaurant> restaurantsList) {
        restaurantsList.add(restaurant);
    }

    private static Restaurant createRestaurant(int score, String name) {
        return new Restaurant(score, name);
    }

    //////////ENTRADA DE DATOS
    private static String askName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nombre");
        return sc.nextLine();
    }

    private static int askScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la puntuación");
        return sc.nextInt();
    }
}
