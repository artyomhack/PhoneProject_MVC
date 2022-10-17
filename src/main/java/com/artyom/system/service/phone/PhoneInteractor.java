package com.artyom.system.service.phone;

import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.phone.PhoneDetails;

import java.util.List;

public interface PhoneInteractor {

    PhoneNumberId add(PhoneDetails phone);

    PhoneDetails update(PhoneNumberId id);

    PhoneDetails fetchById(PhoneNumberId id);

    List<PhoneDetails> fetchAll();

    boolean removeById(PhoneNumberId id);



}
