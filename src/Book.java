import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int yearPublication;

    public Book(String name, String author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }

    @Override
    public String toString() {
        return name + " " + yearPublication + " " + author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return name.equals(other.name) && author.equals(other.author) && yearPublication == other.yearPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }
}
