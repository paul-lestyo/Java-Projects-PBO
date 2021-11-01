/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int angka,tebakan;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        
        angka = ran.nextInt(100) + 1;
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        while(true) {
            System.out.print("Masukkan Tebakan Anda: ");
            tebakan = input.nextInt();
            
            if(tebakan > angka){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu besar");
            }else if(tebakan < angka){
                System.out.println("Hehehe... Bilangan tebakan anda terlalu kecil");
            }else if(tebakan == angka){
                System.out.println("Yeee... Bilangan tebakan anda BENAR :-)");
                break;
            }
        }
    }
    
}
