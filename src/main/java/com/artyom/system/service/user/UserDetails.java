package com.artyom.system.service.user;

import com.artyom.system.model.user.UserFileId;
import lombok.Data;

@Data
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

    public static UserDetails of(String firstName, String lastName, String phonetic) {
        return new UserDetails(
                UserFileId.of(UserFileId.valueUUID),
                firstName, lastName, phonetic
        );
    }
}
