/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membership;

/**
 *
 * @author WIN10
 */
public class DataMember {
    private String ID;
    private String Nama;
    private String Jenis;
    
    public DataMember(String ID, String Nama, String Jenis) {
        this.ID = ID;
        this.Nama = Nama;
        this.Jenis = Jenis;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public String getNama() {
        return this.Nama;
    }
    
    public String getJenis() {
        return this.Jenis;
    } 
    
    void print() {
        System.out.println("ID Member       : " + this.ID);
        System.out.println("Nama Member     : " + this.Nama);
        System.out.println("Jenis Member    : " + this.Jenis);
        System.out.println();
    }
}
