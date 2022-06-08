package domain;

public class MeetingDetails {
    private String url;
    private String organizer;

    @Override
    public String toString() {
        return "MeetingDetails{" +
                "url='" + url + '\'' +
                ", organizer='" + organizer + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }
}
