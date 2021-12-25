/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankaryawan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author WIN10
 */
public class DataKaryawan {
    String Kode, Nama, Alamat;
    LocalDate TglLahir;
    char Golongan;
    boolean Status;
    int Anak;
    
    public DataKaryawan(String k,String n, String a, LocalDate tl,char g, boolean s, int ank) {
        this.Kode = k;
        this.Nama = n;
        this.Alamat = a;
        this.TglLahir = tl;
        this.Golongan = g;
        this.Status = s;
        this.Anak = ank;
    }
    
    public long hitungUsia() {
        LocalDate now = LocalDate.now();
        return ChronoUnit.YEARS.between(this.TglLahir, now);
    }
    
    void output() {
        String status = this.Status ? "Menikah" : "Belum Menikah";
        System.out.println("---------------------------------------------------------");
        System.out.println("Kode Karyawan   : " + this.Kode);
        System.out.println("Nama Karyawan   : " + this.Nama);
        System.out.println("Golongan        : " + this.Golongan);
        System.out.println("Usia            : " + this.hitungUsia());
        System.out.println("Status Menikah  : " + status);
        System.out.println("Jumlah Anak     : " + this.Anak);
        System.out.println("---------------------------------------------------------");
    }
}
