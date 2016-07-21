/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaodetempo;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class ConversaodeTempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int n = scanf.nextInt();
        
        System.out.print(n / 3600 + ":");
        
        n %= 3600;
        
        System.out.print(n / 60 + ":");
        
        System.out.println(n % 60);
        
    }
    
}
