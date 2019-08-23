package book.service.dao;

import book.service.entity.Book;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    private List<Book> books = new ArrayList<>();

    @PostConstruct
    private void init() {
        for (int i = 0; i < 5; i++) {
            books.add(new Book("Tom and Jerry, part " + i, i * 3));
        }
    }

    @Override
    public Book getBook(int id) {
        id = (int) (Math.random() * books.size());
        return books.get(id);
    }

    @Override
    public List<Book> getAllBook() {
        return books;
    }
}
