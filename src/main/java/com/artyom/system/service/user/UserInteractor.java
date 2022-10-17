package com.artyom.system.service.user;

import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.service.phone.PhoneDetails;

import java.util.List;

public interface UserInteractor {

    UserFileId add(UserDetails user);

    UserDetails update(UserFileId id, UserDetails userDetails);

    PhoneDetails fetchById(PhoneNumberId id);

    List<PhoneDetails> fetchAll();

    boolean removeById(PhoneNumberId id);
}
