package com.artyom.system.service.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneInteractor {

    @Autowired
    private final PhoneStorage storage;

    public PhoneInteractor(PhoneStorage storage) {
        this.storage = storage;
    }
}
