package relationer;

public class Person {

	private String namn, adress;
	private Person makeMaka;

	public Person(String n) {

		namn = n;

	}

	public String avläsNamn() {

		return namn;

	}

	public void sättAdress(String adr) {

		adress = adr;
	}

	public String avläsAdress() {

		return adress;
	}

	public void bröllop(Person p) {
		makeMaka = p;
		p.makeMaka = this;
	}

	public void skillsmässa() {

		makeMaka.makeMaka = null;
		makeMaka = null;
	}

	public Person giftMed() {

		return makeMaka;
	}

	public static void main(String[] arg) {

		Person p1 = new Person("evert");
		Person p2 = new Person("ninni");

		p1.bröllop(p2);

		System.out.print(p2.giftMed().avläsNamn());

	}
}
