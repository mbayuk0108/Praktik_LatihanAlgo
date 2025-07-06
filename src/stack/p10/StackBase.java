/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack.p10;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class StackBase {
    protected int size;
    protected int top;
    protected Object[] stackArray;

    public StackBase(int size) {
        this.size = size;
        stackArray = new Object[size];
        top = -1;
    }

    // Operasi umum
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Object value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Object peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            return null;
        }
    }
}