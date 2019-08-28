package ui.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ui.application.service.RestConnectionService;

@Controller
public class UiController {

    @Autowired
    private RestConnectionService restConnectionService;

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("book", restConnectionService.getBook(1));
        return "welcome";
    }
}
