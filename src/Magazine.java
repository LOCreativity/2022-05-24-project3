class Magazine extends Book{
	public Magazine(String name, int price) {
		super(name,price);
	}
	//메소드 선언만 통일화 하고 각각의 기능은 달라야 하는 경우도 있기에 추상 메소드 오버라이딩이 존재함.
	@Override
	void printInfo() {
		System.out.println("책의 이름은 " + this.name + "이고 장르는 코믹입니다.");
		//System.out.println("판매 가격은 " + this.price + "원 입니다.");
	}
	@Override
	double salePrice() {
		return this.price - this.price * 0.05;
	}
}
