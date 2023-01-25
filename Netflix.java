package Account;

import Shows.ShowList;
import Shows.RequestCollection;
import Shows.Show;
import java.util.ArrayList;
import java.util.Map;

public class Netflix {

    private static ShowList shows;
    private static AccountCollection customers;
    private static RequestCollection requests;
    private Map plans_by_country;
    private Map maturity_by_region;

    public Netflix() {
        this.shows = new ShowList();
        this.customers = new AccountCollection();
        this.requests = new RequestCollection();
    }

    public ShowList getShows() {
        return shows;
    }

    public void setShows(ShowList shows) {
        this.shows = shows;
    }

    public AccountCollection getCustomers() {
        return customers;
    }

    public void setCustomers(AccountCollection customers) {
        this.customers = customers;
    }

    public RequestCollection getRequests() {
        return requests;
    }

    public void setRequests(RequestCollection requests) {
        this.requests = requests;
    }

    public void register(Account account) {
        customers.addAccount(account);
    }

    public ArrayList<Show> searchByTitle(String Title) {

        return shows.findShowWithTitle(Title);

    }

    public void browse() {
        //To be implemented later
    }

    public void addShow(Show show) {
        shows.addShow(show);
    }

}
