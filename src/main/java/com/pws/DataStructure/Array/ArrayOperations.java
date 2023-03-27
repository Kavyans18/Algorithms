package com.pws.DataStructure.Array;

public class ArrayOperations {

    public static void display(int a[]) {
        if (a.length == 0) {
            System.out.println("The array is empty");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void delete(int a[], int num) {
        int b[] = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != num) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
                i++;
            }
        }
        display(b);
    }
}
