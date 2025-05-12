import model.Matriz;
import service.MatrizService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz quadrada: ");
        int n = scanner.nextInt();

        int[][] dados = new int[n][n];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dados[i][j] = scanner.nextInt();
            }
        }

        Matriz matriz = new Matriz(dados);
        MatrizService service = new MatrizService();

        int soma = service.calcularSomaDiagonalPrincipal(matriz);
        System.out.println("Soma da diagonal principal: " + soma);
    }
}
