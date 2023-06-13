/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author rizky
 */
public class TestPassByValue {
    public static void main( String[] args){
        int i =10;
        System.out.println( i );
        test( i );
        System.out.println( i ); 
    }
    
    public static void test( int j ){
        j = 33;
    }
}
