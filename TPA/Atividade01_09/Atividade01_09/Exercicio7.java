package Atividade01_09;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite a primeira data (Dia Mês Ano): ");
	        int dia1 = sc.nextInt();
	        int mes1 = sc.nextInt();
	        int ano1 = sc.nextInt();
	        
	        System.out.println("Digite a segunda data (Dia Mês Ano): ");
	        int dia2 = sc.nextInt();
	        int mes2 = sc.nextInt();
	        int ano2 = sc.nextInt();
	        
	        if (ano1 < ano2) {
	            System.out.println("Ordem crescente: " + dia1 + "/" + mes1 + "/" + ano1 + " e " + dia2 + "/" + mes2 + "/" + ano2);
	        } else if (ano1 > ano2) {
	            System.out.println("Ordem crescente: " + dia2 + "/" + mes2 + "/" + ano2 + " e " + dia1 + "/" + mes1 + "/" + ano1);
	        } else if (mes1 < mes2) {
	            System.out.println("Ordem crescente: " + dia1 + "/" + mes1 + "/" + ano1 + " e " + dia2 + "/" + mes2 + "/" + ano2);
	        } else if (mes1 > mes2) {
	            System.out.println("Ordem crescente: " + dia2 + "/" + mes2 + "/" + ano2 + " e " + dia1 + "/" + mes1 + "/" + ano1);
	        } else if (dia1 < dia2) {
	            System.out.println("Ordem crescente: " + dia1 + "/" + mes1 + "/" + ano1 + " e " + dia2 + "/" + mes2 + "/" + ano2);
	        } else {
	            System.out.println("Ordem crescente: " + dia2 + "/" + mes2 + "/" + ano2 + " e " + dia1 + "/" + mes1 + "/" + ano1);
	        }
	
	}

}
