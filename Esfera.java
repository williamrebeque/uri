/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Esfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double raio = scanf.nextDouble();
        
        double volume = (4.0/3.0) * 3.14159 * (raio * raio * raio);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    }
    
}
