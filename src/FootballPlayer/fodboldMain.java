package FootballPlayer;

public class fodboldMain {
    public static void main(String[] args) {
        Fodboldspiller messi = new Fodboldspiller("leo", "messi", "miami", 169, 65);
        Fodboldspiller neymar = new Fodboldspiller(null, "neymar", "saudi1", 175, 70);
        Fodboldspiller ronaldo = new Fodboldspiller(null, "ronaldo", "saudi2", 185, 75);

        System.out.println(messi.getFornavn() + " " + messi.getEfternavn() + " " + messi.getKlub() + " " + messi.getHøjde() + "cm " + messi.getVægt() + "kg");
        System.out.println(messi);

    }
}
