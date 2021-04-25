public class Klant extends Standaardfactuur {
    private String naam;
    private String adres;
    private String facutuuradres;
    private int factuurnummer;
    private String klantid;

    public Klant(String naam) {
        this.naam = "Naam:" + "johan van der Berg";
        this.adres = "Adres:"+"Livefd 14" + "1578 HN"+"Den Haag";
        this.facutuuradres = "Factuuradres:" + "Livefd 14" +"1578 HN"+"Den Haag";
        this.klantid = "Klant-Id:" + "154896";


    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getFacutuuradres() {
        return facutuuradres;
    }

    public void setFacutuuradres(String facutuuradres) {
        this.facutuuradres = facutuuradres;
    }

    public int getFactuurnummer() {
        return factuurnummer;
    }

    public void setFactuurnummer(int factuurnummer) {
        this.factuurnummer = factuurnummer;
    }

    public String getKlantid() {
        return klantid;
    }

    public void setKlantid(String klantid) {
        this.klantid = klantid;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


