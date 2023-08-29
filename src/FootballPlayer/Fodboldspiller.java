package FootballPlayer;

public class Fodboldspiller {
    private String fornavn;
    private String efternavn;
    private String klub;
    private double højde;
    private int vægt;

    public Fodboldspiller(String fornavn, String efternavn, String klub, double højde, int vægt) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.klub = klub;
        this.højde = højde;
        this.vægt = vægt;
    }

    @Override
    public String toString() {
        return "fornavn: " + fornavn + " efternavn: " + efternavn + " klub: " + klub + " højde: " + højde + "cm" + " vægt: " + vægt + "kg";
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public double getHøjde() {
        return højde;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public int getVægt() {
        return vægt;
    }

    public void setVægt(int vægt) {
        this.vægt = vægt;
    }
}
