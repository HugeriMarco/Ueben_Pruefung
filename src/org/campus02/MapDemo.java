package org.campus02;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> matrNrToNameMap = new HashMap<>();
        matrNrToNameMap.put("max", 1);
        matrNrToNameMap.put("susi", 2);
        System.out.println(matrNrToNameMap);

        // get Value of Key
        Integer matrNrOfMax = matrNrToNameMap.get("max");
        System.out.println("matrNrOfMax = " + matrNrOfMax);

        // wenn der max bereits als key vorhanden
        // ja -> nicht in die map aufnehmen
        // nein -> in die map aufnehmen
        if (matrNrToNameMap.containsKey("max")) {
            System.out.println("Max bereits vorhanden");
        } else {
            matrNrToNameMap.put("max", 3);
        }

        System.out.println(matrNrToNameMap);

        matrNrToNameMap.remove("susi");
        System.out.println(matrNrToNameMap);

        matrNrToNameMap.put("john", 4);

        // gib mir alle keys => .keySet()
        for (String name : matrNrToNameMap.keySet()) {
            System.out.println("Name: " + name + " hat die MatrNr: " + matrNrToNameMap.get(name));
        }

        // alle values innerhalb der map (einzeln durchlaufen)
        for (Integer value : matrNrToNameMap.values()) {
            System.out.println("value = " + value);
        }
        System.out.println(matrNrToNameMap.values());
    }
}
