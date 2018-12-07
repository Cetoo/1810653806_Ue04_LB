import java.util.Date;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Neue Instanz von Book erstellt mit gewünschten Übergabeparameter im Konstruktor
        Date released = new Date();
        Book b1 = new Book(200, released,"My Book", "ISBN");
        System.out.println("Das Buch hat " +b1.getPages()+ " Seiten, wurde am " +b1.getReleased()+ " veröffentlicht und hat den Titel " +b1.getTitle());
        //System.out mit b1 für meine Instanz zumanwählen und mit dem. spreche ich die Methode an die () übernehmen den zuvor übergebenen Wert
    }
}
