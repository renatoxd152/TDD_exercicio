import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
    @DisplayName("Deve retornar um vetor vazio para vetores de tamanhos diferentes")

    public void vetoresDiferentes()
    {
        SomarVetor somarVetor = new SomarVetor();
        int[] a = {2,5,10,190};
        int[] b = {2,4};

        int[] c = {};

        assertArrayEquals(c, somarVetor.somar(a, b));
    }

}
