/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack.p10;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class StackInheritance {
    public static void main(String[] args) {
        IntStack myStack = new IntStack(5);
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        System.out.println("Peek: "+ myStack.peekInt());
        System.out.println("Pop: "+ myStack.popInt());
        System.out.println("Pop: "+ myStack.popInt());
        System.out.println("Pop: "+ myStack.popInt());
        System.out.println("Pop (kosong): "+ myStack.popInt());
    }
}