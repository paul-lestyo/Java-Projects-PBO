/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class ArrayProcessing {
    ArrayList<String> dataBil = new ArrayList<String>();
    
    void input() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Menu Data ArrayList:\n" +
                            "1. Tambah data\n" +
                            "2. Cari Data\n" +
                            "3. Hapus Data\n" +
                            "4. Tampil Data\n" +
                            "5. Keluar\n" +
                            "Pilih nomor berapa:");

            int pil = input.nextInt();
            switch(pil) {
                case 1:
                    System.out.print("Masukkan data string: ");
                    input.nextLine();
                    this.dataBil.add(input.nextLine());
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    break;
                case 2:
                    System.out.print("String yang mau dicari: ");
                    input.nextLine();
                    String find = input.nextLine();
                    int index = this.dataBil.indexOf(find);
                    if(index >= 0) {
                        System.out.println("String '" + find + "' ada di index ke-"+ index +" di dalam data");
                        input.nextLine();
                    } else {
                        System.out.println("String ‘"+ find +"’ tidak ada dalam data");
                        input.nextLine();
                    }
                    
                    break;
                case 3:
                    System.out.print("String yang mau dihapus: ");
                    input.nextLine();
                    String findDelete = input.nextLine();
                    int indexDelete = this.dataBil.indexOf(findDelete);
                    if(indexDelete >= 0) {
                        this.dataBil.remove(indexDelete);
                        System.out.println("String '" + findDelete + "' sudah dihapus di dalam data");
                    } else {
                        System.out.println("String ‘"+ findDelete +"’ tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    input.nextLine();
                    break;
                case 5:
                    System.exit(0);
            }
        }
        
    }
}
