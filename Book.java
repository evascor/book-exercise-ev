/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Return author's book
    public String getAuthor()
    {
        return author;
    }

    // Return title's book
    public String getTitle()
    {
        return title;
    }

    // Show Author on screen
    public void printAuthor()
    {
        System.out.println(author);
    }

    // Show Title on screen
    public void printTitle()
    {
        System.out.println(title);
    }

}
