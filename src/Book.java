import java.util.Objects;

public class Book {
    private final String nazvanie;
    private final Author author;
    private int godVypuska;
    public Book(String nazvanie, Author author, int godVypuska) {
        this.nazvanie = nazvanie;
        this.author = author;
        this.godVypuska = godVypuska;
    }
    public String getNazvanie() {
        return this.nazvanie;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int godVypuska() {
        return this.godVypuska;
    }
    public void setGodVypuska(int godVypuska) {
        this.godVypuska = godVypuska;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nazvanie, book.nazvanie) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazvanie, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nazvanie='" + nazvanie + '\'' +
                ", author=" + author +
                ", godVypuska=" + godVypuska +
                '}';
    }
}


