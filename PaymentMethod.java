package Payment;

import java.util.GregorianCalendar;

public class PaymentMethod {

    private String holder_name;
    GregorianCalendar expiration_date;
    Type type;
    int number;

    public PaymentMethod(String type) throws UnavailableTypeCardException {
        if (type.equalsIgnoreCase(Type.VISA.name())) {
            this.type = Type.VISA;
        } else if (type.equalsIgnoreCase(Type.MASTERCARD.name())) {
            this.type = Type.MASTERCARD;
        } else if (type.equalsIgnoreCase(Type.AMERICAN_EXPRESS.name())) {
            this.type = Type.AMERICAN_EXPRESS;
        } else {
            throw new UnavailableTypeCardException(type);
        }
    }

    public PaymentMethod(String holder_name, int year, int month, int day, int number, String type) throws UnavailableTypeCardException {
        this(type);
        this.holder_name = holder_name;
        this.expiration_date = new GregorianCalendar(year, month, day);
        this.number = number;
    }

    public PaymentMethod(String holder_name, GregorianCalendar expiration_date, Type type, int number) {
        this.holder_name = holder_name;
        this.expiration_date = expiration_date;
        this.type = type;
        this.number = number;
    }

    public String getHolderName() {
        return holder_name;
    }

    public void setHolderName(String holder_name) {
        this.holder_name = holder_name;
    }

    public GregorianCalendar getExpirationDate() {
        return expiration_date;
    }

    public void setExpirationDate(int year, int month, int day) {
        expiration_date.set(GregorianCalendar.YEAR, year);
        expiration_date.set(GregorianCalendar.MONTH, month);
        expiration_date.set(GregorianCalendar.DATE, day);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ("\nthe holder name:" + this.holder_name + "\nThe expiration date:" + expiration_date.get(GregorianCalendar.DATE)
                + "/" + expiration_date.get(GregorianCalendar.MONTH) + "/"
                + expiration_date.get(GregorianCalendar.YEAR) + "\nType of the Card: " + this.type + "\nCard Number: " + this.number);

    }
}
