package Rezeptverwaltung;

public class Zutat {

    private String name;
    private int Menge;

    public String getName() {
        return name;
    }

    public int getMenge() {
        return Menge;
    }

    public Zutat(String name, int menge) {
        this.name = name;
        Menge = menge;
    }

    @Override
    public String toString() {
        return "Zutat{" +
                "name='" + name + '\'' +
                ", Menge=" + Menge +
                '}';
    }
}
