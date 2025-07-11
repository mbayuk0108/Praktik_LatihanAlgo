/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array.p3;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class TwoDImArray {
    public static void main(String args[]) {
        int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int array2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.println("\nValues in array2 by row are");
        outputArray(array2);
    }

    public static void outputArray(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d  ", array[row][column]);
            System.out.println();
        }
    }
}