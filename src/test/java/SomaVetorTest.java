import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SomaVetorTest {
    @Test
    @DisplayName("Deve resultar em um terceiro vetor vazio")
    public void resultaVetorVazio()
    {
        SomarVetor somarVetor = new SomarVetor();

        int[] a = {};
        int[] b = {};

        int[] c = {};

        assertArrayEquals(c,somarVetor.somar(a,b));

    }

    @Test
    @DisplayName("Se os dois vetores forem nulos, devem retornar um array ")

    public void vetoresNulos()
    {
        SomarVetor somarVetor = new SomarVetor();

        int [] a = null;
        int [] b = null;

        int [] c = {};

        assertArrayEquals(c, somarVetor.somar(a,b));
    }

    @Test
    @DisplayName("Deve retornar um exceção para vetores de tamanhos diferentes")

    public void vetoresDiferentes()
    {
        SomarVetor somarVetor = new SomarVetor();
        int[] a = {2,5,10,190};
        int[] b = {2,4};

        assertThrows(IllegalArgumentException.class, () -> {
            somarVetor.somar(a, b);
        });
    }

    @Test
    @DisplayName("Deve retornar um terceiro vetor C com a soma do vetor A e B")
    public void vetoresIguaisSoma()
    {
        SomarVetor somarVetor = new SomarVetor();
        int[] a = {2,4,6,8,10};
        int[] b = {4,6,8,10,12};

        int[]c = {6,10,14,18,22};

        assertArrayEquals(c,somarVetor.somar(a,b));
    }

    @Test
    @DisplayName("Deve retornar um terceiro vetor C com a soma do vetor A e B com números negativos")
    public void vetoresNegativosSoma()
    {
        SomarVetor somarVetor = new SomarVetor();
        int[] a = {-2, 5, -8, 34, -5};
        int[] b = {8, -51, 2, -16, 5};

        int[] c = {6, -46, -6, 18, 0};

        assertArrayEquals(c, somarVetor.somar(a, b));
    }


}
