package book.service.dao;

import book.service.entity.Book;

import java.util.List;

public interface BookDao {
    Book getBook(int id);
    List<Book> getAllBook();
}
