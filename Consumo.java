/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Consumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int distancia = scanf.nextInt();
        double combGasto = scanf.nextDouble();
        
        double consumo = distancia / combGasto;
        
        System.out.printf("%.3f km/l\n", consumo);
    }
    
}
