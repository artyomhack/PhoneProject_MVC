package com.artyom.project.data.user;

import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.model.user.UserModel;
import com.artyom.project.service.user.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UserStorageImpl implements UserStorage {

    private final UserCrudRepository crudRepository;

    public UserStorageImpl(@Autowired UserCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public UserFileId add(String firstName, String lastName, String phonetic) {
        return null;
    }

    @Override
    public UserFileId update(UserFileId userId, String firstName, String lastName, String phonetic) {
        return null;
    }

    @Override
    public List<UserModel> findAll() {
        return null;
    }

    @Override
    public UserModel findById(UserFileId userId) {
        return null;
    }

    @Override
    public PhoneNumberId findPhoneIdByUserId(UserFileId userId) {
        return null;
    }

    @Override
    public boolean deleteById(UserFileId userId) {
        return false;
    }

    @Override
    public boolean deletePhoneByUserId(UserFileId userId) {
        return false;
    }
}
