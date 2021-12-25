/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankaryawan;

import golongan.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

/**
 *
 * @author WIN10
 */
public class Karyawan implements Gaji{
    DataKaryawan karyawan;
    ArrayList<DataKaryawan> dataKaryawan = new ArrayList<DataKaryawan>();
    int gaji = 0, tStatus = 0, tUsia = 0, tAnak = 0;
    
    void tambahKaryawan(DataKaryawan karyawan) {
        this.dataKaryawan.add(karyawan);
    }
    
    void cariKaryawan(String Kode){
        boolean finded = false;
        int index = -1;
        for(int i=0; i<this.dataKaryawan.size(); i++){
            if (this.dataKaryawan.get(i).Kode.equals(Kode)){
                index = i;
                finded = true;
            }
        }
         
        if (finded == true){
            this.karyawan = this.dataKaryawan.get(index);
        } else {
            System.out.println("Data karyawan tidak ditemukan");
            this.karyawan = null;
            
        }
    }
    
    void showPrifle() {
        System.out.println("===================================");
        System.out.println("DATA PROFILE KARYAWAN");
        this.karyawan.output();
        switch(this.karyawan.Golongan) {
            case 'A':
                A a = new A();
                this.gaji = a.getGajiPokok();
            case 'B':
                B b = new B();
                this.gaji = b.getGajiPokok();
            case 'C':
                C c = new C();
                this.gaji = c.getGajiPokok();
        }
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Gaji Pokok              : " + kursIndonesia.format(this.gaji));
        int gajiKotor = this.hitungGajiKotor(this.gaji, this.hitungTunjangan());
        System.out.println("Tunjangan Istri/Suami   : " + kursIndonesia.format(this.tStatus));
        System.out.println("Tunjangan Pegawai       : " + kursIndonesia.format(this.tUsia));
        System.out.println("Tunjangan Anak          : " + kursIndonesia.format(this.tAnak));
        System.out.println("--------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : " + kursIndonesia.format(gajiKotor));
        double potongan = gajiKotor * 2.5 / 100;
        System.out.println("Potongan                : " + kursIndonesia.format(potongan));
        System.out.println("Gaji Bersih             : " + kursIndonesia.format(this.hitungGajiBersih(gajiKotor, potongan)));
        this.gaji = this.tUsia = this.tStatus = this.tAnak = 0;
    }
    
    void hapusKaryawan(String Kode) {
        boolean finded = false;
        int index = -1;
        for(int i=0; i<this.dataKaryawan.size(); i++){
            if (this.dataKaryawan.get(i).Kode.equals(Kode)){
                index = i;
                finded = true;
            }
        }
        
        if (finded == true){
            this.dataKaryawan.remove(index);
            this.gaji = this.tUsia = this.tStatus = this.tAnak = 0;
            System.out.println("Karyawan dengan Kode "+ Kode +" Berhasil di hapus");
        } else {
            System.out.println("Data karyawan tidak ditemukan");
            
        }
    }
    
    void printAllKaryawan() {
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s\n", "KODE KARY", "NAMA KARY", "Gol", "Usia", "Status Nikah", "Jumlah Anak");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for(int i=0; i<this.dataKaryawan.size(); i++){
            DataKaryawan data = this.dataKaryawan.get(i);   
            String status = data.Status ? "Menikah" : "Belum Menikah";
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s\n", data.Kode, data.Nama, data.Golongan, data.hitungUsia(), status, data.Anak);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public int hitungGajiKotor(int gapok, int tunjangan) {
        return gapok + tunjangan;
    }

    @Override
    public int hitungTunjangan() {
        if(this.karyawan.Status) {
            this.tStatus = this.gaji * 10 /100;
        }
        
        if(this.karyawan.hitungUsia() > 30) {
            this.tUsia = this.gaji * 15 / 100;
        }
        
        if(this.karyawan.Anak > 0) {
            this.tAnak = (this.gaji * 5 / 100) * this.karyawan.Anak;
        }
        
        return this.tStatus + this.tUsia + this.tAnak;
    }

    @Override
    public double hitungGajiBersih(double gajiKotor, double potongan) {
        return gajiKotor - potongan;
    }
}
