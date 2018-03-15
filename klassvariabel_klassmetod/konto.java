package klassvariabel_klassmetod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class konto extends JFrame implements ActionListener {

	private static int räknare = 0;

	private JLabel l1;

	public static int test() {

		//l1.setText("ytuytu"+räknare);

		System.out.print("hej");

		return räknare;
	}

	public konto() {

		javax.swing.Timer tim = new javax.swing.Timer(1000, this);
		tim.start();

		räknare++;

		l1 = new JLabel("" + räknare);

		add(l1);
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

	 l1.setText("ytuytu"+konto.test());

	}

	public static void main(String[] args) {

		konto[] k1 = new konto[10];
		k1[0] = new konto();
		k1[1] = new konto();
		k1[2] = new konto();

		k1[0].l1.setText("dfg" + konto.test());
		k1[1].l1.setText("cvbf" + konto.test());
		k1[2].l1.setText("fdg" + konto.test());

	}

}
