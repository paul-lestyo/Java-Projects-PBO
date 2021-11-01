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
public class DegDeganApp {
    
    static double HitungHargaJualMinimum(int TotalModal, int BanyakPesan) {
        double LabaMinimum = 15000000;
        double omsetTotal = TotalModal + LabaMinimum;
        double omsetSatuanMin = omsetTotal / BanyakPesan;
        
        return omsetSatuanMin;
    }
    
    static double HitungHargaJualMinimum(double TotalModal, double BanyakPesan) {
        double LabaMinimum = 15000000;
        double omsetTotal = TotalModal + LabaMinimum;
        double omsetSatuanMin = omsetTotal / BanyakPesan;
        
        return omsetSatuanMin;
    }
    
    
    public static void main(String[] args) {
        
        Pesanan p1 = new Pesanan("Boyolali", 15, 5000);
        double modal1 = p1.HitungModalPesanan();
        double ongkir1 = p1.HitungOngkir();
        System.out.println("Modal Stok Pesanan 1 : " + modal1);
        System.out.println("Modal Ongkir Pesanan 1 : " + ongkir1);
        System.out.println("Total Modal Pesanan 1 : " + (modal1 + ongkir1));
        System.out.println("");
        
        Pesanan p2 = new Pesanan("Salatiga", 35, 7500);
        double modal2 = p2.HitungModalPesanan();
        double ongkir2 = p2.HitungOngkir();
        System.out.println("Modal Stok Pesanan 2 : " + modal2);
        System.out.println("Modal Ongkir Pesanan 2 : " + ongkir2);
        System.out.println("Total Modal Pesanan 2 : " + (modal2 + ongkir2));
        
        System.out.println("");
        
        Pesanan p3 = new Pesanan("Klaten", 30, 8300);
        double modal3 = p3.HitungModalPesanan();
        double ongkir3 = p3.HitungOngkir();
        System.out.println("Modal Stok Pesanan 3 : " + modal3);
        System.out.println("Modal Ongkir Pesanan 3 : " + ongkir3);
        System.out.println("Total Modal Pesanan 3 : " + (modal3 + ongkir3));
        System.out.println("");
        
        Pesanan p4 = new Pesanan("Kudus", 75, 9100);
        double modal4 = p4.HitungModalPesanan();
        double ongkir4 = p4.HitungOngkir();
        System.out.println("Modal Stok Pesanan 4 : " + modal4);
        System.out.println("Modal Ongkir Pesanan 4 : " + ongkir4);
        System.out.println("Total Modal Pesanan 4 : " + (modal4 + ongkir4));
        System.out.println("");
        
        double TotalModalStok  = modal1 + modal2 + modal3 + modal4;
        double TotalOngkir = ongkir1 + ongkir2 + ongkir3 + ongkir4;
        double banyakPesan = p1.jumlahPasokan + p2.jumlahPasokan + p3.jumlahPasokan + p4.jumlahPasokan;
        System.out.println("Total Modal Stok dan Ongkir : " + (TotalModalStok + TotalOngkir));
        
        double hargaJualSatuan = HitungHargaJualMinimum(TotalModalStok + TotalOngkir, banyakPesan);
        System.out.println("Harga Jual Minimum : " + hargaJualSatuan);
    }
    
}
