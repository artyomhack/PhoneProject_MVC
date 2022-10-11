package com.artyom.system.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInteractor {

    @Autowired
    private final UserStorage storage;

    public UserInteractor(UserStorage storage) {
        this.storage = storage;
    }
}
