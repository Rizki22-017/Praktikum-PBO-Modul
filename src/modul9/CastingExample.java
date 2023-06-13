/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author rizky
 */
public class CastingExample {
    public static void main(String[] args) {
        int numInt = 10;
        double numDouble = numInt; // implicit cast

        System.out.println("numInt: " + numInt);
        System.out.println("numDouble: " + numDouble);

        char valChar = 'A';
        int valInt = valChar;

        System.out.println("valInt: " + valInt); // casting eksplisit: output 65

        double valDouble = 10.12;
        int valInt2 = (int) valDouble; // melakukan konversi valDouble ke tipe int

        double x = 10.2;
        int y = 2;
        int result = (int) (x / y); // hasil operasi casting ke int

        System.out.println("valInt2: " + valInt2);
        System.out.println("result: " + result);
    }
}

