import java.util.Scanner;

public class number3 {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		System.out.print("�������� �Ĵ� å�� ������?: ");
		int num = st.nextInt();
		
		BookStore ob = new BookStore(num);
		ob.setBooks();
		ob.printBooksInfo();
		st.close();
	}
}


//�Է¸� �ǰ� ��� �ȵ�