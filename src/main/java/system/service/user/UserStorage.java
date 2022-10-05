package system.service.user;

import system.model.phone.PhoneNumberId;
import system.model.user.UserFileId;
import system.model.user.UserModel;

import java.util.List;

public interface UserStorage {

    UserFileId add(String firstName, String lastName, String phonetic);

    UserFileId update(UserFileId userId, String firstName, String lastName, String phonetic);

    List<UserModel> findAll();

    UserModel findById(UserFileId userId);

    PhoneNumberId findPhoneIdByUserId(UserFileId userId);

    boolean deleteById(UserFileId userId);

    boolean deletePhoneByUserId(UserFileId userId);
}
