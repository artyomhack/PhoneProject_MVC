package com.artyom.system.data.user;

import com.artyom.system.file.AbstractFileCrudRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.model.user.UserModel;

import java.util.List;

public class UserCrudRepositoryImpl extends AbstractFileCrudRepository<UserModel, UserFileId>
        implements UserCrudRepository {


    public UserCrudRepositoryImpl() {
        super(UserModel.class);
    }

    @Override
    public UserFileId save(UserModel entity) {
        return null;
    }

    @Override
    public List<UserModel> fetchAll() {
        return null;
    }

    @Override
    public UserModel fetchById(UserFileId userFileId) {
        return null;
    }

    @Override
    public UserFileId getLastId() {
        return null;
    }

    @Override
    protected UserFileId mapOfSrc(Object src) {
        return null;
    }

    @Override
    public UserFileId getNextId() {
        return null;
    }
}
