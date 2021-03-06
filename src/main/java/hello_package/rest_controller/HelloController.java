package hello_package.rest_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/*
RestController means that we can have methods in class
that map the URL request

map the particular method when URL makes
particular request

 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say_hi(){
        return "HI";
    }
}
