package ui.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ui.application.model.Book;

import java.util.List;

@Service
public class RestConnectionServiceImpl implements RestConnectionService {
    private static final String SUFFIX_URL = "http://zuul-server/booking/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(int id) {
        return restTemplate.getForObject(SUFFIX_URL + "book/get/{id}", Book.class, id);
    }

    @Override
    public List<Book> getAllBook() {
        return restTemplate.exchange(SUFFIX_URL+ "/book/getAll",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {
                }).getBody();
    }
}
