package blatt3;

/*
 * in Interfaces sind nur abstrakte Methoden enthalten! Quasi eine Methodensammlung ohne Inhalt
 */
public interface Saeuberung {
	
	/**
	 * waescht eine beliebige Frucht
	 * @param f Frucht, die gewaschen werden soll
	 */
	abstract void wasche(Frucht f);
	
	/**
	 * entkernt eine beliebige Frucht
	 * @param f Frucht, die entkernt werden soll
	 */
	abstract void entkerne(Frucht f);

}
