package com.artyom.project.service.user;

import com.artyom.project.data.user.UserStorageImpl;
import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.service.phone.PhoneDetails;

import java.util.List;

public class UserIteractorImpl implements UserInteractor{

    private final UserStorageImpl userStorage;

    public UserIteractorImpl(UserStorageImpl userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public UserFileId add(UserDetails user) {
        return null;
    }

    @Override
    public UserDetails update(UserFileId id, UserDetails userDetails) {
        return null;
    }

    @Override
    public PhoneDetails fetchById(PhoneNumberId id) {
        return null;
    }

    @Override
    public List<PhoneDetails> fetchAll() {
        return null;
    }

    @Override
    public boolean removeById(PhoneNumberId id) {
        return false;
    }
}
