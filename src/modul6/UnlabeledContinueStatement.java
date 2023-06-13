/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author rizky
 */
public class UnlabeledContinueStatement {
    public static void main(String[] args) {
        String names[] = {"Rizki", "Rizky", "Rezky", "Riski"};
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Rizki")) {
                continue; // skip next statement
            }
            count++;
        }

        System.out.println("Ada " + count + " Yang Cocok Dalam List");
    }
}

