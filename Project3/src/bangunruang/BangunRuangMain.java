/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author WIN10
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.r = 14;
        bola.hitungVol();
        bola.hitungLuasSelimut();
        
        Kerucut kerucut = new Kerucut();
        kerucut.r = 10;
        kerucut.s = 15;
        kerucut.tinggi = 7;
        kerucut.hitungVol();
        kerucut.hitungLuasSelimut();
        
        Tabung tabung = new Tabung();
        tabung.r = 20;
        tabung.tinggi = 25;
        tabung.hitungVol();
        tabung.hitungLuasSelimut();
    }
}
