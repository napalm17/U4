package A;

public class LucasSeries {
    public long[] getSeries(int n, int p, int q) {
        long[] l = new long[n];
        l[0] = 0;
        l[1] = 1;
        for (int i = 2; i < n; i++) {
            l[i] = p * l[i - 1] - q * l[i - 2];
        }
        return l;
    }
}
