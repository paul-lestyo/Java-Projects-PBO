/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author WIN10
 */
public class Member {
    public DataMember member;
    protected int biayaSewa; 
    protected LocalDate tglPinjam;
    protected LocalDate tglKembali;
    protected int banyakHari;
    ArrayList<DataMember> dataMember = new ArrayList<DataMember>();
    
    public void tambahMember(DataMember data) {
        this.dataMember.add(data);
    }
    
    void cariBarang(String ID){
        boolean finded = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
            if (this.dataMember.get(i).ID.equals(ID)){
                index = i;
                finded = true;
            }
        }
         
        if (finded == true){
            this.member = this.dataMember.get(index);
        } else {
            System.out.println("Data member tidak ditemukan");
            System.exit(0);
            
        }
    }
    
    public DataMember inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                  : ");
        this.cariBarang(input.nextLine());
        
        return this.member;
    }
    
    void inputPinjam() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)      : ");
        int tglPinjam = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam   (1-12)      : ");
        int blnPinjam = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam               : ");
        int thnPinjam = input.nextInt();
        this.tglPinjam = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);
        
        System.out.print("Masukkan Tanggal Kembali (1-31)     : ");
        int tglKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali   (1-12)     : ");
        int blnKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali              : ");
        int thnKembali = input.nextInt();
        this.tglKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);
        
        this.banyakHari = (int) ChronoUnit.DAYS.between(this.tglPinjam, this.tglKembali);
        System.out.println();
        if(this.banyakHari < 0) {
            System.out.println("Tanggal Pinjam Salah!");
            System.exit(0);
        }
    }
    
    protected void output() {
        this.member.print();
        System.out.println("Tanggal Pinjam      : " + this.tglPinjam);
        System.out.println("Tanggal Kembali     : " + this.tglKembali);
        System.out.println("Lama Sewa           : " + this.banyakHari + " hari");
        System.out.println();
    }
    
    
    
}
