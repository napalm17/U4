package A;

/**
 * The Main Class.
 * @author ugpsy
 * @version 1.0
 */
public class Main {

    /**
     * Constructor to avoid errors.
     */
    public Main() {
    }

    /**
     * The main method.
     * All the errors are handled here.
     */
    public static void main(String[] args) {
        try {                                     // Raise an error, if one of the arguments is not an integer.
            for (String argument: args) {
                Integer.parseInt(argument);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Command line arguments must be integers.");
            return;
        }
        if (args.length != 3) {                   // Raise an error, if the number of given arguments is not 3.
            System.out.println("Error: Enter exactly 3 command line arguments.");
        }
        else if (Integer.parseInt(args[0]) < 0) { // Raise an error, if n is a negative integer.
            System.out.println("Error: The integer n must be greater than or equal to 0.");

        }
        else {                                    // Run the program, if no error has been raised.
            run(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }
    }

    /**
     * The method that runs the algorithm for finding the Lucas series.
     * @param n The range of the series. (0-n).
     * @param p Freely chosen parameter.
     * @param q Another Freely chosen parameter.
     */
    private static void run(int n , int p , int q) {
        LucasSeries lucasSeries = new LucasSeries();
        long[] series = lucasSeries.getSeries(n, p, q);
        for (long element : series) {
            System.out.println(element);
        }
    }
}