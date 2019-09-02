package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int inventorynumber = scan.nextInt();
		String[] items = new String[inventorynumber + 1];
		double[] prices = new double[inventorynumber + 1];
		int[] numberOfItemsBought = new int[inventorynumber];
		int numberOfCus = 0;
		int i = 0;
		for (i = 0; i < inventorynumber; i++); {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		numberOfCus = scan.nextInt();
		
		String[] cusFirstName = new String[numberOfCus];
		String[] cusLastName = new String[numberOfCus];
		int itemsBought;
		int[] people = new int[inventorynumber];
		boolean[] isAdded = new boolean[inventorynumber];
		
		for (int j = 0; j < numberOfCus; j++) {
			cusFirstName[j] = scan.next();
			cusLastName[j] = scan.next();
			itemsBought = scan.nextInt();
			for (int k = 0; k < itemsBought; k++) {
				int tempNumber = scan.nextInt();
				String tempItem = scan.next();
				if (tempItem.contentEquals(items[k])) {
					if (isAdded[k] == false) {
						people[k]++;
					}
					numberOfItemsBought[k] = numberOfItemsBought[k] + tempNumber;
					people[k]++;
					isAdded[k] = true;
				}
			}
		}
	for (int f = 0; f < inventorynumber; f++) {
		if (people[f] == 0) {
			System.out.println("No customers bought " + items[f]);
		}
		else {
			System.out.println(people[f] + "customers bought " + numberOfItemsBought[f] + " " + items[f]);
		}
	}
	scan.close();
	}
}
