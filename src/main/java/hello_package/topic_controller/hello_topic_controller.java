package hello_package.topic_controller;


import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class hello_topic_controller {

    public List<Topic> arr = Arrays.asList(
            new Topic (1,"java","bad language"),
            new Topic (2,"cpp","good language"),
            new Topic (3,"python","good language")
    );

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return arr;
    }

    @PostMapping("/add/{topic}")
    public String addTopic( @RequestBody Topic topic){
        arr.add (topic);
        return "Successfully Added";
    }
}
