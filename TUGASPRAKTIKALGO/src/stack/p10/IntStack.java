/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack.p10;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
    public class IntStack extends StackBase {

    public IntStack(int size) {
        super(size);
    }

    // Override push dan pop agar hanya menerima dan mengembalikan Integer
    public void push(int value) {
        super.push(Integer.valueOf(value));
    }

    public int popInt() {
        Integer val = (Integer) super.pop();
        return val != null ? val : -1;
    }

    public int peekInt() {
        Integer val = (Integer) super.peek();
        return val != null ? val : -1;
    }
}
