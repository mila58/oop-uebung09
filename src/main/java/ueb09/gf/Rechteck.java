package ueb09.gf;

public class Rechteck extends geometrischeFiguren {

    private int breite;
    private int hoehe;

    public Rechteck(String name, int xstartpunkt, int ystartpunkt, int breite, int hoehe) {
        super(name, xstartpunkt, ystartpunkt);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public String toString(){
        return super.toString()
                + " bis (" + breite + ", " + hoehe + ") mit Breite " + breite + " und Höhe " + hoehe;
    }
}
