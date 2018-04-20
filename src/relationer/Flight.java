package relationer;


 public class Flight {
   private String no, destination, comment = "";
   private tidpunkt2 dep, arr;  // avgångs- och ankomsttid

   // konstruktor
   public Flight (String flightNo, String dest,
                  int depHour, int depMin,
                  int arrHour, int arrMin) {
     no = flightNo;
     destination = dest;
     dep = new tidpunkt2(depHour, depMin);
     arr = new tidpunkt2(arrHour, arrMin);
     
     
     
     
   }

   // metoder
   public void setComment(String com) {
     comment = com;
   }

   public String getNumber() {
     return no;
   }

   public String getDestination() {
     return destination;
   }

   public tidpunkt2 getDep() {
     return new tidpunkt2(dep.avläsTim(), dep.avläsMin());
   }

   public tidpunkt2 getArr() {
     return new tidpunkt2(arr.avläsTim(), arr.avläsMin());
   }

   public void delay (int min) {
     dep.ticka(min*60);
     arr.ticka(min*60);
     setComment("Delayed");
   }

   public String toString() {
     return no + " " + destination + " " + dep + " " + comment;
   }
  
   
   public static void main(String[] args) {
	
	   Flight f= new Flight("23","ere",2,2,2,2);   
	   
}
   
   
 }

