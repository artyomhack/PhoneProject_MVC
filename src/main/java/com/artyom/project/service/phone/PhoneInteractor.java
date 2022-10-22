package com.artyom.project.service.phone;

import com.artyom.project.model.phone.PhoneModel;
import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.model.user.UserModel;
import com.artyom.project.service.phone.PhoneDetails;

import java.util.List;

public interface PhoneInteractor {

    PhoneNumberId add(PhoneDetails phone);

    PhoneDetails update(PhoneNumberId id, PhoneDetails details);

    PhoneDetails fetchById(PhoneNumberId id);

    List<PhoneDetails> fetchAll();

    boolean removeById(PhoneNumberId id);



}
