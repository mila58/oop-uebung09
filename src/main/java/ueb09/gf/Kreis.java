package ueb09.gf;

public class Kreis extends geometrischeFiguren {

    private int radius;

    public Kreis(String name, int xstartpunkt, int ystartpunkt, int radius){
        super(name,xstartpunkt,ystartpunkt);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString()
                + " mit Radius " + radius;
    }
}
