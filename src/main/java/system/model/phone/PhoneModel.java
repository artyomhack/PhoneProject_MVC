package system.model.phone;

import system.model.FileModel;

public class PhoneModel implements FileModel<PhoneNumberId> {

    public final PhoneNumberId number;

    public PhoneModel(PhoneNumberId number) {
        this.number = number;
    }

    @Override
    public PhoneNumberId getId() {
        return number;
    }
}
