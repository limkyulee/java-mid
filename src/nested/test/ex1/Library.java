package nested.test.ex1;

//  Q : 도서관 도서 관리 시스템을 만들어라.
//    : 여러 권의 도서 정보를 관리할 수 있어야 함.
//    : 각 도서는 도서 제목(title), 저자명(author)을 가지고 있음.
//    : 모든 도서의 정보를 출력하는 기능을 제공해야함.
public class Library {
    private final Book[] books;
    private int numOfBooks;

    public Library(int count) {
        books = new Book[count];
        numOfBooks = 0;
    }

    public void addBook(String title, String author) {
        if(numOfBooks < books.length) {
            books[numOfBooks] = new Book(title, author);
            numOfBooks++;
        }else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for(Book book : books){
            System.out.println("도서 제목 : " + book.title + ", 저자 : " + book.author);
        }
    }

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
