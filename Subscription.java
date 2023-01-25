package Account;
// You should add Map billing in constructor+ getter and setter!

import Payment.InvalidPlanTypeException;
import Payment.Plan;
import java.util.GregorianCalendar;
import java.util.Map;

public class Subscription {

    private GregorianCalendar subscribed;
    private Plan current_plan;
    private GregorianCalendar canceled;
    private String cancel_reason;
    private Map billing_by_mounth;

    public Subscription(GregorianCalendar subscribed, Plan current_plan) {
        this.subscribed = subscribed;
        this.current_plan = current_plan;

    }

    public Subscription(int year1, int month1, int day1, Plan current_plan) {
        this.subscribed = new GregorianCalendar(year1, month1, day1);
        this.current_plan = current_plan;
    }

    public Subscription(GregorianCalendar subscribed, Plan current_plan, String cancel_reason) {
        this(subscribed, current_plan);
        this.canceled = null;
        this.cancel_reason = null;
    }

    // the canceled date and cancel reason should be initialized till the cancel function
    public GregorianCalendar getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(int year, int month, int day) {
        subscribed.set(GregorianCalendar.YEAR, year);
        subscribed.set(GregorianCalendar.MONTH, month);
        subscribed.set(GregorianCalendar.DATE, day);
    }

    public GregorianCalendar getcanceled() {
        return canceled;
    }

    public void setCanceled(int year, int month, int day) {
        canceled.set(GregorianCalendar.YEAR, year);
        canceled.set(GregorianCalendar.MONTH, month);
        canceled.set(GregorianCalendar.DATE, day);
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Plan getPlan() {
        return current_plan;
    }

    public void changePlan(String plan) throws InvalidPlanTypeException {
        this.current_plan = new Plan(plan);
    }

    public void cancel(String cancel_reason) {
        this.canceled = new GregorianCalendar();
        this.cancel_reason = cancel_reason;
    }

    public void billing_by_mounth() {

    }

    @Override
    public String toString() {
        return ("Date of Subscription:" + subscribed.get(GregorianCalendar.DATE) + "/" + subscribed.get(GregorianCalendar.MONTH) + "/" + subscribed.get(GregorianCalendar.YEAR) + "\nCurrent Plan: " + this.current_plan);
    }
}
