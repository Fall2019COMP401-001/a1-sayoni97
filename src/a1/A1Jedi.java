package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inventorynumber = scan.nextInt();
		String[] itemNames = new String[inventorynumber];
		int[] totalCount = new int[inventorynumber];
		int[] totalPeople = new int[inventorynumber];
		for (int i = 0; i < inventorynumber; i++) {
			String nameOfItem = scan.next();
			itemNames[i] = nameOfItem;
			double priceOfItem = scan.nextDouble();
		}
		
		int numberOfCustomers = scan.nextInt();
		boolean[] isAdded = new boolean[numberOfCustomers];
		for (int q = 0; q < numberOfCustomers; q++) {
			isAdded[q] = false;
		}
		
		for (int i = 0; i < numberOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numberOfItems = scan.nextInt();
			for (int j = 0; j < numberOfItems; j++) {
				int quantityOfItems = scan.nextInt();
				String nameOfItem = scan.next();
				for (int k = 0; k < inventorynumber; k++) {
					if (nameOfItem.equals(itemNames[k])) {
						totalCount[k] = totalCount[k] + quantityOfItems;
						if (isAdded[k] = false) {
							totalPeople[k] = totalPeople[k] + 1;
							isAdded[k] = true; 
						}
					}
				}
				
			}
			numberOfItems = 0;
		}
		
		for (int h = 0; h < inventorynumber; h++) {
			if (totalCount[h] == 0) {
				System.out.println("No customers bought " + itemNames[h]);
			}
			if (totalCount[h] != 0) {
				System.out.println(totalPeople[h] + " customers bought " + totalCount[h] + itemNames[h]);
			}
		}
		

		/* int inventorynumber = scan.nextInt();
		String[] items = new String[inventorynumber + 1];
		double[] prices = new double[inventorynumber + 1];
		int[] numberOfItemsBought = new int[inventorynumber];
		int i = 0;
		for (i = 0; i < inventorynumber; i++); {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
			System.out.println(items[i]);
		}
		int numberofcustomers = scan.nextInt();
		
		String[] cusFirstName = new String[numberofcustomers];
		String[] cusLastName = new String[numberofcustomers];
		int itemsBought;
		int[] people = new int[inventorynumber];
		boolean[] isAdded = new boolean[inventorynumber];
		
		for (int j = 0; j < numberofcustomers; j++) {
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
	scan.close(); */
	}
}
