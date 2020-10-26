package it.corso.accenture.entities;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\danie\\eclipse-workspace\\Rubrica Telefonica\\rubrica.txt");
		List<NumeroTelefonico> rubrica = new ArrayList<NumeroTelefonico>();
		Scanner input = new Scanner(System.in);
		Scanner lett = null;
		try {
			lett = new Scanner(f);
		} catch (FileNotFoundException e1) {
			System.out.println("Errore nella lettura del file");
			e1.printStackTrace();
		}
		int risp = 0;

		try {
			FileReader impi = new FileReader(f);
			while (lett.hasNextLine()) {
				String data = lett.nextLine();
				int num = lett.nextInt();
				NumeroTelefonico numero = new NumeroTelefonico(data, num);
				rubrica.add(numero);
			}
			impi.close();
			System.out.println("Rubrica popolata con successo");
		} catch (IOException e) {
			System.out.println("Errore nella lettura del file...");
			e.printStackTrace();
		}
		
		do {
			System.out.println(
					"----Menu----\n 1.Visualizza Elenco\n 2.Inserisci contatto\n 3.Cancella Contatto\n 4.Aggiorna Contatto\n 5.Ricerca\n 6.Esci");
			switch(risp) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("Arrivederci...");
				break;
			default:
				System.out.println("Valore non valido...");
				break;
			}
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
