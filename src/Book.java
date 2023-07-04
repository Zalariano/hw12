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
}


