import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
     {
        LinkedList <Book> books = new LinkedList<>();

        books.add(new Book("Book1", 10.3));
        books.add(new Book("Book2", 20.5));
        books.add(new Book("Book3", 15.7));
        books.add(new Book("Book4", 25.4));

        Collections.sort(books);

        Iterator<Book> itr = books.iterator();

            while(itr.hasNext())
             {
                 System.out.println(itr.next().toString());
             }

     }
}