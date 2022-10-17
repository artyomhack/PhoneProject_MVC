package com.artyom.system.service.phone;

import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PhoneStorage {
    PhoneNumberId save(PhoneModel model);

    List<PhoneModel> findAll();

    PhoneModel findById(PhoneNumberId phoneId);

    PhoneModel findByUser(UserFileId userId);

    boolean deleteById(PhoneNumberId numberId);
}
