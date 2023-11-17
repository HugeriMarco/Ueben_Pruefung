package org.campus02.warenkorbuebung;

import java.util.ArrayList;

public class Warenkorb {

    private ArrayList<Artikel> artikelListe = new ArrayList<>();

    public Warenkorb() {
    }

    public void addArtikel(Artikel artikel) {
        artikelListe.add(artikel);
    }

    public void removeArtikel(Artikel artikel) {
        artikelListe.remove(artikel);
    }

    public void printArtikels() {
        //iter - for each erstellen lassen
        for (Artikel artikel : artikelListe) {
            System.out.println(artikel);
        }

//        for (int i = 0; i < artikels.size(); i++) {
//            Artikel a = artikels.get(i);
        // code
//        }
    }

    public double calulcateSum() {
        double hilfsSum = 0.0;
        for (Artikel artikel : artikelListe) {
            hilfsSum = hilfsSum + artikel.getPrice();
        }
        return hilfsSum;
    }

    public double getHighestPrice() {
        // initialwert definieren
        // über artikelListe iterieren
        return 0.0;
    }
}
