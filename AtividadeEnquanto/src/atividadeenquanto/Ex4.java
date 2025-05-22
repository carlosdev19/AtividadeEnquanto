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

public class Ex4 {
    public static void main(String[]args){
        
        Scanner ler = new Scanner(System.in);
        
        String senha = "";
        while(!senha.equals("1234")){
            System.out.println("Digite sua senha: ");
            senha = ler.nextLine();
        }
        System.out.println("Senha correta!");
    }
    
}
