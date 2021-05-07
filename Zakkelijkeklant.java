public class Zakkelijkeklant extends Klant {
    private String btwnummer;

    public Zakkelijkeklant(String naam, String adres, String facutuuradres, int klantid, String btwnummer) {
        super(naam, adres, facutuuradres, klantid);
        this.btwnummer = btwnummer;
    }

    public String getBtwnummer() {
        return btwnummer;
    }

    public void setBtwnummer(String btwnummer) {
        this.btwnummer = btwnummer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
