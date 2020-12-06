package blatt3;

public class Melone extends Frucht implements Saeuberung{

	public Melone(String n, double g, Einheit e, int a) {
		super(n, g, e, a);
	}

	@Override
	public void wasche(Frucht f) {
		System.out.println("Wasche " + this.getName());
	}

	@Override
	public void entkerne(Frucht f) {
		System.out.println("Entkerne " + this.getName());
	}

	@Override
	void bereiteZu() {
		wasche(this);
		entkerne(this);
		System.out.println("Schneide " + this.getAnzahl() * this.getGewicht() + this.getEinheit()
		+ " " + this.getName() + " in große Stücke\n");
	}

}
