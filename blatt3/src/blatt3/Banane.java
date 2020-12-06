package blatt3;

public class Banane extends Frucht{

	/**
	 * Konstruktor
	 * @param n Name
	 * @param g Gewicht
	 * @param e Einheit
	 * @param a Anzahl
	 */
	public Banane(String n, double g, Einheit e, int a) {
		super(n, g, e, a);
	}

	@Override
	void bereiteZu() {
		System.out.println("Schneide " + this.getGewicht() * this.getAnzahl() + this.getEinheit() + " " 
		+ this.getName() + " in Scheiben\n");
	}
	

}
