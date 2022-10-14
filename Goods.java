package Store;

class Goods {
	private String product;
	private int order;
	private int cost;
	private int available;

	Goods(String product, int order, int cost, int available) {
		this.product = product;
		this.order = order;
		this.cost = cost;
		this.available = available;

	}

	void buyProduct() {
		available--;
	}

	int getCost() {
		return cost;
	}

	int getAvailable() {
		return available;
	}

	void setAvailable(int available) {
		this.available = available;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}


}
