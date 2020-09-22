package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie {

    private String topic;


    public Documentary(String title, Rating maturityRating, String topic){
        super(title, maturityRating);
        this.topic = topic;
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    @Override
    public String toString() {
        return getTitle() + " " + topic;
    }

    @Override
    public void play() {
        System.out.println("Playing " + topic);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + topic);
    }
}