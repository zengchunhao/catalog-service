package com.zh.catalogservice;

import com.zh.catalogservice.config.BookProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final BookProperties bookProperties;

    public HomeController(BookProperties bookProperties) {
        this.bookProperties = bookProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return bookProperties.getGreeting();
    }
}
