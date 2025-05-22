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

public class Ex6 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        int secreto = 7;
        int palpite;
        
        do{
            System.out.print("Adivinhe o número (entre 1 e 10): ");
            palpite = ler.nextInt();
        } while (palpite != secreto);
        System.out.println("Você acertou");
    }
    
}



