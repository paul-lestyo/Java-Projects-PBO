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
public class Kurir {
    double hargaAntar = 700000/5;
    double maxAntar = 3000;
    double beratBarang;
    
    Kurir(int beratBarang) {
        this.beratBarang = (double) beratBarang;
    }
    
    Kurir(double beratBarang) {
        this.beratBarang = beratBarang;
    }
    
    public double HitungHargaAntar(int jarak) {
        double banyakAntar = Math.ceil(this.beratBarang / this.maxAntar);
        double totalAntar = ((double) jarak * this.hargaAntar) * banyakAntar;
        return totalAntar;
    }
    
    public double HitungHargaAntar(double jarak) {
        double banyakAntar = Math.ceil(this.beratBarang / this.maxAntar);
        double totalAntar = (jarak * this.hargaAntar) * banyakAntar;
        return totalAntar;
    }
}
