public class Standaardfactuur implements Factuur {
    private int factuurid;
    private int factuurbedrag;


    public Standaardfactuur(int factuurid, int factuurbedrag) {
        this.factuurid=factuurid;
        this.factuurbedrag=factuurbedrag;

    }

    @Override
    public int getFactuurid() {
        return factuurid;
    }

    public void setFactuurid(int factuurid) {
        this.factuurid = factuurid;
    }

    @Override
    public int getFactuurbedrag() {
        return factuurbedrag;
    }

    public void setFactuurbedrag(int factuurbedrag) {
        this.factuurbedrag = factuurbedrag;
        ;
    }
}


