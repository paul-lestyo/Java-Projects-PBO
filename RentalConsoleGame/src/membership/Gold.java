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
public class Gold extends Member {
    int diskon = 2;
    int poin;
    int totalSewa;
    int cashback =  5000;
    
    
    public Gold(DataMember member) {
        super.member = member;
        super.biayaSewa = 30000;
        super.inputPinjam();
    }
    
    public void calculatedServices() {
        this.poin = 5 * banyakHari;
        this.totalSewa = this.biayaSewa * this.banyakHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
    }
    
}
