/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenquanto;

/**
 *
 * @author CARLOS_4895
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int num, soma = 0;
        
        do{
            System.out.print("Digite um número(0 para sair)");
            num = ler.nextInt();
            soma += num;
    } while (num != 0);
        System.out.println("Soma total: " + soma);
    }
}

