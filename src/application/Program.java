package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {	

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();

		System.out.print("Sexo: ");
		bill.gender = sc.nextLine().charAt(0);		
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", bill.feeding());
		if (bill.feeding() > 30.0) {
			System.out.println("Isento de couvert!");
		} else {
			System.out.printf("Cover = R$ %.2f\n", Bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f\n", bill.ticket());
		System.out.println();

		System.out.printf("Total a pagar = $%.2f", bill.total());

		sc.close();

	}

}
