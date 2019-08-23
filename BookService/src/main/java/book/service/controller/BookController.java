package book.service.controller;

import book.service.dao.BookDao;
import book.service.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping("/book/get/{id}")
    public Book getBook(@PathVariable int id) {
        return bookDao.getBook(id);
    }

    @GetMapping("/book/getAll")
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
