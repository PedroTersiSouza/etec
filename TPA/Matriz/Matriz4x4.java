import java.util.Scanner;

public class Matriz4x4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[4][4];

        System.out.println("Preencha a matriz 4x4 com números:");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Número na posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = teclado.nextDouble();
            }
        }

        System.out.println("\nElementos da diagonal principal:");
        for (int linha = 0; linha < 4; linha++) {
            System.out.print(matriz[linha][linha] + " ");
        }

        System.out.println("\nElementos da diagonal secundária:");
        for (int linha = 0; linha < 4; linha++) {
            System.out.print(matriz[linha][3 - linha] + " ");
        }
    }
}