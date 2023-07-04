/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku.model.controller;
import buku.model.view.formBuku;
import buku.model.BukuDao;
import buku.model.Buku;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author rizky
 */
public class BukuController {
    private formBuku formBuku;
    private Buku buku;
    private BukuDao BukuDao;
    
    public BukuController(formBuku fromBuku){
        this.formBuku = formBuku;
        BukuDao = new BukuDao();
        
    }
    public void clearForm(){
        formBuku.gettxtkode().setText("");
        formBuku.gettxtjudul().setText("");
        formBuku.gettxtpengarang().setText("");
        formBuku.gettxtpenerbit().setText("");
        
        
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               formBuku.gettabelbuku().getModel();
       tabelModel.setRowCount(0);
       List<Buku> list =BukuDao.getAll();
       for (Buku a : list){
        Object [] row ={
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getPengarang(),
            a.getPenerbit(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.gettxtkode().getText());
        buku.setJudulBuku(formBuku.gettxtjudul().getText());
        buku.setPengarang(formBuku.gettxtpengarang().getText());
        buku.setPenerbit(formBuku.gettxtpenerbit().getText());
       
        BukuDao.insert(buku);
        JOptionPane.showMessageDialog(formBuku,"insert OK");
        
    }
    
    public void updateBuku(){
        int index = formBuku.gettabelbuku().getSelectedRow();
        buku = BukuDao.getBuku(index);
        buku.setKodeBuku(formBuku.gettxtkode().getText());
        buku.setJudulBuku(formBuku.gettxtjudul().getText());
        buku.setPengarang(formBuku.gettxtpengarang().getText());
        buku.setPenerbit(formBuku.gettxtpenerbit().getText());
       
        BukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku,"Update OK");
    }
    
    public void getBuku(){
        int index = formBuku.gettabelbuku().getSelectedRow();
        buku = BukuDao.getBuku(index);
        if(buku!=null){
            formBuku.gettxtkode().setText(buku.getKodeBuku());
            formBuku.gettxtjudul().setText(buku.getJudulBuku());
            formBuku.gettxtpengarang().setText(buku.getPengarang());
            formBuku.gettxtpenerbit().setText(buku.getPenerbit());
            
        }
    }
    
    public void deleteBuku(){
        int index = formBuku.gettabelbuku().getSelectedRow();
        BukuDao.delete(index);
         JOptionPane.showMessageDialog(formBuku,"Delete OK");  
    }

    public void getAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
