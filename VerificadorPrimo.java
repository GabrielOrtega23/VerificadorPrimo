/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadorprimo;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("VERIFICADOR DE NÚMEROS PRIMOS");
        System.out.println("----------------------------");
        
        int numero;
        char continuar;
        
        do {
            System.out.print("\nDigite um numero inteiro positivo: ");
            numero = scanner.nextInt();
            
            if (numero <= 1) {
                System.out.println(numero + " nao eh um número primo.");
            } else {
                boolean ehPrimo = true;
                
                // Verifica se o número é divisível por algum número além de 1 e ele mesmo
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                
                if (ehPrimo) {
                    System.out.println(numero + " eh um numero primo.");
                } else {
                    System.out.println(numero + " nao eh um numero primo.");
                }
            }
            
            System.out.print("\nDeseja verificar outro numero? (s/n): ");
            continuar = scanner.next().charAt(0);
            
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("\nPrograma encerrado. Obrigado!");
        scanner.close();
    }
}
