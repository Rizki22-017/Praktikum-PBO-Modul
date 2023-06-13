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
public class anggotaDao {
    private List<anggota> data = new ArrayList();
    
    public anggotaDao(){
        data.add(new anggota("A001","Ali","Padang","L"));
        data.add(new anggota("A002","Ani","Pekanbaru","P"));
    }
    
    public void insert(anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index,anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<anggota> getAll(){
        return data;
    }
}
