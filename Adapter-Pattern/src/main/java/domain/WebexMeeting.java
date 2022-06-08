package domain;

public class WebexMeeting {

    public String getMeetingDetailsXML(String meetingId) {
        System.out.println(meetingId + " : Getting meeting details...");
        return "<Organiser>Rahul</Organiser>\n" +
                "<url>https://webex.com/nsdjwq23</url>";

    }
}
