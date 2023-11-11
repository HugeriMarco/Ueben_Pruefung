package org.campus02;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        int index1 = ints[1];
        System.out.println(index1);

        int[] addInts = add(5, ints);
        System.out.println(Arrays.toString(addInts));

        System.out.println(contains(3, ints));
        System.out.println(contains(5, ints));
        System.out.println(contains(5, addInts));
    }

    public static int[] add(int newValue, int[] ints) {
        int[] newInts = new int[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            newInts[i] = ints[i];
        }
        newInts[ints.length] = newValue;
        return newInts;
    }

    public static boolean contains(int compareValue, int[] ints) {
        // itar + tab
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            if (anInt == compareValue) {
                return true;
            }
        }
        return false;
    }
}
