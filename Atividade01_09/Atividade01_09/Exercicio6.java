package Atividade01_09;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a idade do nadador: ");
	        int idade = sc.nextInt();
	        
	        if (idade >= 5 && idade <= 7) {
	            System.out.println("Categoria: Infantil A");
	        } else if (idade >= 8 && idade <= 10) {
	            System.out.println("Categoria: Infantil B");
	        } else if (idade >= 11 && idade <= 13) {
	            System.out.println("Categoria: Juvenil A");
	        } else if (idade >= 14 && idade <= 17) {
	            System.out.println("Categoria: Juvenil B");
	        } else if (idade >= 18) {
	            System.out.println("Categoria: Senior");
	        } else {
	            System.out.println("Idade inv�lida");
	        }
		
	}

}
