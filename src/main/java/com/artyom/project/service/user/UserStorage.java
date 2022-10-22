package com.artyom.project.service.user;

import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.model.user.UserModel;

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
