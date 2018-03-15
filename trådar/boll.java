/**
 * 
 */
package trådar;

/**
 * @author DANAND004
 *
 */
public class boll implements Runnable {
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
public String s;
	
public boll(String b){
	s=b;
	
}

	
	@Override
	public void run() {
		
		
		while(true){
			
			System.out.println(s);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
