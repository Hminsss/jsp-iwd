package dao;

import java.util.ArrayList;
import dto.Book;


public class BookRepository {
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();
	
	public static BookRepository getInstance() {
		return instance;
	}
	
	public BookRepository() {
		Book b1 = new Book("ISBN1234", "HTML5+CSS3",15000);
		Book b2 = new Book("ISBN1235", "���� ���� �ڹ� ���α׷���",27000);
		Book b3 = new Book("ISBN1236", "������4 �Թ�",27000);
		
		b1.setCategory("Hello Coding");
		b2.setCategory("IT �����");
		b3.setCategory("IT �����");
		
		b1.setAuthor("Ȳ��ȣ");
		b2.setAuthor("������");
		b3.setAuthor("�ϼ����� ����ġ, ������ ��Ÿ��, ���� ������(����ö,���μ�)");
		
		b1.setPublisher("�Ѻ��̵��");
		b2.setPublisher("�Ѻ���ī����");
		b3.setPublisher("�Ѻ��̵��");

		b1.setDescription("���峪 PPT ������ ���� �� �ֳ���? �׷��� ���� �����ϴ�. ���� �ٷ� �������� ���ۿ� �����غ�����. ���� ���� ��ǻ�Ͱ� ��� �������ϴ�. �ڵ�� ����ȭ���� �ٷ� ������ �����θ� �о ��� �۵��ϴ��� ���� �ľ��� �� �ִ� ���� �⺻�̰� �߰��߰� ��� �߰��Ͽ� ����ְ� �����ϵ� ������ �� �ֽ��ϴ�.");
		b2.setDescription("��ü ������ �ٽɰ� �ڹ��� ������ ����� ����� �ٷ�鼭�� �ʺ��ڰ� ���� �н��� �� �ְ� �����߽��ϴ�. �ð�ȭ ������ Ȱ���� ���� ����� �������� ���� �ٽ� �ڵ带 ���� ����� ���� ...");
		b3.setDescription("�������� �ܼ��� ��� ����� ������ �ͺ��� ��Ű��ó�� ��� �����ϰ� �����ϴ����� �� �߿��մϴ�. ������ ������ �ٿ��ִ� ������ ���� ���߿��� �������� ����� Ȱ���� �� �����ϴ�...");
		
		
		b1.setUnitInStock(1000);
		b2.setUnitInStock(1000);
		b3.setUnitInStock(1000);
		
		b1.setReleaseDate("2018/03/02");
		b2.setReleaseDate("2018/03/02");
		b3.setReleaseDate("2018/03/02");
		
		b1.setTotalPages(268);
		b2.setTotalPages(300);
		b3.setTotalPages(344);
		
		listOfBooks.add(b1);
		listOfBooks.add(b2);
		listOfBooks.add(b3);
		
		b1.setFilename("ISBN1234.jpg");
		b2.setFilename("ISBN1235.jpg");
		b3.setFilename("ISBN1236.jpg");
	}
	
	public ArrayList<Book> getAllBooks() {
		return listOfBooks;
	}
	
	public Book getBooktById(String bookId) {
		Book BookById = null;
		
		for (int i = 0; i < listOfBooks.size(); i++){
			Book Book = listOfBooks.get(i);
			if(Book != null && Book.getbookId() != null && Book.getbookId().contentEquals(bookId)) {
				BookById = Book;
				break;
			}
		}
		return BookById;
	}
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}

}
