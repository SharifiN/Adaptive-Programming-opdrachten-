public class Periodiekefactuur extends Standaardfactuur{
    private String periode;

    public Periodiekefactuur(int factuurid, int factuurbedrag, String periode) {
        super(factuurid, factuurbedrag);
        this.periode = periode;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        periode = periode;
    }


}
