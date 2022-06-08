package domain;

public class WebexMeetingAdapter implements Meeting {

    private final WebexMeeting webexMeeting;

    public WebexMeetingAdapter() {
        this.webexMeeting = new WebexMeeting();
    }

    @Override
    public MeetingDetails getMeetingDetails(String meetingId) {
        System.out.println(webexMeeting.getMeetingDetailsXML(meetingId));
        System.out.println("Processing XML response....");
        MeetingDetails meetingDetails = new MeetingDetails();
        meetingDetails.setOrganizer("Rahul");
        meetingDetails.setUrl("https://webex.com/nsdjwq23");
        return meetingDetails;
    }
}
