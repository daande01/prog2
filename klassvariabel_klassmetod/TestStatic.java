/**
 * 
 */
package klassvariabel_klassmetod;

public class TestStatic {

	private static int i = 10;
	
	private int f=30;
	

	public int getI() {

		return i;

	}
	
	public static void setI(int k){
		
		i=k;
		
		
		
	}

	public static void main(String[] args) {

		TestStatic t1 = new TestStatic();
		TestStatic t2 = new TestStatic();
		
		TestStatic.setI(20);
		
	
		
		System.out.println(t1.getI());
		System.out.println(t2.getI());
		
		

	}

}

/*
 * One rule-of-thumb: ask yourself "does it make sense to call this method, even
 * if no Obj has been constructed yet?" If so, it should definitely be static.
 */