public class Book {
    private int bookId;
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(int bookId, String name, double price, String author) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "bookCode =" + bookId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'';
    }
}
