package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;

public class ZutatenIndex {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> zutatenIndexDict = new HashMap<>();
        ArrayList<Integer> mehlSeiten = new ArrayList<>();
        mehlSeiten.add(2);
        mehlSeiten.add(12);
        mehlSeiten.add(15);
        zutatenIndexDict.put("Mehl", mehlSeiten);
        ArrayList<Integer> mehlSeiteListe = zutatenIndexDict.get("Mehl");
        mehlSeiteListe.add(56);

        System.out.println(zutatenIndexDict);

        zutatenIndexDict.put("Zucker", new ArrayList<>());
        System.out.println(zutatenIndexDict);
    }
}
