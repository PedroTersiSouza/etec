package Atividade01_09;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o lado A: ");
	        int a = sc.nextInt();
	        System.out.print("Digite o lado B: ");
	        int b = sc.nextInt();
	        System.out.print("Digite o lado C: ");
	        int c = sc.nextInt();
	        
	        if (a + b > c && a + c > b && b + c > a) {
	            if (a == b && b == c) {
	                System.out.println("Tri�ngulo Equil�tero");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("Tri�ngulo Is�sceles");
	            } else {
	                System.out.println("Tri�ngulo Escaleno");
	            }
	        } else {
	            System.out.println("N�o � um tri�ngulo");
	        }
	    }
	}
		
	}

}
