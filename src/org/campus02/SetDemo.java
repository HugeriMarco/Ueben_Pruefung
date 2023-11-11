package org.campus02;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        // hinzufügen
        names.add("max");
        names.add("susi");
        names.add("john");
        System.out.println(names); // -> max, susi, john
        // füge max nochmals hinzu -> !!! Achtung wäre Duplikat !!!
        names.add("max");
        System.out.println(names); // -> max, susi, john

        // entferne elemente
        names.remove("john");
        System.out.println(names);

        // ist max enthalten???
        boolean containsMax = names.contains("max");
        System.out.println("containsMax = " + containsMax);
        boolean containsJohn = names.contains("john");
        System.out.println("containsJohn = " + containsJohn);

        names.add("john");
        names.add("john");
        System.out.println(names);

        names.clear(); // -> leert das komplette set aus
        System.out.println(names);
    }
}
