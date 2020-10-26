package it.corso.accenture.entities;

import java.io.File;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\danie\\eclipse-workspace\\Rubrica Telefonica\\rubrica.txt");
		List<NumeroTelefonico> rubrica = new ArrayList<NumeroTelefonico>();
		Scanner input = new Scanner(System.in);
		int risp = 0;

		do {
			System.out.println(
					"----Menu----\n 1.Visualizza Elenco\n 2.Inserisci contatto\n 3.Cancella Contatto\n 4.Aggiorna Contatto\n 5.Ricerca\n 6.Esci");
			
		} while (risp != 6);
		input.close();
	}

	// Methods
	private void visualizzaContatto() {

	}

	private void insertContatto(NumeroTelefonico num) {

	}

	private void deleteContatto(String nome) {

	}

	private void deleteContatto(NumeroTelefonico num) {

	}

	private void updateContatto(NumeroTelefonico num) {

	}

	private NumeroTelefonico ricerca(String nome) {
		return null;
	}

	private NumeroTelefonico ricerca(int num) {
		return null;
	}
}
