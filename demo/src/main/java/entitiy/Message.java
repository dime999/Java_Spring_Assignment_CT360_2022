package entitiy;


public class Message {

    private int id;
    private String country;
    private String message;

    public Message() {
    }

    public Message(int id, String country, String message) {
        this.id = id;
        this.country = country;
        this.message = message;
    }

    public Message(String country,String message) {
        this.country = country;
        this.message=message;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
