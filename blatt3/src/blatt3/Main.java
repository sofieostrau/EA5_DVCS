package blatt3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main (String[] peter) {
		// Fruechte
					Banane chiquitita = new Banane("Chiquitta", 0.26, Einheit.kg, 3);
					Banane mini = new Banane("Minibanane", 70.0, Einheit.g, 1);
					Apfel golden = new Apfel("Golden Delicious", 300.0, Einheit.g, 5);
					Melone wasserMel = new Melone("Wassermelone", 3.5, Einheit.kg, 1);
					Melone honey = new Melone("Honigmelone", 1000, Einheit.g, 2);

					// Obstsalat No.1
					Obstsalat muttisBester = new Obstsalat("Mutti's Bester", "Glasschuessel");
					ArrayList<Frucht> fruechte = new ArrayList<Frucht>();
					fruechte.add(golden);
					fruechte.add(chiquitita);
					muttisBester.setFruechte(fruechte);
					muttisBester.macheObstsalat(fruechte);
					System.out.println(muttisBester + "\n");
					
					System.out.println("Das ist ein Test für Git"); 
	}
	
	
}
