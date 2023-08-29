package CakeRecipe;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CakeMain {
    public static void main(String[] args) {

 /*       int antalPersoner = 8;
        Opskrift opskrift = new Opskrift(antalPersoner);

        opskrift.udskrivOpskrift();
        opskrift.udskrivSamletVægtEfterBagning();
        opskrift.udskrivSamletVægtEfterBagning();
        opskrift.udskrivEnergiIndhold();*/

        Ingrediens ingrediens1 = new Ingrediens("Mel", 250, "gram", 1500);
        Ingrediens ingrediens2 = new Ingrediens("Sukker", 200, "gram", 1700);
        Ingrediens ingrediens3 = new Ingrediens("Æg", 4, "stk", 300);
        Ingrediens ingrediens4 = new Ingrediens("Smør", 200, "gram", 3000);
        Ingrediens ingrediens5 = new Ingrediens("Bagepulver", 2, "teskefulde", 0);
        System.out.println(ingrediens1);
        System.out.println(ingrediens2);
        System.out.println(ingrediens3);
        System.out.println(ingrediens4);
        System.out.println(ingrediens5);



    }
}
