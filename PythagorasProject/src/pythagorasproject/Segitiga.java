/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author WIN10
 */
public class Segitiga {
    
    void CheckTriplePythagoras(int a, int b, int c) {
        double res = Math.pow(a, 2) + Math.pow(b, 2);
        if(res == Math.pow(c, 2)) {
            System.out.println("Segitiga ABC merupakan Triple Pythagoras");
        } else {
            System.out.println("Segitiga ABC bukan merupakan Triple Pythagoras");
        }
    }
    
    void CheckTriplePythagoras(double a, double b, double c) {
        double res = Math.pow(a, 2) + Math.pow(b, 2);
        if(res == Math.pow(c, 2)) {
            System.out.println("Segitiga ABC merupakan Triple Pythagoras");
        } else {
            System.out.println("Segitiga ABC bukan merupakan Triple Pythagoras");
        }
    }
    
    double FindHypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    }
    
    double FindHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    }
    
    double FindElbows(int a, int c){
        return Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
    }
    
    double FindElbows(double a, double c){
        return Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
    }
}
