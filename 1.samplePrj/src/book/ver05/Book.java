package book.ver05;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {
	//transient
	private String title;
	private int price;

	public Book() { }
	public Book(String title, int price) {
		this.title = title;
		this.setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			return;
		}
		this.price = price;
	}

	public void display() {
		System.out.printf("Book[%-10s : %d ¿ø]%n", title, price);
	}

	@Override
	public String toString() {
		// return "Book["+title+","+price+"]";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(title);
		sb.append(",");
		sb.append(price);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		return price - o.price;
	}

}