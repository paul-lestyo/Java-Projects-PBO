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
public abstract class BangunRuang {
    public abstract double hitungLuas();
    public abstract double hitungVolume();
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Volumenya: " + this.hitungVolume());
    }
}
