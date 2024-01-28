public class Enumeratore {
    public static void main(String[] args) {
        Rettangolo rettangolo =  new Rettangolo(5, 9, TipoForma.Rettangolo);
        Triangolo triangolo = new Triangolo(14, 19, TipoForma.Triangolo);

        System.out.println(triangolo.getForma());
        System.out.println(rettangolo.getForma());


    }
}
