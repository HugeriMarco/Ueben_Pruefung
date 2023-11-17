package org.campus02.warenkorbuebung;

public class WarenkorbDemo {

    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb();
        Artikel apfel = new Artikel(1, "Apfel", 0.50);
        Artikel banane = new Artikel(2, "Banane", 1.30);
        Artikel paprika = new Artikel(3, "Paprika", 2.0);

        warenkorb.addArtikel(apfel);
        warenkorb.addArtikel(banane);
        warenkorb.addArtikel(paprika);
        warenkorb.addArtikel(apfel);

        warenkorb.printArtikels();
        double sum = warenkorb.calulcateSum();
        System.out.println("sum = " + sum);

        System.out.println("warenkorb.getHighestPrice() = " + warenkorb.getHighestPrice());

    }
}
