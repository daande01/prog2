package klassvariabel_klassmetod;

public class konto1 {

	private static double räntesats;
	int i = 20;

	public static double avläsränta() {

		return räntesats;
	}

	public static void ändraränta(double nyränta) {

		räntesats = nyränta;

	}

	private int kundnr;
	private double saldo, intjänadränta;

	public konto1(int kund) {

		kundnr = kund;

	}

	public double avlässaldo() {

		return saldo;

	}

	public void transaktion(double belopp) {

		if (belopp < 0 && saldo + belopp < 0) {

			System.out.print("uttag ej möjligt");

		} else {

			saldo = saldo + belopp;
		}

	}

	public void beräknadagsränta() {

		intjänadränta = intjänadränta + saldo * räntesats / 100 / 365;

	}

	public void läggtillränta() {

		saldo = saldo + intjänadränta;
		intjänadränta = 0;

	}

	public static void main(String[] arg) {

		konto1 k1 = new konto1(1);
		konto1 k2 = new konto1(2);

		k1.transaktion(100);
		k1.beräknadagsränta();
		k1.läggtillränta();
		System.out.println(k1.avlässaldo());

		konto1.ändraränta(5);

		k2.transaktion(100);
		k2.beräknadagsränta();
		k2.läggtillränta();
		System.out.println(k2.avlässaldo());

	}

}
