/**
 * 
 */
package grafik;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author danand004
 *
 */

public class Boll {

	private double x, y, xv, yv;
	private final int RADIE;
	private final Color FÄRG;

	public Boll(double x, double y, int r, double xv, double yv, Color färg) {
		this.x = x;
		this.y = x;
		this.xv = xv;
		this.yv = yv;
		RADIE = r;
		FÄRG = färg;

	}

	public static Boll slumpBoll() {

		return new Boll(Math.random() * 800, 300,
				(int) (Math.random() * 200), 
				Math.random() * 15, 
				Math.random() * 15,
				new Color((int) (Math.random() * 256),
				(int) (Math.random() * 256),
				(int) (Math.random() * 256)));

	}

	public void rita(Graphics g) {
		g.setColor(FÄRG);
		g.fillOval(x() - RADIE, y() - RADIE, RADIE * 2, RADIE * 2);

	}

	public int x() {

		return (int) Math.round(x);
	}

	public int y() {
		return (int) Math.round(y);

	}

	public int r() {

		return RADIE;
	}

	public void uppdatera(int height, int width) {
System.out.println(yv);
		yv =yv+0;

		x += xv;
		y += yv;

		if (x < RADIE) {

			xv = -xv;
			x = RADIE;
		} else if (x > width - RADIE) {

			xv = -xv;
			x = width - RADIE;

		}

		if (y < RADIE) {
			yv = -yv;
			y = RADIE;

		} else if (y > height - RADIE) {

			yv = -yv;
			y = height - RADIE;

		}
	}

}
