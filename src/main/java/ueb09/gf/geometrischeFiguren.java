package ueb09.gf;

public class geometrischeFiguren {
    private String name;
    private int xstartpunkt;
    private int ystartpunkt;

    public geometrischeFiguren(String name, int xstartpunkt, int ystartpunkt){
        this.name = name;
        this.xstartpunkt = xstartpunkt;
        this.ystartpunkt = ystartpunkt;
    }

    public String toString(){
        return name + " um (" + xstartpunkt+ ", " + ystartpunkt + ")";
    }
}
