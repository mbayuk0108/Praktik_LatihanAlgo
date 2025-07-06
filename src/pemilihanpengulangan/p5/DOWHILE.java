/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilihanpengulangan.p5;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class DOWHILE 
{
    public static Object[] i;
    public static void main(String[] args) {
        // for statement header includes initializitation,
        // loop-continuation condition and increment
       int i = 2; // inisialisasi variabel sebelum do-while 
       do{
           System.out.printf("%d",i ); // cetak nilai i 
           i += 3; // Peningkatan nilai i
       } while ( i <= 20); // Kondisi perulangan
        
        System.out.println (); // output a newline 
    }   // end main
}  // end class ForCounter