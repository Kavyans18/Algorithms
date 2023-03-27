package com.pws.DataStructure.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
    public static void display(LinkedList<Integer> ll) {
        Iterator it = ll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
