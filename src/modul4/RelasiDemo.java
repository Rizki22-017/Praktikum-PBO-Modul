/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author rizky
 */
public class RelasiDemo {
    public static void main(String[] args) {
        // A few numbers
        int i = 37;
        int j = 42;
        int k = 42;

        System.out.println("Variable values...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        // Lebih besar dari
        System.out.println("Greater than...");
        System.out.println("i > j = " + (i > j));  // false
        System.out.println("j > i = " + (j > i));  // true
        System.out.println("k > j = " + (k > j));  // false

        // Lebih besar atau sama dengan
        System.out.println("Greater than or equal to...");
        System.out.println("i >= j = " + (i >= j));  // false
        System.out.println("j >= i = " + (j >= i));  // true
        System.out.println("k >= j = " + (k >= j));  // true

        // Lebih kecil dari
        System.out.println("Less than...");
        System.out.println("i < j = " + (i < j));  // true
        System.out.println("j < i = " + (j < i));  // false
        System.out.println("k < j = " + (k < j));  // false

        // Lebih kecil atau sama dengan
        System.out.println("Less than or equal to...");
        System.out.println("i <= j = " + (i <= j));  // true
        System.out.println("j <= i = " + (j <= i));  // false
        System.out.println("k <= j = " + (k <= j));  // true

        // Sama dengan
        System.out.println("Equal to...");
        System.out.println("i == j = " + (i == j));  // false
        System.out.println("k == j = " + (k == j));  // true

        // Tidak sama dengan
        System.out.println("Not equal to...");
        System.out.println("i != j = " + (i != j));  // true
        System.out.println("k != j = " + (k != j));  // false
    }
}

