package klassvariabel_klassmetod;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class objekt_raknare extends JFrame implements ActionListener{
	
	private JLabel l2  = new JLabel("", JLabel.CENTER);
	private JButton but = new JButton("ett till objekt");
	static ArrayList<objekt_raknare> obb = new ArrayList<objekt_raknare>();
	
	public static int antal_ob;
	
	public static int antalobjekt(){
	
	return antal_ob;
		
	}
	
	

	
	

	
	public objekt_raknare(){
		
		antal_ob++;	
		setLayout(new GridLayout(2,1));
		add(but);
		add(l2);
		l2.setText(""+antal_ob);
	    l2.setForeground(Color.blue);
	    l2.setBackground(Color.black);
	    l2.getFont();
		
	    pack();
	    setVisible(true); 
	   // setDefaultCloseOperation(EXIT_ON_CLOSE);
	    but.addActionListener(this);
	    
	    uppdatera();
    
	}
	
public void uppdatera(){
	
	System.out.print(obb.size());
	
	if (obb.size()>0){
		for(int i = 0; i<obb.size(); i++){
			
			obb.get(i).l2.setText(""+antal_ob);
		     
		}
	}
	
	
}
	

public void actionPerformed(ActionEvent e) {
	
	obb.add(new objekt_raknare());
	
	
}

	public static void main(String[] args) {
		
		obb.add(new objekt_raknare());
		obb.add(new objekt_raknare());
		obb.add(new objekt_raknare());
		
	}

	

}
