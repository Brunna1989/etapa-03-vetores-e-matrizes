package model;

public class Vetor {
    private int[] elementos;

    public Vetor(int[] elementos) {
        this.elementos = elementos;
    }

    public int[] getElementos() {
        return elementos;
    }

    public int getTamanho() {
        return elementos.length;
    }
}
