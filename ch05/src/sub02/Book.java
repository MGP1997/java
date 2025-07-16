<<<<<<< HEAD
package sub02;

public class Book {
		
	//속성	
	private String title;
	private String author;
	private String isbn;
	private int availavleCopies;
	
	//생성자
	public Book(String tilte)
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availavleCopies;
		
		
	}
	public boolean borrowBook() {
		if(availavleCopies > 0) { //이용가능한 복사본 수
			availavleCopies--;
			return true;
		}else {
			return false;
		}
	public void returnBook() { 
		availableCopies++;
	}
	
	public void showBook();
		sysout 
	

}

	Book book1 = new Book("삼국지", "나관중", "10001", 10);
	book1.show;
	
	blooean isOk = book1.borrowBook();
	
	if(itOk) { 
		System.out.println(book1.getTitle() + "도서 대출 성공")
	}else {
		System.out.println(book1.getTitle() + "도서 대출 실패");
		
		book.show();
		
		Book boo2 = new Book("명품 Java", "황기태", "10002", 1);
		
		boolean isOk1 = book2.borrowBook();
		boolean isOk2 = book2.borrowBook();
		
		if(isOk2) { 
			System.out.println(book2.getTitle() + "도서 대출 성공");
		}else { 
			System.out.println(book2.getTitle() + "도서 대출 실패");
		}
		book2.show();
=======
package sub02;

public class Book {
		
	//속성	
	private String title;
	private String author;
	private String isbn;
	private int availavleCopies;
	
	//생성자
	public Book(String tilte)
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availavleCopies;
		
		
	}
	public boolean borrowBook() {
		if(availavleCopies > 0) { //이용가능한 복사본 수
			availavleCopies--;
			return true;
		}else {
			return false;
		}
	public void returnBook() { 
		availableCopies++;
	}
	
	public void showBook();
		sysout 
	

}

	Book book1 = new Book("삼국지", "나관중", "10001", 10);
	book1.show;
	
	blooean isOk = book1.borrowBook();
	
	if(itOk) { 
		System.out.println(book1.getTitle() + "도서 대출 성공")
	}else {
		System.out.println(book1.getTitle() + "도서 대출 실패");
		
		book.show();
		
		Book boo2 = new Book("명품 Java", "황기태", "10002", 1);
		
		boolean isOk1 = book2.borrowBook();
		boolean isOk2 = book2.borrowBook();
		
		if(isOk2) { 
			System.out.println(book2.getTitle() + "도서 대출 성공");
		}else { 
			System.out.println(book2.getTitle() + "도서 대출 실패");
		}
		book2.show();
>>>>>>> 9a6cf6a676fcd15d59c76a2fb238cddbd4e57082
	}