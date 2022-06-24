package EX2;

public class Restaurant2 {

    int score;
    String name;

    public Restaurant2(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "La puntuación del restaurante es: " + score + ". El nombre del restaurante es " + name + "\n";
    }
}
