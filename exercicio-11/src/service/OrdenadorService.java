package service;

import exception.VetorInvalidoException;
import model.Vetor;

public class OrdenadorService {

    public Vetor ordenar(Vetor vetor) {
        validar(vetor);
        int[] elementos = vetor.getElementos();
        int n = vetor.getTamanho();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }

        return new Vetor(elementos);
    }

    private void validar(Vetor vetor) {
        if (vetor == null || vetor.getElementos() == null || vetor.getTamanho() == 0) {
            throw new VetorInvalidoException("Vetor inválido: nulo ou vazio.");
        }
    }
}
