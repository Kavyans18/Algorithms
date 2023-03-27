package com.pws.DataStructure.Array;

public class BinarySearch {
    public static void search(int[] a, int num, int first, int last) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (a[mid] < num) {
                first = mid + 1;
            } else if (a[mid] == num) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}

