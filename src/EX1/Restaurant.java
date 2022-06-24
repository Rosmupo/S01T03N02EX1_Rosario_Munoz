package EX1;

public class Restaurant {

    int score;
    String name;

    public Restaurant(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "La puntuación del restaurante es: " + score + ". El nombre del restaurante es " + name + "\n";
    }
}
