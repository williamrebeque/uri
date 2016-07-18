/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        double c = scanf.nextDouble();
        
        double area = (a * c)/ 2;
        System.out.printf("TRIANGULO: %.3f\n", area);
        area = 3.14159 * (c * c);
        System.out.printf("CIRCULO: %.3f\n", area);
        area = ((a + b) * c)/ 2;
        System.out.printf("TRAPEZIO: %.3f\n", area);
        area = b * b;
        System.out.printf("QUADRADO: %.3f\n", area);
        area = a * b;
        System.out.printf("RETANGULO: %.3f\n", area);
    }
    
}
