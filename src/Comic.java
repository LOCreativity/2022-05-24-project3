class Comic extends Book{
	public Comic(String name, int price) {
		super(name,price);
	}
	//�޼ҵ� ���� ����ȭ �ϰ� ������ ����� �޶�� �ϴ� ��쵵 �ֱ⿡ �߻� �޼ҵ� �������̵��� ������.
	@Override
	void printInfo() {
		System.out.println("å�� �̸��� " + this.name + "�̰� �帣�� �ڹ��Դϴ�.");
		//System.out.println("�Ǹ� ������ " + this.price + "�� �Դϴ�.");
	}
	@Override
	double salePrice() {
		return this.price; 
	}
	public void priceSale() {
		//�ڹ� 10%, �Ҽ� 15%, ���� 5%���� �ݾ� ��ȯ
		this.price -= this.price * 0.1;
	}
}
