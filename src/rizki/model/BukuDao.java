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
public class BukuDao {
     private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku ("111","Matematika","Rizki","Gramedia"));
        data.add(new Buku("112","Statistika","Rizki","Politeknik Negeri Padang"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}
