package klassvariabel_klassmetod;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class Boxbox extends JFrame implements ActionListener{

private static int nr=0;
private static ArrayList<Boxbox> ob = new ArrayList<Boxbox>();
private JLabel  lab = new JLabel(""+nr, JLabel.CENTER);
private JButton till = new JButton("L�gg till!");

public Boxbox(){
	Numer();
	ritaOmAntal();
	lab.setText(""+nr);
	till.addActionListener(this);
	add(lab); add(till, BorderLayout.WEST);
	setSize(250,250);
	  setVisible(true);
	  
}

public static void Numer(){
	nr = nr+1;
}

public  void ritaOmAntal(){
	
	for(int i=0;i<ob.size();i++){
		ob.get(i).lab.setText(""+nr);
	}

}


public static void main(String[] args) {
	ob.add(new Boxbox());


}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == till) {
		ob.add(new Boxbox());
	}

}

}