package org.campus02;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<>(); // STRG + ALT + V -> erzeugung der variable

        // add -> Elemente hinzufügen
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList);

        // abfrage der Größe
        int sizeOfIntList = intList.size();
        System.out.println("sizeOfIntList = " + sizeOfIntList);

        // zugriff auf element
        //intArray[1]
        Integer secondElement = intList.get(1);
        System.out.println("secondElement = " + secondElement);
        // zugriff auf letztes Element
        System.out.println(intList.get(intList.size() - 1));

        // hinzufügen am Anfang /erster Stelle
        intList.add(0, 5);
        System.out.println(intList);
        intList.add(2, 6);
        System.out.println(intList);

        // enthält element abfrage
        // STRG + Q -> Doc aufrufen

        boolean contains5 = intList.contains(5);
        System.out.println("contains5 = " + contains5);
        boolean contains10 = intList.contains(10);
        System.out.println("contains10 = " + contains10);

        // elemente entfernen
        Integer removedElement = intList.remove(5);// entfernen an einer gewissen Stelle -> Index

        stringList.add("Hallo");
        stringList.remove("Hallo"); // remove Element/Object


        // iterieren mittels for-schleifen
        System.out.println("for-schleife");
        for (int i = 0; i < intList.size(); i++) {
            int element = intList.get(i);
            System.out.println(element);
        }

        System.out.println();
        // iterieren mittels for-each
        System.out.println("for-each");
        for (Integer i : intList) {
            System.out.println(i);
        }

    }
}
