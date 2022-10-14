package Store;

class Sale extends Goods {
	private double sale = 0.95;

	Sale(String product, int order, int cost, int available, double sale) {
		super(product, order, cost, available);
		this.sale = sale;

	}

	double  getDiscount() {
		return getCost() - (getCost() * sale);

	}
	

}
