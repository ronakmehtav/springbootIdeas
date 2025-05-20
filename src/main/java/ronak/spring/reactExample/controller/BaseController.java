package ronak.spring.reactExample.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @Value("${spring.application.name}")
    String appName;

    @Value("${server.port}")
    String port;

    @GetMapping({"/home", "index", "/"})
    public String homepage (Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("port", port);
        return "index"; // The string value Maps to Template Model.
    }
}
