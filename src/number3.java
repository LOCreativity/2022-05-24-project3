import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.print("서점에서 파는 책의 개수는?: ");
		int num = st.nextInt();
		
		BookStore ob = new BookStore(num);
		ob.setBooks();
		ob.printBooksInfo();
		st.close();
	}
}


//입력만 되고 출력 안됨