package klassvariabel_klassmetod;

public class konto1 {

	private static double r�ntesats;
	int i = 20;

	public static double avl�sr�nta() {

		return r�ntesats;
	}

	public static void �ndrar�nta(double nyr�nta) {

		r�ntesats = nyr�nta;

	}

	private int kundnr;
	private double saldo, intj�nadr�nta;

	public konto1(int kund) {

		kundnr = kund;

	}

	public double avl�ssaldo() {

		return saldo;

	}

	public void transaktion(double belopp) {

		if (belopp < 0 && saldo + belopp < 0) {

			System.out.print("uttag ej m�jligt");

		} else {

			saldo = saldo + belopp;
		}

	}

	public void ber�knadagsr�nta() {

		intj�nadr�nta = intj�nadr�nta + saldo * r�ntesats / 100 / 365;

	}

	public void l�ggtillr�nta() {

		saldo = saldo + intj�nadr�nta;
		intj�nadr�nta = 0;

	}

	public static void main(String[] arg) {

		konto1 k1 = new konto1(1);
		konto1 k2 = new konto1(2);

		k1.transaktion(100);
		k1.ber�knadagsr�nta();
		k1.l�ggtillr�nta();
		System.out.println(k1.avl�ssaldo());

		konto1.�ndrar�nta(5);

		k2.transaktion(100);
		k2.ber�knadagsr�nta();
		k2.l�ggtillr�nta();
		System.out.println(k2.avl�ssaldo());

	}

}
