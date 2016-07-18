/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastocombustivel;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class GastoCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double gasto = (scanf.nextInt() * scanf.nextInt()) / 12.0;
        
        System.out.printf("%.3f\n", gasto);
    }
    
}
