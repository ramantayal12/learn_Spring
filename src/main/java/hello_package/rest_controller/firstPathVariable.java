package hello_package.rest_controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstPathVariable {

    @RequestMapping("hello/{id}")
    public String getID( @PathVariable("id") String id ){
        return "Hi" + id;
    }
}
