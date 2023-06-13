/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul12;

/**
 *
 * @author rizky
 */
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Exception caught!");
        }
    }
}

