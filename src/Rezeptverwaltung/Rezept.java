package Rezeptverwaltung;

import com.sun.source.tree.LiteralTree;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Rezept {

    private String name;
    private int personen;

    private Zutat[] zutat_list = new Zutat[30];

    public void printRezpt()
    {
        System.out.println(name+ " " + personen  + " ");

//        for (Zutat zutat : zutat_list) {
//            System.out.println("zutat.getName() = " + zutat.getName());
//            System.out.println("zutat.getMenge() = " + zutat.getMenge());
//        }

        for (int i = 0; i < zutat_list.length; i++) {
                System.out.println("zutat.getName() = " + zutat_list[i].getName());
                System.out.println("zutat.getMenge() = " + zutat_list[i].getMenge());
        }
    }

    public Rezept umrechnen(int personen)
    {
        int menge_new = 0;

        Zutat[] zutat_list_new = new Zutat[30];

        for (int i = 0; i < zutat_list.length; i++) {
            menge_new = zutat_list[i].getMenge() / getPersonen() * personen;
            zutat_list_new[i] = new Zutat(zutat_list[i].getName(),menge_new);
        }


        return new Rezept(this.name,personen, zutat_list_new);


    }
    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutat_list() {
        return zutat_list;
    }

    public Rezept(String name, int personen, Zutat[] zutat_list) {
        this.name = name;
        this.personen = personen;
        this.zutat_list = zutat_list;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutat_list=" + Arrays.toString(zutat_list) +
                '}';
    }
}
