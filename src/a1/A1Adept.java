package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int inventorynumber = scan.nextInt();
		String[] inventory = new String[inventorynumber];
		double[] priceperitem = new double[inventorynumber];
		
		for (int i = 0; i < inventorynumber; i++) {
			inventory[i] = scan.next();
			priceperitem[i] = scan.nextDouble();
		}
		
		double total = 0;
		int numberofcustomers = scan.nextInt();
		int numberofitems;
		String[] firstname = new String[numberofcustomers];
		String[] lastname = new String[numberofcustomers];
		int g = 0;
		int h = 0;
		int e;
		int f;
		double subtotal;
		double highest = 0;
		double lowest = 0;
		double totalprice = 0;
		double[] totalprice1 = new double[numberofcustomers];
		double[] totals = new double[numberofcustomers];
		int count = 0;
		String itemname = new String();
		
		for (int j = 0; j < numberofcustomers; j++) {
			firstname[j] = scan.next();
			lastname[j] = scan.next();
			numberofitems = scan.nextInt();
			for (int c = 0; c < numberofitems; c++) {
				count = scan.nextInt();
				itemname = scan.next();
				for ( int n = 0; n < inventorynumber; n++) {
					if (inventory[n].equals(itemname)) {
						subtotal = priceperitem[n] * count;
						totalprice = totalprice + subtotal;
						totalprice1[j] = totalprice;
				}				
			}			
			}
		totalprice = 0;	
		}
		
		double min = totalprice1[0]; // assume first element as smallest
		double max = totalprice1[0]; // assume first element as largest
		
		for (int i = 0; i < totalprice1.length; i++) {
			if (totalprice1[i] > max)
			{
				max = totalprice1[i];
			}
			g = i;
		}
		
		for (int z = 0; z < totalprice1.length; z++) {
			if (totalprice1[z] < min)
			{
				min = totalprice1[z];
			}
			h = z;
		}
		
		System.out.println("Biggest: " + firstname[g] + " " + lastname[g] + " " + (max));
		System.out.println("Smallest: " + firstname[h] + " " + lastname[h] + " " + (min));
		for (int m = 0; m < totalprice1.length; m++) {
			total = total + totalprice1[m];
		}
		double average = total / totalprice1.length;	
		System.out.format("Average: %.2f", average);
		
		scan.close();
	} 
}