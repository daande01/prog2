package klassvariabel_klassmetod;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ruta extends JFrame implements ActionListener {

  private JLabel bild  = new JLabel(nr+" rutor");
  private JButton b = new JButton("Lägg till en ruta");

  Timer timer = new Timer();
 
  public static int nr =1;
  
  public ruta() { 
    setLayout(new FlowLayout()); 
    add(bild); add(b);
    b.addActionListener(this); 
    setVisible(true); 
    setSize(150,150);
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
      
    
    timer.scheduleAtFixedRate(new TimerTask() {
    	  @Override
    	  public void run() {
    	 bild.setText(""+nr);
    	  }
    	}, 1000, 1000);
  
  }
  public void actionPerformed(ActionEvent e) { 
	nr=nr+1;
	ruta b = new ruta();
	
  }

  public static void main (String[] arg) {
	    ruta b = new ruta();
	        
	  }
}