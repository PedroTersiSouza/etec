package Atividade01_09;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um n�mero de 1 a 12: ");
	        int mes = sc.nextInt();
	        
	        if (mes == 1) {
	            System.out.println("M�s: Janeiro");
	        } else if (mes == 2) {
	            System.out.println("M�s: Fevereiro");
	        } else if (mes == 3) {
	            System.out.println("M�s: Mar�o");
	        } else if (mes == 4) {
	            System.out.println("M�s: Abril");
	        } else if (mes == 5) {
	            System.out.println("M�s: Maio");
	        } else if (mes == 6) {
	            System.out.println("M�s: Junho");
	        } else if (mes == 7) {
	            System.out.println("M�s: Julho");
	        } else if (mes == 8) {
	            System.out.println("M�s: Agosto");
	        } else if (mes == 9) {
	            System.out.println("M�s: Setembro");
	        } else if (mes == 10) {
	            System.out.println("M�s: Outubro");
	        } else if (mes == 11) {
	            System.out.println("M�s: Novembro");
	        } else if (mes == 12) {
	            System.out.println("M�s: Dezembro");
	        } else {
	            System.out.println("N�mero inv�lido");
	        }
		
	}

}
