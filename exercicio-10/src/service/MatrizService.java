package service;

import exception.MatrizInvalidaException;
import model.Matriz;

public class MatrizService {

    public int calcularSomaDiagonalPrincipal(Matriz matriz) {
        validarMatriz(matriz);

        int[][] dados = matriz.getDados();
        int soma = 0;
        for (int i = 0; i < matriz.getTamanho(); i++) {
            soma += dados[i][i];
        }
        return soma;
    }

    private void validarMatriz(Matriz matriz) {
        if (matriz == null || matriz.getDados() == null) {
            throw new MatrizInvalidaException("A matriz não pode ser nula.");
        }

        int[][] dados = matriz.getDados();
        int linhas = dados.length;

        if (linhas == 0 || dados[0] == null || linhas != dados[0].length) {
            throw new MatrizInvalidaException("A matriz deve ser quadrada e não vazia.");
        }
    }
}
