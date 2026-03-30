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
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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

    // Return number of pages
    public int getPages()
    {
        return pages;
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

    // Show all details from book
    public void printDetails()
    {
        System.out.println("Title: "+title+", Author: "+author+", Pages: "+pages);
    }
}
