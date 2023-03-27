package com.pws.DataStructure.sort;

import com.pws.DataStructure.Array.ArrayOperations;

public class QuickSort {
    public static int partition(int[] a, int start, int end) {
        int pivote = a[end];
        int i = (start - 1);
        for (int j = start; j <= end; j++) {
            if (a[j] < pivote) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return (i + 1);
    }

    public static void quick(int a[], int start, int end) {
        if (start < end) {
            int part = partition(a, start, end);
            quick(a, start, part - 1);
            quick(a, part + 1, end);
        }
    }

}
