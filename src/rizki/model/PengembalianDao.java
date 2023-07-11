/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizki.model;
import java.util.*;
/**
 *
 * @author rizky
 */
public class PengembalianDao {
    private List<Pengembalian> data = new ArrayList();
    
    public PengembalianDao(){
        data.add(new Pengembalian ("01","Rizki","023","Kaidah Bahasa Indonesia","10","20","25","5","10.000"));
        data.add(new Pengembalian ("02","Riz Rizki","095","Sastra Indonesia","20","30","5","5","25.000"));
        
    }
    
    public void insert(Pengembalian Pengembalian){
        data.add(Pengembalian);
    }
    public void update(int index,Pengembalian Pengembalian){
        data.set(index,  Pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian>getAll(){
        return data;
    }
}
