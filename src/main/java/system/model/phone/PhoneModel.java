package system.model.phone;

import system.model.FileModel;

public class PhoneModel implements FileModel<PhoneId> {
    public final PhoneId id;
    private String numberOfPhone;

    public PhoneModel(PhoneId id, String numberOfPhone) {
        this.id = id;
        this.numberOfPhone = numberOfPhone;
    }

    public PhoneModel(PhoneId id) {
        this.id = id;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    @Override
    public PhoneId getId() {
        return id;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
