/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanche;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Lanche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double valores[] = new double[5];
        valores[0] = 4.00;
        valores[1] = 4.50;
        valores[2] = 5.00;
        valores[3] = 2.00;
        valores[4] = 1.50;
        
        int cod = scanf.nextInt();
        int qtd = scanf.nextInt();
        
        System.out.printf("Total: R$ %.2f\n", valores[cod - 1] * qtd);
        
    }
    
}
