package system.model.phone;

import system.model.FileId;

public abstract class AbstractNumber<T extends PhoneNumberString> implements FileId<T>{

    public static PhoneNumberString numberEmpty = new PhoneNumberString("0");

    protected AbstractNumber(Object src) {
        numberEmpty = PhoneNumberString.regexOf(String.valueOf(src));
    }

    @Override
    public boolean isEmpty() {
        return this.getValue() != numberEmpty;
    }

    @Override
    public T getValue() {
        return (T) numberEmpty;
    }
}

