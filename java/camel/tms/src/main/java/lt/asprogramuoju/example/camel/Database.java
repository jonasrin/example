package lt.asprogramuoju.example.camel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Database {

    @Autowired
    BookRepository books;

    @Autowired
    OrderRepository orders;

    public Iterable<Book> findBooks() {
        return books.findAll();
    }

    public Order findOrder(Integer id) {
        return orders.findById(id).get();
    }


}