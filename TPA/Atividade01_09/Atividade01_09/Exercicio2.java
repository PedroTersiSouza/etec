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
        System.out.println("Seu IMC �: " + imc);
        
        if (imc < 18) {
            System.out.println("Classifica��o: Magreza");
        } else if (imc < 24.9) {
            System.out.println("Classifica��o: Saud�vel");
        } else if (imc < 29.9) {
            System.out.println("Classifica��o: Sobrepeso");
        } else {
            System.out.println("Classifica��o: Obesidade");
        }
    }
}
