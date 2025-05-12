import model.Vetor;
import service.VetorService;

public class Main {
    public static void main(String[] args) {
        VetorService service = new VetorService();

        Vetor vetor1 = service.gerarVetorAleatorio(50);
        Vetor vetor2 = service.gerarVetorAleatorio(50);

        service.ordenarVetor(vetor1);
        service.ordenarVetor(vetor2);

        Vetor combinado = service.combinarEVetoresOrdenados(vetor1, vetor2);

        service.imprimirVetor("Vetor 1 Ordenado", vetor1);
        service.imprimirVetor("Vetor 2 Ordenado", vetor2);
        service.imprimirVetor("Vetor Combinado e Ordenado", combinado);
    }
}
