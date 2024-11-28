import java.util.Scanner;

public class Matriz3x5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        System.out.println("Digite os números para preencher a matriz 3x5:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Número na posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }

        boolean repetido = false;
        for (int linha1 = 0; linha1 < 3; linha1++) {
            for (int coluna1 = 0; coluna1 < 5; coluna1++) {
                for (int linha2 = linha1; linha2 < 3; linha2++) {
                    for (int coluna2 = 0; coluna2 < 5; coluna2++) {
                        if ((linha1 != linha2 || coluna1 != coluna2) && matriz[linha1][coluna1] == matriz[linha2][coluna2]) {
                            repetido = true;
                        }
                    }
                }
            }
        }

        int pares = 0, impares = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (matriz[linha][coluna] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Tem números repetidos? " + repetido);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}