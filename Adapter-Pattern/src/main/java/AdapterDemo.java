import domain.Meeting;
import domain.WebexMeetingAdapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Meeting webexMeeting = new WebexMeetingAdapter();
        System.out.println(webexMeeting.getMeetingDetails("1344255"));
    }
}
