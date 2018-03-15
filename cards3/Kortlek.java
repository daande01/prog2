package cards3;

public class Kortlek {

	public Kort[] Lek = new Kort[52];
	public int[] val = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10,}; // Valör
	public int[] col = { 0, 1, 2, 3 }; // Färg

	public Kortlek() {
		int k = 0;
		for (int i = 0; i < val.length; i++) {
			for (int p = 0; p < col.length; p++) {
				Lek[k] = new Kort(val[i], col[p]);
				k++;
			}
		}

	}


	public void blanda() {
		Kort temp;
		for (int y = 0; y < 52; y++) {
			int u = (int) (Math.random() * 52);
			temp = Lek[u];
			Lek[u] = Lek[y];
			Lek[y] = temp;
		}
	}

	public static void main(String[] args) {
		Kortlek k = new Kortlek();
		k.blanda();
		for (int o = 0; o < 52; o++) {
			System.out.println(k.Lek[o]);

		}
	}
}
