/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Procedure.p7;



/**
 *
 * @author Muhamad Bayu Khayatullah
 */
import java.util.Scanner;
public class StatistikNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        double[] nilai = new double[jumlah];

        // Input nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }

        // Panggil prosedur-prosedur
        tampilkanNilai(nilai);
        double rataRata = hitungRataRata(nilai);
        System.out.println("Rata-rata nilai: " + rataRata);

        int jumlahDiAtasRata = hitungDiAtasRata(nilai, rataRata);
        System.out.println("Jumlah mahasiswa yang nilainya di atas rata-rata: " + jumlahDiAtasRata);

        input.close();
    }

    // Prosedur untuk menampilkan semua nilai
    static void tampilkanNilai(double[] data) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + data[i]);
        }
    }

    // Fungsi prosedur non-void (mengembalikan rata-rata)
    static double hitungRataRata(double[] data) {
        double total = 0;
        for (double nilai : data) {
            total += nilai;
        }
        return total / data.length;
    }

    // Prosedur untuk menghitung jumlah nilai di atas rata-rata
    static int hitungDiAtasRata(double[] data, double rataRata) {
        int count = 0;
        for (double nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }
        return count;
    }
}