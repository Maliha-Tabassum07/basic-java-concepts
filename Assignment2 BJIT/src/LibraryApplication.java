
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryApplication {
    Scanner sc=new Scanner(System.in);
    static Library library = new Library();
    static ArrayList<Book> bookList=new ArrayList<>();
    public static void initData(){
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Fantasy", 1997);
        Book book2 = new Book("Harry Potter and the prisoner of Azkaban", "J.K. Rowling", "Fantasy", 1999);
        Book book3 = new Book("Martian", "Andy Weir", "Sci-fi", 2011);
        Book book4 = new Book("Gone Girl", "Gillian Flynn", "Thriller", 2012);
        Book book5 = new Book("The Hunger Games", "Suzanne Collins", "Action", 2008);
        Book book6 = new Book("Twilight ", "Stephenie Meyer", "Romance", 2005);
        Book book7 = new Book("The Giver", "Lois Lowry", "Sci-fi", 1993);
        Book book8 = new Book("The Fault in Our Stars", "John Green", "Romance", 2012);
        Book book9 = new Book("To Kill a Mockingbird", "Harper Lee", "Southern Gothic", 1960);
        Book book10 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        initData();
        System.out.println("Based on what you want the list?  "+"[Options are: all books, author, genre, year]");
        String input = sc.nextLine();
        check(input);

        System.out.println("Do you want to remove any book?  [yes or no]");
        String response=sc.nextLine();
        if (response.equals("yes")){
            System.out.println("Which book?");
            String name=sc.nextLine();
            BookPredicate removePred= (book) ->{
                if(book.getTitle().equals(name)){
                    System.out.println("Successfully removed book" +"\n"+ "New list of books:");
                    return true;
                }
                else {
                    return false;
                }

            };
            bookList=library.removeBooks(removePred);
            library.displayBooks(bookList);




        } else if (response.equals("no")) {
            System.out.println("Thank you!!");

        } else{
            System.out.println("Wrong Input");
        }
    }
    public static void check(String input){
        Scanner sc=new Scanner(System.in);
        if (input .equals("author") ) {
            System.out.println("Write the name of the author");
            String author = sc.nextLine();
            BookPredicate authorPred = (book) -> {
                if (book.getAuthor().equals(author)) {
                    System.out.println("The books of "+ author+" that are available are: " );
                    return true;
                }
                else {
                    return false;
                }
            };
            bookList=library.getBooks(authorPred);
            library.displayBooks(bookList);
        }

        else if (input .equals("genre") ) {
            System.out.println("Which Genre?");
            String genre = sc.nextLine();
            BookPredicate genrePred = (book) -> {
                if (book.getGenre().equals(genre)) {
                    System.out.println("The books of the "+genre+" genre are: ");
                    return true;
                }
                else {
                    return false;
                }
            };
            bookList=library.getBooks(genrePred);
            library.displayBooks(bookList);
        }

        else if (input .equals("year") ) {
            System.out.println("Which year?");
            int year = sc.nextInt();
            BookPredicate yearPublish = (book) -> {
                if (book.getYearPublished()==year) {
                    System.out.println("The books from the year "+year+" are: ");
                    return true;
                }
                else {
                    return false;
                }
            };
            bookList=library.getBooks(yearPublish);
            library.displayBooks(bookList);

        }

        else if(input .equals("all books") ) {
            BookPredicate predAll=(book) ->{
                return true;
            };
            bookList=library.getBooks(predAll);
            library.displayBooks(bookList);
        }
        else{
            System.out.println("The input you gave is Wrong. Try checking the spelling");
        }

    }
}


