package nl.vilius.geometrija;

import java.util.Scanner;

public class Apskritimas {

	Scanner scanner = new Scanner(System.in);

	double r;

	public Apskritimas() {

	}

	double skaiciuokPlota(double r) {

		return Math.PI * Math.pow(r, 2);
	}

	double skaiciuokIlgi(double r) {

		return 2 * Math.PI * r;
	}

	double skaiciuokSkersmeni(double r) {
		return 2 * r;
	}
//-------------

	public void issveskApskritimoDuomenis() {
		System.out.println("Įveskite apskritimo spindulio ilgį: ");
		double r = scanner.nextDouble();
		System.out.println();
		System.out.println("Skersmens ilgis: " + skaiciuokSkersmeni(r));
		System.out.println("Apskritimo ilgis: " + skaiciuokIlgi(r) + " ilgio vienetų");
		System.out.println("Skritulio Plotas: " + skaiciuokPlota(r) + " ploto vienetų");

	}

}
