import java.util.Date;

public class Book
{
    // Meine Attribute für die Klasse Book auf private da sonst getter und setter keinen Sinn machen würden
    private int pages;
    private Date released;
    private String title;
    private String isbn;


    //Konstruktor für die Klasse Book
    public Book (int pages, Date released, String title, String isbn)
    {
        this.pages=pages;
        this.released=released;
        this.title=title;
        this.isbn=isbn;
    }



    //getter methoden

    public int getPages()
    {
        return pages;
    }

    public Date getReleased()
    {
        return released;
    }

    public String getTitle()
    {
        return title;
    }

    public String getIsbn()
    {
        return isbn;
    }


    //setter methoden

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public void setReleased(Date released)
    {
        this.released = released;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
}
