import model.Vetor;
import service.OrdenadorService;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000);
        }

        Vetor vetor = new Vetor(numeros);
        OrdenadorService service = new OrdenadorService();
        Vetor ordenado = service.ordenar(vetor);

        System.out.println("Vetor ordenado:");
        for (int num : ordenado.getElementos()) {
            System.out.print(num + " ");
        }
    }
}
