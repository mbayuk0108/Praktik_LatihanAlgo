/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package record.p9;

/**
 *
 * @author Muhamad Bayu Khayatullah
 */
public class ages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ages[] = {20,22,18,35,48,26,87,70};
        
        int length = ages.length;
        int highestAge = ages[0];
        for (int age : ages) {
            if (highestAge < age) {
                highestAge = age;
            }
        }
        System.out.println("The highest age in the array is: "+ highestAge);
    }
    
}
