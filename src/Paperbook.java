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
    //Ich entferne bei meinem Konstruktor ISBN als Übergabeparameter weil ich bei super einen fixen Wert übergebe
    public Paperbook(int pages, Date released, String title, String series, String month)
    {
        //Mit super spreche ich die Klasse an von der diese Klasse geerbt hat in diesem Fall spreche ich die Klasse Book an
        //Ich gebe ihm als ISBN gleich den Wert über da alle Instanzen die selbe Nummer haben
        super(pages, released, title, "00000-000000-0000");
        this.series = series;
        this.month = month;
    }
}
