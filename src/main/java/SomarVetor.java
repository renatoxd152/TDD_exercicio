public class SomarVetor {

    public int[] somar(int[] a, int[]b)
    {
        if(a == null || a.length == 0 || b == null || b.length == 0)
            return new int[]{};
        if(a.length != 5 || b.length != 5)
            throw new IllegalArgumentException("A and B lengths are not equal");
        return new int[]{};
    }

}
