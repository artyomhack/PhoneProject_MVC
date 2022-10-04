package system.service.user;

import system.model.user.UserFileId;

public class UserDetails {
    private final UserFileId id;
    private String firstName;
    private String lastName;
    private String phonetic;

    public UserDetails(UserFileId id) {
        this.id = id;
    }

    public UserDetails(UserFileId id, String firstName, String lastName, String phonetic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phonetic = phonetic;
    }

    public UserFileId getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhonetic() {
        return phonetic;
    }
}
