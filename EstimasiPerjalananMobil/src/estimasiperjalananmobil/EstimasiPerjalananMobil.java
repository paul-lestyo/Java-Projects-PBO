/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimasiperjalananmobil;
import mobil.*;
/**
 *
 * @author WIN10
 */
public class EstimasiPerjalananMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mobil A | Sedan | Solo - Kudus (103km) | 60km/jam");
        Sedan A = new Sedan();
        A.jarak = 103;
        A.kecepatan = 60;
        A.tampilHasil();
        System.out.println("===============================");
        
        System.out.println("Mobil B | Sedan | Solo – Jakarta (563km) | 65km/jam");
        Sedan B = new Sedan();
        B.jarak = 563;
        B.kecepatan = 65;
        B.tampilHasil();
        System.out.println("===============================");
        
        
        System.out.println("Mobil C | SUV | Solo – Banten (679) | 57km/jam");
        SUV C = new SUV();
        C.jarak = 679;
        C.kecepatan = 57;
        C.tampilHasil();
        System.out.println("===============================");
        
        
        System.out.println("Mobil D | SUV | Solo – Bandung (458) | 62km/jam");
        SUV D = new SUV();
        D.jarak = 458;
        D.kecepatan = 62;
        D.tampilHasil();
        System.out.println("===============================");
        
        System.out.println("Mobil E | MPV | Solo – Banyuwangi (505) | 64km/jam");
        MPV E = new MPV();
        E.jarak = 505;
        E.kecepatan = 64;
        E.tampilHasil();
        System.out.println("===============================");
        
        System.out.println("Mobil F | MPV | Solo – Jember (409km) | 53km/jam");
        MPV F = new MPV();
        F.jarak = 409;
        F.kecepatan = 53;
        F.tampilHasil();
        System.out.println("===============================");
    }
    
}
