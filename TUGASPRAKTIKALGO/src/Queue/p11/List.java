/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue.p11;

/**
 *
 * @author ASUS
 */
    import java.util.LinkedList;

public class List {
    private final String name; // nama list
    private final LinkedList<Object> list;

    public List(String name) {
        this.name = name;
        list = new LinkedList<>();
    }

    public void insertAtBack(Object object) {
        list.addLast(object);
    }

    public Object removeFromFront() {
        if (isEmpty()) {
            throw new EmptyListException(name);
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void print() {
        System.out.print(name + ": ");
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}