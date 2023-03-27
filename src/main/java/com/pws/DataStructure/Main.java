package com.pws.DataStructure;

import com.pws.DataStructure.Array.ArrayOperations;
import com.pws.DataStructure.Array.BinarySearch;
import com.pws.DataStructure.Array.LinearSearch;
import com.pws.DataStructure.HashMap.HashMapOperations;
import com.pws.DataStructure.LinkedList.LinkedListOperations;
import com.pws.DataStructure.Queue.QueueOperations;
import com.pws.DataStructure.sort.InsertionSort;
import com.pws.DataStructure.sort.MergeSort;
import com.pws.DataStructure.sort.QuickSort;
import com.pws.DataStructure.sort.SelectionSort;
import com.pws.DataStructure.stack.StackOperations;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 6, 5, 7};
        int b[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Array Operations");
        ArrayOperations.display(a);
        System.out.println();
        System.out.println("After deleting");
        ArrayOperations.delete(a, 2);
        System.out.println();
        System.out.println("----------------------------------------------------------");

        //Stack operations
        System.out.println("Stack Operations");
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(4);
        s1.push(6);
        StackOperations.display(s1);
        s1.pop();
        System.out.println("After popping");
        StackOperations.display(s1);
        System.out.println("Peek");
        System.out.println(s1.peek());
        System.out.println("Checking if the stack is empty");
        boolean status = s1.empty();
        System.out.println(status);
        System.out.println("Searching the element where index is displayed");
        int index = s1.search(4);
        System.out.println(index);
        System.out.println("Iterating the Stack");
        StackOperations.interate(s1);
        System.out.println("----------------------------------------------------------");

        //Queue
        System.out.println("Queue Operations");
        QueueOperations q = new QueueOperations(5);
        q.enque(2);
        q.enque(3);
        q.enque(5);
        q.enque(7);
        System.out.println("Displaying the queue");
        q.Display();
        System.out.println("Removing an element from a queue");
        q.deque();
        q.Display();
        System.out.println("----------------------------------------------------------");

        //Array List
        System.out.println("Array List");

        //Linked List
        System.out.println("LinkedList Operations");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(8);
        LinkedListOperations.display(ll);
        System.out.println("Removing the element from Linked List");
        ll.remove(2);
        LinkedListOperations.display(ll);
        System.out.println("Size of the Linked List is " + ll.size());
        Boolean val = ll.contains(1);
        System.out.println("Searching the element 1 " + val);
        System.out.println("----------------------------------------------------------");

        //HashMap
        System.out.println("Hash Map Operations");
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Vaishnavi", 101);
        student.put("Nikitha", 102);
        HashMapOperations.displayKey(student);
        System.out.println();
        HashMapOperations.displayPair(student);
        System.out.println("----------------------------------------------------------");


        //Binary Search and Linear Search
        int num = 4;
        System.out.println("Linear Search");
        LinearSearch.search(a, num);
        System.out.println("----------------------------------------------------------");

        //Binary Search
        System.out.println("Binary search Operations");
        int first = b[0];
        int last = b.length - 1;
        BinarySearch.search(b, num, first, last);
        System.out.println("----------------------------------------------------------");

        //Insertion sort
        System.out.println("Insertion Sort");
        System.out.println("Array before Sorting ");
        ArrayOperations.display(a);
        InsertionSort.insertionSort(a);
        System.out.println();
        System.out.println("Array after Sorting ");
        ArrayOperations.display(a);
        System.out.println();
        System.out.println("----------------------------------------------------------");

        //Selection Sort
        int[] sel = {1, 4, 2, 6, 5, 7};
        System.out.println("Selection Sort");
        System.out.println("Array before sorting");
        ArrayOperations.display(sel);
        SelectionSort.sSort(sel);
        int l = a.length;
        System.out.println();
        System.out.println("Array after sorting");
        ArrayOperations.display(sel);
        System.out.println();
        System.out.println("----------------------------------------------------------");

        //Quick Sort
        int[] Qui = {1, 4, 2, 6, 5, 7};
        System.out.println("Quick Sort");
        System.out.println("Array before sorting");
        ArrayOperations.display(Qui);
        System.out.println();
        QuickSort.quick(Qui, 0, l - 1);
        System.out.println("The array after sorting");
        ArrayOperations.display(Qui);
        System.out.println();
        System.out.println("----------------------------------------------------------");

        //Merge Sort
        int[] mer = {1, 4, 2, 6, 5, 7};
        int len = mer.length;
        System.out.println("Merge Sort");
        System.out.println("Array before sorting");
        ArrayOperations.display(mer);
        MergeSort.sort(mer, len);
        System.out.println();
        System.out.println("Array after sorting");
        ArrayOperations.display(mer);
    }

}