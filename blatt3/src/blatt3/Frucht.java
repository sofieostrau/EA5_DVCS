package blatt3;

/*
 * Abstrakte Klasse koennen abstrakte Methoden enthalten, muessen aber nicht. Es koennen also auch nicht abstrakte Methoden
 * sowie non-final Variablen haben. (Interfaces koennen nur abstrakte Variablen enthalten.)
 * Abstrakte Klassen mit extends, Interfaces mit implements!
 * in abstrakten Methoden gibt es keinen Body!
 * ich kann kein Objekt einer abstrakten Klasse erstellen! Um eine abstrakte Klasse zu verwenden, muss ich eine Kindklasse
 * erstellen, die von der abstrakten Klasse erbt und selbst nicht abstrakt ist
 */
public abstract class Frucht {
	private String name;
	private double gewicht;
	private Einheit einheit;
	private int anzahl;
	
	/**
	 * Konstruktor
	 * @param n Name der Frucht
	 * @param g Gewicht der Frucht
	 * @param e Einheit, in der Gewicht der Frucht angegeben wird
	 * @param a vorhandene Anzahl
	 */
	public Frucht (String n, double g, Einheit e, int a) {
		this.name = n;
		this.gewicht = g;
		this.einheit = e;
		this.anzahl = a;
	}
	
	/**
	 * Methode zum Zubereiten einzelner Früchte, die in jeder Fruchtklasse selbst definiert wird
	 */
	abstract void bereiteZu();
	
	public String getName() {
		return this.name;
	}
	
	public double getGewicht() {
		return this.gewicht;
	}
	
	public Einheit getEinheit() {
		return this.einheit;
	}
	
	public int getAnzahl() {
		return this.anzahl;
	}

}
