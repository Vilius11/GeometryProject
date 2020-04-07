package nl.vilius.geometrija;

import java.util.Scanner;

public class Kvadratas extends Apskritimas {

	Scanner scanner = new Scanner(System.in);

	double a;

	public Kvadratas() {

	}

	double skaiciuokKvadratoPlota(double a) {
		return Math.pow(a, 2);
	}

	double skaiciuokKvadratoPerimetra(double a) {
		return 4 * a;
	}

	double apskaiciuokIstrizaine(double a) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2));
	}

	double isveskKvadratoPusesPlota(double a) {
		return skaiciuokKvadratoPlota(a) / 2;
	}
	
	double apskaiciuokKvadratoTrikampioPusesSinusaIrKosinusa() {
		return a / apskaiciuokIstrizaine(a); 
	}
//----------I A SKRITULYS
	double isveskItaKvadrataIbreztoApskritimoIlgi(double a) {
		return skaiciuokIlgi(a / 2);
	}

	double isveskApieTaKvadrataApibreztoApskritimoIlgi(double a) {
		return skaiciuokIlgi((apskaiciuokIstrizaine(a)) / 2);
		
	}

//---------	
	public void issveskKvadratoDuomenis() {
		System.out.println("Įveskite kvadrato kraštinės ilgį: ");
		a = scanner.nextDouble();
		System.out.println("Kvadrato plotas: " + skaiciuokKvadratoPlota(a) + " ploto vienetų.");
		System.out.println("Kvadrato perimetras: " + skaiciuokKvadratoPerimetra(a) + " ilgio vienetų.");
		System.out.println("Kvadrato įstrižainės ilgis: " + apskaiciuokIstrizaine(a) + " ilgio vienetų.");
		System.out.println("Kvadrato pusės plotas: " + isveskKvadratoPusesPlota(a) + " ploto vienetų.");
		System.out.println("Į šį kvadratą įbrėžto apskritimo ilgis yra: " + isveskItaKvadrataIbreztoApskritimoIlgi(a) + " ilgio vienetų." );
		System.out.println("Apie šį kvadratą apibrėžto apskritimo ilgis yra: " + isveskApieTaKvadrataApibreztoApskritimoIlgi(a) + " ilgio vienetų.");
		System.out.println("Kvadrato pusės (stačiojo trikampio smailiųjų kampų) sinusas ir kosinusas yra: " + apskaiciuokKvadratoTrikampioPusesSinusaIrKosinusa());
	}

}
