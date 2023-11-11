package org.campus02;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMap {

    public static void main(String[] args) {
        HashMap<String, String> deToEnDict = new HashMap<>();
        deToEnDict.put("Katze", "Cat");
        deToEnDict.put("Hund", "Dog");

        String katzeInEnglish = deToEnDict.get("Katze");
        String hundInEnglish = deToEnDict.get("Hund");
        System.out.println("katzeInEnglish = " + katzeInEnglish);
        System.out.println("hundInEnglish = " + hundInEnglish);


        for (Map.Entry<String, String> deToEngl : deToEnDict.entrySet()) {
            System.out.println(deToEngl.getKey() + " auf Deutsch");
            System.out.println("heißt auf Englisch " + deToEngl.getValue());
        }
    }
}
