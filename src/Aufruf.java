import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Aufgabe 3
        //Neue Instanz von Book erstellt mit gewünschten Übergabeparameter im Konstruktor

        Date released = new Date();
        Book b1 = new Book(200, released, "My Book", "ISBN");
        System.out.println("Aufgabe Nummer 3");
        System.out.println("Das Buch hat " + b1.getPages() + " Seiten, wurde am " + b1.getReleased() + " veröffentlicht und hat den Titel " + b1.getTitle());
        System.out.println("_______________________________________________________________________________________________________");
        //System.out mit b1 für meine Instanz anzuwählen und mit dem . spreche ich die Methode an die () übernehmen den zuvor übergebenen Wert



        //Aufgabe 4
        //Instanzen für meine List<Book> erstellen

        Book b2 = new Book(200, released, "My Book 1", "125215-12521-73473");
        Book b3 = new Book(200, released, "My Book 2", "6437-623623-24254");
        Book b4 = new Book(200, released, "My Book 3", "26326-734737-732473");
        Book b5 = new Book(200, released, "My Book 4", "745854-124412-3787438348");
        Book b6 = new Book(200, released, "My Book 5", "672-5236236-123483475125");


        //List erstellen
        //Hier adde ich dann meine oben mit dem Konstruktor erstellen Instanzen in meine Tabelle

        List<Book> listA = new ArrayList();
        listA.add(b2);
        listA.add(b3);
        listA.add(b4);
        listA.add(b5);
        listA.add(b6);

        //For each Schleife diese läuft solange wie ich Instanzen in meiner List habe also 5x

        System.out.println("Aufgabe 4");
        for (Book item : listA)
        {
            System.out.println(item.getTitle() + " hat " + item.getPages() + " Seiten und folgende ISBN: " + item.getIsbn());
        }
    }
}
