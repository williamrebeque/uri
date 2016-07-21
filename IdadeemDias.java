/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeemdias;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class IdadeemDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int n = scanf.nextInt();
        
        System.out.println(n / 365 + " ano(s)");
        
        n %= 365;
        
        System.out.println(n / 30 + " mes(es)");
        
        System.out.println(n % 30 + " dia(s)");
        
    }
    
}
