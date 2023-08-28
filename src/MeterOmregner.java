import java.util.Scanner;

public class MeterOmregner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til MeterOmregner 3000!");
        System.out.print("Indtast længde i meter: ");

        double meter = scanner.nextDouble();

        final double inchesPrMeter = 39.3701;
        final double feetPrMeter = 3.28084;
        final double yardsPrMeter = 1.09361;
        final double milesPrMeter = 0.000621371;
        final double sømilPrMeter = 0.000539957;

        double inches = meter * inchesPrMeter;
        double feet = meter * feetPrMeter;
        double yards = meter * yardsPrMeter;
        double miles = meter * milesPrMeter;
        double sømil = meter * sømilPrMeter;

        System.out.println(meter + " meter svarer til:");
        System.out.println(inches + " tommer");
        System.out.println(feet + " fod");
        System.out.println(yards + " yards");
        System.out.println(miles + " miles");
        System.out.println(sømil + " sømil");

        scanner.close();
    }
}