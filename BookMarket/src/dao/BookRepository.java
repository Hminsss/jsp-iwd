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
		Book b2 = new Book("ISBN1235", "쉽게 배우는 자바 프로그래밍",27000);
		Book b3 = new Book("ISBN1236", "스프링4 입문",27000);
		
		b1.setCategory("Hello Coding");
		b2.setCategory("IT 모바일");
		b3.setCategory("IT 모바일");
		
		b1.setAuthor("황재호");
		b2.setAuthor("우종중");
		b3.setAuthor("하세가와 유이치, 오오노 와타루, 토코 코헤이(권은철,전민수)");
		
		b1.setPublisher("한빛미디어");
		b2.setPublisher("한빛아카데미");
		b3.setPublisher("한빛미디어");

		b1.setDescription("워드나 PPT 문서를 만들 수 있나요? 그러면 문제 없습니다. 지금 바로 웹페이지 제작에 도전해보세요. 지금 당장 컴퓨터가 없어도 괜찮습니다. 코드와 실행화면이 바로 보여서 눈으로만 읽어도 어떻게 작동하는지 쉽게 파악할 수 있는 것은 기본이고 중간중간 퀴즈를 추가하여 재미있게 게임하듯 복습할 수 있습니다.");
		b2.setDescription("객체 지향의 핵심과 자바의 현대적 기능을 충실히 다루면서도 초보자가 쉽게 학습할 수 있게 구성했습니다. 시각화 도구를 활용한 개념 설명과 군더더기 없는 핵심 코드를 통해 개념과 구현 ...");
		b3.setDescription("스프링은 단순히 사용 방법만 익히는 것보다 아키텍처를 어떻게 이해하고 설계하는지가 더 중요합니다. 예제를 복사해 붙여넣는 식으로 실제 개발에서 스프링을 제대로 활용할 수 없습니다...");
		
		
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
