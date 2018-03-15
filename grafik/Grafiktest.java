/**
 * 
 */
package grafik;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Grafiktest extends JComponent {
	private Boll boll;
	private Boll boll2;

	private List<Boll> b = new ArrayList<>();

	public Grafiktest() {
		for (int k = 0; k < 30; k++) {
			 b.add( new Boll(((int)Math.random()*200),((int)Math.random()*300),100,0,3, Color.CYAN));
			//b.add(Boll.slumpBoll());
		}
		// boll2= new Boll(500,400,50,4,5, Color.CYAN);

		Timer t = new Timer(25, e -> {

			for (int i = 0; i < b.size(); i++) {
				b.get(i).uppdatera(getHeight(), getWidth());

			}

			// b.forEach(b->b.uppdatera(getHeight(), getWidth););

			// boll.uppdatera(getWidth(),getHeight());
			repaint();

		});
		t.start();

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		for (int i = 0; i < b.size(); i++) {
			b.get(i).rita(g);

		}
		// boll2.rita(g);
		/*
		 * g.fillRect(100,100, 200, 100); //g.setColor(new Color(200,255,0));
		 * g.drawRect(200,200, 200, 100); g.fillOval(0, 0, 200, 200);
		 * 
		 * 
		 * int[] x={500,550,525}; int[] y={200,200,250};
		 * 
		 * 
		 * g.drawPolygon(x, y, 3);
		 */
	}

	public static void main(String[] arg) {

		JFrame f = new JFrame("grafikdemo");
		f.setContentPane(new Grafiktest());
		
		f.setVisible(true);
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
