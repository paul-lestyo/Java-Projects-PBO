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
public class Stok {
    double banyak;
    double hargaDegan = 8000;
    double beratDegan = 1200;
    
    Stok(int banyak) {
        this.banyak = (double) banyak;
    }
    
    Stok(double banyak) {
        this.banyak = banyak;
    }
    
    public double HitungBeratModal() {
        return this.banyak * this.beratDegan / 1000;
    }
    
    public double HitungHargaModal() {
        return this.banyak * this.hargaDegan;
    }
}
