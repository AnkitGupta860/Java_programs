//Create a class Book with the following information.
//Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
//[Assumption: Each book will be written by exactly one Author]
//Parameterized Constructor: To initialize the variables
//Getter methods  for all the member variables
public class _24_Book {
    public String name;
    public String author;
    public double price;
    public int qtyInStock;
    public _24_Book(String name, String author , double price, int qtyInStock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "_24_Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", qtyInStock=" + qtyInStock +
                '}';
    }
}
