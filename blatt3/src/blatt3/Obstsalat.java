package blatt3;

import java.util.ArrayList;

public class Obstsalat {

	private String name;
	private String behaelter;
	private ArrayList<Frucht> zutatenListe = new ArrayList<Frucht>();
	private String ausgabeZutaten;
	private double gewicht = 0.0;

	/**
	 * Konstruktor
	 * 
	 * @param n Name des Salates
	 * @param b Behealter, in dem Salat aufbewahrt wird
	 */
	public Obstsalat(String n, String b) {
		this.name = n;
		this.behaelter = b;
	}

	/**
	 * Methode, um einen Obstsalat zu machen
	 * 
	 * @param fruechte
	 */
	public void macheObstsalat(ArrayList<Frucht> fruechte) {
		
		if (fruechte.size() == 0) {
			System.out.println("Keine Fruechte um Obstsalat zu machen :(");
		} else {
			for (Frucht f : fruechte) {
				f.bereiteZu();
				if (f.getEinheit().equals(Einheit.mg)) {
					this.gewicht += (f.getGewicht() * f.getAnzahl()) * 0.00001;
				}
				if (f.getEinheit().equals(Einheit.g)) {
					this.gewicht += (f.getGewicht() * f.getAnzahl() * 0.001);
				}
				if (f.getEinheit().equals(Einheit.kg)) {
					this.gewicht += (f.getGewicht() * f.getAnzahl());
				}

			}
		}
	}

	public int versorgtPersonen() {
		int ret = 0;
		double gesamt = 0.0;

		for (Frucht f : this.zutatenListe) {
			if (f.getEinheit().equals(Einheit.mg)) {
				gesamt += f.getGewicht() * f.getAnzahl() * 0.00001;
			}
			if (f.getEinheit().equals(Einheit.g)) {
				gesamt += f.getGewicht() * f.getAnzahl() * 0.001;
			}
			if (f.getEinheit().equals(Einheit.kg)) {
				gesamt += f.getGewicht() * f.getAnzahl();
			}
		}

		ret = (int) gesamt; // hier TypeCast zu int, denn ich sage einfach, dass 1kg Salat eine Person satt
							// macht,
		// wenn ich das also TypeCaste, faellt einfach die Nachkommastelle weg und es
		// kommt die Personenanzahl heraus
		return ret;
	}

	public void setFruechte(ArrayList<Frucht> fr) {
		this.zutatenListe = fr;
		
		
	}
	
	

	public String toString() {
		String ret = "";

		ret += "Der Obstsalat " + this.name + " im Behaelter " + this.behaelter + " fuer " + versorgtPersonen()
				+ " Personen enthaelt\n";

		for (Frucht f : this.zutatenListe) {
			ret += f.getAnzahl() * f.getGewicht() + " " + f.getEinheit() + " " + f.getName() + "\n";
		}

		ret += "und wiegt " + this.gewicht + " Kilogramm";

		return (this.zutatenListe.size() == 0) ? "Dieser Obstsalat enthaelt keine Zutaten, aber er heisst " + this.name
				+ " und wird in " + this.behaelter + " aufbewahrt." : ret;

		/*
		 * "Der Obstsalat " + this.name + " im Behaelter " + this.behaelter + "fuer " +
		 * versorgtPersonen() + " Personen enthaelt " + this.ausgabeZutaten +
		 * " und wiegt " + this.gewicht + " Kilogramm.";
		 */
	}

}
