package system.model.phone;

public class PhoneNumberString {

    private final String numberToString;

    public PhoneNumberString(String numberToString) {
        this.numberToString = numberToString;
    }

    public static PhoneNumberString regexOf(String str) {
        str = str.replace("\\D", "");
        return new PhoneNumberString(str);
    }

    public static PhoneNumberString parseToLong(long src) {

        return new PhoneNumberString(String.valueOf(src));
    }
}
