public class Zakkelijkeklant extends Klant {
    private int btwnummer;

    public Zakkelijkeklant(String naam) {
        super(naam);
    }

    public int getBtwnummer() {
        return btwnummer;
    }

    public void setBtwnummer(int btwnummer) {
        this.btwnummer = btwnummer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
