    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somasimples;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class SomaSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int soma = scanf.nextInt() + scanf.nextInt();
        
        System.out.println("SOMA = " + soma);
    }
    
}
