public class Triangolo extends Forma {
    private double base;
    private double altezza;
    private final TipoForma forma;

    @Override
    double calcoloArea() {
       return base * altezza / 2;
    }

    public TipoForma getForma() {
        return forma;
    }

    public Triangolo(double base, double altezza, TipoForma forma) {
        this.base = base;
        this.altezza = altezza;
        this.forma = forma;
    }



}
