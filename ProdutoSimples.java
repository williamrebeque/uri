/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtosimples;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class ProdutoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int prod = scanf.nextInt() * scanf.nextInt();
        
        System.out.println("PROD = " + prod);
    }
    
}
