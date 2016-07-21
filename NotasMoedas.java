/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmoedas;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class NotasMoedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double valor = scanf.nextDouble();
        
        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Math.floor(valor / 100));
        valor %= 100;
        System.out.printf("%.0f nota(s) de R$ 50.00\n", Math.floor(valor / 50));
        valor %= 50;
        System.out.printf("%.0f nota(s) de R$ 20.00\n", Math.floor(valor / 20));
        valor %= 20;
        System.out.printf("%.0f nota(s) de R$ 10.00\n", Math.floor(valor / 10));
        valor %= 10;
        System.out.printf("%.0f nota(s) de R$ 5.00\n", Math.floor(valor / 5));
        valor %= 5;
        System.out.printf("%.0f nota(s) de R$ 2.00\n", Math.floor(valor / 2));
        valor %= 2;
        
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", Math.floor(valor / 1));
        valor %= 1;
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", Math.floor(valor / 0.5));
        valor %= 0.5;
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", Math.floor(valor / 0.25));
        valor %= 0.25;
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", Math.floor(valor / 0.10));
        valor %= 0.10;
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", Math.floor(valor / 0.05));
        valor %= 0.05;
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", Math.floor(valor / 0.01));
    }
    
}
