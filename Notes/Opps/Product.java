void main()
{
    String name = IO.readln();
    String author = IO.readln();

    Book b = Book.getBook(author, name);
    IO.println(b);
}

public class Book
{
    private String author;
    private String name;

    public Book(String author, String name)
    {
        this.author = author;
        this.name = name;
    }

    public static Book getBook(String author, String name)
    {
        return new Book("","");
    }

    @Override
    public String toString()
    {
        return "Book Name : " + name + "\nAuthor : " + author;
    }
}