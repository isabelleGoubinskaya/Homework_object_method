public class Main {
    public static void main(String[] args) {

        Author author = new Author("Kilian", "Mbappe");
        Author author1 = new Author("Olivier", "Giroux");
        Book book = new Book("coucou les loulous", "Mbappe", 1970);
        Book book1 = new Book("comprendre l'empire", "Giroux", 1974);
        book1.setYearPublication(1890);
        System.out.println(book.getNameBook() + " " + author.getFirstName() + " " + author.getLastName() + " " + book.getYearPublication());
        System.out.println(book1.getNameBook() + " " + author1.getFirstName() + " " + author1.getLastName() + " " + book1.getYearPublication());

    }
}