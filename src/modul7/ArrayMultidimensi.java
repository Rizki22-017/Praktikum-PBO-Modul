/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author rizky
 */
public class ArrayMultidimensi {
    int[][] twoD = new int[512][128];
    char[][][] threeD = new char[8][16][24];
    String[][] dogs = {
        {"terry", "brown"},
        {"Kristin", "white"},
        {"toby", "gray"},
        {"fido", "black"}
    };

    public static void main(String[] args) {
        ArrayMultidimensi array = new ArrayMultidimensi();
        System.out.print(array.dogs[0][0]);
    }
}

