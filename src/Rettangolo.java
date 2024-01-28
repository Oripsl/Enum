public class Rettangolo extends Forma {
    private double base;
    private double altezza;
    private final TipoForma forma;

    @Override
    double calcoloArea() {
        return base * altezza;
    }

    public TipoForma getForma() {
        return forma;
    }

    public Rettangolo(double base, double altezza, TipoForma forma) {
        this.base = base;
        this.altezza = altezza;
        this.forma = forma;
    }


}
