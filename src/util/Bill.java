package util;

public class Bill {

	// Atributos da classe
	public char gender;
	public int age;
	public int beer;
	public int barbecue;
	public int softDrink;

	// Métodos da classe
	public static double cover() {
		return 4.00;
	}

	public double feeding() {
		return (beer * 6.00) + (barbecue * 8.00) + (softDrink * 4.00);
	}

	public double ticket() {
		double ticket = 0.0;
		
		if (gender == 'M' || gender == 'm') {
			ticket = 12.00;

		} else if (gender == 'F' || gender == 'f') {
			ticket = 10.00;

		}
		return ticket;

	}	
	 
	public double total() {
		double bill = 0.0;
		
		if (feeding() < 30.0) {
			bill = cover() + feeding() + ticket();
		} else {
			bill = feeding() + ticket();
		}
		
		return bill;
	}

}
