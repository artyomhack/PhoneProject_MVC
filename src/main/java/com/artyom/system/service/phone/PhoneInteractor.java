package com.artyom.system.service.phone;

import org.springframework.stereotype.Service;

@Service
public class PhoneInteractor {

    private final PhoneStorage storage;

    public PhoneInteractor(PhoneStorage storage) {
        this.storage = storage;
    }
}
