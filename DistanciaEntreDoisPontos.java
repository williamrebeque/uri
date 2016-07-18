/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciaentredoispontos;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class DistanciaEntreDoisPontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double x1 = scanf.nextDouble();
        double y1 = scanf.nextDouble();
        double x2 = scanf.nextDouble();
        double y2 = scanf.nextDouble();
        
        double distancia = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        
        System.out.printf("%.4f\n", distancia);
        
    }
    
}
