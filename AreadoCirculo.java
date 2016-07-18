/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadocirculo;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class AreadoCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double raio = scanf.nextDouble();
        
        double area = (raio * raio) * 3.14159;
        
        System.out.printf("A=%.4f\n", area);
    }
    
}
