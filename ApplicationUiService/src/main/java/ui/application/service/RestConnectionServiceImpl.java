package ui.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ui.application.model.Book;

import java.util.List;

@Service
public class RestConnectionServiceImpl implements RestConnectionService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(int id) {
        return restTemplate.getForObject("http://zuul-server/booking/book/get/{id}", Book.class, id);
    }

    @Override
    public List<Book> getAllBook() {
        return null;
    }
}
