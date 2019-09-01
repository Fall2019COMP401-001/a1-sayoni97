package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// create int to store total number of customers
		
		int customernumber = scan.nextInt();
		
		// create for loop to store each customer name in array
		double price = 0;
		double totalprice = 0;
		double subtotalprice = 0;
		int numberofitems = 0;
		int totalitems = 0;
		String firstname = new String();
		String lastname = new String();
		String itemname = new String();
		String decimal = new String();
		
		for (int i=0; i < customernumber; i++) {
			firstname = scan.next();
			lastname = scan.next();
			totalitems = scan.nextInt();
			for (int j=0; j < totalitems; j++) {
				numberofitems = scan.nextInt();
				itemname = scan.next();
				price = scan.nextDouble();
				subtotalprice = price * numberofitems;
				totalprice = totalprice + subtotalprice;
				decimal = String.format("%.2f", totalprice);
			}
			totalprice = 0;
			String firstletter = String.valueOf(firstname.charAt(0));
			System.out.println(firstletter + ". " + lastname + ": " + decimal);
		}
		
		// everything is done so close scanner
		scan.close();
		
	}
}
