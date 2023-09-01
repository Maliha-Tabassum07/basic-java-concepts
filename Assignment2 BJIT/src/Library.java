

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    ArrayList<Book> libraryCatalog=new ArrayList<>();
    ArrayList<Book> title=new ArrayList<>();

    public void addBook(Book book){

        libraryCatalog.add(book);
    }
    public ArrayList getBooks(BookPredicate predicate){
        int i=0;
        for (Book b:libraryCatalog){
            if(predicate.test(b)==true){
                b=libraryCatalog.get(i);
                title.add(b);
            }
            i++;

        }
        return title;
    }



    public ArrayList removeBooks(BookPredicate predicate){
        for(Book b:libraryCatalog){
            if(predicate.test(b)==true){
                libraryCatalog.remove(b);
                break;
            }

        }
        return libraryCatalog;
    }
    public void displayBooks(ArrayList<Book> bookList) {
        for (Book b:bookList){
            System.out.println(b.getTitle());
        }

    }
}
