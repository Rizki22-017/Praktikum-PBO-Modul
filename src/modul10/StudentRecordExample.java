/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

/**
 *
 * @author rizky
 */
public class StudentRecordExample {
    public static void main(String[] args)
    {
        StudentRecord anna = new StudentRecord();
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        anna.setMathGrade(80);
        anna.setEnglishGrade(70);
        anna.setScienceGrade(80);
        
        System.out.println("Nama        : "+anna.getName());
        System.out.println("Alamat      : "+anna.getAddress());
        System.out.println("Umur        : "+anna.getAge());
        System.out.println("Matematika  : "+anna.getMathGrade());
        System.out.println("B Inggris   : "+anna.getEnglishGrade());
        System.out.println("Sains       : "+anna.getScienceGrade());
        System.out.println("Rata-rata   : "+anna.getAverage());
        
        /////
        System.out.println("");
        ////
        StudentRecord ali = new StudentRecord();
        ali.setName("Ali");
        ali.setAddress("Padang");
        
        ali.print("");
        ali.print(80, 70, 90);
        
        /////
        System.out.println("");
        ////
        StudentRecord budi = new StudentRecord("Budi","Padang");
        budi.print("");
        budi.print(80, 70, 90);
        
        System.out.println("Jumlah Siswa    : "+StudentRecord.getStudentCount());
    }
}
