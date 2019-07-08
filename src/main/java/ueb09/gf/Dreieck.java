package ueb09.gf;

public class Dreieck extends geometrischeFiguren {

    private int xpunkt1;
    private int ypunkt1;
    private int xpunkt2;
    private int ypunkt2;
    private int seitenlaenge1 = ypunkt1 + ypunkt2;
    private int seitenlaenge2 = xpunkt1 + xpunkt2;
    private double seitenlaenge3 = Math.sqrt((Math.pow(seitenlaenge1,2) + Math.pow(seitenlaenge2,2)));

    public Dreieck(String name, int xstartpunkt, int ystartpunkt, int xpunkt1, int ypunkt1, int xpunkt2, int ypunkt2) {
        super(name, xstartpunkt, ystartpunkt);
        this.xpunkt1 = xpunkt1;
        this.ypunkt1 = ypunkt1;
        this.xpunkt2 = xpunkt2;
        this.ypunkt2 = ypunkt2;
    }


    @Override
    public String toString (){
        return super.toString()
                + ", (" + xpunkt1 + ", " + ypunkt1 +") und ("+ xpunkt2 +", "+ ypunkt2+ ") mit Seitenlängen " + seitenlaenge1 + ", " + seitenlaenge2 + " und " + seitenlaenge3+ " .";
    }
}
