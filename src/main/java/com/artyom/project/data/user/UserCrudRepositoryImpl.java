package com.artyom.project.data.user;

import com.artyom.project.file.AbstractFileCrudRepository;
import com.artyom.project.model.phone.PhoneModel;
import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.model.user.UserModel;

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
