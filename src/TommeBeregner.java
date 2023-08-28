import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Her kan du omregne tommer om til cm");
        System.out.print("Indtast længde i tommer her: ");


        TommeBeregner main = new TommeBeregner();
        double tomme = main.getValidDoubleInput(sc);

        //double tomme = sc.nextDouble();

        final double TOMMER_I_CM = 2.54;
        double result = (tomme * TOMMER_I_CM);

        System.out.println(tomme + " tommer svarer til " + result + " centimeter");
        System.out.printf(tomme +" tommer svarer til " + "%,.2f", result);
    }

    // metoden kan laves statisk, hvis man gøre dette behøver man ikke et main objekt til at kalde metoden.
    public double getValidDoubleInput(Scanner scanner) {
        double input;
        do {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ugyldig input. Indtast et decimaltal, med komma.");
                scanner.nextLine();
            }
        } while (true);
        return input;
    }
}