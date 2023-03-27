package com.pws.DataStructure.Queue;

public class QueueOperations {
    int front;
    int rear;
    int caps;
    static int[] q1;

    public QueueOperations(int size) {
        caps = size;
        q1 = new int[caps];
    }

    public void enque(int value) {
        if (rear == caps) {
            System.out.println("Queue is already full");
        }
        q1[rear] = value;
        rear++;
    }

    public void deque() {
        if (rear == 0) {
            System.out.println("The queue is empty");
        }
        for (int i = 0; i < rear - 1; i++) {
            q1[i] = q1[i + 1];
        }
        rear--;
    }

    public void Display() {
        if (rear == 0) {
            System.out.println("The queue is empty");
        }
        for (int i = 0; i < rear; i++) {
            System.out.println(q1[i]);
        }
    }

}
