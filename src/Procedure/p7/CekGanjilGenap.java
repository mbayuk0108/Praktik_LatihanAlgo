/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedure.p7;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.Scanner;
public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan sebuah bilangan bulat: ");
        angka = input.nextInt();

        // Panggil prosedur
        cekGanjilGenap(angka);

        input.close();
    }

    // Ini adalah prosedur karena tidak mengembalikan nilai (void)
    static void cekGanjilGenap(int bilangan) {
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }
    }
}