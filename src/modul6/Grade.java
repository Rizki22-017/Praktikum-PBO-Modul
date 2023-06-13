/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author rizky
 */
public class Grade {
    public static void main(String[] args) {
        double grade = 92.0;

        if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 80) {
            System.out.println("Good job!");
        } else if (grade >= 60) {
            System.out.println("Study harder!");
        } else {
            System.out.println("Sorry, you failed.");
        }
    }
}

