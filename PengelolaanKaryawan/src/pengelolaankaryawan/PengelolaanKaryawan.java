/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengelolaankaryawan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class PengelolaanKaryawan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Karyawan karyawan = new Karyawan();
        
        while(true) {
            System.out.print("Menu Utama:\n" +
                            "1. Tambah data\n" +
                            "2. Hapus Data\n" +
                            "3. Cari Data\n" +
                            "4. Lihat Data\n" +
                            "5. Keluar\n" +
                            "Menu Pilihan:");
            
            int pil = input.nextInt();
            input(input, karyawan, pil);
            
            
        }
    }
    
    
    public static void input(Scanner input, Karyawan karyawan, int pil) {
        switch(pil) {
                case 1:
                    System.out.print("Masukkan Kode Karyawan    : ");
                    input.nextLine();
                    String kode = input.nextLine();
                    System.out.print("Masukkan Nama Karyawan	: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Alamat		: ");
                    String alamat = input.nextLine();
                    LocalDate tglLahir = null;
                    try {
                        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD) : ");
                    
                        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        tglLahir = LocalDate.parse(input.nextLine(), dateFormat);
                    } catch(Exception e) {
                        System.out.println("Input Salah!");
                        break;
                    }
                    
                    
                    System.out.print("Masukkan Golongan	(A/B/C) : ");
                    char gol = input.nextLine().charAt(0);
                    if(gol != 'A' && gol != 'B' && gol != 'C') {
                        System.out.println("Input Salah!");
                        break;
                    }
                    System.out.print("Masukkan Status Menikah (0/1): ");
                    boolean status = false;
                    String inputStatus = input.nextLine();
                    if(inputStatus.equals("0")) {
                        status = false;
                    } else if(inputStatus.equals("1")) {
                        status = true;
                    } else {
                        System.out.println("Input Salah");
                        System.exit(0);
                    }
                    
                    int anak = 0;
                    if(status) {
                        System.out.print("Masukkan Jumlah Anak	: ");
                        anak = input.nextInt();
                    }
                    
                    DataKaryawan dataKaryawan = new DataKaryawan(kode, nama, alamat, tglLahir, gol, status, anak);
                    karyawan.tambahKaryawan(dataKaryawan);
                    
                    
                    System.out.print("Pilih SubMenu:\n" +
                            "1. Kembali ke menu utama\n" +
                            "2. Tambah Data Kembali\n" +
                            "Menu Pilihan: ");
                    int inputSubMenu = input.nextInt();
                    switch(inputSubMenu) {
                        case 1:
                            break;
                        case 2:
                            input(input, karyawan, 1);
                    }
                    break;
                    
                    
                case 2:
                    System.out.print("Kode Karyawan yang mau dihapus: ");
                    input.nextLine();
                    karyawan.hapusKaryawan(input.nextLine());
                    
                    System.out.print("Pilih SubMenu:\n" +
                            "1. Kembali ke menu utama\n" +
                            "2. Hapus Data Kembali\n" +
                            "Menu Pilihan: ");
                    int inputSubMenu2 = input.nextInt();
                    switch(inputSubMenu2) {
                        case 1:
                            break;
                        case 2:
                            input(input, karyawan, 2);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Kode Karyawan: ");
                    input.nextLine();
                    karyawan.cariKaryawan(input.nextLine());
                    if(karyawan.karyawan != null) {
                        karyawan.showPrifle();
                    }
                    System.out.print("Pilih SubMenu:\n" +
                            "1. Kembali ke menu utama\n" +
                            "Menu Pilihan: ");
                    int inputSubMenu3 = input.nextInt();
                    switch(inputSubMenu3) {
                        case 1:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Daftar Karyawan: ");
                    karyawan.printAllKaryawan();
                    System.out.print("Pilih SubMenu:\n" +
                            "1. Kembali ke menu utama\n" +
                            "Menu Pilihan: ");
                    int inputSubMenu4 = input.nextInt();
                    switch(inputSubMenu4) {
                        case 1:
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
            }
    }
    
    
    
}
