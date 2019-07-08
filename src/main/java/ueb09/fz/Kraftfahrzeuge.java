package ueb09.fz;

public class Kraftfahrzeuge extends Fortbewegungsmittel{
    private int ps;
    private int tankvolumen;

    public Kraftfahrzeuge(String hersteller, String modell, int ps, int tankvolumen){
        super(hersteller, modell);
        this.ps = ps;
        this.tankvolumen = tankvolumen;
    }

    public String toString(){
        return super.toString()
            + ps + " PS, "
            + + tankvolumen + " Tankvolumen, " ;
    }
}
