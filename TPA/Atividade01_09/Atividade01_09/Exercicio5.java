import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        
        System.out.print("Digite a nota 4: ");
        double nota4 = sc.nextDouble();
        

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);
        
        if (media >= 9) {
            System.out.println("Conceito A - Aprovado");
        } else if (media >= 7) {
            System.out.println("Conceito B - Aprovado");
        } else if (media >= 5) {
            System.out.println("Conceito C - Aprovado");
        } else if (media >= 2.5) {
            System.out.println("Conceito D - Reprovado");
        } else {
            System.out.println("Conceito E - Reprovado");
        }
    }
}

