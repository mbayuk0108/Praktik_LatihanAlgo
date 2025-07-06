/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pemilihanpengulangan.p5;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class MainException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            checkListEmpty(true); // Ganti ke false untuk lihat kondisi tidak error
        } catch (EmptyListException e) {
            System.out.println("Terjadi Exception: " + e.getMessage());
        }
    }

    public static void checkListEmpty(boolean isEmpty) throws EmptyListException {
        if (isEmpty) {
            throw new EmptyListException("MyList");
        }
        System.out.println("List tidak kosong, aman digunakan.");
    }
}