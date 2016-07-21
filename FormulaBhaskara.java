/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulabhaskara;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class FormulaBhaskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        double c = scanf.nextDouble();
        
        double r1, r2;
        
        double delta = (b * b) - (4 * a * c);
        
        if(delta >= 0){
            double dividir = 2 * a;
            if(dividir != 0){
                r1 = ((b * -1) + (Math.sqrt(delta)))/ dividir;
                r2 = ((b * -1) - (Math.sqrt(delta)))/ dividir;
                System.out.printf("R1 = %.5f\n", r1);
                System.out.printf("R2 = %.5f\n", r2);
            }else{
                System.out.println("Impossivel calcular");
            }
        }else{
            System.out.println("Impossivel calcular");
        }
        
        
    }
    
}
