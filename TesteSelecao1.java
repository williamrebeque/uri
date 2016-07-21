/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeselecao1;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class TesteSelecao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        int d = scanf.nextInt();
        boolean aceito = false;
        if(b > c && d > a){
            if((c + d) > (a + b)){
                if(c >= 0 && d >= 0){
                    if(a % 2 == 0){
                        aceito = true;
                    }
                }
            }
        }
        
        if(aceito){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        
    }
    
}
