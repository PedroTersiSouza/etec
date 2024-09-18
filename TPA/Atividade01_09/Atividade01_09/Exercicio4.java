package Atividade01_09;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número de 1 a 12: ");
	        int mes = sc.nextInt();
	        
	        if (mes == 1) {
	            System.out.println("Mês: Janeiro");
	        } else if (mes == 2) {
	            System.out.println("Mês: Fevereiro");
	        } else if (mes == 3) {
	            System.out.println("Mês: Março");
	        } else if (mes == 4) {
	            System.out.println("Mês: Abril");
	        } else if (mes == 5) {
	            System.out.println("Mês: Maio");
	        } else if (mes == 6) {
	            System.out.println("Mês: Junho");
	        } else if (mes == 7) {
	            System.out.println("Mês: Julho");
	        } else if (mes == 8) {
	            System.out.println("Mês: Agosto");
	        } else if (mes == 9) {
	            System.out.println("Mês: Setembro");
	        } else if (mes == 10) {
	            System.out.println("Mês: Outubro");
	        } else if (mes == 11) {
	            System.out.println("Mês: Novembro");
	        } else if (mes == 12) {
	            System.out.println("Mês: Dezembro");
	        } else {
	            System.out.println("Número inválido");
	        }
		
	}

}
