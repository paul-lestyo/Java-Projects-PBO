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
public class SUV extends Mobil {
    public double jarak, kecepatan;
    
    public double hitungMinBahanBakar() {
        return this.jarak / 12;
    }

    public double hitungWaktuPerjalanan() {
        return this.jarak / this.kecepatan;
    }
}
