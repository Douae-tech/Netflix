package Shows;

import Account.Account;
import java.util.GregorianCalendar;

public class Request {

    private Account requester;
    private GregorianCalendar request_made;
    private String title_suggestion;

    public Request(Account requester, GregorianCalendar request_made, String title_suggestion) {
        this.requester = requester;
        this.request_made = request_made;
        this.title_suggestion = title_suggestion;
    }

    public Request(Account requester, int year, int month, int day, String title_suggestion) {
        this.requester = requester;
        this.request_made = new GregorianCalendar(year, month, day);
        this.title_suggestion = title_suggestion;
    }

    public Account getAccount() {
        return requester;
    }

    public void setAccount(Account requester) {
        this.requester = requester;
    }

    public GregorianCalendar getRequestMade() {
        return request_made;
    }

    public void setRequestMade(int year, int month, int day) {
        request_made.set(GregorianCalendar.YEAR, year);
        request_made.set(GregorianCalendar.MONTH, month);
        request_made.set(GregorianCalendar.DATE, day);
    }

    public String getTitle() {
        return title_suggestion;
    }

    public void setTitle(String title_suggestion) {
        this.title_suggestion = title_suggestion;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Request) {
            Request s = (Request) obj;
            return s.getTitle().equals(this.title_suggestion);
        }
        return false;
    }

    @Override
    public String toString() {
        return ("\nRequester Information:" + this.requester + "\nRequest Date: " + request_made.get(GregorianCalendar.DATE)
                + "/" + request_made.get(GregorianCalendar.MONTH) + "/"
                + request_made.get(GregorianCalendar.YEAR) + "\nRequest Title: " + this.title_suggestion);

    }
}
