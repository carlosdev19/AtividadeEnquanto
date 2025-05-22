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

public class Ex2 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = ler.nextInt();
        while (num >= 0){
            System.out.print(num);
            num--;
        }
    }
   
}

