import java.util.Scanner;

class BookStore{
	private int num;
	private Book[] books;
	
	public BookStore(int num) {
		this.num = num;
		this.books = new Book[this.num];
	}
	public void setBooks() {
		//Scanner�� ���� å ���� �Է�
		Scanner st = new Scanner(System.in);
		
		for(int i = 0; i< this.num; i++) {
			System.out.print("å �̸�: ");
			String name = st.next();
		
			System.out.print("å ����: ");
			int price = st.nextInt();
		 
			//�帣�� ��ü �ʱ�ȭ
			System.out.println("å �帣(1: �ڹ�, 2: �Ҽ�, 3: ����)");
			System.out.print(">>");
			int genre = st.nextInt();
			
			if(genre == 1) {
				books[i] = new Comic(name, price);
				((Comic)books[i]).priceSale();
			}
			else if(genre == 2) {
				books[i] = new Fiction(name, price);
				((Fiction)books[i]).priceSale();
			}
			else if(genre == 3) {
				books[i] = new Magazine(name, price);
				((Magazine)books[i]).priceSale();
			}
			
		}
		st.close();
	}
	public void printBooksInfo() {
		for(int i = 0; i < this.num; i++) {
			books[i].printInfo();
			System.out.println("�Ǹ� ������ " + books[i].salePrice() + "�� �Դϴ�.");
		}
	}
}
