abstract class Book {
	
	protected String name; //책 이름
	protected int price; //책 가격
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	abstract void printInfo();
	abstract double salePrice();
}
