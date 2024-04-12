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
}
