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
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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

    // Define reference number
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
            refNumber = ref;
        } else {
            System.out.println("[ERROR] Invalid reference number.");
            System.out.println("Detail: at least 3 characteres are required.");
            System.out.println("Input received: "+ ref.length() + " characters were received.");
        }
    }

    // Return reference number
    public String getRefNumber()
    {
        return refNumber;
    }

    public void borrow()
    {
        borrowed += 1;
        System.out.println("Thank you, enjoy your reading!");
        printDetails();
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }

    // Show all details from book
    public void printDetails()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (refNumber.length() == 0)
        {
            System.out.println("ZZZ");
        } else {
            System.out.println("Reference number: " + refNumber);
        }
        System.out.println("This book has been borrowed: " + borrowed + " times.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
