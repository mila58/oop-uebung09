package ueb09.fz;

public class Auto extends Kraftfahrzeuge{

	private int hubraum;
	private int zulGesamtGewicht;
	private int sitze;
	private int tueren;
	private Bremse[] bremsen;

	public Auto(String hersteller, String modell, int ps, int hubraum, int tankvolumen, int sitze, int tueren, int zulGesamtGewicht) {
		super(hersteller,modell,ps,tankvolumen);
		this.hubraum = hubraum;
		this.sitze = sitze;
		this.zulGesamtGewicht = zulGesamtGewicht;

		this.bremsen = new Scheibenbremse[] {
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse()
		};
	}

	public String toString() {
		return super.toString()
				+ hubraum + " Hubraum, "
				+ sitze + " Sitzen, "
				+ tueren + " Türen, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}

}
