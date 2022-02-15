import java.util.Scanner;

public class ProgrammingBook extends Book {
    private String language;
    private String fameWork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(int bookId, String name, double price, String author, String language, String fameWork) {
        super(bookId, name, price, author);
        this.language = language;
        this.fameWork = fameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFameWork() {
        return fameWork;
    }

    public void setFameWork(String fameWork) {
        this.fameWork = fameWork;
    }

}
