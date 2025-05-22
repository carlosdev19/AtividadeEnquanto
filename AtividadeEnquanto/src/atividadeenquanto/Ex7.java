/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeenquanto;

import java.util.Scanner;
/**
 *
 * @author CARLOS_4895
 */
public class Ex7 {
    public void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        int idade;
        
        do {
            System.out.print("Digite sua idade (0-120): ");
            idade = ler.nextInt();
        } while(idade < 0 || idade > 120);
        System.out.println("Idade Válida: " + idade);
        
    }
    
}



