/**
 * A Novel program that stores the name of the book, author name, and the year it was published;
 *
 * @author Andres Arevalo, sam ordonez
 * @version 1.0
 */
public class Novel
{
    private final String    bookTitle;
    private final String    authorName;
    private final int       yearPublished;

    public Novel(final String   bookTitle,
                 final String   authorName,
                 final int      yearPublished)
    {
        if(bookTitle == null || bookTitle.isBlank())
        {
            this.bookTitle = null;
        }
        else
        {
            this.bookTitle = bookTitle;
        }

        if(authorName == null || authorName.isBlank())
        {
            this.authorName = null;
        }
        else
        {
            this.authorName = authorName;
        }

        if(yearPublished > 0)
        {
            this.yearPublished = yearPublished;
        }else
        {
            this.yearPublished = 0; //to catch negative entries
        }
    }

    /**
     * Access the title of the book
     * @return the book title
     */
    public String getBookTitle()
    {
        return bookTitle;
    }

    /**
     * Access the name of the author
     * @return the name of the author
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Access the year a book was published
     * @return the year a book was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
