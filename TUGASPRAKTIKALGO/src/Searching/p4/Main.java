package Searching.p4;


import Searching.p4.LinearArray;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        LinearArray array = new LinearArray(10); // buat array dengan 10 elemen

        System.out.println("Array:");
        System.out.println(array);

        int key = 25; // contoh angka yang ingin dicari
        int result = array.linearSearch(key);

        if (result != -1)
            System.out.printf("Angka %d ditemukan di indeks %d.\n", key, result);
        else
            System.out.printf("Angka %d tidak ditemukan di array.\n", key);
    }
}
