import com.sun.tools.javac.Main;

import java.util.Scanner;

public class BmiBeregner {
    public static void main(String[] args) {

        double højde;
        double vægt;
        double bmi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Her kan du tjekke din BMI du skal blot indtaste dine værdier nedenunder");
        System.out.println("Indtast din højde i meter: ");

        højde = sc.nextDouble();

        if (højde > 3){
            højde = (højde/100);
        }

        System.out.println("indtast din vægt i Kg: ");

        vægt = sc.nextDouble();

        bmi = vægt / (højde * højde);

        System.out.println("Dit BMI er " + bmi);

        if (bmi < 18.5){
            System.out.println("Du er undervægtigt, spis noget mere");
        }

        if (bmi >= 25){
            System.out.println("Du er overvægtig, gå ud og løb en tur");
        }

        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println(" "  + "Du har en normal vægt");
        }

    }
}