import java.util.Scanner;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Insira os valores da matriz 5x5:");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Valor na posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int somaImpares = 0;
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (matriz[linha][coluna] % 2 != 0) {
                    somaImpares += matriz[linha][coluna];
                }
            }
        }

        System.out.println("\nSoma de cada coluna:");
        for (int coluna = 0; coluna < 5; coluna++) {
            int somaColuna = 0;
            for (int linha = 0; linha < 5; linha++) {
                somaColuna += matriz[linha][coluna];
            }
            System.out.println("Coluna " + coluna + ": " + somaColuna);
        }

        System.out.println("\nSoma de cada linha:");
        for (int linha = 0; linha < 5; linha++) {
            int somaLinha = 0;
            for (int coluna = 0; coluna < 5; coluna++) {
                somaLinha += matriz[linha][coluna];
            }
            System.out.println("Linha " + linha + ": " + somaLinha);
        }

        System.out.println("\nTotal dos números ímpares: " + somaImpares);
    }
}