package nl.vilius.geometrija;

import java.util.Scanner;

public class Staciakampis {

	Scanner scanner = new Scanner(System.in);

	double a, b;

	public Staciakampis() {

	}

	double skaiciuokStaciakampioPlota(double a, double b) {
		return a * b;
	}

	double skaiciuokStaciakampioPerimetra(double a, double b) {
		return 2 * (a + b);
	}

	double apskaiciuokIstrizaine(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
//------TRIGONOMETRIJA

	double apskaiciuokSinusaArKosinusa1(double a, double b) {
		return a / apskaiciuokIstrizaine(a, b);
	}

	double apskaiciuokSinusaArKosinusa2(double a, double b) {
		return b / apskaiciuokIstrizaine(a, b);
	}

	double apskaiciuokTangentaArKotangenta1(double a, double b) {
		return b / a;
	}

	double apskaiciuokTangentaArKotangenta2(double a, double b) {
		return a / b;
	}
//-------------
	public void issveskStaciakampioDuomenis() {
		System.out.println("Įveskite stačiakampio gretimų kraštinių ilgius: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		System.out.println("Stačiakampio plotas: " + skaiciuokStaciakampioPlota(a, b) + " ploto vienetų.");
		System.out.println("Stačiakampio perimetras: " + skaiciuokStaciakampioPerimetra(a, b) + " ilgio vienetų.");
		System.out.println("Stačiakampio įstrižainės ilgis: " + apskaiciuokIstrizaine(a, b) + " ilgio vienetų.");
		System.out.println("Stačiakampio (stačiojo trikampio) smailiųjų kampų sinusas ir kosinusas yra: "
				+ apskaiciuokSinusaArKosinusa1(a, b) + ", " + apskaiciuokSinusaArKosinusa2(a, b) + ", "
				+ apskaiciuokTangentaArKotangenta1(a, b) + ", " + apskaiciuokTangentaArKotangenta2(a, b));

	}

}
