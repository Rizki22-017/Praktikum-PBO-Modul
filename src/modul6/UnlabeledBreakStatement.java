/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author rizky
 */
public class UnlabeledBreakStatement {
    public static void main(String[] args) {
        String names[] = {"Rizki", "Rezki", "Rizky", "Rizqi", "Riski", "Reski", "Risky", "Risqi"};
        String searchName = "Rizki";
        boolean foundName = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                foundName = true;
                break;
            }
        }

        if (foundName) {
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}

