import javax.swing.JOptionPane;

public class Exemplo_6 {
    public static void main(String[] args) {
        final int N_LIN = 3, N_COL = 5; 
        int[][] matriz = new int[N_LIN][N_COL];

        // Entrada dos valores da matriz
        JOptionPane.showMessageDialog(null, "** Cadastro de dados na matriz **");
        for (int linha = 0; linha < N_LIN; linha++) {
            for (int coluna = 0; coluna < N_COL; coluna++) {
                String valor = JOptionPane.showInputDialog("Valor para posição [" + (linha + 1) + "][" + (coluna + 1) + "]:");
                matriz[linha][coluna] = Integer.parseInt(valor);
            }
        }

        // Exibição dos valores na matriz
        JOptionPane.showMessageDialog(null, "** Exibindo dados da matriz **");
        for (int linha = 0; linha < N_LIN; linha++) {
            for (int coluna = 0; coluna < N_COL; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println(); 
        }
    }
}