/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author WIN10
 */
public abstract class Mobil {
    public abstract double hitungMinBahanBakar();
    public abstract double hitungWaktuPerjalanan();
    
    public void tampilHasil() {
        System.out.println("Bahan Bakar Minimal   : " + this.hitungMinBahanBakar() + " liter");
        System.out.println("Lama Waktu Perjalanan : " + this.hitungWaktuPerjalanan() + " jam");
    }
}
