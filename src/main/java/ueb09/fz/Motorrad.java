package ueb09.fz;

public class Motorrad extends Kraftfahrzeuge{

	private Bremse vorderbremse;
	private Bremse hinterbremse;

	public Motorrad(String hersteller, String modell, int ps, int tankvolumen) {
		super(hersteller,modell,ps,tankvolumen);

		this.vorderbremse = new Scheibenbremse();
		this.hinterbremse = new Trommelbremse();
	}

	public void anlassen() {
		System.out.println("Starte Motor...");
	}

	public String toString() {
		return super.toString()
				+ " sowie einer " + vorderbremse + " und " + hinterbremse;
	}
}
