/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maior;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        
        int maior = (a + b + Math.abs(a - b))/ 2;
        maior = (maior + c + Math.abs(maior - c))/ 2;
        System.out.println(maior + " eh o maior");
    }
    
}
