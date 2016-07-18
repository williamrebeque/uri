/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media2;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Media2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double media = ( scanf.nextDouble() * 2.0 + scanf.nextDouble() * 3.0 + scanf.nextDouble() * 5.0 ) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);
    }
    
}
