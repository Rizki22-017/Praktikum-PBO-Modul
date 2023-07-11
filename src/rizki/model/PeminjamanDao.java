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
public class PeminjamanDao {
    private List<Peminjaman> data = new ArrayList();
    
    public PeminjamanDao(){
        data.add(new Peminjaman ("01","Rizki","023","Kaidah Bahasa Indonesia","10","20"));
        data.add(new Peminjaman ("02","Riz Rizki","095","Sastra Indonesia","20","30"));
        
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index,  peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}
