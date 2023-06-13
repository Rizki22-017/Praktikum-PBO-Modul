/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author rizky
 */
class TestPassByreference2 {
    public static void main(String[] args) {
        // Membuat array integer
        int[] ages = {10, 11, 12};
        
        // Mencetak nilai array
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        
        test(ages);
        
        // Mencetak kembali nilai array
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
    
    public static void test(int[] arr) {
        // Mengubah nilai pada array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 50;
        }
    }
}

