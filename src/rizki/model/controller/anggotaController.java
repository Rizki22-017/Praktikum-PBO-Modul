/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizki.model.controller;
import rizki.model.*;
import rizki.model.view.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author rizky
 */
public class anggotaController {
    private formAnggota formAnggota;
    private anggota anggota;
    private anggotaDao anggotaDao;
    
    public anggotaController(formAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new anggotaDao();
    }
    
    public void clearForm(){
        formAnggota.getTxtkodeAnggota().setText("");
        formAnggota.getTxtnamaAnggota().setText("");
        formAnggota.getTxtalamat().setText("");
        formAnggota.getCbojenisKelamin().removeAllItems();
        formAnggota.getCbojenisKelamin().addItem("L");
        formAnggota.getCbojenisKelamin().addItem("P");
        
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<anggota> list = anggotaDao.getAll();
        for (anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
   public void saveAnggota(){
    anggota = new anggota();
    anggota.setKodeAnggota(formAnggota.getTxtkodeAnggota().getText());
    anggota.setNamaAnggota(formAnggota.getTxtnamaAnggota().getText());
    anggota.setAlamat(formAnggota.getTxtalamat().getText());
    anggota.setJenisKelamin(formAnggota.getCbojenisKelamin().getSelectedItem().toString());
    anggotaDao.insert(anggota);
    JOptionPane.showMessageDialog(formAnggota, "Insert OK");
    }
   
   public void updateAnggota(){
       int index = formAnggota.getTabelAnggota().getSelectedRow();
       anggota = anggotaDao.getAnggota(index);
       anggota.setKodeAnggota(formAnggota.getTxtkodeAnggota().getText());
       anggota.setNamaAnggota(formAnggota.getTxtnamaAnggota().getText());
       anggota.setAlamat(formAnggota.getTxtalamat().getText());
       anggota.setJenisKelamin(formAnggota.getCbojenisKelamin().getSelectedItem().toString());
       anggotaDao.update(index, anggota);
       JOptionPane.showMessageDialog(formAnggota, "Update OK");
   }
   
   public void getAnggota(){
       int index = formAnggota.getTabelAnggota().getSelectedRow();
       anggota = anggotaDao.getAnggota(index);
       if(anggota!=null){
           formAnggota.getTxtkodeAnggota().setText(anggota.getKodeAnggota());
           formAnggota.getTxtnamaAnggota().setText(anggota.getNamaAnggota());
           formAnggota.getTxtalamat().setText(anggota.getAlamat());
           formAnggota.getCbojenisKelamin().addItem(anggota.getJenisKelamin());
       }
   }
   
   public void deleteAnggota(){
       int index = formAnggota.getTabelAnggota().getSelectedRow();
       anggotaDao.delete(index);
       JOptionPane.showMessageDialog(formAnggota, "Delete OK");
   }

    
}
