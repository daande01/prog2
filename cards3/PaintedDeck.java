package cards3;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaintedDeck {

	private JLabel[] l1 = new JLabel[52];
	private JLabel labels[] = new JLabel[52];
	private Kortlek k;
	BufferedImage[] sprites;

	int cardCounter = 0;

	public PaintedDeck(Kortlek k1) {
		
		k=k1;
		BufferedImage bigImg = null;
		try {
			bigImg = ImageIO.read(new File("cards.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// The above line throws an checked IOException which must be caught.

		final int width = 73;
		final int height = 98;
		final int rows = 4;
		final int cols = 13;
		sprites = new BufferedImage[rows * cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sprites[(i * cols) + j] = bigImg.getSubimage(j * width, i * height, width, height);
			}
		}

		
		k = new Kortlek();

	}

	public void blanda() {
		k.blanda();

	}
	
	
public int kortnr(){
		
		int i=0;
		
		
		
		i=k.Lek[51 - cardCounter+1].value+1;
		
		if (i>9 && i<14)
			i=11;
			
		
		
		return i;
	}

	public JPanel paintOneCard() {
		
		JPanel p=new JPanel();
		labels[1] = new JLabel(new ImageIcon(sprites[k.Lek[51 - cardCounter].returnCardAsInt()]));
		p.add(labels[1]);
		
		cardCounter++;

		return p;

	}

	public JPanel paintDeck() {

		int f = 0;
		JPanel p=new JPanel();
		for (JLabel label : labels) {

			label = new JLabel(new ImageIcon(sprites[k.Lek[f].returnCardAsInt()]));
			p.add(label);
			
			f++;
		}

		return p;

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * PaintedDeck d1= new PaintedDeck();
	 * 
	 * }
	 */
}
