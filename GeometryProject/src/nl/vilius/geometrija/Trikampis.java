package nl.vilius.geometrija;

import java.util.Scanner;

public class Trikampis extends Apskritimas {

	Scanner scanner = new Scanner(System.in);

	public double ilgis1;
	public double ilgis2;
	public double ilgis3;

	boolean nustatykArTrikampisEgzistuoja(double ilgis1, double ilgis2, double ilgis3) {
		if (!(ilgis1 + ilgis2 > ilgis3) && (ilgis2 + ilgis3 > ilgis1) && (ilgis1 + ilgis3 > ilgis2)) {
			return false;
		}
		return true;
	}

//-------------
	private double nustatykIlgiausiaKrastine(double ilgis1, double ilgis2, double ilgis3) {
		if (ilgis1 >= ilgis2 && ilgis1 > ilgis3 || ilgis1 > ilgis2 && ilgis1 >= ilgis3) {
			return ilgis1;
		} else if (ilgis2 >= ilgis1 && ilgis2 > ilgis3 || ilgis2 > ilgis1 && ilgis2 >= ilgis3) {
			return ilgis2;
		} else if (ilgis3 >= ilgis2 && ilgis3 > ilgis2 || ilgis3 > ilgis2 && ilgis3 >= ilgis2) {
			return ilgis3;
		}
		return ilgis1;
	}

	private double nustatykTrumpiausiaKrastine(double ilgis1, double ilgis2, double ilgis3) {
		if (ilgis1 <= ilgis2 && ilgis1 < ilgis3 || ilgis1 < ilgis2 && ilgis1 <= ilgis3) {
			return ilgis1;
		} else if (ilgis2 <= ilgis1 && ilgis2 < ilgis3 || ilgis2 < ilgis1 && ilgis2 <= ilgis3) {
			return ilgis2;
		} else if (ilgis3 <= ilgis2 && ilgis3 < ilgis2 || ilgis3 < ilgis2 && ilgis3 <= ilgis2) {
			return ilgis3;
		}
		return ilgis1;
	}

	private double nustatykVidurineKrastine(double ilgis1, double ilgis2, double ilgis3) {
		if (ilgis1 < nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3)
				&& ilgis1 > nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3)) {
			return ilgis1;
		} else if (ilgis2 < nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3)
				&& ilgis2 > nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3)) {
			return ilgis2;
		} else if (ilgis3 < nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3)
				&& ilgis3 > nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3)) {
			return ilgis3;
		}
		return ilgis1;
	}

//-------------
	public void nustatykTrikampioRusi(double ilgis1, double ilgis2, double ilgis3) {
		if (ilgis1 != ilgis2 && ilgis1 != ilgis3 && ilgis2 != ilgis3
				&& (ilgis1 != Math.sqrt(Math.pow(ilgis2, 2) + Math.pow(ilgis3, 2))
						&& ilgis2 != Math.sqrt(Math.pow(ilgis1, 2) + Math.pow(ilgis3, 2))
						&& ilgis3 != Math.sqrt(Math.pow(ilgis2, 2) + Math.pow(ilgis1, 2)))) {
			System.out.println("Trikampis yra įvairiakraštis.");
			System.out.println("Trikampio kampo kosinusai: " + skaiciuokTrikampioKampoKosinusa1(ilgis1, ilgis2, ilgis3)
					+ ", " + skaiciuokTrikampioKampoKosinusa2(ilgis1, ilgis2, ilgis3) + ", "
					+ skaiciuokTrikampioKampoKosinusa3(ilgis1, ilgis2, ilgis3));
			System.out.println(
					"Trikampio kampų dydžiai: " + arccosinusas1() + ", " + arccosinusas2() + ", " + arccosinusas3());
		} else if (ilgis1 == ilgis2 || ilgis1 == ilgis3 || ilgis2 == ilgis3) {
			System.out.println("Trikapis yra lygiašonis.");
			System.out.println("Trikampio kampo kosinusai: " + skaiciuokTrikampioKampoKosinusa1(ilgis1, ilgis2, ilgis3)
					+ ", " + skaiciuokTrikampioKampoKosinusa2(ilgis1, ilgis2, ilgis3) + ", "
					+ skaiciuokTrikampioKampoKosinusa3(ilgis1, ilgis2, ilgis3));
			System.out.println(
					"Trikampio kampų dydžiai: " + arccosinusas1() + ", " + arccosinusas2() + ", " + arccosinusas3());
		} else if (ilgis1 == ilgis2 && ilgis1 == ilgis3 && ilgis2 == ilgis3) {
			System.out.println("Trikampis yra lygiakraštis.");
			System.out.println("Trikampio kampo kosinusai: " + skaiciuokTrikampioKampoKosinusa1(ilgis1, ilgis2, ilgis3)
					+ ", " + skaiciuokTrikampioKampoKosinusa2(ilgis1, ilgis2, ilgis3) + ", "
					+ skaiciuokTrikampioKampoKosinusa3(ilgis1, ilgis2, ilgis3));
			System.out.println(
					"Trikampio kampų dydžiai: " + arccosinusas1() + ", " + arccosinusas2() + ", " + arccosinusas3());
		} else if (ilgis1 == Math.sqrt(Math.pow(ilgis2, 2) + Math.pow(ilgis3, 2))
				|| ilgis2 == Math.sqrt(Math.pow(ilgis1, 2) + Math.pow(ilgis3, 2))
				|| ilgis3 == Math.sqrt(Math.pow(ilgis2, 2) + Math.pow(ilgis1, 2))) {
			System.out.println("Trikampis yra statusis. ");
			System.out.println("Apie šį trikampį apibrėžto apskritimo ilgis: "
					+ skaiciuokApieStatujiTrikampiApibreztoApskritimoSpinduli());
			System.out.println(
					"Trikampio kraštinių ilgių santykiai: " + raskTrigonometrinesFunkcijas1(ilgis1, ilgis2, ilgis3)
							+ ", " + raskTrigonometrinesFunkcijas2(ilgis1, ilgis2, ilgis3));
		}
	}

	double skaiciuokPlota(double ilgis1, double ilgis2, double ilgis3) {
		double p = (skaiciuokPerimetra(ilgis1, ilgis2, ilgis3)) / 2;
		double S = Math.sqrt(p * (p - ilgis1) * (p - ilgis2) * (p - ilgis3));
		return S;
	}

	double skaiciuokPerimetra(double ilgis1, double ilgis2, double ilgis3) {
		return ilgis1 + ilgis2 + ilgis3;
	}

	double skaiciuokApieStatujiTrikampiApibreztoApskritimoSpinduli() {
		return skaiciuokIlgi((nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3)) / 2);
	}

//--------TRIGONOMETRIJA (sinusas ar kosinusas)?
	public double raskTrigonometrinesFunkcijas1(double ilgis1, double ilgis2, double ilgis3) {
		if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) != ilgis1
				&& nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) != ilgis2) {
			return ilgis1 / nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3);
		} else if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) != ilgis2
				&& nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) != ilgis3) {
			return ilgis2 / nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3);
		} else
			return ilgis3 / nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3);

	}

//                 (tangemtas ar kotangentas)
	public double raskTrigonometrinesFunkcijas2(double ilgis1, double ilgis2, double ilgis3) {
		if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis1) {
			return ilgis2 / ilgis3;
		} else if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis2) {
			return ilgis1 / ilgis3;
		}
		return ilgis1 / ilgis2;
	}

//--------------KOSINUSAI

	public double skaiciuokTrikampioKampoKosinusa1(double ilgis1, double ilgis2, double ilgis3) {
		if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis1) {
			return (Math.pow(ilgis2, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis1, 2)) / (2 * ilgis2 * ilgis3);
		} else if (nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis2) {
			return (Math.pow(ilgis1, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis2, 2)) / (2 * ilgis1 * ilgis3);
		}
		return (Math.pow(ilgis1, 2) + Math.pow(ilgis2, 2) - Math.pow(ilgis3, 2)) / (2 * ilgis1 * ilgis2);
	}

	public double skaiciuokTrikampioKampoKosinusa2(double ilgis1, double ilgis2, double ilgis3) {
		if (nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis1) {
			return (Math.pow(ilgis2, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis1, 2)) / (2 * ilgis2 * ilgis3);
		} else if (nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3) == ilgis2) {
			return (Math.pow(ilgis1, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis2, 2)) / (2 * ilgis1 * ilgis3);
		}
		return (Math.pow(ilgis1, 2) + Math.pow(ilgis2, 2) - Math.pow(ilgis3, 2)) / (2 * ilgis1 * ilgis2);
	}

	public double skaiciuokTrikampioKampoKosinusa3(double ilgis1, double ilgis2, double ilgis3) {
		if (nustatykVidurineKrastine(ilgis1, ilgis2, ilgis3) == ilgis1) {
			return (Math.pow(ilgis2, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis1, 2)) / (2 * ilgis2 * ilgis3);
		} else if (nustatykVidurineKrastine(ilgis1, ilgis2, ilgis3) == ilgis2) {
			return (Math.pow(ilgis1, 2) + Math.pow(ilgis3, 2) - Math.pow(ilgis2, 2)) / (2 * ilgis1 * ilgis3);
		}
		return (Math.pow(ilgis1, 2) + Math.pow(ilgis2, 2) - Math.pow(ilgis3, 2)) / (2 * ilgis1 * ilgis2);
	}
//--------KAMPAI

	public double arccosinusas1() {
		return Math.toDegrees(Math.acos(skaiciuokTrikampioKampoKosinusa1(ilgis1, ilgis2, ilgis3)));
	}

	public double arccosinusas2() {
		return Math.toDegrees(Math.acos(skaiciuokTrikampioKampoKosinusa2(ilgis1, ilgis2, ilgis3)));
	}

	public double arccosinusas3() {
		return Math.toDegrees(Math.acos(skaiciuokTrikampioKampoKosinusa3(ilgis1, ilgis2, ilgis3)));
	}

//--------VIDURINE LINIJA
	public double nustatykTrikampioVidurinesLinijosIlgi1() {
		return nustatykIlgiausiaKrastine(ilgis1, ilgis2, ilgis3) / 2;
	}

	public double nustatykTrikampioVidurinesLinijosIlgi2() {
		return nustatykTrumpiausiaKrastine(ilgis1, ilgis2, ilgis3) / 2;
	}

	public double nustatykTrikampioVidurinesLinijosIlgi3() {
		return nustatykVidurineKrastine(ilgis1, ilgis2, ilgis3) / 2;
	}

//-----------------------	
	public void issveskInformacijaApieTrikampi() {
		System.out.println("Įveskite trijų trikampio kraštinių ilgius: ");
		ilgis1 = scanner.nextDouble();
		ilgis2 = scanner.nextDouble();
		ilgis3 = scanner.nextDouble();
		if (nustatykArTrikampisEgzistuoja(ilgis1, ilgis2, ilgis3) == true) {
			System.out.println("Toks trikampis egzistuoja. Ar pateikti duomenis apie šį trikampį? taip/ne ");
			String pasirinkimas = scanner.next();
			if (pasirinkimas.equals("taip")) {
				System.out.println(
						"Trikampio perimetras: " + skaiciuokPerimetra(ilgis1, ilgis2, ilgis3) + " ilgio vienetų.");
				System.out.println("Trikampio plotas: " + skaiciuokPlota(ilgis1, ilgis2, ilgis3) + " ploto vienetų.");
				nustatykTrikampioRusi(ilgis1, ilgis2, ilgis3);
				System.out.println("Trikampio vidurinių linijų ilgiai: " + nustatykTrikampioVidurinesLinijosIlgi1() + ", "
						+ nustatykTrikampioVidurinesLinijosIlgi2() + ", " + nustatykTrikampioVidurinesLinijosIlgi3());
			} else {
				System.out.println("Toks trikampis neegzistuoja.");
			}

		}

	}
}
