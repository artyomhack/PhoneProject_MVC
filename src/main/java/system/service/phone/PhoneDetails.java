package system.service.phone;

import system.model.phone.PhoneNumberId;
import system.service.user.UserDetails;

public class PhoneDetails {
    private final PhoneNumberId id;
    private final String number;
    private UserDetails user;

    public PhoneDetails(PhoneNumberId id, String number) {
        this.id = id;
        this.number = number;
    }

    public PhoneDetails(PhoneNumberId id, String number, UserDetails user) {
        this.id = id;
        this.number = number;
        this.user = user;
    }

    public static PhoneDetails of(String number) {
        return new PhoneDetails(
                PhoneNumberId.numberOfPhone,
                number
        );
    }

    public PhoneNumberId getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public UserDetails getUser() {
        return user;
    }
}
