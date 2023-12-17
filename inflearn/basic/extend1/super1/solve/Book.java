package extend1.super1.solve;

public class Book extends Item{

    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.println("이름:" + getName() + ",  가격:" + getPrice());
        System.out.println("- 저자:" + author + ",  isbn:" + isbn);
    }
}
