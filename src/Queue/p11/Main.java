/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Queue.p11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Isi queue:");
        queue.print();

        System.out.println("Ambil dari queue: " + queue.dequeue());
        System.out.println("Isi setelah dequeue:");
        queue.print();
    }
}
