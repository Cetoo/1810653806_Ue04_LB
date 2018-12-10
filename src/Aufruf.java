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
        System.out.println("Aufgabe 3");
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

        System.out.println("______________________________________________________________________________________________");


        System.out.println("Aufgabe 5");
        //Aufgabe 5
        Date releasedate = new Date();

        //Meine neuen Instanzen für Paperbook
        Paperbook c1 = new Paperbook(200, releasedate,"My Paperbook 1", "1", "April");
        Paperbook c2 = new Paperbook(210,releasedate, "My Paperbook 2", "2", "April");
        Paperbook c3 = new Paperbook(240,releasedate, "My Paperbook 3", "3","January");
        Paperbook c4 = new Paperbook(100,releasedate, "My Paperbook 4", "4", "March");
        Paperbook c5 = new Paperbook(140,releasedate, "My Paperbook 5", "5", "October");


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
