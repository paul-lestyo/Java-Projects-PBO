/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,menu;
        Segitiga s = new Segitiga();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Aplikasi Pythagoras");
        System.out.println("===================");
        while(true) {
            System.out.println("1. Cek triple pythagoras\n" +
                    "2. Menentukan sisi miring segitiga\n" +
                    "3. Menentukan sisi siku-siku segitiga\n" +
                    "4. Exit");
            
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println();
            
            switch(menu) {
                case 1:
                    System.out.print("Nilai A : ");
                    a = input.nextInt();
                    System.out.print("Nilai B : ");
                    b = input.nextInt();
                    System.out.print("Nilai C : ");
                    c = input.nextInt();                    
                    s.CheckTriplePythagoras(a,b,c);
                    break;
                case 2:
                    System.out.print("Nilai A : ");
                    a = input.nextInt();
                    System.out.print("Nilai B : ");
                    b = input.nextInt();
                    double resultC = s.FindHypotenuse(a, b);
                    System.out.println("Nilai C yaitu " + resultC);
                    break;
                case 3:
                    System.out.print("Nilai A : ");
                    a = input.nextInt();
                    System.out.print("Nilai C : ");
                    c = input.nextInt();
                    double resultB = s.FindElbows(a, c);
                    System.out.println("Nilai B yaitu " + resultB);
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println();
        }  
        
    }
    
}
