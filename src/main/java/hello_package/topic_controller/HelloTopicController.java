package hello_package.topic_controller;


import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class HelloTopicController {

    public List<Topic> arr = new ArrayList<> (Arrays.asList(
            new Topic (1,"java","bad language"),
            new Topic (2,"cpp","good language"),
            new Topic (3,"python","good language")
    ));

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return arr;
    }

    @PostMapping("/add")
    public String addTopic(@RequestBody Topic topic){
        arr.add (topic);
        return "Successfully Added";
    }

    @PutMapping("/update/{id}")
    public String updateTopic( @RequestBody Topic topic, @PathVariable("id") int id ){

        for( int i=0; i< arr.size (); i++ ){
            if( arr.get (i).getId () == id ){
                arr.get (i).setTopic( topic );
                return "Successfully Updated ";
            }
        }
        return "Topic with this ID not found ";

    }
}
