abstract class Book {
	
	protected String name; //å �̸�
	protected int price; //å ����
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	abstract void printInfo();
	abstract double salePrice();
}
