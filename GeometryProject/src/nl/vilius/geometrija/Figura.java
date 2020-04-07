package nl.vilius.geometrija;

import java.util.Scanner;

public class Figura {

	static Scanner scanner = new Scanner(System.in);

	public static void issveskDuomenis() {

		Trikampis trikampis1 = new Trikampis();
		Kvadratas kvadratas1 = new Kvadratas();
		Apskritimas apskritimas1 = new Apskritimas();
		Staciakampis staciakampis1 = new Staciakampis();

		System.out.println(
				"Pasirinkite geometrinę figūrą: (trikampis, kvadratas, stačiakampis, apskritimas). Informacija pateikiama pagal figūros kraštines.");
		String figura = scanner.next();
		if (figura.equals("trikampis")) {
			trikampis1.issveskInformacijaApieTrikampi();
			System.out.println();
			System.out.println("Ar norite tęsti?: taip/ne ");
			String pasirinkimas = scanner.next();
			if (pasirinkimas.equals("taip")) {
				issveskDuomenis();
			}
		} else if (figura.equals("kvadratas")) {
			kvadratas1.issveskKvadratoDuomenis();
			System.out.println();
			System.out.println("Ar norite tęsti?: taip/ne ");
			String pasirinkimas = scanner.next();
			if (pasirinkimas.equals("taip")) {
				issveskDuomenis();
			}
		} else if (figura.equals("apskritimas")) {
			apskritimas1.issveskApskritimoDuomenis();
			System.out.println();
			System.out.println("Ar norite tęsti?: taip/ne ");
			String pasirinkimas = scanner.next();
			if (pasirinkimas.equals("taip")) {
				issveskDuomenis();
			}
		}
			else if (figura.equals("staciakampis")) {
				staciakampis1.issveskStaciakampioDuomenis();
				System.out.println();
				System.out.println("Ar norite tęsti?: taip/ne ");
				String pasirinkimas = scanner.next();
				if (pasirinkimas.equals("taip")) {
					issveskDuomenis();
				}
			}
		 else
			System.out.println("Tokios geometrinės figūros nėra");
	}

}

