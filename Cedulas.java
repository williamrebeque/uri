/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedulas;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Cedulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int valor = scanf.nextInt();
        
        System.out.println(valor);
        System.out.println(valor / 100 + " nota(s) de R$ 100,00");
        valor %= 100;
        System.out.println(valor / 50 + " nota(s) de R$ 50,00");
        valor %= 50;
        System.out.println(valor / 20 + " nota(s) de R$ 20,00");
        valor %= 20;
        System.out.println(valor / 10 + " nota(s) de R$ 10,00");
        valor %= 10;
        System.out.println(valor / 5 + " nota(s) de R$ 5,00");
        valor %= 5;
        System.out.println(valor / 2 + " nota(s) de R$ 2,00");
        valor %= 2;
        System.out.println(valor / 1 + " nota(s) de R$ 1,00");
    }
    
}
