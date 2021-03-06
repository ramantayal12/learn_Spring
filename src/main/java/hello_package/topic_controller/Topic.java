package hello_package.topic_controller;

public class Topic {

    private int id;
    private String name,description ;

    public Topic(){}

    public Topic(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTopic(Topic topic) {
        this.id = topic.getId ();
        this.description = topic.getDescription ();
        this.name = topic.getName ();
    }
}
