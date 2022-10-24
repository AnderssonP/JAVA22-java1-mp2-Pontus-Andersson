
package Store;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Sale chicken = new Sale("Chicken", 1, 100, 8, 0.10);
		Goods rice = new Goods("Rice", 2, 50, 10);
		Goods ps = new Goods("Protein Shake", 3, 18, 20);
		Customer i = new Customer(0, 0);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Choose what you want to buy");
			System.out.println(chicken.getOrder()+": Buy: "+ chicken.getProduct() +", "+ chicken.getDiscount() + " Sek, " + chicken.getAvailable() + " left");
			System.out.println(rice.getOrder()+": Buy: "+ rice.getProduct()+", "+ rice.getCost() + " Sek, " + rice.getAvailable() + " left");
			System.out.println(ps.getOrder()+": Buy: "+ ps.getProduct()+", "+ ps.getCost() + " Sek, " + ps.getAvailable() + " left");
			System.out.println("4: End shopping tour!");
			System.out.println("\nBasket: " + i.getTotalInBasket());
			System.out.println("Total is: " + i.getPriceInBasket());
			
			int buy = scan.nextInt();

			if (buy == 1) {
				chicken.buyProduct();
				i.addToBasket((int)chicken.getDiscount());
			} else if (buy == 2) {
				rice.buyProduct();
				i.addToBasket(rice.getCost());
			} else if (buy == 3) {
				ps.buyProduct();
				i.addToBasket(ps.getCost());
			} else {
				System.out.println("you bought: " + i.getTotalInBasket());
				System.out.println("your total: " + i.getPriceInBasket());
				break;
				
			}
	
		}
		scan.close();

	}
}
