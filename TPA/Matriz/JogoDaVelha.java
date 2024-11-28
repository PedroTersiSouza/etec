import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        preencherTabuleiro(tabuleiro);
        int jogadorAtual = 1; 
        boolean acabou = false;

        System.out.println("Jogo da Velha - Digite a linha e coluna (1 a 3) para jogar!");
        
        while (!acabou) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", sua vez!");

            System.out.print("Linha: ");
            int linha = entrada.nextInt() - 1;
            System.out.print("Coluna: ");
            int coluna = entrada.nextInt() - 1;

            if (movimentoValido(tabuleiro, linha, coluna)) {
                char simbolo = (jogadorAtual == 1) ? 'X' : 'O';
                tabuleiro[linha][coluna] = simbolo;

                if (verificarVitoria(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Parabéns, jogador " + jogadorAtual + " ganhou!");
                    acabou = true;
                } else if (verificarEmpate(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Empate! Não há mais jogadas possíveis.");
                    acabou = true;
                } else {
                    jogadorAtual = (jogadorAtual == 1) ? 2 : 1;
                }
            } else {
                System.out.println("Posição inválida! Escolha outra.");
            }
        }
    }

    static void preencherTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    static boolean movimentoValido(char[][] tabuleiro, int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-';
    }

    static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean verificarVitoria(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] != '-' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                return true;
            }
        }
        if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] != '-' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }
        return false;
    }

    static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}