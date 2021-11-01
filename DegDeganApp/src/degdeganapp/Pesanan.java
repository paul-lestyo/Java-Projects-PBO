/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author WIN10
 */
public class Pesanan {
    String kota;
    double jarak;
    double jumlahPasokan;
    
    Pesanan(String kota, int jarak, int jumlahPasokan) {
        this.kota = kota;
        this.jarak = (double) jarak;
        this.jumlahPasokan = (double) jumlahPasokan;
    }
    
    Pesanan(String kota, double jarak, double jumlahPasokan) {
        this.kota = kota;
        this.jarak = jarak;
        this.jumlahPasokan = jumlahPasokan;
    }
    
    public double HitungModalPesanan() {
        Stok stok = new Stok(this.jumlahPasokan);
        return stok.HitungHargaModal();
    }
    
    public double HitungOngkir() {
        Stok stok = new Stok(this.jumlahPasokan);
        double berat = stok.HitungBeratModal();
        
        Kurir kurir = new Kurir(berat);
        double total = kurir.HitungHargaAntar(this.jarak);
        
        return total;
    }
    
}
