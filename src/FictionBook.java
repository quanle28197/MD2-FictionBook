import java.util.Scanner;

public class FictionBook extends Book {
    private String category;
    private int amount;

    public FictionBook() {
    }

    public FictionBook(int bookId, String name, double price, String author, String category, int amount) {
        super(bookId, name, price, author);
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
