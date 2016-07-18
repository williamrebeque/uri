/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosimples;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class CalculoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int codProd1 = scanf.nextInt();
        double qtdPecas1 = scanf.nextInt() * scanf.nextDouble();
        int codProd2 = scanf.nextInt();
        double qtdPecas2 = scanf.nextInt() * scanf.nextDouble();
        
        double total = qtdPecas1 + qtdPecas2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
    
}
