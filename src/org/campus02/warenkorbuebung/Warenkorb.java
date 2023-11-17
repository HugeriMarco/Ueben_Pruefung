package org.campus02.warenkorbuebung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        // double highestPrice = 0.0;
        double highestPrice = Double.MIN_VALUE;

        // über artikelListe iterieren
        for (Artikel artikel : artikelListe) {
            if (highestPrice < artikel.getPrice()) {
                highestPrice = artikel.getPrice();
            }
        }
        return highestPrice;
    }

    public HashSet<Artikel> getUniqueArtikels() {
        HashSet<Artikel> unique = new HashSet<>();
        for (Artikel artikel : artikelListe) {
            unique.add(artikel);
        }
        return unique;
    }

    public ArrayList<Artikel> getUniqueArtikels2() {
        ArrayList<Artikel> unique = new ArrayList<>();
        for (Artikel artikel : artikelListe) {
            if (!unique.contains(artikel)) {
                unique.add(artikel);
            }
        }
        return unique;
    }

    public HashSet<Artikel> getUniqueArtikels3() {
        return new HashSet<>(artikelListe);
    }

    public HashMap<String, Integer> getArtikelCount() {
        // key -> Datentyp: String; Artikelname
        // value -> Datentyp: Integer; Anzahl der Artikel mit demselben Namen
        HashMap<String, Integer> artikelsCountMap = new HashMap<>();
        for (Artikel artikel : artikelListe) {
            if (artikelsCountMap.containsKey(artikel.getName())) {
                int count = artikelsCountMap.get(artikel.getName());
                int newCount = count + 1;
                //count = count + 1;
                artikelsCountMap.put(artikel.getName(), newCount);
                //artikelsCountMap.put(artikel.getName(), count + 1);
            } else {
                artikelsCountMap.put(artikel.getName(), 1);
            }
        }

        return artikelsCountMap;
    }
}
