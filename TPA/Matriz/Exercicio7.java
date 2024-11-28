import javax.swing.JOptionPane;

public class Exemplo_7 {
    public static void main(String[] args) {
        double[][] matriz = { { 4.5, 5.2 }, { 4.2, 1.0 } };

        JOptionPane.showMessageDialog(null, "** Exibindo valores da matriz com índices **");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("matriz[" + linha + "][" + coluna + "] = " + matriz[linha][coluna]);
            }
        }
    }
}