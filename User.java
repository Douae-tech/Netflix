package Account;

import Payment.PaymentMethod;
import Shows.RequestCollection;
import java.util.ArrayList;

public class User {

    private String phone;
    private ArrayList<Profile> profiles;
    private RequestCollection requests;
    private PaymentMethod pay_method;

    public User(String phone, PaymentMethod pay_method) {
        this.phone = phone;
        this.profiles = new ArrayList();
        this.requests = new RequestCollection();
        this.pay_method = pay_method;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PaymentMethod getPaymentMethod() {
        return pay_method;
    }

    public void setPaymentMethod(PaymentMethod pay_method) {
        this.pay_method = pay_method;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    public RequestCollection getRequests() {
        return requests;
    }

    public void setProfiles(RequestCollection requests) {
        this.requests = requests;
    }

    public void view_prof_his() {
        //To be implemented later
    }

    public void download_his() {
        //To be implemented later 
    }

    @Override
    public String toString() {
        return ("\nPhone Number:" + this.phone + "\nPayment Information: " + this.pay_method);

    }
}
