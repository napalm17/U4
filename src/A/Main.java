package A;

public class Main {
    public static void main(String[] args) {
        try {
            for (String argument: args) {
                Integer.parseInt(argument);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Command line arguments must be integers.");
            return;
        }
        if (args.length != 3) {
            System.out.println("Error: Enter exactly 3 command line arguments.");
        }
        else if (Integer.parseInt(args[0]) < 0) {
            System.out.println("Error: The integer n must be greater than or equal to 0.");

        }
        else {
            LucasSeries lucasSeries = new LucasSeries();
            long[] series = lucasSeries.getSeries(Integer.parseInt(args[0]) + 1, Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            for (long element : series) {
                System.out.println(element);
            }
        }
    }
}