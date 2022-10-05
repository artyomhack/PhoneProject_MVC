package system.service.user;

import system.data.user.FileUserRepository;
import system.model.phone.PhoneNumberId;
import system.model.user.UserFileId;
import system.model.user.UserModel;

import java.util.List;

public class UserStorageImpl implements UserStorage{

    private final FileUserRepository userRepository;

    public UserStorageImpl(FileUserRepository userRepository) {
        this.userRepository = userRepository;
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
