package Atividade18_09;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número inicial: ");
        int inicio = sc.nextInt();
        
        System.out.print("Digite o número final: ");
        int fim = sc.nextInt();
        
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
       
    }
}
