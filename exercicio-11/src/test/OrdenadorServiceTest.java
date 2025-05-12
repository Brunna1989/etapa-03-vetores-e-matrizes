package test;

import exception.VetorInvalidoException;
import model.Vetor;
import org.junit.jupiter.api.Test;
import service.OrdenadorService;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class OrdenadorServiceTest {

    private final OrdenadorService service = new OrdenadorService();

    @Test
    void deveOrdenarVetorAleatorio() {
        int[] entrada = {5, 1, 4, 2, 3};
        Vetor vetor = new Vetor(entrada);
        Vetor resultado = service.ordenar(vetor);

        int[] esperado = {1, 2, 3, 4, 5};
        System.out.println("Esperado: " + Arrays.toString(esperado));
        System.out.println("Obtido:   " + Arrays.toString(resultado.getElementos()));
        assertArrayEquals(esperado, resultado.getElementos());
    }

    @Test
    void deveOrdenarVetorComNegativos() {
        int[] entrada = {-3, -1, -2};
        Vetor vetor = new Vetor(entrada);
        Vetor resultado = service.ordenar(vetor);

        int[] esperado = {-3, -2, -1};
        assertArrayEquals(esperado, resultado.getElementos());
    }

    @Test
    void deveLancarExcecaoParaVetorNulo() {
        assertThrows(VetorInvalidoException.class, () -> service.ordenar(null));
    }

    @Test
    void deveLancarExcecaoParaVetorVazio() {
        Vetor vetor = new Vetor(new int[0]);
        assertThrows(VetorInvalidoException.class, () -> service.ordenar(vetor));
    }

    @Test
    void deveManterVetorOrdenado() {
        int[] entrada = {1, 2, 3, 4, 5};
        Vetor vetor = new Vetor(entrada);
        Vetor resultado = service.ordenar(vetor);
        assertArrayEquals(entrada, resultado.getElementos());
    }
}
