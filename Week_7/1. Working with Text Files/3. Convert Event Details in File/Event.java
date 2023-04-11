public class Event {
    private String name;
    private String details;
    private String manager;

    public Event(String name, String details, String manager) {
        this.name = name;
        this.details = details;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public String getManager() {
        return manager;
    }
}
