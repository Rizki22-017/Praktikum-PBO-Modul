/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author rizky
 */
public class LabeledContinueStatement {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inside for(j) loop"); // message1
                if (j == 2)
                    continue outerLoop;
            }

            System.out.println("Inside for(i) loop"); // message2
        }
    }
}

