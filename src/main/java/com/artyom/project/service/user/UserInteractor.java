package com.artyom.project.service.user;

import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserFileId;
import com.artyom.project.service.phone.PhoneDetails;

import java.util.List;

public interface UserInteractor {

    UserFileId add(UserDetails user);

    UserDetails update(UserFileId id, UserDetails userDetails);

    PhoneDetails fetchById(PhoneNumberId id);

    List<PhoneDetails> fetchAll();

    boolean removeById(PhoneNumberId id);
}
