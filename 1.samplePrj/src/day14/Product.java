package day14;

public class Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ�� ���ʽ� ����

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
			System.out.println("�ܾ��� �����մϴ�.");
		}else{
			money -= p.price;
			bonusPoint += p.bonusPoint;
			//basket[count] = p;
			//count++;
			basket[count++] = p;
			System.out.println(p.toString()+"������ �����߽��ϴ�.");
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
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

