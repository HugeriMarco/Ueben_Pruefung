package Rezeptverwaltung;

public class ZutatDemo {

    public static void main(String[] args) {


        Zutat zutat1 = new Zutat("Zwiebel", 20);
        Zutat zutat2 = new Zutat("Mehl", 30);
        Zutat zutat3 = new Zutat("Nuss", 90);
        Zutat zutat4 = new Zutat("Milch", 11);
        Zutat zutat5 = new Zutat("Eier", 3);
        Zutat zutat6 = new Zutat("Butter", 150);

        Zutat[] zutaten1 = {zutat1, zutat3};

        Rezept rezept1 = new Rezept("Keks", 3, zutaten1);


        rezept1.printRezpt();


        Rezept rezept1_neu = rezept1.umrechnen(6);

        rezept1_neu.printRezpt();

    }

}
