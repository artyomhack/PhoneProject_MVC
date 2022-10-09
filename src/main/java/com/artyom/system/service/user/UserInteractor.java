package com.artyom.system.service.user;

import org.springframework.stereotype.Service;

@Service
public class UserInteractor {

    private final UserStorage storage;

    public UserInteractor(UserStorage storage) {
        this.storage = storage;
    }
}
