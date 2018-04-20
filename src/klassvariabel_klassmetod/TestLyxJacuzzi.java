package klassvariabel_klassmetod;
import java.io.*;
public class TestLyxJacuzzi {
public static void main(String[] argument) {
	LyxJacuzzi palmsprings = new LyxJacuzzi(41);
	LyxJacuzzi lotta = new LyxJacuzzi(45);
	LyxJacuzzi hummer = new LyxJacuzzi(100);
	
	System.out.println("* Fråan borjan ser det ut så här");
	System.out.println(" Palmspringshotell: " + palmsprings);
	System.out.println(" Lotta: " + lotta);
	System.out.println(" Hummergrytan: " + hummer);
	
	System.out.println("* Lyxskatten satts till 10000");
	LyxJacuzzi.nySkatt(10000); // Vi andrar skatten for alla!
	
	System.out.println(" Palmspringshotell: " + palmsprings);
	System.out.println(" Lotta: " + lotta);
	System.out.println(" Hummergrytan: " + hummer);
}
}