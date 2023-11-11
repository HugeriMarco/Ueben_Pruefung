package org.campus02;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student max = new Student(1, "max");
        Student susi = new Student(2, "susi");
        Student john = new Student(3, "john");

        students.add(max);
        students.add(susi);
        students.add(john);
        System.out.println(students);

        students.add(max);

        students.add(new Student(1, "max")); // student erzeugen und gleich zum set hinzufügen
        System.out.println(students);

        students.add(new Student(4, "max"));
        System.out.println(students);

        // verhindern dass doppelte matrikelnummern enthalten sind über equals & hashcode
        // nur die matrNr heranziehen für den Vergleich
        students.add(new Student(4, "geri"));
        System.out.println(students);

        students.remove(max);
        System.out.println(students);

        System.out.println(students.contains(susi));

        // iter + tab
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
