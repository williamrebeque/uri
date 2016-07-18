/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int number = scanf.nextInt();
        int hours = scanf.nextInt();
        double paymenthours = scanf.nextDouble();
        double salary = hours * paymenthours;
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
    }
    
}
