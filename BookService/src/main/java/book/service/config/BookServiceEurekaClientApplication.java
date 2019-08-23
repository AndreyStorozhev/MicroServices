package book.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"book.service.controller", "book.service.dao"})
public class BookServiceEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookServiceEurekaClientApplication.class, args);
    }
}
