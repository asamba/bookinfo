package my.pkg.bookinfo.bookdetails;

/**
 * Created by asamba on 6/22/19.
 */
public class BookNotFoundException extends Exception {

    public BookNotFoundException(){};

    public BookNotFoundException(String message){
        super(message);
    }

    public BookNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }

    public BookNotFoundException(Throwable throwable){
        super(throwable);
    }

}