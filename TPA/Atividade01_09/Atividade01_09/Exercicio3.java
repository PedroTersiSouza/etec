package Atividade01_09;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Escolha uma op��o do menu:");
	        System.out.println("1. BigMac");
	        System.out.println("2. Quarteir�o");
	        System.out.println("3. MacChicken");
	        System.out.println("4. Cheddar");
	        System.out.println("5. Cheese burger");
	        
	        int opcao = sc.nextInt();
	        
	        if (opcao == 1) {
	            System.out.println("Voc� escolheu BigMac");
	        } else if (opcao == 2) {
	            System.out.println("Voc� escolheu Quarteir�o");
	        } else if (opcao == 3) {
	            System.out.println("Voc� escolheu MacChicken");
	        } else if (opcao == 4) {
	            System.out.println("Voc� escolheu Cheddar");
	        } else if (opcao == 5) {
	            System.out.println("Voc� escolheu Cheese burger");
	        } else {
	            System.out.println("Op��o inv�lida");
	        }
		
	}

}
