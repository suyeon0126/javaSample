package day14;

public class ProductTest {
	public static void main(String[] args) {
		Product t = new TV();
		Product c = new Computer();
		Product a = new Audio();
		
		Buyer buyer = new Buyer();
		
		buyer.buy(t);
		buyer.buy(c);
		buyer.buy(a);
		
		buyer.summary();
	}

}
