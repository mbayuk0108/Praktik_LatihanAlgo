/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue.p11;

/**
 *
 * @author ASUS
 */
public class Queue {
    private List queueList;

    public Queue() {
        queueList = new List("queue");
    }

    public void enqueue(Object object) {
        queueList.insertAtBack(object);
    }

    public Object dequeue() {
        return queueList.removeFromFront();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void print() {
        queueList.print();
    }
}