package my.pkg.bookinfo.bookdetails;

/**
 * Created by asamba on 6/22/19.
 */
public class Book {

    private String id;
    private String author;
    private int year;
    private String type;
    private int pages;
    private String publisher;
    private String language;
    private String ISBN10;
    private String ISBN13;

    public Book(String id, String author, int year, String type, int pages, String publisher, String language, String ISBN10, String ISBN13) {
        this.id = id;
        this.author = author;
        this.year = year;
        this.type = type;
        this.pages = pages;
        this.publisher = publisher;
        this.language = language;
        this.ISBN10 = ISBN10;
        this.ISBN13 = ISBN13;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getISBN10() {
        return ISBN10;
    }

    public void setISBN10(String ISBN10) {
        this.ISBN10 = ISBN10;
    }

    public String getISBN13() {
        return ISBN13;
    }

    public void setISBN13(String ISBN13) {
        this.ISBN13 = ISBN13;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", ISBN10='" + ISBN10 + '\'' +
                ", ISBN13='" + ISBN13 + '\'' +
                '}';
    }


}
