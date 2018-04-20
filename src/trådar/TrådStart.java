
package trådar;


public class TrådStart {

	
	
	
	public TrådStart(){
		boll b1 = new boll("boll1");
		boll b2 = new boll("boll2");
		fiende fi=new fiende();
		 Thread t1 = new Thread(b1);
		 Thread t2 = new Thread(b2);
	t1.start();
	t2.start();
	
	}
	
	public static void main(String[] args) {
		new TrådStart();
	}
}
