package org.campus02.warenkorbuebung;

public class Artikel {

    private int artId;
    private String name;
    private double price;

    public Artikel(int artId, String name, double price) {
        this.artId = artId;
        this.name = name;
        this.price = price;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return "Artikel{" +
                "artId=" + artId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
