package my.pkg.bookinfo.bookdetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 6/22/19.
 */
@RestController
public class BookService {

    @GetMapping("/book/{id}")
    public Book getBookDetails(@PathVariable("id") String id) throws BookNotFoundException{

        if(! "1".equals(id)){
            throw new BookNotFoundException("Book id " + id + " not found!");
        }

        return new Book("1", "William Shakespeare", 1595, "paperback", 200, "PublisherA", "English", "1234567890", "123-1234567890");
    }
}
