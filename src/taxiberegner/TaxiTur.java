package taxiberegner;

import java.util.Scanner;

public class TaxiTur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculateAgain = true;

        System.out.println("Taxi prisberegner");
        System.out.println("-----------------");

        while (calculateAgain) {
            double distance = getDistance(scanner);
            boolean isDaytime = isDaytime(scanner);
            int passengers = getPassengerCount(scanner);
            boolean hasBike = hasBike(scanner);
            double price = calculatePrice(distance, passengers, isDaytime, hasBike);
            System.out.printf("Taxa pris: " + price + " kr \n");
            System.out.println("-------------------");
            calculateAgain = doAnotherCalculation(scanner);
        }
        scanner.close();
    }

    public static double getDistance(Scanner scanner) {
        while (true) {
            System.out.print("Hvor lang er taxa turen (km)? ");
            double kilometer = scanner.nextDouble();
            if (kilometer <= 0) {
                System.out.println("Ugyldigt input");
            } else {
                return kilometer;
            }
        }
    }

    public static int getPassengerCount(Scanner scanner) {
        while (true) {
            System.out.print("Antal passagerer (maks 8)? ");
            int passengers = scanner.nextInt();
            if (passengers >= 1 && passengers <= 8) {
                return passengers;
            } else {
                System.out.println("Ugyldigt antal passagerer ");
            }
        }
    }

    public static boolean isDaytime(Scanner scanner) {
        System.out.print("Skal du køre om dagen (06-18) [y/n]? ");
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }

    public static boolean hasBike(Scanner scanner) {
        System.out.print("Medbringes en cykel [y/n]? ");
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }

    public static double calculatePrice(double distance, int passengers, boolean isDaytime, boolean hasBike) {
        double startFee;
        double kmPrice;
        double speed;
        double time;

        if (isDaytime) {
            if (passengers <= 4) {
                startFee = 39.0;
                kmPrice = 10.0;
                speed = 44.0;
            } else {
                startFee = 69.0;
                kmPrice = 14.0;
                speed = 44.0;
            }
        } else {
            if (passengers <= 4) {
                startFee = 49.0;
                kmPrice = 14.0;
                speed = 40.0;
            } else {
                startFee = 79.0;
                kmPrice = 20.0;
                speed = 40.0;
            }
        }
        if (hasBike) {
            startFee += 25.0;
        }
        time = distance / speed;
        double price = startFee + (kmPrice * distance);
        if (!isDaytime) {
            if (passengers <= 4) {
                double minuteRate = 6.5;
                double timeInMinutes = time * 60;
                price += minuteRate * timeInMinutes;
            } else {
                double minuteRate = 7.0;
                double timeInMinutes = time * 60;
                price += minuteRate * timeInMinutes;
            }
        } else {
            if (passengers <= 4) {
                double minuteRate = 6.75;
                double timeInMinutes = time * 60;
                price += minuteRate * timeInMinutes;
            } else {
                double minuteRate = 6.7;
                double timeInMinutes = time * 60;
                price += minuteRate * timeInMinutes;
            }
        }
        return price;
    }

    public static boolean doAnotherCalculation(Scanner scanner) {
        System.out.print("Lav en ny beregning [y/n]? ");
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }
}
