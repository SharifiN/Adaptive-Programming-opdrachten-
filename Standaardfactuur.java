public class Standaardfactuur implements Factuur {
    private String factuurid;
    private String factuurbedrag;


    public Standaardfactuur() {
        this.factuurid = "Factuurnummer:" + "NL14859885";
        this.factuurbedrag ="factuurbedrag:" + "78.951,00 euro";
    }

    @Override
    public String getFactuurid() {
        return factuurid;
    }

    public void setFactuurid(String factuurid) {
        this.factuurid = factuurid;
    }

    @Override
    public String getFactuurbedrag() {
        return factuurbedrag;
    }

    public void setFactuurbedrag(int factuurbedrag) {
        this.factuurbedrag = "factuurbedrag:"+"78.951,00 euro";;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
