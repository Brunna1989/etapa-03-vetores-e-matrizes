package test;

import model.Matriz;
import org.junit.jupiter.api.Test;
import service.MatrizService;
import exception.MatrizInvalidaException;

import static org.junit.jupiter.api.Assertions.*;

public class MatrizServiceTest {

    private final MatrizService service = new MatrizService();

    @Test
    void deveCalcularSomaDiagonalPrincipal() {
        int[][] dados = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matriz matriz = new Matriz(dados);
        int resultado = service.calcularSomaDiagonalPrincipal(matriz);
        System.out.println("Resultado esperado: 15 | Obtido: " + resultado);
        assertEquals(15, resultado);
    }

    @Test
    void deveCalcularComNumerosNegativos() {
        int[][] dados = {
                {-1, 0},
                {0, -2}
        };
        Matriz matriz = new Matriz(dados);
        int resultado = service.calcularSomaDiagonalPrincipal(matriz);
        System.out.println("Resultado esperado: -3 | Obtido: " + resultado);
        assertEquals(-3, resultado);
    }

    @Test
    void deveLancarExcecaoParaMatrizNula() {
        MatrizInvalidaException ex = assertThrows(
                MatrizInvalidaException.class,
                () -> service.calcularSomaDiagonalPrincipal(null)
        );
        System.out.println("Exceção esperada (matriz nula): " + ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaMatrizVazia() {
        int[][] dados = {};
        Matriz matriz = new Matriz(dados);

        MatrizInvalidaException ex = assertThrows(
                MatrizInvalidaException.class,
                () -> service.calcularSomaDiagonalPrincipal(matriz)
        );
        System.out.println("Exceção esperada (matriz vazia): " + ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaMatrizNaoQuadrada() {
        int[][] dados = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Matriz matriz = new Matriz(dados);

        MatrizInvalidaException ex = assertThrows(
                MatrizInvalidaException.class,
                () -> service.calcularSomaDiagonalPrincipal(matriz)
        );
        System.out.println("Exceção esperada (matriz não quadrada): " + ex.getMessage());
    }
}
