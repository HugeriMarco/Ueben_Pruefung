package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student max = new Student(1, "Max Mustermann");
        students.add(max);
        Student susi = new Student(2, "Susi Sorglos");
        students.add(susi);
        students.add(new Student(3, "John Doe"));
        System.out.println(students);
        System.out.println(students.size());

        students.remove(max); // remove max
        System.out.println(students);
        students.remove(0); // remove susi, da susi nun auf index 0 liegt
        System.out.println(students);
        System.out.println(students.size());

        // nochmals hinzufügen da oben beide entfernt wurden
        students.add(max);
        students.add(susi);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
        }

        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }

        boolean containsMax = students.contains(max);
        System.out.println("containsMax = " + containsMax);

        boolean containsSusi = students.contains(new Student(2, "Susi Sorglos"));
        System.out.println("containsSusi = " + containsSusi);

        max.equals(new Student(2, "Susi Sorglos")); // -> false
        susi.equals(new Student(2, "Susi Sorglos")); // -> erhoffen wir uns true -> bekommen false

        Student max2 = new Student(4, "Max Mustermann");
        boolean maxEqualsMax2 = max.equals(max2);
        System.out.println(maxEqualsMax2);
    }
}
