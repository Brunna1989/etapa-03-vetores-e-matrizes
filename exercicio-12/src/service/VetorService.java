package service;

import exception.VetorInvalidoException;
import model.Vetor;

import java.util.Arrays;
import java.util.Random;

public class VetorService {

    public Vetor gerarVetorAleatorio(int tamanho) {
        if (tamanho <= 0) {
            throw new VetorInvalidoException("Tamanho do vetor deve ser maior que zero.");
        }

        int[] dados = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            dados[i] = random.nextInt(100); // valores de 0 a 99
        }

        return new Vetor(dados);
    }

    public void ordenarVetor(Vetor vetor) {
        validarVetor(vetor);
        int[] dados = vetor.getDados();
        int n = dados.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dados[j] > dados[j + 1]) {
                    int temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }

        vetor.setDados(dados);
    }

    public Vetor combinarEVetoresOrdenados(Vetor v1, Vetor v2) {
        validarVetor(v1);
        validarVetor(v2);

        int[] d1 = v1.getDados();
        int[] d2 = v2.getDados();

        int[] combinado = new int[d1.length + d2.length];
        System.arraycopy(d1, 0, combinado, 0, d1.length);
        System.arraycopy(d2, 0, combinado, d1.length, d2.length);

        Vetor combinadoVetor = new Vetor(combinado);
        ordenarVetor(combinadoVetor);
        return combinadoVetor;
    }

    private void validarVetor(Vetor vetor) {
        if (vetor == null || vetor.getDados() == null || vetor.getTamanho() == 0) {
            throw new VetorInvalidoException("Vetor inválido.");
        }
    }

    public void imprimirVetor(String titulo, Vetor vetor) {
        System.out.println(titulo + ": " + Arrays.toString(vetor.getDados()));
    }
}
