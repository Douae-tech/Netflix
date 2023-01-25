package Payment;

public class UnavailableTypeCardException extends Exception {

    public UnavailableTypeCardException(String card) {
        super("This card " + card + "is not offered in our System!");
    }

    public String[] getValidTypeCards() {
        Type type[] = Type.values();
        String[] types = new String[type.length];
        for (int i = 0; i < type.length; i++) {
            types[i] = type[i].name();
        }

        return types;
    }
}
