package Store;

class Customer {
	private int totalInBasket = 0;
	private int priceInBasket = 0;

	Customer(int totalInBasket, int priceInBasket) {

	}

	void addToBasket(int priceInBasket) {
		this.totalInBasket += 1;
		this.priceInBasket += priceInBasket;
	}
	
	int getTotalInBasket() {
		return this.totalInBasket;
	}
	int getPriceInBasket() {
		return this.priceInBasket;
	}

}
