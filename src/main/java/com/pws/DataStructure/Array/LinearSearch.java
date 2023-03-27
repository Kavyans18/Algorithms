package com.pws.DataStructure.Array;

public class LinearSearch {

    public static void search(int a[], int num) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == num) {
                System.out.println("Element " + num + " is at position " + a[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found in the array");
        }
    }

}
