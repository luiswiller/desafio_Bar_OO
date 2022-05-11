package util;

public class Bill {

	// Atributos da classe
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;

	// Métodos da classe
	public static double cover() {
		return 4.00;
	}

	public static double feeding() {
		return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
	}

	public static double ticket() {
		double ticket = 0.0;
		
		if (gender == 'M' || gender == 'm') {
			ticket = 10.00;

		} else if (gender == 'F' || gender == 'f') {
			ticket = 8.00;

		}
		return ticket;

	}
	 
	public static double total() {
		double bill = 0.0;
		
		if (feeding() < 30.0) {
			bill = cover() + feeding() + ticket();
		} else {
			bill = feeding() + ticket();
		}
		
		return bill;
	}

}
