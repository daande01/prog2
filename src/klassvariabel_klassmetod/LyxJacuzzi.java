package klassvariabel_klassmetod;
public class LyxJacuzzi {

	int temperatur; // instansvariabel
static int lyxskatt = 0; // klassvariabel

	public LyxJacuzzi(int parameter) { // konstruktor
	temperatur = parameter;
		}
	
	public String toString() {
	return "Temperatur " + temperatur + " grader"
	+ " och lyxskatt " + lyxskatt + " kronor";
	}
	
	public static void nySkatt(int pengar) { // klassmetod
	lyxskatt = pengar;
	}
	
	public int doppaTån() { // instansmetod
	return temperatur;
	}
}