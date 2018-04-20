/**
 * 
 */
package cards3;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * @author danand004
 *
 */
public class BlackJack extends JFrame {
	private Player p1;
	private Dealer d1;
	private Kortlek k1;
	private int playerPoints;

	private JLabel player;
	private JLabel computer;
	JButton b1=new JButton("ett kort till");
	JPanel playerPanel = new JPanel();

	public BlackJack() {

		p1 = new Player();
		d1 = new Dealer();
		k1 = new Kortlek();
		player=new JLabel("poäng",2);

		setSize(400, 400);
		setLayout(new GridLayout(1,2));
		PaintedDeck p = new PaintedDeck(k1);
		p.blanda();
		

		playerPanel = new JPanel();
		playerPanel.setBorder(new TitledBorder("Player"));
		playerPanel.add(p.paintOneCard());
		playerPoints+=p.kortnr();
		playerPanel.add(p.paintOneCard());
		playerPoints+=p.kortnr();
		player.setText(""+playerPoints);
		//playerPanel.add(player);
		playerPanel.add(b1);
		playerPanel.add(player);
		
		b1.addActionListener(e->{
			playerPanel.add(p.paintOneCard());
			playerPoints+=p.kortnr();
			player.setText(""+playerPoints);
			 validate();
			repaint();
			
			System.out.print("test");
			
			
			
		});

		add(playerPanel);
		this.repaint();
		JPanel compPanel = new JPanel();
		compPanel.setBorder(new TitledBorder("Computer"));
		compPanel.add(p.paintOneCard());
		compPanel.add(p.paintOneCard());

	
		add(compPanel);

		setVisible(true);

	}
	
	public void ifEss(){
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		new BlackJack();

	}

}
