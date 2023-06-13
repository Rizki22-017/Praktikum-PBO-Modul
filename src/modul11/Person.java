/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author rizky
 */
public class Person {
    protected String name;
    protected String address;
    
    /**
     * Default constructor
     */
    public Person() {
        System.out.println("Inside Person: Constructor");
        name = "";
        address = "";
    }
    
    /**
     * Constructor dengan dua parameter
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    /**
     * Method accessor
     */
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

