package A;

/**
 * Computes a Lucas-Series with the given parameters and range.
 * @author ugpsy
 * @version 1.0
 */
public class LucasSeries {

    /**
     * Constructor to avoid errors.
     */
    public LucasSeries() {
    }

    /**
     * Computes elements of a Lucas-Series.
     * @param n The range of the series. (0-n).
     * @param p Freely chosen parameter.
     * @param q Another Freely chosen parameter.
     * @return an integer array that contains the elements of the Lucas-Series.
     */
    public long[] getSeries(int n, int p, int q) {
        long[] l = new long[n + 1];
        l[0] = 0; // Set the first two elements manually.
        l[1] = 1;
        for (int i = 2; i <= n; i++) {
            l[i] = p * l[i - 1] - q * l[i - 2]; // Apply the given formula.
        }
        return l;
    }
}
