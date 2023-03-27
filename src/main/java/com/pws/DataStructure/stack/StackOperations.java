package com.pws.DataStructure.stack;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Iterator;
import java.util.Stack;

public class StackOperations {
    Stack<Integer> s1 = new Stack<>();

    public static void display(Stack<Integer> s1) {
        System.out.println(s1);
    }

    public static void interate(Stack<Integer> s) {
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}
