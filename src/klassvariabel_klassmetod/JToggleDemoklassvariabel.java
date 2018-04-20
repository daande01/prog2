package klassvariabel_klassmetod;
 import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
 
 
 
public class JToggleDemoklassvariabel extends JFrame implements ActionListener {

private static ArrayList<JToggleDemoklassvariabel> ob = new ArrayList<JToggleDemoklassvariabel>();

private static Color cc=Color.blue;	
	
private JLabel l = new JLabel("swing!",JLabel.CENTER);
private  Font vanlig = new Font ("SansSerif", Font.PLAIN, 30), 
			  kursiv = new Font ("SansSerif", Font.ITALIC, 20);
					
private JRadioButton r1 = new JRadioButton("blå", true),
					 r2 = new JRadioButton ("röd", false),
					 r3 = new JRadioButton("gul", false);
			



private JCheckBox x1 = new JCheckBox("kursiv ", true),
				  x2 = new JCheckBox("centrerad", true),
				  x3 = new JCheckBox("svart bakgrund",false);
								
								

   
   
    public JToggleDemoklassvariabel() {
    
    getContentPane();
    setLayout(new FlowLayout());
    
    
    add (l);
    l.setForeground(Color.blue);
    l.setFont(kursiv);
    l.setHorizontalAlignment(JLabel.CENTER);
    l.setBackground(Color.white);
    l.setOpaque(true);
    l.setPreferredSize(new Dimension(150,75));
    
    add(r1); add(r2); add(r3);
    
    ButtonGroup färger = new ButtonGroup();
    färger.add(r1); färger.add(r2); färger.add(r3);
    
    
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);
    
    
    add(x1); add(x2); add(x3);
   
    x1.addActionListener(this);
    x2.addActionListener(this);
    x3.addActionListener(this);

    
    setSize(350,150);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    
    public void actionPerformed (ActionEvent e){
    	
    	Object b = e.getSource();
    	
    	if (b==r1){
    		l.setForeground(Color.blue);
    	
    	}else if (b==r2){
    	l.setForeground(Color.red);
    	
    	
    	}else if(b==r3){
    		l.setForeground(Color.yellow);
    		
    		
    	}else if (b==x1){
    		if (x1.isSelected()){
    			
    			l.setFont(kursiv);
    			
    		}else{
    			l.setFont(vanlig);
    		}
    		
    		}else if(b==x2){
    		
    			if (x2.isSelected()){
    				l.setHorizontalAlignment(JLabel.CENTER);
    				
    				
    			}else {
    				
    					l.setHorizontalAlignment(JLabel.LEFT);
    				
    			}
    		
    		
    		} else if(b==x3){
    			
    			if (x3.isSelected()){
    				
    				cc=Color.black;
    				ritaOm();
    				
    				
    				
    				
    			}else{
    				

    				cc=Color.white;
    				ritaOm();
    				
    			
    			}
    			
    			
    			
    		}
    			
    			
    		
    	
    	
    	
    	
    	
    }
    
    public static void ritaOm(){

    	for(int i=0;i<ob.size();i++){
    	ob.get(i).l.setBackground(cc);
    	}
    }
    public static void main(String[] args) {
       
    	ob.add(new JToggleDemoklassvariabel());
       
    	ob.add(new JToggleDemoklassvariabel());
       
       
    }
}
