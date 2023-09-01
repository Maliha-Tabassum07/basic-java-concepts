

public class Book {
    private String title="";
    private String author="";
    private String genre="";
    private int yearPublished=0;

    public Book(){

    }
    public Book(String t, String a, String g, int y){
        setTitle(t);
        setAuthor(a);
        setGenre(g);
        setYearPublished(y);
    }
    public void setTitle(String t){
        title=t;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String a){
        author=a;
    }
    public String getAuthor(){
        return author;
    }
    public void setGenre(String g){
        genre=g;
    }
    public String getGenre(){
        return genre;
    }
    public void setYearPublished(int y){
        yearPublished=y;
    }
    public int getYearPublished(){
        return yearPublished;
    }
}
