package system.model.phone;

public class PhoneNumberId extends AbstractNumber<PhoneNumberString>{

    private static final PhoneNumberId numberOfPhone = new PhoneNumberId(numberEmpty);

    public PhoneNumberId(Object src) {
        super(src);
    }

    public static PhoneNumberId of(Object src) {
        if (src instanceof Long) src = Long.parseLong(String.valueOf(src));
        return new PhoneNumberId(src);
    }

}
