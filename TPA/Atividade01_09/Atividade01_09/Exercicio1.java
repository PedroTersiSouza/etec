package Atividade01_09;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a hora de início do turno (0-23): ");
	        int hora = sc.nextInt();
	        
	        if (hora >= 5 && hora < 13) {
	            System.out.println("Turno da manhã");
	        } else if (hora >= 13 && hora < 21) {
	            System.out.println("Turno da tarde");
	        } else {
	            System.out.println("Turno da noite");
	        }
	
	}

}
