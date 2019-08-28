package ui.application.service;

import ui.application.model.Book;

import java.util.List;

public interface RestConnectionService {
    Book getBook(int id);
    List<Book> getAllBook();
}
