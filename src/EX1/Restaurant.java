package EX1;

import java.util.Objects;

public class Restaurant {

    int score;
    String name;

    public Restaurant(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString(){
        return "La puntuación del restaurante es: " + score + ". El nombre del restaurante es " + name + "\n";
    }
}
