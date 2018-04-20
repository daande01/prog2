package cards3;

public class Kort {
	
	public int value;
	public int colour;
	
	public String[] val = { "Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	public String[] col = {"Clubs","Spades", "Hearts", "Diamonds"};
  	
	public Kort(int value, int colour){
		this.value = value;
		this.colour = colour;
		
	}
	
	public int getColour(){
		return colour;
	}
	
	public int getValue(){
		return value;
	}
	
	public int returnCardAsInt(){
		
		
		
		
		int cardNr=(this.value)+(this.colour*13);
		
		
		
		
		return cardNr;
	}
	
	@Override
	public String toString(){
		
		String s = val[value] + " of " + col[colour];
		
		
		return s;
	}
	
	/*public static void main(String[] args) {
		Kort k = new Kort(6,0);
		
		System.out.println(k.toString());
	}*/
}
