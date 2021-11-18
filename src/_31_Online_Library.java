public class _31_Online_Library {
    String [] Books;
    int no_of_books;
    _31_Online_Library()
    {
        this.Books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String Book)
    {
        Books[no_of_books] = Book;
        no_of_books++;
        System.out.println("Book has been added");
    }
    void showAvailableBook()
    {
        for(String book:Books)
        {
            if(book==null)
            {
                continue;
            }
            System.out.println("* "+book );
        }
    }
    void issuedBook(String Book)
    {
        for(int i=0;i<this.Books.length;i++)
        {
            if(Books[i].equals(Book))
            {
                System.out.println("Book has been issued");
                Books[i]=null;
                return;
            }
        }
        System.out.println("Book not found");
    }
    void returnBook(String Book)
    {
        addBook(Book);
    }
}
class print {
    public static void main(String[] args) {
        _31_Online_Library centralLibrary = new _31_Online_Library();
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Python");
        centralLibrary.showAvailableBook();
        centralLibrary.issuedBook("Python");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("Python");
        centralLibrary.showAvailableBook();
    }
}
