package murach.business;

import java.io.Serializable;

public class Information implements Serializable {
    private String hear;
    private String announcements;
    private String contact;


    public Information() {
        hear = "";
        announcements = "";
        contact = "";

    }

    public Information(String hear, String announcements,String contact) {
        this.hear = hear;
        this.announcements = announcements;
        this.contact = contact;
    }
    public String getHear() {
        return hear;
    }

    public void setHear(String hear) {
        this.hear = hear;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
