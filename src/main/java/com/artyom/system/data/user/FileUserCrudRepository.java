package com.artyom.system.data.user;

import com.artyom.system.file.AbstractFileCrudRepository;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.user.UserStorage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

public class FileUserCrudRepository extends AbstractFileCrudRepository<UserModel, UserFileId>
implements UserStorage {

    private final UserCrudRepository crudRepository;

    public FileUserCrudRepository(UserCrudRepository crudRepository, Class<UserModel> entity) {
        super(entity);
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

    @Override
    protected UserFileId mapOfSrc(Object src) {
        return UserFileId.of(src);
    }

    @Override
    public UserFileId getNextId() {

        var usr = crudRepository.fetchAll().stream()
                .map(UserModel::getId).sorted().toList();

        var last = usr.get(usr.size() - 1);

        return UserFileId.of(new UUID(123456789,
                last.getValueUUID().getLeastSignificantBits()
                        - UUID.randomUUID().getMostSignificantBits()));
    }


}
