package test;

import exception.VetorInvalidoException;
import model.Vetor;
import org.junit.jupiter.api.Test;
import service.VetorService;

import static org.junit.jupiter.api.Assertions.*;

public class VetorServiceTest {

    private final VetorService service = new VetorService();

    @Test
    void deveGerarVetorComTamanhoCorreto() {
        Vetor vetor = service.gerarVetorAleatorio(50);
        assertEquals(50, vetor.getTamanho());
    }

    @Test
    void deveOrdenarVetorCorretamente() {
        Vetor vetor = new Vetor(new int[]{5, 1, 3, 9, 2});
        service.ordenarVetor(vetor);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, vetor.getDados());
    }

    @Test
    void deveCombinarEVetoresOrdenados() {
        Vetor v1 = new Vetor(new int[]{1, 3, 5});
        Vetor v2 = new Vetor(new int[]{2, 4, 6});
        Vetor combinado = service.combinarEVetoresOrdenados(v1, v2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, combinado.getDados());
    }

    @Test
    void deveLancarExcecaoParaVetorNulo() {
        assertThrows(VetorInvalidoException.class, () -> service.ordenarVetor(null));
    }

    @Test
    void deveLancarExcecaoParaTamanhoInvalido() {
        assertThrows(VetorInvalidoException.class, () -> service.gerarVetorAleatorio(0));
    }

    @Test
    void deveImprimirVetorSemErros() {
        Vetor vetor = new Vetor(new int[]{10, 20, 30});
        service.imprimirVetor("Teste Impressão", vetor);
    }
}
