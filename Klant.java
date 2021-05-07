public class Klant {
    private String naam;
    private String adres;
    private String facutuuradres;
    private int klantid;




    public Klant(String naam, String adres, String facutuuradres,int klantid){
        this.naam = naam;
        this.adres = adres;
        this.facutuuradres = facutuuradres;
        this.klantid = klantid;


    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;}

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



    public int getKlantid() {
        return klantid;
    }

    public void Klantid(int klantid) {
        this.klantid = klantid;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}


