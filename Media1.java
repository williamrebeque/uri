/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media1;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Media1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double media = ( scanf.nextDouble() * 3.5 + scanf.nextDouble() * 7.5 ) / 11;
        
        System.out.printf("MEDIA = %.5f\n", media);
    }
    
}
