package CakeRecipe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CakeMain {
    public static void main(String[] args) {

        int antalPersoner = 8;
        Opskrift opskrift = new Opskrift(antalPersoner);

        opskrift.udskrivOpskrift();
        opskrift.udskrivSamletVægtEfterBagning();
        opskrift.udskrivSamletVægtEfterBagning();
        opskrift.udskrivEnergiIndhold();
    }
}
