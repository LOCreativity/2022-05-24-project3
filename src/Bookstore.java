import java.util.Scanner;

class BookStore{
	private int num;
	private Book[] books;
	
	public BookStore(int num) {
		this.num = num;
		this.books = new Book[this.num];
	}
	public void setBooks() {
		//Scanner를 통한 책 정보 입력
		Scanner st = new Scanner(System.in);
		
		for(int i = 0; i< this.num; i++) {
			System.out.print("책 이름: ");
			String name = st.next();
		
			System.out.print("책 가격: ");
			int price = st.nextInt();
		 
			//장르별 객체 초기화
			System.out.println("책 장르(1: 코믹, 2: 소설, 3: 잡지)");
			System.out.print(">>");
			int genre = st.nextInt();
			
			if(genre == 1) {
				this.books[i] = new Comic(name, price);
			}
			else if(genre == 2) {
				this.books[i] = new Fiction(name, price);
			}
			else if(genre == 3) {
				this.books[i] = new Magazine(name, price);
			}
			
		}
		st.close();
	}
	public void printBooksInfo() {
		for(int i = 0; i < this.num; i++) {
			this.books[i].printInfo();
			System.out.println("판매 가격은 " + this.books[i].salePrice() + "원 입니다.");
		}
	}
}
