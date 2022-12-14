package com.artyom.project.model.phone;

import com.artyom.project.file.FileId;

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

