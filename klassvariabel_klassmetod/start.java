package klassvariabel_klassmetod;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class start extends JFrame implements ActionListener {

	public static int antal = 0;
	
	
	JButton b1 = new JButton("Lägg till ruta");
	JLabel l1 = new JLabel();
	Timer timer = new Timer(1000, this);
	
	public void actionPerformed(ActionEvent e) {
		
		l1.setText(""+antal);
		
		if (e.getSource() == b1) {
			
			new start();
		}
		
	}
	
	public start() {
		
		timer.start();
		antal ++;
		setTitle(""+antal);
		setLayout(new FlowLayout());
		setBackground(Color.lightGray);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		
		add(l1);
		add(b1);
		pack();
		
	}
	

	public static void main(String[] arg) {
		
		start jf1 = new start();
		start jf2 = new start();

		
	}


	
	
}
