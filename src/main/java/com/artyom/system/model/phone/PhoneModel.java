package com.artyom.system.model.phone;

import com.artyom.system.file.FileModel;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.phone.PhoneDetails;

public class PhoneModel implements FileModel<PhoneNumberId> {

    private final PhoneNumberId number;
    private final String numberOfPhone;
    private UserModel user;

    public PhoneModel(PhoneNumberId number, String numberOfPhone) {
        this.number = number;
        this.numberOfPhone = numberOfPhone;
    }

    public PhoneModel(PhoneNumberId number, String numberOfPhone, UserModel user) {
        this.number = number;
        this.numberOfPhone = numberOfPhone;
        this.user = user;
    }

    @Override
    public PhoneNumberId getId() {
        return number;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public UserModel getUser() {
        return user;
    }

    public static PhoneModel modelOf(PhoneDetails details) {
        return new PhoneModel(
                details.getId(),
                details.getNumber()
        );
    }


}
