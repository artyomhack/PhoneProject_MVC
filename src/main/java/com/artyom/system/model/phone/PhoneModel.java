package com.artyom.system.model.phone;

import com.artyom.system.file.FileModel;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.phone.PhoneDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class PhoneModel implements FileModel<PhoneNumberId> {

    private final PhoneNumberId number;
    private final String numberOfPhone;
    private UserModel user;

    public PhoneModel(PhoneNumberId number, String numberOfPhone) {
        this.number = number;
        this.numberOfPhone = numberOfPhone;
    }

    public static PhoneModel modelOf(PhoneDetails details) {
        return new PhoneModel(
                details.getId(),
                details.getNumber()
        );
    }

    @Override
    public PhoneNumberId getId() {
        return number;
    }
}
