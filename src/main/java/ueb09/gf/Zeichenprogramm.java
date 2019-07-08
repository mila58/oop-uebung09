package ueb09.gf;
import java.util.LinkedList;
import java.util.List;

public class Zeichenprogramm {
	public static void main(String[] args) {
		// 1. Datenstruktur erstellen, welche die geometrischen Formen speichern soll
		List figuren = new LinkedList();

		// 2. Je ein/en Kreis, Viereck und Dreieck erstellen, und in obige Struktur einfuegen
		Kreis kreis = new Kreis("Kreis",5,10,5);
		Rechteck rechteck = new Rechteck("Rechteck",0,0,3,2);
		Dreieck dreieck = new Dreieck("Dreieck",0,0,1,0,0,1);

		figuren.add(kreis);
		figuren.add(rechteck);
		figuren.add(dreieck);

		// 3. Alle Formen mit `toString` auf der Konsole ausgeben.

		for(Object figur: figuren){
			System.out.println(figur);
		}
	}
}
