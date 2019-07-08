package ueb09.fz;

public class Fortbewegungsmittel {
    private String hersteller;
    private String modell;

    public Fortbewegungsmittel(String hersteller, String modell){
        this.hersteller = hersteller;
        this.modell = modell;
    }

    public String toString(){
        return "Ich bin ein " + hersteller + " " + modell + " mit ";
    }
}
