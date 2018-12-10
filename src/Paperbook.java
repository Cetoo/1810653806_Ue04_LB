import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//Paperbook erbt von der Klasse Book mit extends
public class Paperbook extends Book
{

    //Meine Attribute für Paperbook
    private String series;
    private String month;



    //Getter Methoden
    public String getSeries()
    {
        return series;
    }

    public String getMonth()
    {
        return month;
    }


    //Setter Methoden
    public void setSeries(String series)
    {
        this.series = series;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }


    //Konstruktur für Paperbook + String series und String month hinzufügen
    public Paperbook(int pages, Date released, String title, String isbn, String series, String month)
    {
        //Mit super spreche ich die Klasse an von der diese Klasse geerbt hat in diesem Fall spreche ich die Klasse Book an
        super(pages, released, title, isbn);
        this.series = series;
        this.month = month;
    }

    public static void main(String[] args)
    {
        Date releasedate = new Date();

        //Meine neuen Instanzen für Paperbook
        Paperbook c1 = new Paperbook(200,releasedate, "My Paperbook 1", "00000-000000-0000","1","April");
        Paperbook c2 = new Paperbook(210,releasedate, "My Paperbook 2", "00000-000000-0000", "2", "April");
        Paperbook c3 = new Paperbook(240,releasedate, "My Paperbook 3", "00000-000000-0000", "3", "January");
        Paperbook c4 = new Paperbook(100,releasedate, "My Paperbook 4", "00000-000000-0000", "4", "March");
        Paperbook c5 = new Paperbook(140,releasedate, "My Paperbook 5", "00000-000000-0000", "5", "October");


        //Meine neue Liste für Paperbook
        List<Paperbook> listB = new ArrayList();
        listB.add(c1);
        listB.add(c2);
        listB.add(c3);
        listB.add(c4);
        listB.add(c5);


        //For each list für Paperbook und diese läuft solange wie ich Instanzen in Paperbook habe
        for (Paperbook item : listB)
        {
            System.out.println(item.getTitle() + " hat " + item.getPages() + " Seiten und folgende ISBN " + item.getIsbn() + " zusätzlich ist es im Monat " + item.getMonth() + " erschienen.");
        }
    }
}
