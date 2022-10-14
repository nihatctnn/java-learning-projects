public class Book implements Comparable<Book>
{
    String name;
    double price;

    public Book(String name, double price)
     {
         this.name = name;
         this.price = price;
     }

    public double totalPrice()
     {
         return this.price + 0.08 * this.price;
     }

    @Override
    public String toString()
     {
         return this.name + " " + this.totalPrice();
     }

    @Override
    public int compareTo(Book b1)
     {
        return (int) (this.totalPrice() - b1.totalPrice());
     }

}