/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariocombonus;

import java.util.Scanner;

/**
 *
 * @author Fulano
 */
public class SalariocomBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        String nome = scanf.next();
        double salario = scanf.nextDouble();
        double bonus = scanf.nextDouble();
        
        double comissao = (bonus * 15)/ 100;
        
        salario += comissao;
        
        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
    
}
