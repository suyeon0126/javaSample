package day14;

public class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품의 보너스 점수

	public Product() {
		super();
	}

	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = price / 10;
	}

	@Override
	public String toString() {
		return "a";
	}
}

class TV extends Product {
	public TV() {
		super(100);
	}

	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio() {
		super(50);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] basket = new Product[10];
	int count = 0;

	void buy(Product p){
		if(p.price > money){
			System.out.println("잔액이 부족합니다.");
		}else{
			money -= p.price;
			bonusPoint += p.bonusPoint;
			//basket[count] = p;
			//count++;
			basket[count++] = p;
			System.out.println(p.toString()+"물건을 구입했습니다.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < basket.length; i++) {
			if(basket[i]==null){ break; }
			sum += basket[i].price;
			itemList += basket[i].toString() + ", ";			
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

