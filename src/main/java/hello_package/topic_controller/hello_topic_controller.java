package hello_package.topic_controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class hello_topic_controller {

    @RequestMapping("/topics")
    public List<topic1> getAllTopics(){
        return Arrays.asList(
                new topic1(1,"java","bad language"),
                new topic1(2,"cpp","good language"),
                new topic1(3,"python","good language")
        );
    }
}
