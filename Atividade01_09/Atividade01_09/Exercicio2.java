package Atividade01_09;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();
        
        sc.close();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        
        if (imc < 18) {
            System.out.println("Classificação: Magreza");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}
