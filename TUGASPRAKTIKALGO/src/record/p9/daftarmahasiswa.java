/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package record.p9;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class daftarmahasiswa {

    record Mahasiswa (String nama, String nim, double ipk) {}
    public static void main(String[] args) {
       Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        
        daftarMahasiswa[0] = new Mahasiswa("Zein", "124001", 3.5);
        daftarMahasiswa[1] = new Mahasiswa("Iqbal", "124002", 3.8);
        daftarMahasiswa[2] = new Mahasiswa("Ariq", "124003", 3.7);
        
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama" + mahasiswa.nama() + ",NIM" + mahasiswa.nim() + ",IPK" + mahasiswa.ipk());
        }
    }
}
