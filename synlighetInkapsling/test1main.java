package synlighetInkapsling;

import synlighetInkasling2.test2;

public class test1main extends test2 { // krävs arv för att testa protected "en subklass i ett annat paket"

	
	public void test(){
		
		//--------testar i samma paket
		test1 tt=new test1();
		
			tt.testprint();
			
		
			
		//--------TESTAR PROTECTED
		
		this.test2print(); // fungerar med protected vid arv
		//tt.test;
		System.out.println(this.testvar);
		
	
		
		//---------testar private
		//this.test3print();
		System.out.println(this.testvar);
		
		
		
		
		
		//--------- testar åtkomst till class i annat paket 

		test2 tt2=new test2();
		
			//tt2.testprint2();
		
	}
	
	
	
	public static void main(String[] args) {
		// testar synlighet gällande flera klasser i en fil

		
		test1main m=new test1main();
		m.test();
	
		
	}

}
